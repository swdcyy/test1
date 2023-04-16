package com.kuaishou.merchant.live.cart.onsale.audience.ultron.rollback.UltronYellowCartInitModule;
import com.kwai.framework.init.TTIInitModule;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.rollback.UltronYellowCartInitModule$a;
import nsd.u;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.rollback.UltronYellowCartInitModule$c;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.sdk.signal.f;
import j85.e;
import b76.a;

public final class UltronYellowCartInitModule extends TTIInitModule	// class@00199d
{
    public e q;
    public static final UltronYellowCartInitModule$a r;

    static {
       UltronYellowCartInitModule.r = new UltronYellowCartInitModule$a(null);
    }
    public void UltronYellowCartInitModule(){
       super();
       this.q = UltronYellowCartInitModule$c.a;
    }
    public int f0(){
       return 7;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UltronYellowCartInitModule.class, "2")) {
          return;
       }
       f.e().w(this.q);
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UltronYellowCartInitModule.class, "1")) {
          return;
       }
       String[] stringArray = new String[]{"Push.Kwaishop.Flow.Live"};
       f.e().o(this.q, stringArray);
       return;
    }
}
