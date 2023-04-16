package com.hhh.smartwidget.bubble.d;
import android.view.View;
import android.widget.LinearLayout;

public class d	// class@00057f
{

    public static void a(View p0){
       View view = p0.findViewById(R.id.arrow);
       if (view != null && p0 instanceof LinearLayout) {
          if (p0.getOrientation() == Float.MIN_VALUE) {
             p0.setPivotX((p0.getPivotX() + view.getTranslationX()));
             p0.setPivotY((view.getY() + (float)view.getHeight()));
          }else {
             p0.setPivotX((view.getX() + (float)view.getWidth()));
             p0.setPivotY((p0.getPivotY() + view.getTranslationY()));
          }
       }
       return;
    }
}
