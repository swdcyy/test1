package com.kwai.live.gzone.accompanyplay.anchor.j0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.anchor.j0$d;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
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
import xl6.h;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.anchor.j0$a;
import j37.b;
import j37.a;
import brd.t;
import cjd.e;
import erd.o;
import h37.q0;
import com.kwai.live.gzone.accompanyplay.anchor.j0$b;
import erd.g;
import u07.t$a;
import android.app.Activity;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.live.gzone.accompanyplay.anchor.j0$c;
import u07.u;
import h37.t0;
import java.util.Map;
import java.util.HashMap;

public class j0 extends PresenterV2 implements g	// class@000b1a
{
    public d p;
    public b q;
    public LiveGzoneAccompanyGameInfo r;
    public c s;
    public c t;
    public b u;
    public LiveGzoneAccompanySdkPlatformConfig v;

    public void j0(){
       super();
       this.p = new j0$d(this);
       this.s = PublishSubject.g();
       this.t = PublishSubject.g();
    }
    public void E8(){
       PatchProxy.applyVoid(null, this, j0.class, "1");
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "2")) {
          return;
       }
       b9.a(this.u);
       j0 tq = this.q;
       if (tq != null) {
          tq.release();
          this.q = null;
       }
       return;
    }
    public void P8(LiveGzoneAccompanyGameInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "7")) {
          return;
       }
       if (p0.mEnableOneClick == null || p0.mAccompanySdkPlatformConfig == null) {
          j0 tq = this.q;
          if (tq != null) {
             tq.release();
             this.q = null;
          }
          return;
       }else {
          j0 tq1 = this.q;
          if (tq1 != null && (TextUtils.equals(p0.mGameId, tq1.getGameId()) && p0.mAccompanySdkPlatformConfig.equals(this.v))) {
             return;
          }
          this.r = p0;
          a uoa = new a();
          uoa.c = p0.mGameId;
          LiveGzoneAccompanySdkPlatformConfig mSdkConfig = p0.mAccompanySdkPlatformConfig.mSdkConfig;
          uoa.e = mSdkConfig.mGameSDKMinimumVersion;
          uoa.d = mSdkConfig.mUrlSchemes[0];
          uoa.a = mSdkConfig.mGamePackageNames;
          Context context = this.getContext();
          int i = (d.a(0xded02ea).PL())? 2: 1;
          this.q = c.a(context, uoa, i);
          this.v = p0.mAccompanySdkPlatformConfig;
          return;
       }
    }
    public h R8(String p0,boolean p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, oj0, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new j0$a(this, p0, p1);
    }
    public void S8(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, j0.class, "4")) {
          return;
       }
       b9.a(this.u);
       this.u = a.b().f(p1, p0, p2).map(new e()).subscribe(new q0(this, p3), new j0$b(this));
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "5")) {
          return;
       }
       t$a uoa = new t$a(this.getActivity());
       uoa.W0(R.string.arg_RES_7f102324);
       uoa.S0(R.string.arg_RES_7f103a83);
       f.e(uoa).Y(PopupInterface.a);
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "6")) {
          return;
       }
       t$a uoa = new t$a(this.getActivity());
       uoa.W0(R.string.arg_RES_7f1023d9);
       uoa.S0(R.string.arg_RES_7f1023dd);
       uoa = f.e(uoa);
       uoa.Q0(R.string.cancel);
       uoa.u0(new j0$c(this));
       uoa.Y(PopupInterface.a);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, j0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(j0.class, new t0());
       }else {
          obj.put(j0.class, null);
       }
       return obj;
    }
}
