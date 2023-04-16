package com.yxcorp.gifshow.activity.web.presenter.d;
import ai7.e;
import com.yxcorp.gifshow.activity.web.presenter.WebFullScreenVideoPresenter;
import java.lang.Object;
import com.kwai.player.qos.KwaiPlayerResultQos;
import java.util.Objects;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import nc6.b;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.WebVideoParam;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import lnc.i3;
import com.yxcorp.gifshow.log.model.CommonParams;
import mx8.n;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public final class d implements e	// class@0014c9
{
    public final WebFullScreenVideoPresenter a;
    public final long b;

    public void d(WebFullScreenVideoPresenter p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onRelease(KwaiPlayerResultQos p0){
       d ta = this.a;
       d tb = this.b;
       Objects.requireNonNull(ta);
       ClientStat$VideoStatEvent videoStatEve = new ClientStat$VideoStatEvent();
       videoStatEve.videoQosJson = (b.a())? p0.videoStatJson: p0.briefVideoStatJson;
       videoStatEve.sessionUuid = ta.A;
       videoStatEve.mediaType = 9;
       videoStatEve.duration = tb;
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.videoStatEvent = videoStatEve;
       ClientEvent$UrlPackage urlPackage = PatchProxy.apply(null, ta, WebFullScreenVideoPresenter.class, "9");
       if (urlPackage != PatchProxyResult.class) {
       }else {
          urlPackage = new ClientEvent$UrlPackage();
          urlPackage.category = 1;
          urlPackage.page2 = "YODA_SPLASH_VIDEO";
          urlPackage.params = "splash_id="+TextUtils.I(ta.p.mVideoId);
          if (!TextUtils.x(ta.p.pageParams)) {
             urlPackage.params = urlPackage.params+"&"+ta.p.pageParams;
          }
       }
       videoStatEve.urlPackage = urlPackage;
       videoStatEve.bizType = ta.p.mBizType;
       i3 oi3 = i3.f();
       oi3.d("cny23_action", "warm_up_main_stage");
       oi3.d("video_stat_biz_type", "cny_2023");
       videoStatEve.expParams = oi3.e();
       CommonParams uCommonParam = new CommonParams();
       uCommonParam.mServiceName = "cartoon";
       c.k(new n(statPackage, uCommonParam));
       return;
    }
}
