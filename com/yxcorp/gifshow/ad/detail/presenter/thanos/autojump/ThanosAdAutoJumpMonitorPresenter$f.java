package com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$f;
import p49.a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Object;
import q35.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import q35.d;
import p49.c;
import p49.c$a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.photoad.AdTrackBlackUtil;
import java.lang.Boolean;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo;
import com.google.gson.JsonArray;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track;
import lnc.y0;
import mxb.j;
import com.yxcorp.gifshow.photoad.r;
import java.lang.StringBuilder;
import o49.g;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;

public final class ThanosAdAutoJumpMonitorPresenter$f implements a	// class@0016c6
{
    public final ThanosAdAutoJumpMonitorPresenter a;
    public final PhotoAdvertisement b;

    public void ThanosAdAutoJumpMonitorPresenter$f(ThanosAdAutoJumpMonitorPresenter p0,PhotoAdvertisement p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(c$a p0){
       g a;
       Boolean uBoolean;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdAutoJumpMonitorPresenter$f.class, "1")) {
          return;
       }
       p0.d(BusinessType.THANOS);
       p0.i(d.b);
       p0.h(c.Z.b().a());
       ThanosAdAutoJumpMonitorPresenter$f ta = this.a;
       ThanosAdAutoJumpMonitorPresenter$f tb = this.b;
       Objects.requireNonNull(ta);
       ThanosAdAutoJumpMonitorPresenter thanosAdAuto = ThanosAdAutoJumpMonitorPresenter.class;
       JsonObject jsonObject = PatchProxy.applyOneRefs(tb, ta, thanosAdAuto, "13");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          jsonObject.c0("url", tb.mUrl);
          PhotoAdvertisement$AdData adData = tb.getAdData();
          if (adData != null) {
             adData = adData.mH5ControlInfo;
             if (adData != null) {
                Integer integer = Integer.valueOf(adData.mH5PreloadType);
             label_0058 :
                jsonObject.a0("h5_preload_type", integer);
                jsonObject.H("enable_intercept_redirect_track", Boolean.valueOf(AdTrackBlackUtil.b.a()));
                PhotoAdvertisement mTrackRedire = tb.mTrackRedirectInfo;
                if (mTrackRedire != null) {
                   jsonObject.G("track_redirect_info", a.a.x(mTrackRedire));
                   tb.mTrackRedirectInfo = null;
                }
                mTrackRedire = tb.mAutoConversionInfo;
                integer = (mTrackRedire != null)? Integer.valueOf(mTrackRedire.mAutoConversionType): null;
                jsonObject.a0("auto_conversion_type", integer);
                if (!PatchProxy.applyVoidTwoRefs(jsonObject, tb, ta, thanosAdAuto, "14")) {
                   JsonArray jsonArray = new JsonArray();
                   PhotoAdvertisement mTracks = tb.mTracks;
                   if (mTracks != null) {
                      Iterator iterator = mTracks.iterator();
                      while (iterator.hasNext()) {
                         PhotoAdvertisement$Track track = iterator.next();
                         if (track != null) {
                            PhotoAdvertisement$Track mUrl = track.mUrl;
                            if (mUrl != null) {
                               boolean b = (mUrl.length() > 0)? true: false;
                               uBoolean = Boolean.valueOf(b);
                            label_00c7 :
                               if (y0.p(uBoolean)) {
                                  JsonObject jsonObject1 = new JsonObject();
                                  jsonObject1.a0("type", Integer.valueOf(track.mType));
                                  jsonObject1.c0("origin_url", track.mUrl);
                                  jsonObject1.c0("url", r.d(track.mUrl, track.mEnableDefaultMacro, track.mUrlOperationType, null, 0));
                                  jsonArray.G(jsonObject1);
                               }
                            }
                         }
                         uBoolean = null;
                         goto label_00c7 ;
                      }
                   }
                   ta.P8("tracks is "+jsonArray);
                   jsonObject.G("tracks", jsonArray);
                }
                a = g.a;
                ThanosAdAutoJumpMonitorPresenter q = ta.q;
                if (q == null) {
                   a.S("mPhoto");
                }
                a.e(jsonObject, q);
             }
          }
          a uoa = null;
          goto label_0058 ;
       }
       p0.f(jsonObject);
       return;
    }
}
