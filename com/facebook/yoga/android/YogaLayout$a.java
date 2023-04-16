package com.facebook.yoga.android.YogaLayout$a;
import lg.e;
import java.lang.Object;
import lg.g;
import com.facebook.yoga.YogaMeasureMode;
import android.view.View;
import com.facebook.yoga.android.YogaLayout;
import android.view.View$MeasureSpec;
import lg.f;

public class YogaLayout$a implements e	// class@001465
{

    public void YogaLayout$a(){
       super();
    }
    public long a(g p0,float p1,YogaMeasureMode p2,float p3,YogaMeasureMode p4){
       View view = p0.m();
       if (view == null || view instanceof YogaLayout) {
          return f.b(0, 0);
       }
       view.measure(View$MeasureSpec.makeMeasureSpec((int)p1, this.b(p2)), View$MeasureSpec.makeMeasureSpec((int)p3, this.b(p4)));
       return f.b(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
    public final int b(YogaMeasureMode p0){
       if (p0 == YogaMeasureMode.AT_MOST) {
          return Integer.MIN_VALUE;
       }
       if (p0 == YogaMeasureMode.EXACTLY) {
          return 0x40000000;
       }
       return 0;
    }
}
