package com.kuaishou.live.core.show.conditionredpacket.pendant.e;
import k51.c;
import android.os.Message;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l62.g;
import com.kuaishou.live.core.show.conditionredpacket.pendant.e$a;
import i62.z;
import i62.t$c;
import brd.t;
import com.kuaishou.live.core.show.conditionredpacket.pendant.d;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.conditionredpacket.pendant.c;
import l62.i;
import java.util.List;
import java.util.Iterator;
import l62.a;
import xw1.b;
import j62.a;
import com.kwai.robust.PatchProxyResult;
import i62.z$a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import z52.j$b;
import u52.t;

public abstract class e extends c	// class@000ac2
{
    public t$c p;
    public j$b q;
    public t r;
    public static String sLivePresenterClassName = "LiveConditionRedPacketPendantBasePresenter";

    public void e(){
       super();
    }
    public static void P8(e p0,Message p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, e.class, "5")) {
       }else {
          p0.V8(p1, new g(p0, p1));
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.X7(this.p.n().d(1).subscribe(new d(this)));
       this.X7(this.p.n().d(2).subscribe(new c(this)));
       this.X7(this.p.n().d(4).subscribe(new i(this)));
       this.X7(this.p.n().d(7).subscribe(new i(this)));
       return;
    }
    public void J8(){
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "3")) {
          return;
       }
       List list = this.p.i();
       if (!PatchProxy.applyVoidOneRefs(list, this, uoe, "4")) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa != null) {
                uoa.release();
             }
          }
       }
       return;
    }
    public abstract b R8();
    public final a S8(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.c(p0);
    }
    public final void V8(Message p0,e$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "8")) {
          return;
       }
       p0 = p0.obj;
       if (!p0 instanceof z$a) {
          return;
       }
       p1.accept(p0);
       return;
    }
    public abstract void W8(a p0,LiveConditionRedPacketInfo p1);
    public abstract void X8(a p0,LiveConditionRedPacketInfo p1);
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(t$c.class);
       this.q = this.q8(j$b.class);
       this.r = this.q8(t.class);
       return;
    }
}
