package com.kuaishou.growth.privacy.dialog.helper.m;
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
import wf0.f0;
import erd.g;
import crd.b;
import java.lang.Integer;
import lnc.b9;
import o07.o;

public class m implements PopupInterface$h	// class@00071b
{
    public c b;
    public b c;

    public void m(){
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       this.b = p0;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, d.class, "13")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PRIVACY_DISAGREE_SECOND_KEEP_STAY_POPUP";
          uElementPack.params = d.a();
          u1.u0(4, uElementPack, objArray);
       }
       b.a(0x5cc4db59).a();
       d.a(-2061018968).bR(0, true);
       d.a(-2061018968).bR(true, true);
       this.c = RxBus.f.f(p.class).observeOn(d.a).subscribe(new f0(this));
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, m.class, "2")) {
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
