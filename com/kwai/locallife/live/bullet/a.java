package com.kwai.locallife.live.bullet.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k87.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import fq5.b;
import com.kuaishou.livestream.message.nano.LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal;
import lf3.g;
import com.kwai.locallife.live.bullet.LiveLocalLifeBuyingBulletData;
import com.kwai.locallife.live.bullet.a$a;
import gr5.a;
import kr5.a;
import zq5.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import android.content.Context;
import vq5.d;
import xh7.b;
import qh7.b;
import qh7.a;
import lr3.f;
import lp3.i;
import lp3.c;

public class a extends PresenterV2	// class@000eb4
{
    public d p;
    public b q;
    public i r;
    public b s;
    public final g t;

    public void a(){
       super();
       this.t = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.q.u().u0(1086, LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal.class, this.t);
       a ts = this.s;
       if (ts != null) {
          ts.v9(15, LiveLocalLifeBuyingBulletData.class, null, new a$a(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.q.u().o(1086, this.t);
       return;
    }
    public boolean P8(LiveLocalLifeBuyingBulletData p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.q.e()) {
          return true;
       }
       LiveLocalLifeBuyingNoticeSignal$SCLiveLocalLifeBuyingNoticeSignal signal = p0.getSignal();
       if (signal == null || TextUtils.x(signal.jumpUri)) {
          return false;
       }
       if ((signal.jumpUri).startsWith("kwailive")) {
          obj = this.p;
          if (obj != null) {
             obj.r4(signal.jumpUri, this.getActivity());
          }
       }else {
          a.b(new b(this.getActivity(), signal.jumpUri), null);
       }
       f.a("LiveLocalLifeBuyingBulletPresenter", signal.jumpUri, "bullet click");
       return true;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.t8("LIVE_BASIC_CONTEXT");
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.r = oi;
       this.s = oi.c(b.class);
       this.p = this.t8("LIVE_ROUTER_SERVICE");
       return;
    }
}
