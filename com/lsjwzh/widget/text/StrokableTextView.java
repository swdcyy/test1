package com.lsjwzh.widget.text.StrokableTextView;
import com.lsjwzh.widget.text.FastTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.System;
import java.lang.CharSequence;
import android.text.Spanned;
import q38.a;
import q38.b;

public class StrokableTextView extends FastTextView	// class@00147f
{

    public void StrokableTextView(Context p0){
       super(p0);
    }
    public void StrokableTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void StrokableTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       System.currentTimeMillis();
       CharSequence text = this.getText();
       if (text instanceof Spanned) {
          a[] uoaArray = b.b(text);
          if (uoaArray != null && uoaArray.length > 0) {
             b.c(uoaArray);
             super.onDraw(p0);
             b.a(uoaArray);
          }
       }
       super.onDraw(p0);
       System.currentTimeMillis();
       return;
    }
}
