package com.kuaishou.live.ad.fanstop.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sr5.a;
import im8.f;
import java.lang.Boolean;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.ad.fanstop.i$a;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import xq5.c;
import com.kwai.robust.PatchProxyResult;
import hn5.n;
import hn5.m;
import android.content.Context;

public class i extends PresenterV2	// class@0009a8
{
    public a p;
    public LiveAudienceParam q;
    public f r;
    public String s;
    public boolean t;

    public void i(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       i tp = this.p;
       if (tp == null) {
          return;
       }
       if (!tp.v()) {
          return;
       }
       tp = this.r;
       boolean b = (tp != null && !tp.get().booleanValue())? true: false;
       this.t = b;
       tp = this.q;
       if (tp != null) {
          LiveAudienceParam mPhoto = tp.mPhoto;
          if (mPhoto != null) {
             this.s = r1.w0(mPhoto).mKsOrderId;
          }
       }
       if (!TextUtils.x(this.s) && this.P8()) {
          this.p.h1().P4(new i$a(this));
       }
       return;
    }
    public final boolean P8(){
       i obj = PatchProxy.apply(null, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (m.a().U3(this.getContext())) {
          return b;
       }
       obj = this.q;
       if (obj != null) {
          LiveAudienceParam mLiveSourceT = obj.mLiveSourceType;
          if (mLiveSourceT == 6 || mLiveSourceT == 4) {
          label_0032 :
             return b;
          }
       }
       b = false;
       goto label_0032 ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.t8("LIVE_PLAY_CALLER_CONTEXT");
       this.q = this.t8("LIVE_AUDIENCE_PARAM");
       this.r = this.w8("DETAIL_FROM_SLIDE");
       return;
    }
}
