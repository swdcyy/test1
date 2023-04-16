package com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uf0.d;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import wf0.m0;
import lnc.a1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import wkd.b;
import hn5.y;
import tkd.b;
import tkd.d;
import ap5.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.p;
import brd.t;
import t45.d;
import brd.z;
import wf0.e0;
import erd.g;
import crd.b;
import lnc.b9;
import o07.o;

public class PrivacyDialogHelper$a implements PopupInterface$h	// class@00070b
{
    public c b;
    public b c;

    public void PrivacyDialogHelper$a(){
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrivacyDialogHelper$a.class, "1")) {
          return;
       }
       this.b = p0;
       d uod = d.class;
       Object obj = null;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(1), obj, uod, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PERMISSION_DIALOG";
          i3 oi3 = d.d(1);
          if (m0.a()) {
             oi3.d("permission_allow_button_text", a1.p(R.string.arg_RES_7f10002f));
          }
          uElementPack.params = oi3.e();
          u1.u0(4, uElementPack, obj);
       }
       b.a(0x5cc4db59).a();
       d.a(-2061018968).bR(0, 1);
       d.a(-2061018968).bR(1, 1);
       this.c = RxBus.f.f(p.class).observeOn(d.a).subscribe(new e0(this));
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(PrivacyDialogHelper$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PrivacyDialogHelper$a.class, "2")) {
          return;
       }
       b9.a(this.c);
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
