package com.tachikoma.plugin.TkScoreView;
import com.tachikoma.core.component.e;
import gx4.f;
import android.content.Context;
import android.view.View;
import com.tachikoma.plugin.ScoreLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tachikoma.core.bridge.c;
import iq8.p;
import mq8.b;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Math;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.tachikoma.plugin.ScoreLayout$a;
import iq8.n;

public class TkScoreView extends e	// class@000de8
{

    public void TkScoreView(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public ScoreLayout createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TkScoreView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ScoreLayout(p0);
    }
    public void setScore(double p0,String p1,double p2){
       int i2;
       String str = p1;
       if (PatchProxy.isSupport(TkScoreView.class) && PatchProxy.applyVoidThreeRefs(Double.valueOf(p0), p1, Double.valueOf(p2), this, TkScoreView.class, "2")) {
          return;
       }
       Context context = this.getContext();
       int i = 0x7f0800c1;
       float f = (float)p2;
       int i1 = p.c(str, this.getJSContext());
       b uob = b.class;
       LayerDrawable layerDrawabl = null;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(f), Integer.valueOf(i1), layerDrawabl, uob, "2");
          if (obj != PatchProxyResult.class) {
             i2 = obj.intValue();
          label_006c :
             Drawable uDrawable = b.a(context, i, ColorStateList.valueOf(i2), true);
             Drawable uDrawable1 = b.a(this.getContext(), R.drawable.arg_RES_7f0800c2, ColorStateList.valueOf(p.c(str, this.getJSContext())), true);
             i = 2;
             if (uDrawable != null && uDrawable1 != null) {
                Drawable[] uDrawableArr = new Drawable[i];
                uDrawableArr[0] = uDrawable;
                uDrawableArr[1] = uDrawable1;
                layerDrawabl = new LayerDrawable(uDrawableArr);
             }
             Object obj1 = layerDrawabl;
             Drawable uDrawable2 = b.a(this.getContext(), R.drawable.arg_RES_7f0800c0, ColorStateList.valueOf(p.c(str, this.getJSContext())), true);
             if (uDrawable != null && (uDrawable2 != null && obj1 != null)) {
                ScoreLayout$a uoa = new ScoreLayout$a(uDrawable2, obj1, uDrawable, n.b(12), n.b(i), (float)p0);
                this.getView().setConfig(uDrawable1);
             }
          label_00d6 :
             return;
          }
       }
       i2 = (Math.min(255, Math.max(0, (int)(f * 0x437f0000))) << 24) + (i1 & 0xffffff);
       goto label_006c ;
    }
}
