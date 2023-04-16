package hm2.e;
import lf3.g;
import com.kuaishou.live.core.show.wealthgrade.b;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zy1.a;
import t02.a0;
import t02.r1;
import pp.d;
import z12.x;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import d61.y;
import ekd.j;
import com.kuaishou.livestream.message.nano.WealthHighGradeEnterRoom;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import ry1.b;
import va1.a0;
import m72.a;
import p91.m;
import m72.a$a;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.wealthgrade.LiveWealthGradeEnterRoomData;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import java.util.ArrayList;
import b61.a;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenImageItem;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenSegmentItem;
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
import lf3.f;

public final class e implements g	// class@002dd1
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       d uod;
       boolean b;
       LiveWealthGradeEnterRoomData liveWealthGr;
       LiveAudienceState userStateSeg;
       int i2;
       a$a uoa1;
       LiveFloatingScreenTextItem liveFloating2;
       int i4;
       int[] ointArray;
       int[] ointArray1;
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "3")) {
       }else if(!a.b()){
          uod = x.j(tb.q, tb.r);
          if (uod != null) {
             uod.h(LiveLogTag.WEALTH_GRADE, "No authority, do not show enter room view");
          }
       }else if(a1.i(tb.getActivity()) && y.d(tb.getActivity())){
          uod = x.j(tb.q, tb.r);
          if (uod != null) {
             uod.h(LiveLogTag.WEALTH_GRADE, "Landscape, do not show enter room view");
          }
       }else if(!j.h(p0.wealthHighGradeEnterRoom)){
          SCActionSignal wealthHighGr = p0.wealthHighGradeEnterRoom;
          int len = wealthHighGr.length;
          int i = 0;
          while (i < len) {
             object oobject = wealthHighGr[i];
             if (oobject.senderState != null) {
                WealthHighGradeEnterRoom user = oobject.user;
                if (user != null && (oobject.displayType != null && !TextUtils.n(String.valueOf(user.userId), QCurrentUser.me().getId()))) {
                   b q = tb.q;
                   if (q != null && (q.b3.D1() != null && (tb.q.b3.D1().mIsAnonymousLive != null && (!TextUtils.n(oobject.deviceHash, a0.b()) && tb.t != null)))) {
                      a$a w = a.w;
                      b = tb.p.e();
                      Objects.requireNonNull(w);
                      a$a uoa = a$a.class;
                      if (PatchProxy.isSupport(uoa)) {
                         liveWealthGr = PatchProxy.applyTwoRefs(oobject, Boolean.valueOf(b), w, uoa, "2");
                         if (liveWealthGr != PatchProxyResult.class) {
                         }else {
                         label_00d7 :
                            a.p(oobject, "enterRoomData");
                            liveWealthGr = new LiveWealthGradeEnterRoomData();
                            WealthHighGradeEnterRoom user1 = oobject.user;
                            WealthHighGradeEnterRoom senderState = oobject.senderState;
                            int i1 = (senderState == null)? 0: senderState.assistantType;
                            UserInfo userInfo = UserInfo.convertFromProto(user1, i1);
                            i1 = 1;
                            liveWealthGr.setBizType(i1);
                            liveWealthGr.setUserInfo(userInfo);
                            liveWealthGr.setRunwayType(i1);
                            liveWealthGr.setWealthGrade(oobject.displayType);
                            liveWealthGr.setPriority(100);
                            ArrayList uArrayList = new ArrayList();
                            if (a.e(userInfo)) {
                               LiveFloatingScreenImageItem liveFloating = new LiveFloatingScreenImageItem();
                               liveFloating.setPicType(0);
                               liveFloating.setPicWidth(a1.d(R.dimen.arg_RES_7f0702b8));
                               liveFloating.setPicWidth(a1.d(R.dimen.arg_RES_7f0702b8));
                               liveFloating.setPicUrls(userInfo.mHeadUrls);
                               uArrayList.add(liveFloating);
                            }
                            if (!a.e(userInfo) && oobject.senderState != null) {
                               LiveFloatingScreenSegmentItem liveFloating1 = new LiveFloatingScreenSegmentItem();
                               if (b) {
                                  userStateSeg = oobject.senderState.userStateSegmentForAuthor;
                                  if (userStateSeg != null) {
                                     i2 = (!userStateSeg.length)? 1: 0;
                                     if (!i2) {
                                        uoa1 = null;
                                     label_0152 :
                                        if (!uoa1) {
                                        label_0159 :
                                           liveFloating1.setSegment(userStateSeg);
                                           UserStateRichTextSegment[] segment = liveFloating1.getSegment();
                                           if (segment != null) {
                                              segment = (!segment.length)? 1: 0;
                                              if (!segment) {
                                                 liveFloating2 = null;
                                              label_016e :
                                                 if (!liveFloating2) {
                                                    uArrayList.add(liveFloating1);
                                                 }
                                              }
                                           }
                                           liveFloating2 = 1;
                                           goto label_016e ;
                                        }
                                     }
                                  }
                                  uoa1 = 1;
                                  goto label_0152 ;
                               }
                               userStateSeg = oobject.senderState.userStateSegment;
                               goto label_0159 ;
                            }
                         label_0173 :
                            liveFloating2 = new LiveFloatingScreenTextItem();
                            String str = b.c(userInfo);
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
                            WealthHighGradeEnterRoom displayType = oobject.displayType;
                            boolean b1 = 3;
                            i2 = 4;
                            int i3 = 2;
                            if (displayType != i1) {
                               if (displayType != i3) {
                                  if (displayType != b1) {
                                     if (displayType == i2) {
                                        liveFloating3.setBackgroundType(i3);
                                        ointArray = new int[5];
                                        ointArray[0] = a.l;
                                        ointArray[i1] = a.m;
                                        ointArray[i3] = a.n;
                                        ointArray[b1] = a.o;
                                        ointArray[i2] = a.q;
                                        liveFloating3.setBackgroundGradientIntColor(ointArray);
                                        liveFloating3.setBackgroundGradientPoints(a.p);
                                        liveFloating4 = new LiveFloatingScreenBorderData();
                                        liveFloating4.setBorderWidth(a.a);
                                        ointArray1 = new int[i3];
                                        ointArray1[0] = a.r;
                                        ointArray1[i1] = a.s;
                                        liveFloating4.setBorderGradientIntColors(ointArray1);
                                     }
                                  }else {
                                     liveFloating3.setBackgroundType(i3);
                                     ointArray = new int[i3];
                                     ointArray[0] = a.h;
                                     ointArray[i1] = a.i;
                                     liveFloating3.setBackgroundGradientIntColor(ointArray);
                                     liveFloating4 = new LiveFloatingScreenBorderData();
                                     liveFloating4.setBorderWidth(a.a);
                                     ointArray1 = new int[i3];
                                     ointArray1[0] = a.j;
                                     ointArray1[i1] = a.k;
                                     liveFloating4.setBorderGradientIntColors(ointArray1);
                                  }
                               }else {
                                  liveFloating3.setBackgroundType(i3);
                                  ointArray = new int[i3];
                                  ointArray[0] = a.d;
                                  ointArray[i1] = a.e;
                                  liveFloating3.setBackgroundGradientIntColor(ointArray);
                                  liveFloating4 = new LiveFloatingScreenBorderData();
                                  liveFloating4.setBorderWidth(a.a);
                                  ointArray1 = new int[i3];
                                  ointArray1[0] = a.f;
                                  ointArray1[i1] = a.g;
                                  liveFloating4.setBorderGradientIntColors(ointArray1);
                               }
                            }else {
                               liveFloating3.setBackgroundType(i3);
                               ointArray1 = new int[i3];
                               ointArray1[0] = a.b;
                               ointArray1[i1] = a.c;
                               liveFloating3.setBackgroundGradientIntColor(ointArray1);
                            }
                            liveWealthGr.setBorderData(liveFloating4);
                            liveWealthGr.setBackgroundData(liveFloating3);
                            LiveFloatingScreenSurfaceData liveFloating5 = new LiveFloatingScreenSurfaceData();
                            liveFloating5.setSurfaceDecorTailWidth(a.t);
                            liveFloating5.setSurfaceDecorTailHeight(a.u);
                            liveFloating5.setSurfaceDecorTailMarginStart(a.v);
                            user1 = oobject.displayType;
                            if (user1 != i1) {
                               if (user1 != i3) {
                                  if (user1 != b1) {
                                     i4 = (user1 != i2)? 0: 0x7f0810b5;
                                  }else {
                                     i4 = 0x7f0810b2;
                                  }
                               }else {
                                  i4 = 0x7f0810b3;
                               }
                            }else {
                               i4 = 0x7f0810b4;
                            }
                            liveFloating5.setSurfaceDecorTailResId(i4);
                            liveWealthGr.setSurfaceData(liveFloating5);
                            if (oobject.displayType == i2) {
                               LiveFloatingScreenEffectData liveFloating6 = new LiveFloatingScreenEffectData();
                               liveFloating6.setEffectTypeBits(i1);
                               liveFloating6.setShimmerLocation(i3);
                               liveFloating6.setShimmerResType(i1);
                               liveFloating6.setShimmerDrawableId(R.drawable.arg_RES_7f081497);
                               liveFloating6.setEffectDelayTimeMs(600);
                               liveWealthGr.setEffectData(liveFloating6);
                            }
                         }
                      }else {
                         goto label_00d7 ;
                      }
                      tb.t.Gi(liveWealthGr);
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
