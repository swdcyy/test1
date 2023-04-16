package com.kuaishou.commercial.splash.presenter.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.splash.presenter.q$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.SplashInfo;
import ujc.g;
import android.view.View;
import wkd.b;
import tjc.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import brd.t;
import t45.d;
import brd.z;
import gz.j2;
import erd.g;
import crd.b;
import java.lang.Float;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.b9;
import gz.h2;
import com.kuaishou.commercial.splash.presenter.o;
import android.view.View$OnClickListener;
import android.view.ViewStub;
import android.widget.TextView;
import tjc.b;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.app.Activity;
import android.content.res.Resources;
import cw9.c;
import java.util.concurrent.TimeUnit;
import gz.k2;
import com.kuaishou.commercial.splash.presenter.p;

public class q extends PresenterV2	// class@001603
{
    public BaseFragment p;
    public QPhoto q;
    public SplashInfo r;
    public boolean s;
    public View t;
    public View u;
    public b v;
    public final h2 w;

    public void q(){
       super();
       this.w = new q$a(this);
    }
    public void E8(){
       boolean b;
       SplashInfo mSplashAdMat;
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "2")) {
          return;
       }
       q tq = this.q;
       PhotoAdvertisement$AdData obj = PatchProxy.applyOneRefs(tq, objArray, oq, "13");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tq != null && (tq.isAd() && (k.B(tq).mAdData != null && k.B(tq).mAdData.mSplashInfo != null))){
          b = true;
       }else {
          b = false;
       }
       RxBus rxBus = 2;
       if (b) {
          obj = k.B(this.q).mAdData.mSplashInfo;
          this.r = obj;
          mSplashAdMat = obj.mSplashAdMaterialType;
          if (mSplashAdMat == true || mSplashAdMat == rxBus) {
             this.s = true;
          }
       }
       if (!this.V8()) {
          return;
       }else {
          g og = new g();
          View view = this.m8();
          this.u = view;
          og.a = view;
          if (b.a(-1608526086).S() && this.W8()) {
             rxBus = RxBus.f;
             rxBus.b(og);
             t ot = rxBus.f(e.class);
             this.v = ot.observeOn(d.a).subscribe(new j2(this));
          }else {
             Float.isNaN(0x3f800000);
             if (TextUtils.isEmpty(this.r.mSplashAdFeedActionBarContent)) {
                return;
             }else {
                mSplashAdMat = this.r.mSplashAdMaterialType;
                if (mSplashAdMat == true || mSplashAdMat == rxBus) {
                   this.S8(this.R8());
                   this.P8();
                }
             }
          }
          return;
       }
    }
    public void J8(){
       q oq = q.class;
       if (PatchProxy.applyVoid(null, this, oq, "3")) {
          return;
       }
       if (this.V8()) {
          if (!PatchProxy.applyVoid(null, this, oq, "4")) {
             oq = this.t;
             if (oq != null) {
                oq.setVisibility(8);
             }
          }
          if (b.a(-1608526086).S()) {
             g og = new g();
             og.a = this.u;
             og.b = true;
             RxBus.f.b(og);
          }
          b9.a(this.v);
       }
       this.s = false;
       this.r = null;
       this.t = null;
       this.u = null;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, q.class, "7")) {
          return;
       }
       this.w.a();
       this.R8().setVisibility(0);
       this.R8().setOnClickListener(new o(this));
       return;
    }
    public final View R8(){
       Object obj = PatchProxy.apply(null, this, q.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.t == null) {
          this.t = this.m8().findViewById(0x7f0a3af2);
       }
       if (this.t == null) {
          this.t = this.m8().findViewById(0x7f0a3af5).inflate();
       }
       return this.t;
    }
    public final void S8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "11")) {
          return;
       }
       p0.findViewById(R.id.splash_feed_item_action_bar_text).setText(this.r.mSplashAdFeedActionBarContent);
       return;
    }
    public final boolean V8(){
       return this.s;
    }
    public final boolean W8(){
       b obj = PatchProxy.apply(null, this, q.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.V8()) {
          obj = b.a(-1608526086).a();
          if (obj != null) {
             obj = obj.b;
             if (obj != null && (r1.t1(obj)).equals(this.q.getPhotoId())) {
                return true;
             }
          }
       }
       return false;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(QPhoto.class);
       return;
    }
    public void onEventMainThread(e p0){
       q oq = q.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oq, "5")) {
          return;
       }
       if (p0.a != 4 || (!this.V8() || (this.W8() && !PatchProxy.applyVoid(null, this, oq, "9")))) {
          Activity activity = this.getActivity();
          if (activity != null && !TextUtils.isEmpty(this.r.mSplashAdFeedActionBarContent)) {
             this.X7(t.timer(500, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new k2(this, c.b(activity.getResources(), R.dimen.arg_RES_7f070eee)), p.b));
          }
       }
    label_005f :
       return;
    }
}
