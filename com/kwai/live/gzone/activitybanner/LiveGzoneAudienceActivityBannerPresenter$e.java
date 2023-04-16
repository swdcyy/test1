package com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$e;
import h47.b;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter;
import java.lang.Object;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.bean.LiveGzoneActivityBanner;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import ekd.j;
import java.util.Objects;
import java.lang.Boolean;
import java.util.ArrayList;
import f37.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Collection;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$LiveGzoneBannerLruMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.Integer;
import oq5.c;
import oq5.a;
import y43.a;
import mw1.d;
import mw1.b;
import lt5.b;
import lt5.a;
import iq5.b;
import iq5.a;
import mq5.h;
import mq5.b;
import j77.f;
import j77.a;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import j47.b;
import t37.o;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import java.lang.Float;
import java.lang.Number;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import com.yxcorp.utility.n;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;
import t37.p;
import android.view.View$OnClickListener;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import t37.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.image.KwaiImageView;
import t37.d;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.FrameLayout;
import android.widget.TextView;
import t37.q;
import t37.r;
import t37.j;
import t37.c;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import tkd.b;
import tkd.d;
import oq3.a;
import lp3.e;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.live.gzone.activitybanner.a;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import t37.l;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import uxc.e;
import t37.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public class LiveGzoneAudienceActivityBannerPresenter$e implements b	// class@000c56
{
    public final LiveGzoneAudienceActivityBannerPresenter a;

    public void LiveGzoneAudienceActivityBannerPresenter$e(LiveGzoneAudienceActivityBannerPresenter p0){
       this.a = p0;
       super();
    }
    public void a(LiveGzoneConfigResponse p0){
       boolean b;
       int i1;
       View view;
       int i2;
       KwaiImageView kwaiImageVie;
       LiveGzoneAudienceActivityBannerPresenter s;
       a a;
       Object[] objArray;
       List list;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGzoneAudienceActivityBannerPresenter liveGzoneAud = LiveGzoneAudienceActivityBannerPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceActivityBannerPresenter$e.class, "1")) {
          return;
       }
       this.a.Z8();
       LiveGzoneConfigResponse mLiveGzoneAc = p0.mLiveGzoneActivityBanner;
       if (mLiveGzoneAc != null && !TextUtils.x(mLiveGzoneAc.mContentLink)) {
          if (!QCurrentUser.me().isLogined()) {
             return;
          }else {
             mLiveGzoneAc = p0.mLiveGzoneActivityBanner;
             if (mLiveGzoneAc.mEnableImageBanner != null && j.h(mLiveGzoneAc.mImageBannerUrls)) {
                return;
             }else {
                LiveGzoneAudienceActivityBannerPresenter$e ta = this.a;
                LiveGzoneConfigResponse mLiveGzoneAc1 = p0.mLiveGzoneActivityBanner;
                Objects.requireNonNull(ta);
                LiveGzoneAudienceActivityBannerPresenter obj = PatchProxy.applyOneRefs(mLiveGzoneAc1, ta, liveGzoneAud, "29");
                String str = "user";
                int i = 2;
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else if(mLiveGzoneAc1.mBannerCloseType != i){
                   b = true;
                }else {
                   ta.p = new ArrayList();
                   ArrayList uArrayList = ArrayList.class;
                   String str1 = a.a.getString(b.d(str)+"live_gzone_banner_close_list", "");
                   objArray = (str1 == null || str1 == "")? null: b.a(str1, uArrayList);
                   if (objArray != null) {
                      ta.p.addAll(objArray);
                   }
                   b = ta.p.contains(mLiveGzoneAc1.mBannerId) ^ 1;
                }
                if (!b) {
                   return;
                }else {
                   ta = this.a;
                   mLiveGzoneAc1 = p0.mLiveGzoneActivityBanner;
                   Objects.requireNonNull(ta);
                   obj = PatchProxy.applyOneRefs(mLiveGzoneAc1, ta, liveGzoneAud, "30");
                   if (obj != patchProxyRe) {
                      b = obj.booleanValue();
                   }else if(mLiveGzoneAc1.mMaxDisplayTimes == null){
                      ta.q = new LiveGzoneAudienceActivityBannerPresenter$LiveGzoneBannerLruMap();
                      Type a1 = LiveGzoneAudienceActivityBannerPresenter.a1;
                      str = a.a.getString(b.d(str)+"live_gzone_banner_displayed_times_map", "{}");
                      objArray = (str == null || str == "")? null: b.a(str, a1);
                      if (objArray != null) {
                         ta.q.putAll(objArray);
                      }
                      if (ta.q.containsKey(mLiveGzoneAc1.mBannerId) && ta.q.get(mLiveGzoneAc1.mBannerId).intValue() >= mLiveGzoneAc1.mMaxDisplayTimes) {
                         b = true;
                      }
                   }
                label_0117 :
                   b = false;
                   if (b) {
                      return;
                   }else {
                      ta = this.a;
                      ta.U0 = p0.mLiveGzoneActivityBanner;
                      Objects.requireNonNull(ta);
                      if (!PatchProxy.applyVoid(null, ta, liveGzoneAud, "5")) {
                         ta.K.H6(ta.V);
                         a = ta.J.A;
                         if (a != null) {
                            a.Y3(ta.Z);
                         }
                         s = ta.N;
                         if (s != null) {
                            s.y2(ta.U);
                         }
                         a = ta.J.W0;
                         if (a != null) {
                            a.b(ta.W);
                         }
                         ta.J.z.Km(ta.X0);
                         a = ta.J.l;
                         if (a != null) {
                            a.l(ta.Y0);
                         }
                         a[] uoaArray = new a[]{AudienceBizRelation.PK};
                         ta.J.D.u5(ta.X, uoaArray);
                         s = ta.J;
                         if (s.s != null) {
                            s.K.P4(new o(ta));
                         }
                      }
                      ta = this.a;
                      p0 = p0.mLiveGzoneActivityBanner;
                      Objects.requireNonNull(ta);
                      if (!PatchProxy.applyVoidOneRefs(p0, ta, liveGzoneAud, "16")) {
                         LiveGzoneActivityBanner mWidthHeight = p0.mWidthHeightRatio;
                         if (PatchProxy.isSupport(liveGzoneAud)) {
                            obj = PatchProxy.applyOneRefs(Float.valueOf(mWidthHeight), ta, liveGzoneAud, "14");
                            if (obj != patchProxyRe) {
                               i1 = obj.intValue();
                            label_01d8 :
                               ta.W0 = i1;
                               if (ta.x == null) {
                                  RelativeLayout relativeLayo = ta.r.inflate();
                                  ta.x = relativeLayo;
                                  view = relativeLayo.findViewById(R.id.live_gzone_activity_banner_anchor_view);
                                  ta.w = view;
                                  view.getLayoutParams().height = ta.W0;
                                  view = m1.f(ta.x, R.id.live_gzone_audience_activity_close_image_view);
                                  ta.v = view;
                                  view.setVisibility(0);
                                  ta.v.setOnClickListener(new p(ta));
                                  ClientContent$LiveStreamPackage liveStreamPa = ta.J.m.a();
                                  obj = ta.U0;
                                  if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, obj, null, a.class, "7")) {
                                     ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                                     uElementPack.action2 = "SHOW_LIVE_WATCH_BANNER_CLOSE_BTN";
                                     uElementPack.params = a.b(obj);
                                     u1.u0(6, uElementPack, a.c(liveStreamPa));
                                  }
                               }
                               i2 = 8;
                               if (p0.mEnableImageBanner != null) {
                                  if (!PatchProxy.applyVoid(null, ta, liveGzoneAud, "17")) {
                                     if (ta.s == null) {
                                        kwaiImageVie = ta.x.findViewById(R.id.live_gzone_audience_activity_image_banner_view_stub).inflate();
                                        ta.s = kwaiImageVie;
                                        kwaiImageVie.setOnClickListener(new d(ta));
                                     }
                                     ta.s.setVisibility(0);
                                     kwaiImageVie.height = ta.W0;
                                     ta.s.U(ta.U0.mImageBannerUrls);
                                     LiveGzoneAudienceActivityBannerPresenter t = ta.t;
                                     if (t != null) {
                                        t.setVisibility(i2);
                                     }
                                     ta.S = 1;
                                     ta.e9(i, 0);
                                     a.e(ta.S, 1, ta.J.m.a(), ta.U0);
                                  }
                               }else if(PatchProxy.applyVoidOneRefs(p0, ta, liveGzoneAud, "18")){
                                  if (ta.t == null) {
                                     view = ta.x.findViewById(R.id.live_gzone_audience_activity_h5_banner_view_stub).inflate();
                                     ta.t = view;
                                     ta.y = view.findViewById(0x7f0a1dd2);
                                     ta.z = ta.t.findViewById(0x7f0a1dd1);
                                     ta.B = ta.t.findViewById(0x7f0a1dcf);
                                     view = ta.t.findViewById(R.id.live_gzone_activity_banner_top_empty_view);
                                     ta.E = view;
                                     view.setOnClickListener(new q(ta));
                                     ta.A = ta.t.findViewById(0x7f0a1dd4);
                                     ta.B.setOnClickListener(new r(ta));
                                     ta.A.setOnClickListener(new j(ta));
                                  }
                                  ta.t.setVisibility(0);
                                  s = ta.s;
                                  if (s != null) {
                                     s.setVisibility(i2);
                                  }
                                  ta.A.setText(p0.mUnfoldButtonText);
                                  KwaiImageView kwaiImageVie1 = ta.t.findViewById(R.id.live_gzone_unfold_background);
                                  ta.C = kwaiImageVie1;
                                  kwaiImageVie1.setOnClickListener(new c(ta));
                                  if (!j.h(p0.mUnfoldButtonUrls)) {
                                     ta.C.U(p0.mUnfoldButtonUrls);
                                  }
                                  LiveGzoneActivityBanner mContentLink = p0.mContentLink;
                                  if (!PatchProxy.applyVoidOneRefs(mContentLink, ta, liveGzoneAud, "20")) {
                                     KwaiYodaWebViewFragment kwaiYodaWebV = PatchProxy.applyOneRefs(mContentLink, ta, liveGzoneAud, "21");
                                     if (kwaiYodaWebV != patchProxyRe) {
                                     }else {
                                        kwaiYodaWebV = d.a(0x7b1b2208).Tf(ta.O);
                                        KwaiWebViewActivity$a uoa = KwaiWebViewActivity.N3(ta.getActivity(), mContentLink).o(ta.getActivity().getUrl());
                                        uoa.j("");
                                        kwaiYodaWebV.setArguments(uoa.e("KEY_THEME", "3").e("KEY_WEB_TYPE", "Live_GzoneTab_1").a().getExtras());
                                        kwaiYodaWebV.lh(new a(ta));
                                        l ol = new l(ta);
                                        ta.T = ol;
                                        kwaiYodaWebV.ch(ol);
                                        if (ta.Z0 == null) {
                                           m om = PatchProxy.apply(null, ta, liveGzoneAud, "22");
                                           if (om != patchProxyRe) {
                                           }else {
                                              om = new m(ta);
                                           }
                                           ta.Z0 = om;
                                        }
                                        kwaiYodaWebV.qh(ta.Z0);
                                     }
                                     ta.D = kwaiYodaWebV;
                                     e uoe = ta.J.m.b().getChildFragmentManager().beginTransaction();
                                     uoe.w(R.id.live_gzone_activity_banner_content_container, ta.D, "ActivityBannerFragment");
                                     uoe.m();
                                  }
                                  ta.V8();
                               }
                            }
                         }
                         if (!mWidthHeight) {
                            mWidthHeight = 5.77f;
                         }
                         i2 = (y.d(ta.getActivity()))? n.j(ta.getActivity()): n.k(ta.getActivity());
                         i1 = (int)((float)i2 / mWidthHeight);
                         goto label_01d8 ;
                      }
                   label_03f6 :
                      this.a.d9();
                      LiveGzoneAudienceActivityBannerPresenter$e ta1 = this.a;
                      ta1.e9(0, ta1.J.D.E6(AudienceBizRelation.PK));
                   }
                }
             }
          }
       }
       return;
    }
}
