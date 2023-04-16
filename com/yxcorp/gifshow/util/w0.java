package com.yxcorp.gifshow.util.w0;
import android.view.View;
import lnc.za;
import android.view.View$OnTouchListener;

public class w0	// class@001fb6
{

    public static void a(View p0,float p1){
       if (p0 == null) {
          return;
       }
       p0.setOnTouchListener(new za(p0, p1));
       return;
    }
}
