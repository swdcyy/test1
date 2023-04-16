package com.yxcorp.gifshow.widget.f0;
import w4.h;
import android.content.Context;
import tyc.l4;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import w4.j;

public class f0 extends h	// class@001978
{
    public int t;
    public final LottieTask u;
    public j v;

    public void f0(Context p0,int p1){
       super();
       this.v = new l4(this);
       this.t = p1;
       this.u = a.h(p0, p1);
    }
    public boolean setVisible(boolean p0,boolean p1){
       if (PatchProxy.isSupport(f0.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, f0.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p1 = super.setVisible(p0, p1);
       if (p0) {
          this.u.addListener(this.v);
          this.start();
       }else {
          this.u.removeListener(this.v);
          this.stop();
       }
       return p1;
    }
}
