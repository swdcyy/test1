package com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$d;
import tq5.a;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import ek2.g;
import java.lang.reflect.Type;
import kotlin.jvm.internal.a;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.LiveFeedFunctionShieldSwitchInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.System;
import java.util.List;
import fq5.b;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import ek2.o;
import ek2.a;
import ek2.o$a;
import java.lang.Integer;
import ek2.i;
import el.a;
import pm8.a;
import java.lang.Long;
import ek2.e0;
import ek2.e0$a;
import java.lang.Math;
import com.yxcorp.gifshow.util.DateUtils;
import ek2.j;
import ek2.k;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveSideBarModel;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.g;
import androidx.fragment.app.Fragment;
import c12.f;
import mq5.b;
import lp3.i;
import oa1.b;
import o63.a;
import lp3.c;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import p63.a;
import p63.a$a;
import p63.a$b;
import p91.m;
import com.kuaishou.live.core.basic.utils.e;
import com.kwai.framework.model.user.User;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import oa1.a;
import nsd.u;
import o63.d;
import tq5.c;

public final class LiveAudienceStayInfoDispatcherPresenter$d implements a	// class@0010aa
{
    public final LiveAudienceStayInfoDispatcherPresenter a;

    public void LiveAudienceStayInfoDispatcherPresenter$d(LiveAudienceStayInfoDispatcherPresenter p0){
       this.a = p0;
       super();
    }
    public final int onBackPressed(){
       boolean b;
       String str3;
       LiveAudienceStayInfoDispatcherPresenter obj5;
       c obj6;
       boolean b1;
       Iterator iterator1;
       e0$a a;
       String str4;
       LiveStreamFeed$LiveSideBarModel mLiveSideTyp;
       a0 obj8;
       a uoa;
       Map obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       LiveAudienceStayInfoDispatcherPresenter$d obj1 = PatchProxy.apply(objArray, obj, LiveAudienceStayInfoDispatcherPresenter$d.class, str);
       if (obj1 != patchProxyRe) {
          return obj1.intValue();
       }
       obj1 = obj.a;
       PatchProxyResult patchProxyRe1 = 1;
       if (obj1.M == null) {
          Objects.requireNonNull(obj1);
          LiveAudienceStayInfoDispatcherPresenter liveAudience = LiveAudienceStayInfoDispatcherPresenter.class;
          Object obj2 = PatchProxy.apply(objArray, obj1, liveAudience, "7");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(obj1.Q == null){
             obj1.Q = a.t().u("SOURCE_LIVE").getValue("liveStayInfoFollowFrequency", g.class, objArray);
          }
          LiveAudienceStayInfoDispatcherPresenter s = obj1.S;
          if (s == null) {
             a.S("mLivePlayCallerContext");
          }
          a0 c = s.c;
          if (c != null) {
             LiveStreamFeedWrapper mEntity = c.mEntity;
             if (mEntity != null) {
                LiveStreamFeed mLiveStreamM = mEntity.mLiveStreamModel;
                if (mLiveStreamM != null) {
                   LiveStreamModel mFunctionShi = mLiveStreamM.mFunctionShieldSwitchInfo;
                   if (mFunctionShi != null && mFunctionShi.mDisableStayInfo == patchProxyRe1) {
                      b.Z(LiveLogTag.LIVE_STAY_INFO, "stayInfo function disabled by server config");
                   }else {
                   label_0072 :
                      s = obj1.Q;
                      if (s != null && (System.currentTimeMillis() - obj1.L) - s.minWatchTimeMs >= 0) {
                         obj1.N.clear();
                         LiveAudienceStayInfoDispatcherPresenter s1 = obj1.S;
                         if (s1 == null) {
                            a.S("mLivePlayCallerContext");
                         }
                         b uob = s1.b();
                         a.o(uob, "mLivePlayCallerContext.liveBasicContext");
                         String str1 = uob.d();
                         g followFreque = s.followFrequency;
                         if (followFreque != null) {
                            Iterator iterator = followFreque.entrySet().iterator();
                            while (iterator.hasNext()) {
                               Object obj3 = iterator.next();
                               o$a d = o.d;
                               int i = obj3.getKey().intValue();
                               e0$a obj4 = obj3.getValue();
                               String str2 = "userId";
                               a.o(str1, str2);
                               Objects.requireNonNull(d);
                               if (PatchProxy.isSupport(o$a.class)) {
                                  str3 = str2;
                                  obj5 = obj4;
                                  obj6 = PatchProxy.applyThreeRefs(Integer.valueOf(i), obj4, str1, d, o$a.class, "1");
                                  if (obj6 != patchProxyRe) {
                                     b1 = obj6.booleanValue();
                                     iterator1 = iterator;
                                     patchProxyRe1 = patchProxyRe;
                                  }else {
                                  label_00ff :
                                     a.p(obj5, "frequencyInformation");
                                     a.p(str1, str3);
                                     Map map = a.z(new i().getType());
                                     long l = 0;
                                     if (map != null) {
                                        Long longx = map.get(Integer.valueOf(i));
                                        if (longx == null) {
                                           longx = Long.valueOf(l);
                                        }
                                        if (longx != null) {
                                           l = longx.longValue();
                                        }
                                     }
                                     a = e0.a;
                                     long l1 = System.currentTimeMillis();
                                     Objects.requireNonNull(a);
                                     obj4 = e0$a.class;
                                     if (PatchProxy.isSupport(obj4)) {
                                        iterator1 = iterator;
                                        obj = PatchProxy.applyTwoRefs(Long.valueOf(l), Long.valueOf(l1), a, obj4, str);
                                        if (obj != patchProxyRe) {
                                           l1 = obj.longValue();
                                        label_0163 :
                                           patchProxyRe1 = patchProxyRe;
                                           if (l1 - (long)obj5.a() < 0) {
                                              b.e0(LiveLogTag.LIVE_STAY_INFO, "can not show notice dialog,interval hours dissatisfy", "bizType", Integer.valueOf(i), "hourDiff", Long.valueOf(l1), "intervalHours", Integer.valueOf(obj5.a()));
                                           }else {
                                              str4 = "bizType";
                                              String str5 = "can show notice dialog";
                                              if (!DateUtils.H(l)) {
                                                 if (obj5.b() < 0) {
                                                    b.d0(LiveLogTag.LIVE_STAY_INFO, "can not show notice dialog,maxShowTimesPerDayAllAuthor dissatisfy", "bizType", Integer.valueOf(i), "maxShowTimesPerDayAllAuthor", Integer.valueOf(obj5.b()));
                                                 }else {
                                                    b.c0(LiveLogTag.LIVE_STAY_INFO, str5, str4, Integer.valueOf(i));
                                                 }
                                                 if (obj5.b() <= 0) {
                                                 label_024a :
                                                    b1 = false;
                                                 }
                                              }else {
                                                 obj = a.A(new j().getType());
                                                 if (obj != null) {
                                                    Integer integer = obj.get(Integer.valueOf(i));
                                                    if (integer != null) {
                                                       b1 = integer.intValue();
                                                    label_01e6 :
                                                       if (b1 >= obj5.b()) {
                                                          b.e0(LiveLogTag.LIVE_STAY_INFO, "can not show notice dialog,showTimesPerDayAllAuthor dissatisfy", "bizType", Integer.valueOf(i), "showTimesPerDayAllAuthor", Integer.valueOf(b1), "maxShowTimesPerDayAllAuthor", Integer.valueOf(obj5.b()));
                                                          goto label_024a ;
                                                       }else {
                                                          obj = a.B(new k().getType());
                                                          if (obj != null) {
                                                             obj = obj.get(Integer.valueOf(i));
                                                             if (obj != null) {
                                                                integer = obj.get(str1);
                                                                if (integer != null) {
                                                                   b1 = integer.intValue();
                                                                label_0233 :
                                                                   if (b1 >= obj5.maxShowTimesPerDayOneAuthor) {
                                                                      b.d0(LiveLogTag.LIVE_STAY_INFO, "can not show notice dialog,showTimesPerDayOneAuthor dissatisfy", "bizType", Integer.valueOf(i), "showTimesPerDayOneAuthor", Integer.valueOf(b1));
                                                                      goto label_024a ;
                                                                   }else {
                                                                      b.c0(LiveLogTag.LIVE_STAY_INFO, str5, str4, Integer.valueOf(i));
                                                                   }
                                                                }
                                                             }
                                                          }
                                                          b1 = 0;
                                                          goto label_0233 ;
                                                       }
                                                    }
                                                 }
                                                 b1 = 0;
                                                 goto label_01e6 ;
                                              }
                                              b1 = true;
                                           }
                                        }
                                     }else {
                                        iterator1 = iterator;
                                     }
                                     l1 = l1 - l;
                                     l1 = l1 / 0x36ee80;
                                     l1 = Math.abs(l1);
                                     goto label_0163 ;
                                  }
                               }else {
                                  str3 = str2;
                                  obj5 = obj4;
                                  goto label_00ff ;
                               }
                               if (b1) {
                                  obj1.N.add(obj3.getKey());
                               }
                               patchProxyRe = patchProxyRe1;
                               iterator = iterator1;
                               str3 = 1;
                            }
                            patchProxyRe1 = patchProxyRe;
                            if (!obj1.N.isEmpty()) {
                               b.c0(LiveLogTag.LIVE_STAY_INFO, "print canShowTypeList", "canShowTypeList", obj1.N.toString());
                               LiveAudienceStayInfoDispatcherPresenter s2 = obj1.S;
                               if (s2 == null) {
                                  a.S("mLivePlayCallerContext");
                               }
                               a0 c1 = s2.c;
                               Activity uActivity = -1;
                               if (c1 != null) {
                                  LiveStreamFeedWrapper mEntity1 = c1.mEntity;
                                  if (mEntity1 != null) {
                                     LiveStreamFeed mLiveSideBar = mEntity1.mLiveSideBarModel;
                                     if (mLiveSideBar != null) {
                                        mLiveSideTyp = mLiveSideBar.mLiveSideType;
                                     label_029b :
                                        if (mLiveSideTyp != uActivity) {
                                           if (!g.h(obj1.getActivity())) {
                                              LiveAudienceStayInfoDispatcherPresenter u = obj1.U;
                                              if (u == null) {
                                                 a.S("mFragment");
                                              }
                                              if (u.isAdded()) {
                                                 f z = obj1.z;
                                                 a.o(z, "mLiveEndService");
                                                 if (!z.U0()) {
                                                    if (PatchProxy.isSupport(liveAudience)) {
                                                       a$a obj7 = PatchProxy.applyTwoRefs(Integer.valueOf(mLiveSideTyp), s, obj1, liveAudience, "8");
                                                       if (obj7 != patchProxyRe1) {
                                                          b1 = obj7.booleanValue();
                                                       }else {
                                                       label_02e1 :
                                                          str4 = "config";
                                                          a.p(s, str4);
                                                          obj5 = obj1.T;
                                                          str1 = "mLiveServiceManager";
                                                          if (obj5 == null) {
                                                             a.S(str1);
                                                          }
                                                          if (!obj5.b()) {
                                                             b a1 = b.a;
                                                             obj5 = obj1.T;
                                                             if (obj5 == null) {
                                                                a.S(str1);
                                                             }
                                                             c uoc = obj5.a(a.class);
                                                             a.o(uoc, "mLiveServiceManager.getS¡­ridgeService::class.java\)");
                                                             obj6 = uoc;
                                                             LiveKrnPageKey liveStayCard = LiveKrnPageKey.LiveStayCard;
                                                             if (PatchProxy.isSupport(liveAudience)) {
                                                                obj8 = PatchProxy.applyTwoRefs(Integer.valueOf(mLiveSideTyp), s, obj1, liveAudience, "9");
                                                                if (obj8 != patchProxyRe1) {
                                                                   uoa = obj8;
                                                                label_03f9 :
                                                                   a uoa1 = new a(0, 0, 0, 0x3f800000, 1, 0, null, true, 0, 327, null);
                                                                   if (b.d(a1, obj6, liveStayCard, uoa, v14, null, 16, null) != null) {
                                                                      mLiveSideTyp = 1;
                                                                   }else {
                                                                      mLiveSideTyp = 0;
                                                                   }
                                                                }
                                                             }
                                                             a.p(s, str4);
                                                             obj7 = a.b.a();
                                                             liveAudience = obj1.S;
                                                             if (liveAudience == null) {
                                                                a.S("mLivePlayCallerContext");
                                                             }
                                                             obj8 = liveAudience.Z2;
                                                             a.o(obj8, "mLivePlayCallerContext.mLiveBasicContext");
                                                             obj7 = obj7.a("liveStreamId", obj8.getLiveStreamId());
                                                             liveAudience = obj1.S;
                                                             if (liveAudience == null) {
                                                                a.S("mLivePlayCallerContext");
                                                             }
                                                             obj7 = obj7.a("followRefer", e.j(liveAudience.c)).a("followSource", String.valueOf(25));
                                                             liveAudience = obj1.S;
                                                             if (liveAudience == null) {
                                                                a.S("mLivePlayCallerContext");
                                                             }
                                                             obj7 = obj7.a("source", String.valueOf(liveAudience.l)).a("watchingDurationMs", String.valueOf((System.currentTimeMillis() - obj1.L))).a("maxWaitTimeMs", String.valueOf(s.maxWaitTimeMs));
                                                             String str6 = (obj1.K != null)? str: "0";
                                                             obj7 = obj7.a("startPlayFollowStatus", str6);
                                                             s = obj1.S;
                                                             if (s == null) {
                                                                a.S("mLivePlayCallerContext");
                                                             }
                                                             c = s.c;
                                                             a.o(c, "mLivePlayCallerContext.mPhoto");
                                                             User user = c.getUser();
                                                             a.o(user, "mLivePlayCallerContext.mPhoto.user");
                                                             if (!user.isFollowingOrFollowRequesting()) {
                                                                str = "0";
                                                             }
                                                             uoa = obj7.a("stopPlayFollowStatus", str).a("slideBarType", String.valueOf(mLiveSideTyp)).a("availableBizTypes", CollectionsKt___CollectionsKt.V2(obj1.N, ",", null, null, 0, null, null, 62, null)).b();
                                                             goto label_03f9 ;
                                                          }
                                                       }
                                                    }else {
                                                       goto label_02e1 ;
                                                    }
                                                    b = b1;
                                                 }
                                              }
                                           }
                                        label_0427 :
                                           s2 = obj1.V;
                                           if (s2 == null) {
                                              a.S("mQuitLiveService");
                                           }
                                           s2.tc();
                                        }
                                     }
                                  }
                               }
                               mLiveSideTyp = -1;
                               goto label_029b ;
                            }
                         }
                      }
                   }
                }else {
                   goto label_0072 ;
                }
             }else {
                goto label_0072 ;
             }
          }else {
             goto label_0072 ;
          }
          b = false;
          if (!b) {
             return 0;
          }
       }
       return 1;
    }
}
