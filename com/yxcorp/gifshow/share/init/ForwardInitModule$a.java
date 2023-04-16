package com.yxcorp.gifshow.share.init.ForwardInitModule$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.share.init.ForwardInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.KsShareApi;
import java.util.Objects;
import uo7.j;
import f97.a;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import lnc.i3;
import qrd.l1;
import k2b.u1;

public final class ForwardInitModule$a implements Runnable	// class@001bc1
{
    public final ForwardInitModule b;

    public void ForwardInitModule$a(ForwardInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ForwardInitModule$a.class, "1")) {
          return;
       }
       KsShareApi s = KsShareApi.s;
       Objects.requireNonNull(s);
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, s, KsShareApi.class, "25") && !KsShareApi.r) {
          KsShareApi.r = b;
          a.a(j.b);
       }
       this.b.l0();
       this.b.q = b;
       ForwardInitModule$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, ForwardInitModule.class, "5")) {
          h$b uob = h$b.e(0, "ALBUM_AUTHORIZATION");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          String str = (PermissionUtils.a(a.B, "android.permission.READ_EXTERNAL_STORAGE"))? "AUTHORIZED": "UNAUTHORIZED";
          i3 oi3 = i3.f();
          oi3.d("authorization_state", str);
          uElementPack.params = oi3.e();
          uob.k(uElementPack);
          u1.r0(uob);
       }
       return;
    }
}
