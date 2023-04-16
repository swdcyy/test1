package f12.m;
import d51.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import dw6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import com.kuaishou.android.live.model.i;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import tkd.b;
import tkd.d;
import os5.l;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.feed.SearchParams;
import java.lang.System;
import dq3.b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import kp.r1;
import com.kuaishou.android.live.model.QLivePlayConfig;
import u53.b;
import android.content.Context;
import r12.g;
import bw6.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xa2.k;
import lm9.a;
import pw6.a;
import com.kwai.library.groot.framework.viewitem.GrootEmptyFragment;
import pw6.d;
import f12.f;
import f12.f$b;
import f12.f$a;
import com.kwai.feature.api.live.base.model.LivePrivateAutoCheckParams;
import com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment$b;
import com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment;
import f12.o;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;

public class m extends a	// class@00283f
{
    public final LiveBizParam a;
    public static final boolean b;

    static {
       m.b = a.t().u("SOURCE_LIVE").d("newLiveSlideAudienceParam", false);
    }
    public void m(LiveBizParam p0){
       super();
       this.a = p0;
    }
    public void a(b p0,int p1){
       LiveBizParam mLiveAudienc;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, om, "3")) {
          return;
       }
       if (p1 == 1) {
          return;
       }
       b d = p0.d;
       LiveStreamFeed liveStreamFe = p0.b(LiveStreamFeed.class);
       QPhoto qPhoto = new QPhoto(liveStreamFe);
       m ta = this.a;
       int i = (ta.mReferLiveSourceType > null)? x.h(liveStreamFe): ta.mLiveSourceType;
       if (i.i(liveStreamFe) > 0) {
          this.a.mLiveSourceType = i.i(liveStreamFe);
       }else if(k.B(qPhoto) != null && k.B(qPhoto).mAdLiveForFansTop != null){
          this.a.mLiveSourceType = 12;
       }else if(i > null){
          this.a.mLiveSourceType = i;
       }else {
          this.a.mLiveSourceType = d.a(-1492894991).KL(this.a.mPhotoDetailSource);
       }
       if (m.b) {
          mLiveAudienc = this.a.mLiveAudienceParam;
          if (mLiveAudienc != null) {
             LiveAudienceParam mPhoto = mLiveAudienc.mPhoto;
             if (mPhoto != null && TextUtils.n(mPhoto.getId(), liveStreamFe.getId())) {
                mLiveAudienc = this.a.mLiveAudienceParam;
                if (mLiveAudienc.mSearchParams == null) {
                   mLiveAudienc.mSearchParams = SearchParams.getSearchParams(liveStreamFe);
                }
                if (TextUtils.x(mLiveAudienc.mLiveSourceUrl) && !TextUtils.x(this.a.mLiveSourceUrl)) {
                   mLiveAudienc.mLiveSourceUrl = this.a.mLiveSourceUrl;
                }
                if (mLiveAudienc.getStartActivityTime() <= 0) {
                   mLiveAudienc.setStartActivityTime(System.currentTimeMillis());
                }
                mLiveAudienc.mIndexInAdapter = d;
                if (mLiveAudienc.mLiveSourceType == null) {
                   mLiveAudienc.mLiveSourceType = b.a(this.a.mLiveSourceType, liveStreamFe, null, null, null);
                }
                if (mLiveAudienc.mPhoto == null) {
                   mLiveAudienc.mPhoto = liveStreamFe;
                }
             }else {
             label_00e0 :
                m ta1 = this.a;
                LiveBizParam mLiveAudienc1 = ta1.mLiveAudienceParam;
                if (mLiveAudienc1 != null && mLiveAudienc1.mPhoto == liveStreamFe) {
                   mLiveAudienc = mLiveAudienc1;
                }else {
                   LiveAudienceParam$a uoa = new LiveAudienceParam$a();
                   uoa.j(liveStreamFe);
                   uoa.g(b.a(ta1.mLiveSourceType, liveStreamFe, null, null, null));
                   if (!TextUtils.x(this.a.mLiveSourceUrl)) {
                      uoa.h(this.a.mLiveSourceUrl);
                   }
                   uoa.d(d);
                   uoa.v(System.currentTimeMillis());
                   uoa.m(SearchParams.getSearchParams(liveStreamFe));
                   mPhoto = uoa.a();
                }
             }
          }else {
             goto label_00e0 ;
          }
       }else {
          goto label_00e0 ;
       }
       g.h(null, b.j(liveStreamFe.mConfig, r1.U1(liveStreamFe)), liveStreamFe);
       p0.h(LiveAudienceParam.LIVE_AUDIENCE_PARAM_KEY, mLiveAudienc);
       return;
    }
    public int b(a p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(k.e(this.a)){
          i = 1;
       }else if(d.a(-1638991736).jm(p0)){
          i = 3;
       }else {
          i = 0;
       }
       return i;
    }
    public a e(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p0) {
          int i = 1;
          if (p0 != i) {
             if (p0 != 3) {
                return new a(new GrootEmptyFragment(), p0);
             }else {
                return d.a(-1638991736).fz(this.a);
             }
          }else {
             LiveBizParam mLiveAudienc = this.a.mLiveAudienceParam;
             Object obj1 = null;
             f uof = PatchProxy.applyOneRefs(mLiveAudienc, obj1, f.class, "1");
             if (uof != patchProxyRe) {
             }else {
                f$b uob = new f$b(obj1);
                uof = new f(LiveAudiencePrivatePasswordFragment.eh(mLiveAudienc.mPhoto, mLiveAudienc.mLivePrivateAutoCheckParams, uob), i, mLiveAudienc, uob);
             }
             return uof;
          }
       }else {
          return new o(d.a(-1492894991).vz(), p0);
       }
    }
}
