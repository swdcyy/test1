package com.yxcorp.gifshow.growth.widget.onekeyadd.WidgetGuideViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.view.View;

public final class WidgetGuideViewPager extends ViewPager	// class@0015ee
{
    public View b;

    public void WidgetGuideViewPager(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void WidgetGuideViewPager(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(WidgetGuideViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, WidgetGuideViewPager.class, "1")) {
          return;
       }
       WidgetGuideViewPager tb = this.b;
       if (tb == null) {
          super.onMeasure(p0, p1);
          return;
       }else {
          p1 = 0;
          if (tb != null) {
             tb.measure(p0, View$MeasureSpec.makeMeasureSpec(p1, p1));
          }
          tb = this.b;
          int measuredHeig = (tb != null)? tb.getMeasuredHeight(): 0;
          if (measuredHeig > 0) {
             p1 = measuredHeig;
          }
          super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(p1, 0x40000000));
          return;
       }
    }
}
