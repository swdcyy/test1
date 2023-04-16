package com.yxcorp.gifshow.payment.activity.KwaiPayActivity$a;
import sfc.a;
import com.yxcorp.gifshow.payment.activity.KwaiPayActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ewb.h;
import java.lang.Runnable;

public class KwaiPayActivity$a extends a	// class@000e3a
{
    public final KwaiPayActivity c;

    public void KwaiPayActivity$a(KwaiPayActivity p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPayActivity$a.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.V2().postDelayed(new h(this), 1000);
       return;
    }
}
