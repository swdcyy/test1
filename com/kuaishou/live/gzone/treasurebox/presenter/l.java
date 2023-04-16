package com.kuaishou.live.gzone.treasurebox.presenter.l;
import im8.g;
import com.smile.gifmaker.mvps.presenter.a;
import r53.j;
import p53.g0;
import com.kuaishou.live.gzone.treasurebox.presenter.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.gzone.treasurebox.presenter.w;
import com.kuaishou.live.gzone.treasurebox.presenter.s;
import com.kuaishou.live.gzone.treasurebox.presenter.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kuaishou.live.gzone.treasurebox.presenter.j;
import io.reactivex.g;
import com.kuaishou.live.gzone.treasurebox.presenter.k;
import erd.g;
import crd.b;
import mq5.h;
import mq5.b;
import x57.e;
import x57.a;
import fq5.b;
import r53.b;
import h47.b;
import j47.d;
import com.kwai.library.widget.popup.common.c;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import p53.o0;
import java.util.Map;
import java.util.HashMap;
import com.kwai.video.waynelive.LivePlayerController;
import tq5.c;
import lp3.e;
import jv1.b;
import y43.a;
import r53.a;
import k67.d;
import vq5.d;
import k67.l;
import c77.p;
import jk1.e;
import k67.b;
import gq5.f;
import j47.c;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import bt5.b;
import lp3.c;
import xq5.a;
import kq5.b;
import t47.a;
import ht5.a;

public class l extends a implements g	// class@001c8c
{
    public b A;
    public final h B;
    public b C;
    public t D;
    public a E;
    public boolean r;
    public String s;
    public b t;
    public d u;
    public LivePlayerController v;
    public c w;
    public e x;
    public b y;
    public b z;
    public static String sLivePresenterClassName = "LiveGzoneTreasureBoxPresenter";

    public void l(){
       super();
       this.A = new j();
       this.B = new g0(this);
       this.U7(new h());
       this.U7(new w());
       this.U7(new s());
       this.U7(new p());
    }
    public void E8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       t ot = PatchProxy.apply(objArray, this, ol, "9");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new j(this));
       }
       this.X7(ot.subscribe(new k(this)));
       this.z.Km(this.B);
       a.a().h("LiveTreasureBoxV2", this.t.getLiveStreamId());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "8")) {
          return;
       }
       this.A.release();
       l tu = this.u;
       if (tu != null) {
          tu.H8(this.C);
       }
       this.z.le(this.B);
       this.R8();
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, l.class, "7")) {
          return;
       }
       l tD = this.D;
       if (tD != null && tD.D()) {
          this.D.q(0);
          this.D = null;
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"live_gzone_hide_treasure_task_leave_dialog", true);
       g.a(uEditor);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(l.class, new o0());
       }else {
          obj.put(l.class, null);
       }
       return obj;
    }
    public void j8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "1")) {
          return;
       }
       this.t = this.r8("LIVE_BASIC_CONTEXT");
       this.u = this.s8(d.class);
       this.v = this.r8("LIVE_PLAYER_CONTROLLER");
       this.w = this.r8("LIVE_QUIT_LIVE_SERVICE");
       this.x = this.r8("LIVE_SERVICE_MANAGER");
       this.y = this.q8(b.class);
       this.z = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.E = this.q8(a.class);
       l tA = this.A;
       a uoa = PatchProxy.apply(objArray, this, ol, "2");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
          uoa.b = this.u;
          uoa.c = this.v;
          uoa.a = this.t;
          uoa.y = this.E;
          uoa.d = this.t8("LIVE_GZONE_FEATURE_PENDANT_BUBBLE_SERVICE");
          uoa.e = this.r8("LIVE_ROUTER_SERVICE");
          uoa.f = this.A;
          uoa.g = this.s8(l.class);
          uoa.h = this.s8(p.class);
          uoa.i = this.r8("LIVE_AUDIENCE_GIFT_BOX_SERVICE");
          uoa.j = this.s8(b.class);
          uoa.k = this.q8(f.class);
          uoa.p = this.q8(c.class);
          uoa.q = this.r8("LIVE_PHOTO");
          uoa.m = this.x.a(b.class);
          uoa.r = this.q8(a.class);
          uoa.s = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
          uoa.t = this.t8("LIVE_GZONE_SERVER_REQUEST_SERVICE");
          l tE = this.E;
          uoa.u = tE.e;
          uoa.v = tE.f;
          uoa.w = tE.g;
          uoa.x = this.s8(a.class);
       }
       tA.f = uoa;
       return;
    }
}
