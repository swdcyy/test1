package com.kuaishou.commercial.splash.playable.g;
import im8.g;
import com.smile.gifmaker.mvps.presenter.a;
import java.lang.Object;
import wkd.b;
import tjc.c;
import tjc.b;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import com.kuaishou.commercial.splash.SplashUtils;
import ez.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.splash.playable.j;
import ez.q0;
import ez.w;
import com.kuaishou.commercial.splash.playable.c;
import com.kuaishou.commercial.splash.playable.k;
import com.kuaishou.commercial.splash.presenter.n;
import ez.n;
import com.kuaishou.commercial.splash.playable.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kwai.framework.model.feed.BaseFeed;
import yx.j0;
import com.kuaishou.android.model.ads.SplashInfo;
import tw.l;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import com.kuaishou.commercial.splash.playable.e;
import com.kuaishou.commercial.splash.playable.f;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kuaishou.commercial.splash.SplashV2Activity;
import com.kuaishou.commercial.splash.v3.view.SplashV3Activity;
import tjc.a;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;
import mxb.j0;
import mxb.i0;
import ez.x;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import ekd.i;
import ez.b0;
import java.util.Map;
import java.util.HashMap;
import io.reactivex.subjects.PublishSubject;

public class g extends a implements g	// class@0015bf
{
    public boolean A;
    public BaseFeed r;
    public f s;
    public PublishSubject t;
    public m u;
    public FrameLayout v;
    public FrameLayout w;
    public SplashInfo$PlayablePopupInfo x;
    public int y;
    public boolean z;
    public static float B = 0.000000;

    public void g(){
       super(0, 0);
    }
    public void g(int p0,boolean p1){
       SplashInfo$PlayablePopupInfo mPopupShowTy;
       super();
       if (!p0) {
          int i = -1608526086;
          if (b.a(i).getState()) {
             SplashInfo$PlayablePopupInfo playablePopu = SplashUtils.t(b.a(i).a());
             if (playablePopu != null) {
                mPopupShowTy = playablePopu.mPopupShowType;
             }
          }
       }
       this.z = p1;
       this.y = mPopupShowTy;
       this.U7(new k());
       if (mPopupShowTy == 2) {
          this.U7(new j());
          this.U7(new q0());
       }else {
          this.U7(new j());
          this.U7(new w());
          this.U7(new c());
          this.U7(new k());
       }
       if (this.z != null) {
          this.U7(new n());
          this.U7(new n());
       }else if(mPopupShowTy == 2){
          this.U7(new m());
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       if (!b.a(-1608526086).getState()) {
          return;
       }
       g ts = this.s;
       if (ts == null || (ts.get().booleanValue() && this.r != null)) {
          if (!d.a(-536296199).bY(this.r)) {
             Object[] objArray = new Object[0];
             j0.f("SplashPlayablePopupPresenter", "can not ShowPlayablePopup", objArray);
             return;
          }else {
             SplashInfo splashInfo = l.e(this.r);
             if (l.i(splashInfo)) {
                return;
             }else {
                this.x = splashInfo.mPlayableInfo.mPlayablePopupInfo;
                this.S8();
                this.t.subscribe(new e(this), f.b);
             }
          }
       }
       return;
    }
    public final boolean R8(){
       Activity obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       boolean b = (!obj instanceof SplashV2Activity && (obj instanceof SplashV3Activity || obj instanceof a))? true: false;
       return b;
    }
    public final void S8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "6")) {
          return;
       }
       int i = 0x7f0a30ed;
       if (this.m8().findViewById(i) == null) {
          if (this.y == 2) {
             a.c(LayoutInflater.from(this.getActivity()), R.layout.arg_RES_7f0d08bb, this.m8(), true);
          }else {
             a.c(LayoutInflater.from(this.getActivity()), R.layout.arg_RES_7f0d08ba, this.m8(), true);
          }
       }
       this.v = this.m8().findViewById(i);
       this.w = this.m8().findViewById(0x7f0a30ec);
       if (this.y != 2 && !PatchProxy.applyVoid(objArray, this, og, "7")) {
          ViewGroup$MarginLayoutParams layoutParams = this.v.getLayoutParams();
          int i1 = (int)((float)n.z(this.getActivity()) * 0.13f);
          layoutParams.leftMargin = i1;
          layoutParams.rightMargin = i1;
          float f = (float)((n.x(this.getActivity()) - i1) - i1);
          layoutParams.height = (int)(0x3fe3d70a * f);
          this.v.setLayoutParams(layoutParams);
          if (this.x.mPopupMaterialType == true) {
             layoutParams = this.w.getLayoutParams();
             layoutParams.height = (int)(f * g.B);
             this.w.setLayoutParams(layoutParams);
          }else {
             this.w.setVisibility(8);
          }
       }
       this.P8(true);
       i0.a().e(630, this.r).d(new x(this)).a();
       Activity uActivity = (!this.getActivity() instanceof KwaiYodaWebViewActivity || (this.getActivity().isImmersiveMode() || (!this.getActivity() instanceof KwaiWebViewActivity || (this.getActivity().isImmersiveMode() || this.R8()))))? 1: null;
       if (!uActivity) {
          this.A = true;
          this.getActivity().findViewById(0x1020002).setPadding(0, 0, 0, 0);
          View view = this.getActivity().findViewById(R.id.title_root);
          if (view != null) {
             view.getLayoutParams().topMargin = n.A(this.getActivity());
          }
          i.h(this.getActivity(), 0, 0);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new b0());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.r = this.s8(BaseFeed.class);
       this.s = this.w8("AD_WEB_ENABLE_PLAYABLE_POPUP");
       this.t = this.r8("POPUP_HOLDER_VISIBLE_STATE_CHANGED");
       return;
    }
}
