package com.yxcorp.gifshow.homepage.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.g;
import brd.t;
import t45.d;
import brd.z;
import yta.i;
import erd.g;
import crd.b;
import com.kwai.component.photo.reduce.h;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import android.view.View;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.kcube.TabIdentifier;
import on5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import k2b.e0;
import ia5.a;
import ha5.b;
import com.kuaishou.android.model.mix.ExtMeta;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kp.r1;
import com.kuaishou.android.model.feed.AggregateTemplateFeed;
import k2b.p3;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import k2b.u1;
import ekd.m1;
import yta.h;
import android.view.View$OnClickListener;
import yta.g;
import ha5.e;

public class b extends PresenterV2	// class@0017b1
{
    public String A;
    public long B;
    public String C;
    public View p;
    public View q;
    public CommonMeta r;
    public AggregateTemplateFeed s;
    public RecyclerFragment t;
    public int u;
    public AggregateTemplateMeta v;
    public TabIdentifier w;
    public e x;
    public b y;
    public h z;

    public void b(){
       super();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       this.X7(RxBus.f.f(g.class).observeOn(d.a).subscribe(new i(this)));
       this.z = new h(this.t);
       b tq = this.q;
       int i = (this.v.mHideCloseButton != null)? 8: 0;
       tq.setVisibility(i);
       this.r.mPosition = this.u;
       this.A = "following";
       tq = this.w;
       if (tq != null) {
          this.A = a.d(tq);
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "10")) {
          uob = this.r;
          if (uob.mShowed == null) {
             uob.mShowed = true;
             a.e(this.t, this.v.mContentType, this.A, new QPhoto(this.s), 1463, this.p);
             uob = this.y;
             if (uob != null) {
                uob.c(this.s, this.u, this.v);
             }
             uob = this.v;
             if (uob.mContentType == 204) {
                AggregateTemplateMeta mExtMeta = uob.mExtMeta;
                if (mExtMeta.isKaraokeEntry != null) {
                   this.C = "karaoke";
                }else if(!TextUtils.x(mExtMeta.mLiveStreamIds)){
                   this.C = "live";
                }else {
                   this.C = "photo";
                }
             }else if(r1.E3(this.s)){
                String id = this.s.getId();
                b tv = this.v;
                AggregateTemplateMeta mInnerFeedTy = tv.mInnerFeedType;
                String str = TextUtils.k(tv.mExpTag);
                CommonMeta mKsOrderId = this.r.mKsOrderId;
                if (!PatchProxy.isSupport(p3.class) || !PatchProxy.applyVoidFourRefs(id, Integer.valueOf(mInnerFeedTy), str, mKsOrderId, null, p3.class, "2")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "CITY_VOICE_PARTY_CARD";
                   uElementPack.name = id;
                   uElementPack.index = mInnerFeedTy;
                   ClientContent$ContentPackage uContentPack = p3.a();
                   ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
                   photoPackage.expTag = str;
                   uContentPack.photoPackage = photoPackage;
                   uContentPack.ksOrderInfoPackage = l0.a(mKsOrderId);
                   u1.u0(9, uElementPack, uContentPack);
                }
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.B = 0;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0782);
       this.p = m1.f(p0, 0x7f0a0923);
       m1.a(p0, new h(this), R.id.close);
       m1.a(p0, new g(this), R.id.container);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.r = this.q8(CommonMeta.class);
       this.s = this.q8(AggregateTemplateFeed.class);
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("ADAPTER_POSITION").intValue();
       this.v = this.q8(AggregateTemplateMeta.class);
       this.w = this.t8("HOME_TAB");
       this.x = this.t8("PHOTO_CLICK_LISTENER");
       this.y = this.t8("AGGREGATE_PHOTO_OPERATE_LISTENER");
       return;
    }
}
