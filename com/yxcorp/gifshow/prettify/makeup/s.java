package com.yxcorp.gifshow.prettify.makeup.s;
import u07.u;
import java.lang.Object;
import u07.t;
import android.view.View;
import xyb.a;
import java.lang.String;
import q87.c;
import f1c.f0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class s implements u	// class@001196
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public final void a(t p0,View p1){
       Object[] objArray = new Object[0];
       a.D().w("MakeupPartsTabController", "makeup resetView dialog onNegative, cancel", objArray);
       if (PatchProxy.applyVoid(null, null, f0.class, "4")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RESET_MAKEUP_POPUP_CANCEL";
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
