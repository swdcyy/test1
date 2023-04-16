package com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.AdLiveConversionObservable$mOpenLiveConsumer$2$a;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.AdLiveConversionObservable$mOpenLiveConsumer$2;
import java.lang.Object;
import v19.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.AdLiveConversionObservable;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.PhotoMeta;
import msd.a;
import tkd.b;
import tkd.d;
import lm9.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Number;
import p1a.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import gz8.d;
import com.kwai.framework.model.live.LiveTipInfo;
import wkd.b;
import mxb.f0;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kuaishou.android.model.feed.SearchParams;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.framework.abtest.f;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import os5.e;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import e17.i;
import p49.f;
import p49.c;
import p49.c$a;
import p49.f$a;
import rz8.a;
import p49.a;
import yx.j0;

public final class AdLiveConversionObservable$mOpenLiveConsumer$2$a implements g	// class@0015a2
{
    public final AdLiveConversionObservable$mOpenLiveConsumer$2 b;

    public void AdLiveConversionObservable$mOpenLiveConsumer$2$a(AdLiveConversionObservable$mOpenLiveConsumer$2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       AdLiveConversionObservable$mOpenLiveConsumer$2 this$0;
       BaseFeed uBaseFeed1;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdLiveConversionObservable$mOpenLiveConsumer$2$a.class, "1")) {
       }else if(a.g(p0.a.getPhotoId(), this.b.this$0.c.getPhotoId()) ^ 0x01){
          PhotoMeta photoMeta = this.b.this$0.c.getPhotoMeta();
          BaseFeed uBaseFeed = null;
          photoMeta = (photoMeta != null)? photoMeta.mLiveTipInfo: uBaseFeed;
          Object obj = this.b.this$0.f.invoke();
          if (obj != null) {
             d.a(-1638991736).Tq(obj.getEntity());
             uBaseFeed = obj.getLiveStreamId();
             this$0 = this.b.this$0;
             d.b(this$0.b, this$0.c, this$0.d.invoke().intValue(), obj, this.b.this$0.e.invoke(), false);
          }else if(this.b.this$0.c.isAd() && photoMeta != null){
             uBaseFeed = photoMeta.mLiveStreamId;
             b.a(-762347696).u1(photoMeta.mLiveStreamId, k.B(this.b.this$0.c));
             LiveAudienceParam$a uoa = new LiveAudienceParam$a();
             uoa.i(photoMeta.mLiveStreamId);
             uoa.n(photoMeta.mExptag);
             uoa.m(SearchParams.getSearchParams(this.b.this$0.c.mEntity));
             uoa.g(5);
             LiveAudienceParam liveAudience = uoa.a();
             if (!f.a("shouldJumpLiveSlide")) {
                a.o(liveAudience, "liveAudienceParam");
                AdProcessUtils.n(this.b.this$0.b.getActivity(), liveAudience);
             }else {
                LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
                uob.o(liveAudience.mLiveSourceType);
                uob.n(78);
                uob.m(liveAudience);
                uob.v(d.a.a(this.b.this$0.b));
                uob.q(liveAudience.mLiveStreamId);
                uob.D(liveAudience.mLiveStreamId);
                FragmentActivity activity = this.b.this$0.b.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                d.a(-1835681758).b1(activity, uob.a());
             }
          }else {
             i.a(R.style.arg_RES_7f110668, 0x7f1020a8);
             this$0 = this.b.this$0;
             Objects.requireNonNull(this$0);
             if (!PatchProxy.applyVoid(uBaseFeed, this$0, AdLiveConversionObservable.class, "4")) {
                f.a.a(c.Z.d()).g(new a(this$0));
             }
             Object[] objArray = new Object[0];
             j0.a("adVideoLive", "live end", objArray);
          }
          a.o(p0, "it");
          this.b.this$0.b(p0, uBaseFeed);
       }
       return;
    }
}
