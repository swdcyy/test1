package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.d$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.widget.TextView;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;

public class d$a extends a	// class@0016da
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       d$a tb = this.b;
       tb.p.removeCallbacks(tb.t);
       this.b.p.setAlpha(0);
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       if (this.b.p.getVisibility() == 8) {
          return;
       }
       ObjectAnimator.ofFloat(this.b.p, View.ALPHA, new float[2]{0,0x3f800000}).setDuration(300).start();
       d$a tb = this.b;
       tb.p.postDelayed(tb.t, 2000);
       return;
    }
}
