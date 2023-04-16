package com.kuaishou.live.core.show.wealthgrade.b$a;
import com.kuaishou.live.core.show.wealthgrade.b$c;
import com.kuaishou.live.core.show.wealthgrade.b;
import java.lang.Object;
import hm2.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import t02.a0;
import t02.r1;
import pp.d;
import z12.x;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kwai.framework.model.user.UserInfo;
import com.google.common.collect.ImmutableMap;
import pp.c;
import java.util.Map;
import m72.a;
import p91.m;
import m72.a$a;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.wealthgrade.LiveWealthGradeEnterRoomData;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import java.util.ArrayList;
import b61.a;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenImageItem;
import lnc.a1;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenSegmentItem;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenTextItem;
import jr5.a;
import b61.b;
import jr5.a$a;
import java.util.List;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenBackgroundData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBorderData;
import com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenSurfaceData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenEffectData;
import zq5.b;

public class b$a implements b$c	// class@001252
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(i p0,int p1){
       boolean b;
       LiveWealthGradeEnterRoomData liveWealthGr;
       i a;
       LiveAudienceState userStateSeg;
       a$a uoa2;
       LiveFloatingScreenTextItem liveFloating2;
       int[] ointArray;
       int[] ointArray1;
       b$a uoa = b$a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, str)) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || (PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), uoa, uob, "4") || (p0.a == null || (p0.b != null && p0.d != null)))) {
          if (!PatchProxy.applyVoidOneRefs(p0, uoa, uob, "8")) {
             d uod = x.j(uoa.q, uoa.r);
             if (uod != null) {
                uod.m(LiveLogTag.WEALTH_GRADE, "enterroom message", ImmutableMap.of("userId", p0.a.mId, "level", Integer.valueOf(p0.b), "type", Integer.valueOf(p0.d)));
             }
          }
          if (uoa.t != null) {
             a$a w = a.w;
             b = uoa.p.e();
             Objects.requireNonNull(w);
             a$a uoa1 = a$a.class;
             if (PatchProxy.isSupport(uoa1)) {
                liveWealthGr = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(b), w, uoa1, str);
                if (liveWealthGr != PatchProxyResult.class) {
                }else {
                label_0099 :
                   a.p(p0, "enterRoomData");
                   liveWealthGr = new LiveWealthGradeEnterRoomData();
                   a = p0.a;
                   liveWealthGr.setBizType(1);
                   liveWealthGr.setUserInfo(a);
                   liveWealthGr.setRunwayType(1);
                   liveWealthGr.setWealthGrade(p0.d);
                   liveWealthGr.setPriority(999);
                   ArrayList uArrayList = new ArrayList();
                   int i = 0;
                   if (a.e(a)) {
                      LiveFloatingScreenImageItem liveFloating = new LiveFloatingScreenImageItem();
                      liveFloating.setPicType(i);
                      liveFloating.setPicWidth(a1.d(R.dimen.arg_RES_7f0702b8));
                      liveFloating.setPicWidth(a1.d(R.dimen.arg_RES_7f0702b8));
                      liveFloating.setPicUrls(a.mHeadUrls);
                      uArrayList.add(liveFloating);
                   }
                   if (!a.e(a) && p0.c != null) {
                      LiveFloatingScreenSegmentItem liveFloating1 = new LiveFloatingScreenSegmentItem();
                      if (b) {
                         userStateSeg = p0.c.userStateSegmentForAuthor;
                         if (userStateSeg != null) {
                            int i1 = (!userStateSeg.length)? 1: 0;
                            if (!i1) {
                               uoa2 = null;
                            label_0109 :
                               if (!uoa2) {
                               label_0110 :
                                  liveFloating1.setSegment(userStateSeg);
                                  UserStateRichTextSegment[] segment = liveFloating1.getSegment();
                                  if (segment != null) {
                                     segment = (!segment.length)? 1: 0;
                                     if (!segment) {
                                        liveFloating2 = null;
                                     label_0125 :
                                        if (!liveFloating2) {
                                           uArrayList.add(liveFloating1);
                                        }
                                     }
                                  }
                                  liveFloating2 = 1;
                                  goto label_0125 ;
                               }
                            }
                         }
                         uoa2 = 1;
                         goto label_0109 ;
                      }
                      userStateSeg = p0.c.userStateSegment;
                      goto label_0110 ;
                   }
                label_012a :
                   liveFloating2 = new LiveFloatingScreenTextItem();
                   str = b.c(a);
                   a.o(str, "LiveUsernameUtils.getUserLiveDisplayName\(userInfo\)");
                   str = a1.r(R.string.arg_RES_7f102ebb, a.b.c(str, 7));
                   a.o(str, "CommonUtil.string\(\n     ¡­AX_SIZE\n        \)\n      \)");
                   liveFloating2.setText(str);
                   liveFloating2.setTextSize(14);
                   liveFloating2.setTextColor(a1.a(R.color.arg_RES_7f061e52));
                   uArrayList.add(liveFloating2);
                   liveWealthGr.setContentItems(uArrayList);
                   LiveFloatingScreenBackgroundData liveFloating3 = new LiveFloatingScreenBackgroundData();
                   LiveFloatingScreenBorderData liveFloating4 = null;
                   i d = p0.d;
                   if (d != 1) {
                      if (d != 2) {
                         if (d != 3) {
                            if (d == 4) {
                               liveFloating3.setBackgroundType(2);
                               ointArray = new int[]{a.l,a.m,a.n,a.o,a.q};
                               liveFloating3.setBackgroundGradientIntColor(ointArray);
                               liveFloating3.setBackgroundGradientPoints(a.p);
                               liveFloating4 = new LiveFloatingScreenBorderData();
                               liveFloating4.setBorderWidth(a.a);
                               ointArray1 = new int[]{a.r,a.s};
                               liveFloating4.setBorderGradientIntColors(ointArray1);
                            }
                         }else {
                            liveFloating3.setBackgroundType(2);
                            ointArray = new int[]{a.h,a.i};
                            liveFloating3.setBackgroundGradientIntColor(ointArray);
                            liveFloating4 = new LiveFloatingScreenBorderData();
                            liveFloating4.setBorderWidth(a.a);
                            ointArray1 = new int[]{a.j,a.k};
                            liveFloating4.setBorderGradientIntColors(ointArray1);
                         }
                      }else {
                         liveFloating3.setBackgroundType(2);
                         ointArray = new int[]{a.d,a.e};
                         liveFloating3.setBackgroundGradientIntColor(ointArray);
                         liveFloating4 = new LiveFloatingScreenBorderData();
                         liveFloating4.setBorderWidth(a.a);
                         ointArray1 = new int[]{a.f,a.g};
                         liveFloating4.setBorderGradientIntColors(ointArray1);
                      }
                   }else {
                      liveFloating3.setBackgroundType(2);
                      ointArray1 = new int[]{a.b,a.c};
                      liveFloating3.setBackgroundGradientIntColor(ointArray1);
                   }
                   liveWealthGr.setBackgroundData(liveFloating3);
                   liveWealthGr.setBorderData(liveFloating4);
                   LiveFloatingScreenSurfaceData liveFloating5 = new LiveFloatingScreenSurfaceData();
                   liveFloating5.setSurfaceDecorTailWidth(a.t);
                   liveFloating5.setSurfaceDecorTailHeight(24);
                   liveFloating5.setSurfaceDecorTailMarginStart(a.v);
                   a = p0.d;
                   if (a != 1) {
                      if (a != 2) {
                         if (a != 3) {
                            if (a == 4) {
                               i = 0x7f0810b5;
                            }
                         }else {
                            i = 0x7f0810b2;
                         }
                      }else {
                         i = 0x7f0810b3;
                      }
                   }else {
                      i = 0x7f0810b4;
                   }
                   liveFloating5.setSurfaceDecorTailResId(i);
                   liveWealthGr.setSurfaceData(liveFloating5);
                   if (p0.d == 4) {
                      LiveFloatingScreenEffectData liveFloating6 = new LiveFloatingScreenEffectData();
                      liveFloating6.setEffectTypeBits(1);
                      liveFloating6.setShimmerLocation(1);
                      liveFloating6.setShimmerResType(1);
                      liveFloating6.setShimmerDrawableId(R.drawable.arg_RES_7f081497);
                      liveFloating6.setEffectDelayTimeMs(600);
                      liveWealthGr.setEffectData(liveFloating6);
                   }
                }
             }else {
                goto label_0099 ;
             }
             uoa.t.Gi(liveWealthGr);
          }
       }
    label_0271 :
       return;
    }
}
