package com.kwai.live.gzone.accompanyplay.audience.d0;
import im8.g;
import f37.b0;
import com.kwai.live.gzone.accompanyplay.audience.d0$a;
import com.kwai.live.gzone.accompanyplay.audience.d0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import k37.u;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k37.p1;
import mq5.h;
import mq5.b;
import pp.a;
import q87.c;
import o37.a;
import android.app.Activity;
import lnc.a1;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAudienceAccompanyFleetInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySettingInfo;
import io.reactivex.internal.functions.Functions;
import erd.a;
import p37.d$b;
import com.kwai.live.gzone.accompanyplay.audience.d0$d;
import p37.d;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAudienceGameAccountInfo;
import android.view.View;
import ekd.m1;
import android.content.Context;
import d61.f0;
import com.kwai.live.gzone.accompanyplay.audience.d0$c;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.audience.g0;
import java.util.Map;
import java.util.HashMap;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;
import com.kwai.live.gzone.accompanyplay.audience.p0$e;

public class d0 extends b0 implements g	// class@000b78
{
    public a A;
    public h B;
    public d0$e C;
    public View q;
    public LiveGzoneAccompanyTabHostFragment$e r;
    public k0$g s;
    public p0$e t;
    public TextView u;
    public TextView v;
    public TextView w;
    public b x;
    public String y;
    public c z;

    public void d0(){
       super();
       this.B = new d0$a(this);
       this.C = new d0$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "3")) {
          return;
       }
       this.X7(this.s.n().subscribe(new u(this)));
       this.s.w().e.Km(this.B);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "7")) {
          return;
       }
       super.J8();
       this.s.w().e.le(this.B);
       this.y = null;
       this.z = null;
       this.A = null;
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveGzoneAudienceAccompanyIntoPresenter", "showPayPopup: ", objArray);
       a uoa = this.s.t();
       if (uoa == null || (this.y != null && a1.i(this.getActivity()))) {
          if (uoa.mFleetInfo.mSettingInfo.isFree()) {
             this.s.z(this.y, Functions.c);
             return;
          }else {
             d$b uob = new d$b(this.getActivity());
             uob.I = uoa;
             uob.J = this.s.w();
             uob.K = new d0$d(this);
             d uod = new d(uob);
             this.z = uod;
             uod.Z();
             this.P8(this.z);
          }
       }
       return;
    }
    public void V8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "4")) {
          return;
       }
       a mFleetInfo = p0.mFleetInfo;
       if (mFleetInfo.mQueuingFull != null) {
          this.u.setAlpha(0x3f000000);
          this.u.setText(R.string.arg_RES_7f1023ac);
          return;
       }else if(mFleetInfo.mQueuingStop != null){
          this.u.setAlpha(0x3f000000);
          this.u.setText(R.string.arg_RES_7f102318);
          return;
       }else {
          p0 = p0.mAudienceGameAccountInfo;
          int i = 0x7f10235e;
          if (p0 != null && (p0.mMatchFleet == null && p0.mNeedEdit == null)) {
             this.u.setAlpha(0x3f000000);
             this.u.setText(i);
             return;
          }else if(!this.q.getVisibility()){
             this.u.setAlpha(0x3f000000);
             this.u.setText(i);
             return;
          }else {
             this.u.setAlpha(0x3f800000);
             this.u.setText(R.string.arg_RES_7f102363);
             return;
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a11cc);
       this.v = m1.f(p0, 0x7f0a11e3);
       this.w = m1.f(p0, 0x7f0a11e5);
       this.q = m1.f(p0, 0x7f0a11ff);
       f0.i(this.v, this.getContext());
       this.u.setOnClickListener(new d0$c(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d0.class, new g0());
       }else {
          obj.put(d0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "1")) {
          return;
       }
       this.r = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_TAB_HOST_SERVICE");
       this.s = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       this.t = this.t8("LIVE_GZONE_ACCOMPANY_SDK_SERVICE");
       return;
    }
}
