package com.kuaishou.live.lite.share.h;
import mhc.n1;
import or5.d;
import java.lang.String;
import xp5.g;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import uo7.k;
import rq4.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonElement;
import sx1.j;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent;
import com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent$LiveShareStatus;
import java.lang.Throwable;
import java.lang.Integer;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import mhc.d2;
import com.kuaishou.live.lite.share.d;
import com.kuaishou.live.lite.share.e;
import com.kuaishou.live.lite.share.f;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import sx1.f;
import sx1.e;
import brd.t;
import cjd.e;
import erd.o;
import dd3.h;
import com.kuaishou.live.lite.share.g;
import erd.g;
import crd.b;

public class h extends n1	// class@000b1b
{
    public final String b;
    public final String c;
    public final LiveStreamFeedWrapper d;
    public Object e;

    public void h(d p0){
       super();
       this.b = p0.getLiveStreamId();
       this.c = p0.d();
       this.d = p0.r5();
    }
    public void f(k p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       h tb = this.b;
       h tc = this.c;
       if (!TextUtils.x(tb)) {
          jsonObject.c0("live_stream_id", tb);
       }
       if (!TextUtils.x(tc)) {
          jsonObject.c0("author_id", tc);
       }
       tb = this.d;
       String str = jsonObject.toString();
       if (!PatchProxy.applyVoidFourRefs(p1, tb, str, null, null, j.class, "4")) {
          p1.d = 24;
          p1.g = 1;
          p1.j = TextUtils.I(tb.getUserId());
          p1.k = TextUtils.I(tb.getPhotoId());
          p1.p = TextUtils.I(tb.getExpTag());
          if (!TextUtils.x(str)) {
             p1.v = str;
          }
          if (!TextUtils.x(null)) {
             p1.H = null;
          }
       }
       return;
    }
    public void l(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "4")) {
          return;
       }
       super.l(p0, p1);
       b.Z(LiveLiteLogTag.SHARE, "LiveLiteShareListener.onCancel");
       this.q(p0, 3);
       RxBus.f.b(new LiveShareStatusEvent(LiveShareStatusEvent$LiveShareStatus.CANCEL, this.e, p1.mActionUrl));
       return;
    }
    public void m(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "3")) {
          return;
       }
       super.m(p0, p1, p2);
       b.Z(LiveLiteLogTag.SHARE, "LiveLiteShareListener.onFail");
       this.q(p0, 2);
       RxBus.f.b(new LiveShareStatusEvent(LiveShareStatusEvent$LiveShareStatus.FAIL, this.e, p1.mActionUrl));
       return;
    }
    public void p(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "2")) {
          return;
       }
       super.p(p0, p1);
       b.Z(LiveLiteLogTag.SHARE, "LiveLiteShareListener.onSuccess");
       this.r(p0, 1, p1.mActionUrl);
       return;
    }
    public final void q(k p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oh, "5")) {
          return;
       }
       this.r(p0, p1, null);
       return;
    }
    public final void r(k p0,int p1,String p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, h.class, "6")) {
          return;
       }
       ShareAnyResponse shareAnyResp = p0.r();
       String str = (shareAnyResp == null)? null: shareAnyResp.mShareAnyData.mShareChannel;
       e.b().a(2, this.b, d2.a(str), p1, Integer.valueOf(5), k0.c(shareAnyResp, d.a, e.a, f.a).or(""), null).map(new e()).subscribe(new h(this, p1, p2), g.b);
       return;
    }
}
