package com.kuaishou.recruit.live.guide.audience.e;
import im8.g;
import h41.a;
import java.lang.String;
import d61.l0;
import rt4.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.CountDownTimer;
import java.lang.Boolean;
import crd.b;
import lnc.b9;
import o63.d;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.recruit.live.guide.audience.g;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sr5.a;
import lp3.i;
import fu4.b;
import lp3.c;
import brd.t;
import rt4.j;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.kuaishou.recruit.live.guide.audience.a;
import rt4.h;
import ok.x;
import o63.a;

public class e extends a implements g	// class@000ecc
{
    public d A;
    public e$a B;
    public a s;
    public i t;
    public b u;
    public a v;
    public CountDownTimer w;
    public a x;
    public boolean y;
    public b z;
    public static final l0 C;

    static {
       e.C = l0.e("recruit.audienceRecruitInfoFirstGuideTimes");
    }
    public void e(){
       super();
       this.B = new i(this);
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       e tw = this.w;
       if (tw != null) {
          tw.cancel();
          this.w = null;
       }
       return;
    }
    public void Q(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "3")) {
          return;
       }
       super.Q(p0);
       this.P8();
       b9.a(this.z);
       e tA = this.A;
       if (tA != null) {
          tA.L();
       }
       this.y = false;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new g());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.j8();
       this.s = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.t = oi;
       this.u = oi.a(b.class);
       return;
    }
    public void x(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoe, "4")) {
          this.z = this.u.W().subscribe(new j(this), Functions.d());
       }
       this.x = new a(new h(this));
       this.v = this.t.a(a.class);
       return;
    }
}
