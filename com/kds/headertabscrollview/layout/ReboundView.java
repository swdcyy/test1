package com.kds.headertabscrollview.layout.ReboundView;
import sj.e;
import android.view.View;
import android.content.Context;
import java.lang.Object;
import android.view.ViewGroup$LayoutParams;
import android.os.Build$VERSION;
import android.view.ViewParent;

public class ReboundView extends View implements e	// class@00072a
{
    public int b;

    public void ReboundView(Context p0){
       super(p0);
       this.b = 0;
       this.setTag("ReboundView");
       this.setLayoutParams(new ViewGroup$LayoutParams(-1, 0));
    }
    public boolean a(int p0){
       if (p0 == this.b) {
          return false;
       }
       this.b = p0;
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       layoutParams.height = p0;
       this.setLayoutParams(layoutParams);
       if (Build$VERSION.SDK_INT < 26) {
          ViewParent parent = this.getParent();
          if (parent != null) {
             parent.requestLayout();
          }
       }
       return true;
    }
}
