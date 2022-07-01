package com.kesavan.interview.peacockinterviewcode

import android.util.Log
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ImageView.loadImagefromUrl(url:String){
    Picasso.get().load(url).into(this)
}

fun View.visible(){
    this.visibility= View.VISIBLE
}

fun View.gone(){
    this.visibility= View.GONE
}