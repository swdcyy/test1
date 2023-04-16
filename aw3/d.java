package aw3.d;
import aw3.b;
import aw3.a;
import java.lang.Object;
import java.lang.String;
import ks3.t;
import fq5.b;
import tq5.c;
import ks3.f0;
import cs3.a;
import java.lang.Class;
import lp3.i;
import c08.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Map;
import java.util.LinkedHashMap;
import com.kuaishou.merchant.dynamicpendant.mount.LiveArea;
import java.lang.Enum;
import com.kuaishou.merchant.api.live.service.LiveMerchantTopPendantService;
import ks5.g;
import pq5.c;
import zq5.b;
import lp3.c;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import o63.a;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import fg6.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;
import com.google.gson.Gson;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.Context;
import androidx.fragment.app.Fragment;
import dm4.b;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import ot3.l0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Integer;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext$User;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import qrd.l1;

public final class d implements b	// class@0002d3
{
    public final int a;
    public final a b;
    public final boolean c;
    public final t d;
    public final b e;
    public final c f;
    public final f0 g;
    public final a h;
    public final i i;

    public void d(int p0,boolean p1,a p2){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p1;
       this.d = p2.t8("LIVE_MERCHANT_AUDIENCE_COMMON_SERVICE");
       this.e = p2.t8("LIVE_BASIC_CONTEXT");
       this.f = p2.t8("LIVE_QUIT_LIVE_SERVICE");
       this.g = p2.t8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       this.h = p2.s8(a.class);
       this.i = p2.r8("LIVE_SERVICE_MANAGER");
    }
    public a a(){
       LiveMerchantBaseContext liveMerchant;
       b uob;
       boolean b2;
       d td1;
       Gson a;
       Integer integer;
       Object[] objArray1;
       Object[] objArray2;
       Object[] objArray3;
       i obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, uod, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       a uoa = new a();
       Activity activity = this.b.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = objArray;
       }
       uoa.i(activity);
       LinkedHashMap linkedHashMa = PatchProxy.apply(objArray, this, uod, "4");
       if (linkedHashMa != patchProxyRe) {
       }else {
          linkedHashMa = new LinkedHashMap();
          obj2 = this.b.t8("LIVE_SERVICE_MANAGER");
          linkedHashMa.put("liveServiceManager", obj2);
          linkedHashMa.put(LiveArea.RIGHT_BOTTOM_SLIDE_AREA.name(), this.b.t8("LIVE_MERCHANT_AUDIENCE_SLIDE_SHOW_SERVICE"));
          linkedHashMa.put(LiveArea.MERCHANT_TOP_LEFT_AREA.name(), this.b.s8(LiveMerchantTopPendantService.class));
          g og = this.b.s8(g.class);
          linkedHashMa.put(LiveArea.TEMP_PLAY_AREA.name(), og);
          linkedHashMa.put(LiveArea.ASSOCIATED_CONTENT_AREA.name(), og);
          linkedHashMa.put(LiveArea.CONTENT_ASSIST_AREA.name(), this.b.s8(c.class));
          linkedHashMa.put(LiveArea.INTERACTIVE_PLAY_AREA.name(), this.b.t8("LIVE_MERCHANT_PENDANT_SERVICE"));
          String str1 = LiveArea.COMMENT_TOP_BARRAGE.name();
          uob = (obj2 != null)? obj2.c(b.class): objArray;
          linkedHashMa.put(str1, uob);
          linkedHashMa.put(LiveArea.CENTER_MSG_BARRAGE.name(), this.b.t8("LIVE_CENTRAL_ENTER_ROOM_EFFECT_SCHEDULER_V2"));
          linkedHashMa.put(LiveArea.BOTTOM_BUBBLE_AREA.name(), this.b.t8("LIVE_AUDIENCE_BUBBLE_SERVICE"));
          linkedHashMa.put(LiveArea.LIVE_WATCH_AVATAR.name(), this.b.t8("LIVE_TOP_BAR_HEAD_PENDANT_SERVICE"));
          linkedHashMa.put(LiveArea.ATMOSPHERE_AREA.name(), this.b.t8("LIVE_MERCHANT_ATMOSPHERE_PENDANT_SERVICE"));
       }
       uoa.j(linkedHashMa);
       uoa.p("LIVE_WATCH");
       d td = this.d;
       if (td != null) {
          liveMerchant = td.a();
          if (liveMerchant == null) {
          label_0113 :
             td = this.e;
             obj2 = PatchProxy.applyOneRefs(td, this, uod, "2");
             if (obj2 != patchProxyRe) {
                liveMerchant = obj2;
             }else if(td != null){
                liveMerchant = new LiveMerchantBaseContext$Builder().setLiveStreamId(td.getLiveStreamId()).setLiveAuthorId(td.d()).setLiveAuthorUser(td.I()).setLiveStreamPackage(td.a()).setNeedDowngrade(td.U()).setLiveType(this.a).build();
             }else {
                liveMerchant = objArray;
             }
          }
       }else {
          goto label_0113 ;
       }
       uoa.m(liveMerchant);
       uoa.l(this.e);
       uoa.n(this.c);
       uoa.h = this.f;
       uoa.k(this.i.a(a.class));
       PendantLiveContext pendantLiveC = new PendantLiveContext();
       uob = uoa.b();
       String liveStreamId = (uob != null)? uob.getLiveStreamId(): objArray;
       pendantLiveC.setLiveStreamId(liveStreamId);
       uob = uoa.b();
       liveStreamId = (uob != null)? uob.s5(): objArray;
       pendantLiveC.setRouterSessionId(liveStreamId);
       d tg = this.g;
       liveStreamId = (tg != null)? tg.J4(): objArray;
       pendantLiveC.setLiveId(liveStreamId);
       tg = this.g;
       liveStreamId = (tg != null)? tg.I4(): objArray;
       pendantLiveC.setPageId(liveStreamId);
       GifshowActivity gifshowActiv = uoa.a();
       if (gifshowActiv != null) {
          liveStreamId = gifshowActiv.Q2();
          if (liveStreamId != null) {
          label_01c6 :
             pendantLiveC.setPagePath(liveStreamId);
             uob = uoa.b();
             boolean b = false;
             int b1 = (uob != null)? uob.e(): false;
             pendantLiveC.setAnchor(b1);
             pendantLiveC.setLiveType(obj);
             pendantLiveC.setProfessionalMerchant(this.c);
             b obj1 = PatchProxy.apply(objArray, this, uod, "3");
             if (obj1 != patchProxyRe) {
                b2 = obj1.booleanValue();
             }else {
                td1 = this.h;
                b2 = (td1 != null)? td1.d(): false;
             }
             pendantLiveC.setAnchorMerchantLive(b2);
             td1 = this.d;
             boolean b3 = true;
             if (td1 == null || td1.x3() != b3) {
                b3 = false;
             }
             pendantLiveC.setSlidePlay(b3);
             LiveMerchantBaseContext liveMerchant1 = uoa.c();
             String serverExpTag = (liveMerchant1 != null)? liveMerchant1.getServerExpTag(): objArray;
             pendantLiveC.setServerExpTag(serverExpTag);
             liveMerchant1 = uoa.c();
             if (liveMerchant1 != null) {
                BaseFeed liveFeed = liveMerchant1.getLiveFeed();
                if (liveFeed != null) {
                   pendantLiveC.setLiveCoverUrl(r1.E0(liveFeed));
                }
             }
             a = a.a;
             obj1 = uoa.b();
             if (obj1 != null) {
                LiveStreamFeedWrapper liveStreamFe = obj1.r5();
                if (liveStreamFe != null) {
                   LiveMerchantFeedData merchantData = liveStreamFe.getMerchantData();
                label_0243 :
                   pendantLiveC.setMerchantData(a.q(merchantData));
                   b uob1 = uoa.b();
                   if (uob1 != null) {
                      BaseFragment uBaseFragmen = uob1.b();
                      if (uBaseFragmen != null) {
                         Context context = uBaseFragmen.getContext();
                      label_025c :
                         pendantLiveC.setCashierParam(b.a(context));
                         uob1 = uoa.b();
                         if (uob1 != null) {
                            LiveStreamFeedWrapper liveStreamFe1 = uob1.r5();
                            if (liveStreamFe1 != null) {
                               serverExpTag = liveStreamFe1.getListLoadSequenceID();
                            label_0275 :
                               pendantLiveC.setLlsid(serverExpTag);
                               uob1 = uoa.b();
                               if (uob1 != null) {
                                  liveStreamFe1 = uob1.r5();
                                  if (liveStreamFe1 != null) {
                                     serverExpTag = liveStreamFe1.getExpTag();
                                  label_028a :
                                     pendantLiveC.setExpTag(serverExpTag);
                                     liveMerchant1 = uoa.c();
                                     MerchantAudienceParams merchantAudi = (liveMerchant1 != null)? liveMerchant1.getMerchantAudienceParams(): objArray;
                                     pendantLiveC.setKwaiLinkInfo(l0.m(merchantAudi));
                                     uob1 = uoa.b();
                                     if (uob1 != null) {
                                        liveStreamFe1 = uob1.r5();
                                        if (liveStreamFe1 != null) {
                                           QLivePlayConfig livePlayConf = liveStreamFe1.getLivePlayConfig();
                                           if (livePlayConf != null) {
                                              integer = Integer.valueOf(livePlayConf.mPatternType);
                                           label_02ba :
                                              pendantLiveC.setPatternType(integer);
                                              PendantLiveContext$User user = new PendantLiveContext$User();
                                              obj1 = uoa.b();
                                              String str = (obj1 != null)? obj1.d(): objArray;
                                              user.setUserId(str);
                                              obj1 = uoa.b();
                                              if (obj1 != null) {
                                                 User user1 = obj1.I();
                                                 if (user1 != null) {
                                                    user1 = user1.mName;
                                                 label_02e1 :
                                                    user.setName(user1);
                                                    obj1 = uoa.b();
                                                    if (obj1 != null) {
                                                       user1 = obj1.I();
                                                       if (user1 != null) {
                                                          CDNUrl[] avatars = user1.getAvatars();
                                                          if (avatars != null) {
                                                             objArray = new ArrayList(avatars.length);
                                                             int len = avatars.length;
                                                             for (b1 = 0; b1 < len; b1 = b1 + 1) {
                                                                objArray.add(avatars[b1].mUrl);
                                                             }
                                                          }
                                                       }
                                                    }
                                                    user.setAvatars(objArray);
                                                    obj1 = uoa.b();
                                                    if (obj1 != null) {
                                                       user1 = obj1.I();
                                                       if (user1 != null) {
                                                          b = user1.isFollowingOrFollowRequesting();
                                                       }
                                                    }
                                                    user.setFollowing(b);
                                                    pendantLiveC.setAuthor(user);
                                                    uoa.o(pendantLiveC);
                                                    return uoa;
                                                 }
                                              }
                                              objArray1 = objArray;
                                              goto label_02e1 ;
                                           }
                                        }
                                     }
                                     integer = objArray;
                                     goto label_02ba ;
                                  }
                               }
                               objArray2 = objArray;
                               goto label_028a ;
                            }
                         }
                         objArray2 = objArray;
                         goto label_0275 ;
                      }
                   }
                   objArray2 = objArray;
                   goto label_025c ;
                }
             }
             objArray1 = objArray;
             goto label_0243 ;
          }
       }
       liveStreamId = "";
       goto label_01c6 ;
    }
}
