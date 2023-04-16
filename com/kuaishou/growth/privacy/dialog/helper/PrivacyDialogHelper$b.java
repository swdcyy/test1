package com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uf0.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tkd.b;
import tkd.d;
import ap5.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.p;
import brd.t;
import t45.d;
import brd.z;
import wf0.g0;
import erd.g;
import crd.b;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper;
import java.lang.Integer;
import lnc.b9;
import o07.o;

public class PrivacyDialogHelper$b implements PopupInterface$h	// class@00070c
{
    public c b;
    public b c;

    public void PrivacyDialogHelper$b(){
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrivacyDialogHelper$b.class, "1")) {
          return;
       }
       this.b = p0;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, d.class, "19")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AGAIN_LICENSING_AGREEMENT_POPUP";
          uElementPack.params = d.a();
          u1.u0(4, uElementPack, objArray);
       }
       d.a(-2061018968).bR(0, true);
       d.a(-2061018968).bR(true, true);
       this.c = RxBus.f.f(p.class).observeOn(d.a).subscribe(new g0(this));
       PrivacyDialogHelper.g = true;
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(PrivacyDialogHelper$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PrivacyDialogHelper$b.class, "2")) {
          return;
       }
       b9.a(this.c);
       PrivacyDialogHelper.g = false;
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
