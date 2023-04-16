package com.tachikoma.core.yoga.layout.YogaLayout$a;
import lg.e;
import java.lang.Object;
import lg.g;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import com.tachikoma.core.yoga.layout.YogaLayout;
import android.view.View$MeasureSpec;
import lg.f;

public class YogaLayout$a implements e	// class@000ddb
{

    public void YogaLayout$a(){
       super();
    }
    public long a(g p0,float p1,YogaMeasureMode p2,float p3,YogaMeasureMode p4){
       YogaLayout$a uoa = YogaLayout$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),p2,Float.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       View view = p0.m();
       if (view == null || view instanceof YogaLayout) {
          return f.b(0, 0);
       }else {
          view.measure(View$MeasureSpec.makeMeasureSpec((int)p1, this.b(p2)), View$MeasureSpec.makeMeasureSpec((int)p3, this.b(p4)));
          return f.b(view.getMeasuredWidth(), view.getMeasuredHeight());
       }
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
