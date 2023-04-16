package com.yxcorp.gifshow.lelink.ScreencastManager$e;
import com.hpplay.sdk.source.api.IBindSdkListener;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import java.lang.StringBuilder;
import q87.c;
import wza.a;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;

public final class ScreencastManager$e implements IBindSdkListener	// class@001a35
{
    public final ScreencastManager a;

    public void ScreencastManager$e(ScreencastManager p0){
       this.a = p0;
       super();
    }
    public final void onBindCallback(boolean p0){
       ScreencastManager$e uoe = ScreencastManager$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "1")) {
          return;
       }
       uoe = this.a;
       Objects.requireNonNull(uoe);
       ScreencastManager screencastMa = ScreencastManager.class;
       if (!PatchProxy.isSupport(screencastMa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoe, screencastMa, "6")) {
          KLogLelink$a e = KLogLelink.e;
          Object[] objArray = new Object[0];
          e.a().w(uoe.a, "onBindCallback result "+p0, objArray);
          if (p0) {
             ScreencastManager b = uoe.b;
             if (b != null) {
                b.h();
             }
             KLogLelink kLogLelink = e.a();
             ScreencastManager a = uoe.a;
             StringBuilder str = "load patch success ";
             ScreencastManager b1 = uoe.b;
             boolean b2 = (b1 != null && b1.f() == true)? true: false;
             Object[] objArray1 = new Object[0];
             kLogLelink.w(a, str+b2, objArray1);
             b = uoe.b;
             if (b != null && b.f() == true) {
                b = uoe.b;
                if (b != null) {
                   b.l(uoe.k, uoe.j, uoe.l);
                }
                uoe.h = true;
                Object[] objArray2 = new Object[0];
                e.a().w(uoe.a, "searchdelay "+uoe.i, objArray2);
                if (uoe.i != null) {
                   uoe.s();
                   uoe.i = false;
                }
             }
          }
       }
    label_00c3 :
       return;
    }
}
