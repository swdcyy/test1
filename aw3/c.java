package aw3.c;
import aw3.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import or5.d;
import v51.a;
import xp5.i;
import ks3.b;
import o63.a;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService;
import f93.c;
import java.lang.Object;
import c08.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import kotlin.jvm.internal.a;
import d61.g;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Map;
import java.util.LinkedHashMap;
import com.kuaishou.merchant.dynamicpendant.mount.LiteLiveArea;
import java.lang.Enum;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder;
import xp5.g;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import aw3.c$a;
import fq5.b;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import fg6.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;
import com.google.gson.Gson;
import android.app.Application;
import o56.a;
import android.content.Context;
import dm4.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Integer;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext$User;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import qrd.l1;

public final class c implements b	// class@0002d2
{
    public final PresenterV2 a;
    public final d b;
    public final a c;
    public final i d;
    public final b e;
    public final a f;
    public final LiveLiteTempPlayService g;
    public final c h;

    public void c(PresenterV2 p0,d p1,a p2,i p3,b p4,a p5,LiveLiteTempPlayService p6,c p7){
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.a = p0;
    }
    public a a(){
       boolean b1;
       Gson a;
       Integer integer;
       Object[] objArray1;
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       LiveStreamFeed obj = PatchProxy.apply(objArray, this, uoc, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       boolean b = false;
       if (this.b.j0() != null) {
          obj = this.b.j0();
          a.m(obj);
          b1 = g.j(obj);
       }else {
          b1 = false;
       }
       a uoa = new a();
       Activity activity = this.a.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = objArray;
       }
       uoa.i(activity);
       LinkedHashMap linkedHashMa = PatchProxy.apply(objArray, this, uoc, "3");
       if (linkedHashMa != patchProxyRe) {
       }else {
          linkedHashMa = new LinkedHashMap();
          linkedHashMa.put(LiteLiveArea.LITE_TEMP_PLAY.name(), this.g);
          linkedHashMa.put(LiteLiveArea.LITE_BOTTOM_BUBBLE.name(), this.h);
       }
       uoa.j(linkedHashMa);
       LiveMerchantBaseContext liveMerchant = PatchProxy.apply(objArray, this, uoc, "2");
       int i = 1;
       if (liveMerchant != patchProxyRe) {
       }else {
          c tb2 = this.b;
          if (tb2 != null) {
             LiveMerchantBaseContext$Builder uBuilder = new LiveMerchantBaseContext$Builder().setLiveStreamId(tb2.getLiveStreamId()).setLiveAuthorId(tb2.d()).setLiveAuthorUser(tb2.I());
             c td = this.d;
             ClientContent$LiveStreamPackage liveStreamPa = (td != null)? td.a(): objArray;
             liveMerchant = uBuilder.setLiveStreamPackage(liveStreamPa).setNeedDowngrade(tb2.U()).setLiveType(i).build();
          }else {
             objArray2 = objArray;
          }
       }
       uoa.m(liveMerchant);
       uoa.k(this.f);
       uoa.p("LIVE_WATCH_LITE");
       uoa.l(new c$a(this, b1));
       uoa.n(b1);
       PendantLiveContext pendantLiveC = new PendantLiveContext();
       uoc = this.b;
       String liveStreamId = (uoc != null)? uoc.getLiveStreamId(): objArray;
       pendantLiveC.setLiveStreamId(liveStreamId);
       uoc = this.e;
       liveStreamId = (uoc != null)? uoc.a(): objArray;
       pendantLiveC.setRouterSessionId(liveStreamId);
       uoc = this.f;
       liveStreamId = (uoc != null)? uoc.getLiveId(): objArray;
       pendantLiveC.setLiveId(liveStreamId);
       uoc = this.f;
       liveStreamId = (uoc != null)? uoc.I4(): objArray;
       pendantLiveC.setPageId(liveStreamId);
       GifshowActivity gifshowActiv = uoa.a();
       String str = "";
       if (gifshowActiv != null) {
          liveStreamId = gifshowActiv.Q2();
          if (liveStreamId != null) {
          label_0115 :
             pendantLiveC.setPagePath(liveStreamId);
             pendantLiveC.setAnchor(b);
             pendantLiveC.setLiveType(i);
             pendantLiveC.setProfessionalMerchant(b1);
             pendantLiveC.setAnchorMerchantLive(b);
             pendantLiveC.setSlidePlay(i);
             uoc = this.b;
             if (uoc != null) {
                LiveStreamFeed liveStreamFe = uoc.j0();
                if (liveStreamFe != null) {
                   pendantLiveC.setLiveCoverUrl(r1.E0(liveStreamFe));
                   pendantLiveC.setServerExpTag(r1.I1(liveStreamFe));
                }
             }
             a = a.a;
             c tb = this.b;
             if (tb != null) {
                LiveStreamFeedWrapper liveStreamFe1 = tb.r5();
                if (liveStreamFe1 != null) {
                   LiveMerchantFeedData merchantData = liveStreamFe1.getMerchantData();
                label_0151 :
                   pendantLiveC.setMerchantData(a.q(merchantData));
                   pendantLiveC.setCashierParam(b.a(a.b()));
                   uoc = this.b;
                   if (uoc != null) {
                      LiveStreamFeedWrapper liveStreamFe2 = uoc.r5();
                      if (liveStreamFe2 != null) {
                         liveStreamId = liveStreamFe2.getListLoadSequenceID();
                      label_0173 :
                         pendantLiveC.setLlsid(liveStreamId);
                         uoc = this.b;
                         if (uoc != null) {
                            liveStreamFe2 = uoc.r5();
                            if (liveStreamFe2 != null) {
                               liveStreamId = liveStreamFe2.getExpTag();
                            label_0186 :
                               pendantLiveC.setExpTag(liveStreamId);
                               pendantLiveC.setKwaiLinkInfo(str);
                               uoc = this.b;
                               if (uoc != null) {
                                  QLivePlayConfig qLivePlayCon = uoc.C0();
                                  if (qLivePlayCon != null) {
                                     integer = Integer.valueOf(qLivePlayCon.mPatternType);
                                  label_019e :
                                     pendantLiveC.setPatternType(integer);
                                     PendantLiveContext$User user = new PendantLiveContext$User();
                                     tb = this.b;
                                     String str1 = (tb != null)? tb.d(): objArray;
                                     user.setUserId(str1);
                                     tb = this.b;
                                     if (tb != null) {
                                        User user1 = tb.I();
                                        if (user1 != null) {
                                           user1 = user1.mName;
                                        label_01c1 :
                                           user.setName(user1);
                                           tb = this.b;
                                           if (tb != null) {
                                              user1 = tb.I();
                                              if (user1 != null) {
                                                 CDNUrl[] avatars = user1.getAvatars();
                                                 if (avatars != null) {
                                                    objArray = new ArrayList(avatars.length);
                                                    i = avatars.length;
                                                    for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                                                       objArray.add(avatars[i1].mUrl);
                                                    }
                                                 }
                                              }
                                           }
                                           user.setAvatars(objArray);
                                           c tb1 = this.b;
                                           if (tb1 != null) {
                                              User user2 = tb1.I();
                                              if (user2 != null) {
                                                 b = user2.isFollowingOrFollowRequesting();
                                              }
                                           }
                                           user.setFollowing(b);
                                           pendantLiveC.setAuthor(user);
                                           uoa.o(pendantLiveC);
                                           return uoa;
                                        }
                                     }
                                     objArray1 = objArray;
                                     goto label_01c1 ;
                                  }
                               }
                               integer = objArray;
                               goto label_019e ;
                            }
                         }
                         objArray2 = objArray;
                         goto label_0186 ;
                      }
                   }
                   objArray2 = objArray;
                   goto label_0173 ;
                }
             }
             objArray1 = objArray;
             goto label_0151 ;
          }
       }
       liveStreamId = str;
       goto label_0115 ;
    }
}
