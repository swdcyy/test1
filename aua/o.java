package aua.o;
import com.yxcorp.gifshow.widget.m;
import aua.n;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p0;
import android.content.res.Resources;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import mxb.f0;
import com.kwai.framework.model.live.LiveTipInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.SearchParams;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import tkd.b;
import tkd.d;
import os5.l;
import android.app.Activity;
import ja5.h;
import im8.f;
import java.lang.Integer;
import ia5.h;
import com.kuaishou.android.model.mix.w;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.android.model.feed.PhotoType;
import kp.r1;
import java.lang.Long;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import l66.c;
import dda.h;
import m66.a;
import ha5.e;

public class o extends m	// class@00031a
{
    public final n c;

    public void o(n p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       if (!p0.C(this.c.getContext())) {
          i.d(R.style.arg_RES_7f110668, this.c.l8().getString(R.string.arg_RES_7f1038e7));
          return;
       }else {
          o tc = this.c;
          if (tc.w.mLiveTipInfo == null) {
             return;
          }
          if (tc.y.isAd()) {
             o tc1 = this.c;
             b.a(-762347696).u1(tc1.w.mLiveTipInfo.mLiveStreamId, k.B(tc1.y));
          }
          LiveAudienceParam$a uoa = new LiveAudienceParam$a();
          uoa.i(this.c.w.mLiveTipInfo.mLiveStreamId);
          uoa.n(this.c.w.mLiveTipInfo.mExptag);
          uoa.m(SearchParams.getSearchParams(this.c.y.mEntity));
          uoa.g(5);
          d.a(-1492894991).m1(this.c.getActivity(), uoa.a());
          tc = this.c;
          h r = tc.r;
          i = tc.u.get().intValue();
          h oh = h.class;
          if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(r, Integer.valueOf(i), null, oh, "6")) {
             LiveTipInfo liveTipInfo = w.X(r);
             if (liveTipInfo != null) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action = 810;
                uElementPack.name = "click_head";
                ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
                liveStreamPa.identity = liveTipInfo.mLiveStreamId;
                ClientContent$PhotoPackage photoPackage = w1.f(r);
                photoPackage.type = r1.S1(r).toInt();
                photoPackage.identity = r1.t1(r);
                photoPackage.authorId = Long.valueOf(r1.U1(r)).longValue();
                photoPackage.expTag = liveTipInfo.mExptag;
                i = i + 1;
                photoPackage.index = (long)i;
                photoPackage.llsid = TextUtils.k(r1.h1(r));
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                uContentPack.photoPackage = photoPackage;
                u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setCommonParams(a.a(r, i)).setFeedLogCtx(r1.O0(r)));
             }
          }
          o tc2 = this.c;
          c.a().b(new h(tc2.r, tc2.w.mLiveTipInfo.mLiveStreamId));
          tc = this.c;
          n z = tc.z;
          if (z != null) {
             z.b(tc.r, tc.u.get().intValue());
          }
          return;
       }
    }
}
