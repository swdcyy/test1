package com.yxcorp.gifshow.payment.activity.c;
import sfc.a;
import com.yxcorp.gifshow.payment.activity.KwaiPayActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import u07.t$a;
import android.app.Activity;
import ewb.i;
import u07.u;
import u07.t;
import u07.j;
import android.os.Handler;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ewb.j;
import java.lang.Runnable;

public class c extends a	// class@000e3e
{
    public final KwaiPayActivity c;

    public void c(KwaiPayActivity p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       if (p0 instanceof KwaiException && p0.getErrorCode() == 851) {
          t$a uoa = new t$a(this.c);
          uoa.W0(R.string.arg_RES_7f101c45);
          uoa.y0(R.string.arg_RES_7f101c32);
          uoa.S0(R.string.arg_RES_7f104114);
          uoa.Q0(R.string.cancel);
          uoa.u0(new i(this));
          j.d(uoa);
       }else {
          super.b(p0);
          this.c.V2().postDelayed(new j(this), 1000);
       }
       return;
    }
}
