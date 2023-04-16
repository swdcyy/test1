package com.kwai.slide.play.detail.information.caption.f;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.information.caption.i;
import java.lang.Object;
import com.kwai.slide.play.detail.information.caption.l$c;
import com.kwai.slide.play.detail.information.caption.l$b;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import android.animation.ValueAnimator;
import android.widget.TextView;
import android.content.Context;
import qp7.d;
import android.app.Activity;
import com.yxcorp.utility.n;
import rkd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.view.WindowManager;
import android.graphics.Point;
import android.view.Display;
import java.lang.Math;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import lnc.a1;
import android.view.View$MeasureSpec;
import zq7.d;
import com.kwai.slide.play.detail.information.caption.CaptionTextView$a;
import com.kwai.slide.play.detail.information.caption.CaptionTextView;

public final class f implements Observer	// class@0017d7
{
    public final i b;

    public void f(i p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       f tb = this.b;
       i o = tb.o;
       if (o != null && (o.a() && p0.b())) {
          SpannableStringBuilder spannableStr = new SpannableStringBuilder();
          tb.p = spannableStr;
          spannableStr.append(p0.a());
          o = tb.t;
          if (o != null && o.isStarted()) {
             tb.t.cancel();
          }
          tb.w();
          tb.u = false;
       }
    label_0037 :
       tb.m.setText(p0.a());
       if (p0.b()) {
          int i = n.k(tb.k());
          if (b.g()) {
             i = PatchProxy.apply(null, tb, i.class, "17");
             if (i != PatchProxyResult.class) {
                i = i.intValue();
             }else if(!i.G){
                Point point = new Point();
                a.b().getSystemService("window").getDefaultDisplay().getRealSize(point);
                i.G = Math.min(point.x, point.y);
             }
             i = i.G;
          }
          float f = 99.00f;
          float f1 = (NasaSlidePlayExperimentUtil.f())? 15.00f: 0;
          tb.m.setOnMeasureListener(new d(tb));
          tb.m.measure(View$MeasureSpec.makeMeasureSpec((i - a1.e((f1 + f))), 0x40000000), View$MeasureSpec.makeMeasureSpec(-2, Integer.MIN_VALUE));
       }
       return;
    }
}
