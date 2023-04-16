package com.kwai.live.gzone.accompanyplay.audience.p0;
import im8.g;
import f37.b0;
import com.kwai.live.gzone.accompanyplay.audience.p0$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kwai.live.gzone.accompanyplay.audience.p0$a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k37.p1;
import com.kwai.live.gzone.accompanyplay.audience.p0$b;
import mq5.h;
import mq5.b;
import xl6.b;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySdkPlatformConfig;
import xl6.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameSdkConfig;
import android.content.Context;
import tkd.b;
import tkd.d;
import com.kwai.feature.api.feed.thanos.ThanosPlugin;
import xl6.c;
import j37.d;
import j37.c;
import cjd.e;
import erd.o;
import brd.x;
import k37.w0;
import com.kwai.live.gzone.accompanyplay.audience.p0$c;
import k37.x0;
import com.kwai.live.gzone.accompanyplay.audience.p0$d;
import com.kwai.robust.PatchProxyResult;
import k37.d1;
import java.util.Map;
import java.util.HashMap;

public class p0 extends b0 implements g	// class@000baa
{
    public h q;
    public p0$e r;
    public k0$g s;
    public b t;
    public LiveGzoneAccompanySdkPlatformConfig u;
    public boolean v;

    public void p0(){
       super();
       this.r = new p0$f(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "2")) {
          return;
       }
       this.X7(this.s.n().subscribe(new p0$a(this)));
       p0$b uob = new p0$b(this);
       this.q = uob;
       this.s.w().e.Km(uob);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "10")) {
          return;
       }
       super.J8();
       p0 tt = this.t;
       if (tt != null) {
          tt.release();
       }
       this.s.w().e.le(this.q);
       this.t = null;
       this.u = null;
       return;
    }
    public void S8(LiveGzoneAccompanyGameInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "3")) {
          return;
       }
       if (p0.mEnableOneClick == null || p0.mAccompanySdkPlatformConfig == null) {
          p0 tt = this.t;
          if (tt != null) {
             tt.release();
             this.t = null;
          }
          return;
       }else {
          p0 tt1 = this.t;
          if (tt1 != null && (TextUtils.equals(p0.mGameId, tt1.getGameId()) && p0.mAccompanySdkPlatformConfig.equals(this.u))) {
             return;
          }
          a uoa = new a();
          uoa.c = p0.mGameId;
          LiveGzoneAccompanySdkPlatformConfig mSdkConfig = p0.mAccompanySdkPlatformConfig.mSdkConfig;
          uoa.e = mSdkConfig.mGameSDKMinimumVersion;
          uoa.d = mSdkConfig.mUrlSchemes[0];
          uoa.a = mSdkConfig.mGamePackageNames;
          Context context = this.getContext();
          int i = (d.a(0xded02ea).PL())? 2: 1;
          this.t = c.a(context, uoa, i);
          this.u = p0.mAccompanySdkPlatformConfig;
          return;
       }
    }
    public void V8(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p0.class, "5")) {
          return;
       }
       this.X7(c.b().g(p0, p1).map(new e()).compose(this.s.u()).subscribe(new w0(this), new p0$c(this)));
       return;
    }
    public void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "6")) {
          return;
       }
       this.X7(c.b().n(p0).map(new e()).compose(this.s.u()).subscribe(new x0(this), new p0$d(this)));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, p0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(p0.class, new d1());
       }else {
          obj.put(p0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "1")) {
          return;
       }
       this.s = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       return;
    }
}
