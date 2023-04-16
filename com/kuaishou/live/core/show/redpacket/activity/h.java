package com.kuaishou.live.core.show.redpacket.activity.h;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.redpacket.activity.h$a;
import com.kuaishou.live.core.show.redpacket.activity.h$b;
import og2.u;
import com.kuaishou.live.core.show.redpacket.activity.h$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager;
import com.kuaishou.live.core.show.redpacket.activity.h$d;
import p91.m;
import t02.a0;
import com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager$a;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import mq5.h;
import mq5.b;
import t02.r1;
import pw1.c;
import pw1.e;
import o63.a;
import lp3.c;
import lp3.i;
import com.kuaishou.live.bridge.LiveJsKwaiLiveCommands;
import o63.k;
import o63.j;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdProvideTreasureBoxParams;
import og2.v;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import og2.y;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class h extends c implements g	// class@000e60
{
    public m p;
    public a0 q;
    public r1 r;
    public i s;
    public a t;
    public LiveRedPacketActivityManager u;
    public KwaiDialogFragment v;
    public LiveActivityPopupDialog w;
    public final c x;
    public final h y;
    public final c z;
    public static String sLivePresenterClassName = "LiveRedPacketActivityPresenter";

    public void h(){
       super();
       this.t = new h$a(this);
       this.x = new h$b(this);
       this.y = new u(this);
       this.z = new h$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.u = new LiveRedPacketActivityManager(this.p, this.q, new h$d(this));
       h tq = this.q;
       if (tq != null && tq.h != null) {
          tq.y2.P4(this.x);
       }
       tq = this.q;
       if (tq != null) {
          tq.D2.Km(this.y);
       }else {
          tq = this.r;
          if (tq != null) {
             tq.Y0.Hj(this.z);
          }
       }
       tq = this.s;
       if (tq != null) {
          tq.a(a.class).B9(LiveJsKwaiLiveCommands.ProvideTreasureBoxParams).e = new v(this);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       h tq = this.q;
       if (tq != null && tq.h != null) {
          tq.y2.d5(this.x);
       }
       tq = this.q;
       if (tq != null) {
          tq.D2.le(this.y);
       }else {
          tq = this.r;
          if (tq != null) {
             tq.Y0.C9(this.z);
          }
       }
       this.P8();
       this.V8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
          return;
       }
       x.E(this.v);
       this.v = null;
       x.E(this.w);
       this.w = null;
       return;
    }
    public final Fragment R8(){
       Object obj = PatchProxy.apply(null, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.b();
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, h.class, "10")) {
          return;
       }
       this.P8();
       this.V8();
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       h tu = this.u;
       if (tu != null) {
          tu.i();
          this.u = null;
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new y();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new y());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.s8(a0.class);
       this.r = this.s8(r1.class);
       this.s = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
