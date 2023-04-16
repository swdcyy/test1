package com.yxcorp.gifshow.homepage.serchcard.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.yxcorp.gifshow.homepage.serchcard.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.homepage.serchcard.d;
import l66.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.c;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.homepage.serchcard.a;
import erd.g;
import crd.b;
import lua.a;
import com.yxcorp.gifshow.homepage.serchcard.d$a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;
import com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import com.kwai.framework.model.feed.BaseFeed;
import io.reactivex.subjects.PublishSubject;
import dda.d;
import com.kuaishou.android.model.mix.w;
import m66.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import uh5.e;
import android.widget.ImageView;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.VideoQualityInfo;
import java.lang.System;

public abstract class b extends PresenterV2	// class@0017f9
{
    public BaseFeed p;
    public QPhoto q;
    public RecyclerFragment r;
    public KwaiImageView s;
    public ViewGroup t;
    public d u;
    public PublishSubject v;
    public d$a w;
    public static final int x;

    static {
       b.x = a1.e(220.00f);
    }
    public void b(){
       super();
       this.w = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.u = b.a(0x325d46d9);
       b.a(0x6d2a4fdd).a(this);
       this.X7(RxBus.f.g(c.class, RxBus$ThreadMode.MAIN).subscribe(new a(this)));
       b tv = this.v;
       if (tv != null) {
          this.X7(tv.subscribe(new a(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b.a(0x6d2a4fdd).c(this);
       b tu = this.u;
       if (tu != null) {
          tu.f();
          this.u.k(null);
          this.u = null;
       }
       return;
    }
    public abstract boolean P8();
    public int R8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null || q.f(this.r.q().getItems())) {
          return -1;
       }
       return this.r.q().getItems().indexOf(p0);
    }
    public void S8(){
    }
    public final boolean V8(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (this.u.b() == -1) {
          return b;
       }
       if (this.u.b() == this.R8(this.q)) {
          b = true;
       }
       return b;
    }
    public void W8(SearchCardMeta p0){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3105);
       this.t = m1.f(p0, 0x7f0a0923);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("FRAGMENT");
       this.p = this.r8("feed");
       this.v = this.t8("HOT_ITEM_REAL_ACTION_OBSERVER");
       return;
    }
    public void onEventMainThread(d p0){
       boolean b;
       boolean b1;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "5")) {
          return;
       }
       b = false;
       w.L1(this.q.mEntity, b);
       this.S8();
       w.C1(this.q.mEntity, true);
       if (TextUtils.n(this.q.getPhotoId(), p0.a.getId()) && !e.f()) {
          this.u.f();
          this.u.a();
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object obj = PatchProxy.apply(null, this, uob, "9");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(this.s.getMeasuredHeight() >= b.x && (!this.q.isAd() && (!this.q.isImageType() && !this.q.isLiveStream()))){
             Object obj1 = PatchProxy.apply(null, this, uob, "10");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(this.q.getPhotoMeta() != null && (this.q.getPhotoMeta().mHasSurvey != null || (this.q.getPhotoMeta().mVideoQualityInfo != null && !q.f(this.q.getPhotoMeta().mVideoQualityInfo.mScoreMarkList)))){
                b1 = true;
             }else {
                b1 = false;
             }
             if (!b1) {
             label_00b9 :
                b1 = b;
             }
          }
       label_00b8 :
          b = 1;
          goto label_00b9 ;
          if (b1) {
             return;
          }else {
             this.u.h(System.currentTimeMillis());
             this.u.g(this.R8(this.q));
             this.u.i(p0.a.getId());
             this.u.j(System.currentTimeMillis());
             p0.j = this.q;
          }
       }
       return;
    }
}
