package com.kwai.live.gzone.accompanyplay.audience.p0$f;
import com.kwai.live.gzone.accompanyplay.audience.p0$e;
import com.kwai.live.gzone.accompanyplay.audience.p0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jg0.a;
import xl6.b;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import o37.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import java.util.Objects;
import brd.t;
import f37.a;
import android.content.SharedPreferences;
import com.kwai.live.gzone.accompanyplay.audience.r0;
import io.reactivex.g;
import com.kwai.live.gzone.accompanyplay.audience.p0$f$a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.audience.s0;
import com.kwai.live.gzone.accompanyplay.audience.p0$f$b;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k37.a0;
import android.os.Bundle;
import xl6.h;

public class p0$f implements p0$e	// class@000ba9
{
    public final p0 a;

    public void p0$f(p0 p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p0$f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.a("0.1.0", p0) >= 0)? true: false;
       return b;
    }
    public boolean b(){
       p0 obj = PatchProxy.apply(null, this, p0$f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.t;
       if (obj == null) {
          return true;
       }
       if (obj.f()) {
          return false;
       }
       this.a.s.g();
       return true;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0$f.class, "6")) {
          return;
       }
       this.a.S8(p0.mGameInfo);
       return;
    }
    public void d(boolean p0){
       t ot;
       p0$f uof = p0$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "1")) {
          return;
       }
       if (this.a.t == null) {
          return;
       }
       if (this.b()) {
          return;
       }
       uof = this.a;
       Objects.requireNonNull(uof);
       p0 op0 = p0.class;
       if (PatchProxy.isSupport(op0)) {
          ot = PatchProxy.applyOneRefs(Boolean.valueOf(p0), uof, op0, "7");
          if (ot != PatchProxyResult.class) {
          }else if(!p0 || a.a.getBoolean("live_gzone_not_remind_bind_game", false)){
             ot = t.just(Boolean.TRUE);
          }else {
             ot = t.create(new r0(uof));
          }
       }else {
          goto label_0041 ;
       }
       uof.X7(ot.subscribe(new p0$f$a(this)));
       return;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p0$f.class, "2")) {
          return;
       }
       p0$f ta = this.a;
       if (ta.t != null) {
          Objects.requireNonNull(ta);
          t ot = PatchProxy.apply(objArray, ta, p0.class, "8");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = t.create(new s0(ta));
          }
          ta.X7(ot.subscribe(new p0$f$b(this)));
       }
       return;
    }
    public void f(LiveGzoneAccompanyBindGameAccountInfo p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p0$f.class, "3")) {
          return;
       }
       a0.j(this.a.s.a(), this.a.s.t(), 1);
       if (this.b()) {
          a0.j(this.a.s.a(), this.a.s.t(), 8);
          return;
       }else {
          p0$f ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, p0.class, "9") && ta.t != null) {
             Bundle uBundle = new Bundle();
             uBundle.putString("EXTRA_USER_INFO", p0.mGameAccountDesc);
             ta.t.c(null, p0.mGameUid, p1, uBundle);
             a0.j(ta.s.a(), ta.s.t(), 7);
          }
          return;
       }
    }
}
