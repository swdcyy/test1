package com.kuaishou.live.lite.growth.LiveLiteGrowthPresenter;
import b93.d;
import com.kuaishou.live.lite.growth.LiveLiteGrowthPresenter$a;
import com.kuaishou.live.lite.growth.LiveLiteGrowthPresenter$b;
import kb3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.watchtimer.b;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import aq5.d;
import ds5.c;
import ds5.a;
import c93.b;
import or5.d;
import e93.a;
import d93.a;
import tkd.b;
import tkd.d;
import vt5.e;
import android.app.Activity;
import st5.b$k;
import st5.b;
import com.kwai.robust.PatchProxyResult;
import xp5.g;
import java.lang.Number;
import com.kuaishou.live.lite.LiveLiteParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;
import com.kuaishou.android.live.model.QLivePlayConfig;
import xp5.a;
import u53.b;
import yy1.b;
import wt5.g;
import au5.b;
import com.yxcorp.gifshow.entity.QPhoto;
import or5.b;
import com.kwai.framework.model.feed.BaseFeed;

public class LiveLiteGrowthPresenter extends d	// class@000997
{
    public final c A;
    public final ActivityContext$b B;
    public final b C;
    public d v;
    public a w;
    public a x;
    public d y;
    public String z;

    public void LiveLiteGrowthPresenter(){
       super();
       this.A = new LiveLiteGrowthPresenter$a(this);
       this.B = new LiveLiteGrowthPresenter$b(this);
       this.C = new a(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGrowthPresenter.class, "3")) {
          return;
       }
       super.F8();
       b.e().a(this.d9(), this.c9());
       ActivityContext.i(this.B);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
       this.y.u5(this.C, uoaArray);
       this.w.gd(this.A);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGrowthPresenter.class, "8")) {
          return;
       }
       b.e().b(this.z);
       ActivityContext.k(this.B);
       this.w.fo(this.A);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
       this.y.G5(this.C, uoaArray);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGrowthPresenter.class, "1")) {
          return;
       }
       this.v = p0.a(d.class);
       this.w = p0.a(a.class);
       this.x = p0.a(a.class);
       this.y = p0.a(d.class);
       return;
    }
    public void Y8(a p0){
       PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGrowthPresenter.class, "2");
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGrowthPresenter.class, "4")) {
          return;
       }
       d.a(-1094279325).ha(this.getActivity(), b$k.b);
       return;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGrowthPresenter.class, "7")) {
          return;
       }
       d.a(-1094279325).fx(this.getActivity(), b$k.b);
       return;
    }
    public String c9(){
       String obj = PatchProxy.apply(null, this, LiveLiteGrowthPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = String.valueOf(this.getActivity().hashCode());
       this.z = obj;
       if (obj.isEmpty()) {
          this.z = this.v.getLiveStreamId();
       }
       return this.z;
    }
    public int d9(){
       boolean b1;
       LiveStreamFeed obj = PatchProxy.apply(null, this, LiveLiteGrowthPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.x.ok().getLiveStreamFeed();
       boolean b = true;
       if (obj != null) {
          LiveStreamFeed mLiveStreamM = obj.mLiveStreamModel;
          if (mLiveStreamM != null && mLiveStreamM.mIsGRPRCustomized != null) {
             b1 = true;
          label_002d :
             if (obj != null) {
                obj = obj.mMerchantData;
                if (obj != null && obj.isShopLive()) {
                label_003b :
                   return b.a(b1, b, this.y.r2(AudienceBizRelation.VOICE_PARTY), b.b(this.x.C0(), this.x.d()).c(), this.x.V0());
                }
             }
             b = false;
             goto label_003b ;
          }
       }
       b1 = false;
       goto label_002d ;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteGrowthPresenter.class, "6")) {
          return;
       }
       b.e().h(this.getActivity(), objArray);
       b.e().b(this.z);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGrowthPresenter.class, "5")) {
          return;
       }
       b.e().h(this.getActivity(), new QPhoto(this.v.j0()));
       b.e().a(this.d9(), this.c9());
       return;
    }
}
