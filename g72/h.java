package g72.h;
import lf3.g;
import g72.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import j72.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$EnterRoomFeed;
import com.kuaishou.live.core.show.enterroom.model.EnterRoomMessage;
import da1.c;
import j72.a;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import lnc.l1;
import p91.m;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;
import java.util.List;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenSegmentItem;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenTextItem;
import b61.b;
import lnc.a1;
import com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenBackgroundData;
import d61.k;
import com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenSurfaceData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBorderData;
import zq5.b;
import lf3.f;

public final class h implements g	// class@002a85
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       int b2;
       int i1;
       ArrayList uArrayList;
       LiveFloatingScreenBackgroundData liveFloating1;
       LiveFloatingScreenSurfaceData liveFloating2;
       LiveFloatingScreenBorderData liveFloating3;
       int[] ointArray;
       int[] ointArray1;
       LiveAudienceState userStateSeg;
       String str;
       LiveFloatingScreenTextItem liveFloating5;
       h b = this.b;
       LiveStreamMessages$SCFeedPush obj = p0;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(obj, b, j.class, "5")) {
       }else {
          obj = obj.enterRoomFeed;
          if (obj != null) {
             int len = obj.length;
             int i = 0;
             while (i < len) {
                EnterRoomMessage uEnterRoomMe = c.e(obj[i]);
                a$a b1 = a.b;
                EnterRoomMessage mFansGroupEn = uEnterRoomMe.mFansGroupEnterRoomSpecialEffectType;
                Objects.requireNonNull(b1);
                if (PatchProxy.isSupport(a$a.class)) {
                   LiveFloatingScreenCommonData obj1 = PatchProxy.applyOneRefs(Integer.valueOf(mFansGroupEn), b1, a$a.class, "1");
                   if (obj1 != PatchProxyResult.class) {
                      b2 = obj1.booleanValue();
                   label_0053 :
                      if (b2 && (!l1.a() && b.t != null)) {
                         b2 = b.p.e();
                         if (PatchProxy.isSupport(a$a.class)) {
                            obj1 = PatchProxy.applyTwoRefs(uEnterRoomMe, Boolean.valueOf(b2), b1, a$a.class, "2");
                            if (obj1 != PatchProxyResult.class) {
                               i1 = 0;
                            label_0239 :
                               b.t.Gi(obj1);
                            }
                         }
                         a.p(uEnterRoomMe, "enterRoomMsg");
                         EnterRoomMessage mFansGroupEn1 = uEnterRoomMe.mFansGroupEnterRoomSpecialEffectType;
                         LiveFloatingScreenCommonData liveFloating = new LiveFloatingScreenCommonData();
                         liveFloating.setBizType(4);
                         liveFloating.setPriority(100);
                         liveFloating.setRunwayType(1);
                         liveFloating.setUserInfo(uEnterRoomMe.mUser);
                         if (PatchProxy.isSupport(a$a.class)) {
                            uArrayList = PatchProxy.applyTwoRefs(uEnterRoomMe, Boolean.valueOf(b2), b1, a$a.class, "3");
                            if (uArrayList != PatchProxyResult.class) {
                            label_011f :
                               liveFloating.setContentItems(uArrayList);
                               object oobject = 2;
                               i1 = 3;
                               if (PatchProxy.isSupport(a$a.class)) {
                                  liveFloating1 = PatchProxy.applyOneRefs(Integer.valueOf(mFansGroupEn1), b1, a$a.class, "4");
                                  if (liveFloating1 != PatchProxyResult.class) {
                                  label_019b :
                                     liveFloating.setBackgroundData(liveFloating1);
                                     if (PatchProxy.isSupport(a$a.class)) {
                                        liveFloating2 = PatchProxy.applyOneRefs(Integer.valueOf(mFansGroupEn1), b1, a$a.class, "5");
                                        if (liveFloating2 != PatchProxyResult.class) {
                                        label_01db :
                                           liveFloating.setSurfaceData(liveFloating2);
                                           if (PatchProxy.isSupport(a$a.class)) {
                                              liveFloating3 = PatchProxy.applyOneRefs(Integer.valueOf(mFansGroupEn1), b1, a$a.class, "6");
                                              if (liveFloating3 != PatchProxyResult.class) {
                                                 i1 = 0;
                                              label_0235 :
                                                 liveFloating.setBorderData(liveFloating3);
                                                 obj1 = liveFloating;
                                                 goto label_0239 ;
                                              }
                                           }
                                           liveFloating3 = new LiveFloatingScreenBorderData();
                                           liveFloating3.setBorderWidth(0x3f000000);
                                           if (mFansGroupEn1 != oobject && mFansGroupEn1 != 4) {
                                              ointArray = null;
                                              i1 = 0;
                                           }else {
                                              ointArray = new int[3];
                                              ointArray[0] = k.a(0x3f800000, a1.a(0x7f0604f4));
                                              ointArray[1] = k.a(0.20f, a1.a(0x7f0604f4));
                                              ointArray[oobject] = k.a(0, a1.a(0x7f0604f4));
                                           }
                                           liveFloating3.setBorderGradientIntColors(ointArray);
                                           goto label_0235 ;
                                        }
                                     }
                                     liveFloating2 = new LiveFloatingScreenSurfaceData();
                                     liveFloating2.setSurfaceDecorTailWidth(120);
                                     liveFloating2.setSurfaceDecorTailHeight(24);
                                     b2 = - a1.e(28.00f);
                                     liveFloating2.setSurfaceDecorTailMarginStart(b2);
                                     if (mFansGroupEn1 != oobject) {
                                        i1 = (mFansGroupEn1 != 4)? 0: 0x7f081322;
                                     }else {
                                        i1 = 0x7f081320;
                                     }
                                     liveFloating2.setSurfaceDecorTailResId(i1);
                                     goto label_01db ;
                                  }
                               }
                               liveFloating1 = new LiveFloatingScreenBackgroundData();
                               liveFloating1.setBackgroundType(oobject);
                               if (mFansGroupEn1 != 1 && mFansGroupEn1 != oobject) {
                                  if (mFansGroupEn1 != i1 && mFansGroupEn1 != 4) {
                                     ointArray1 = null;
                                  }else {
                                     ointArray1 = new int[i1];
                                     ointArray1[0] = k.a(0x3f0ccccd, a1.a(0x7f06052c));
                                     ointArray1[1] = k.a(0.30f, a1.a(0x7f06041f));
                                     ointArray1[oobject] = k.a(0x3f333333, a1.a(0x7f06052e));
                                  }
                               }else {
                                  ointArray1 = new int[oobject];
                                  ointArray1[0] = a1.a(0x7f060d3f);
                                  ointArray1[1] = a1.a(0x7f060d3e);
                               }
                               liveFloating1.setBackgroundGradientIntColor(ointArray1);
                               goto label_019b ;
                            }
                         }
                         uArrayList = new ArrayList();
                         if (uEnterRoomMe.mLiveAudienceState != null) {
                            LiveFloatingScreenSegmentItem liveFloating4 = new LiveFloatingScreenSegmentItem();
                            if (b2) {
                               userStateSeg = uEnterRoomMe.mLiveAudienceState.userStateSegmentForAuthor;
                               if (userStateSeg != null) {
                                  ointArray1 = (!userStateSeg.length)? 1: 0;
                                  if (!ointArray1) {
                                     str = null;
                                  label_00d2 :
                                     if (!str) {
                                     label_00d9 :
                                        liveFloating4.setSegment(userStateSeg);
                                        UserStateRichTextSegment[] segment = liveFloating4.getSegment();
                                        if (segment != null) {
                                           segment = (!segment.length)? 1: 0;
                                           if (!segment) {
                                              liveFloating5 = null;
                                           label_00ee :
                                              if (!liveFloating5) {
                                                 uArrayList.add(liveFloating4);
                                              }
                                           }
                                        }
                                        liveFloating5 = 1;
                                        goto label_00ee ;
                                     }
                                  }
                               }
                               str = 1;
                               goto label_00d2 ;
                            }
                            userStateSeg = uEnterRoomMe.mLiveAudienceState.userStateSegment;
                            goto label_00d9 ;
                         }
                         liveFloating5 = new LiveFloatingScreenTextItem();
                         String str1 = a1.r(R.string.arg_RES_7f10213e, b.c(uEnterRoomMe.mUser));
                         a.o(str1, "CommonUtil.string\(\n     ¡­terRoomMsg.mUser\)\n      \)");
                         liveFloating5.setText(str1);
                         liveFloating5.setTextColor(a1.a(R.color.arg_RES_7f061e52));
                         liveFloating5.setTextSize(14);
                         uArrayList.add(liveFloating5);
                         goto label_011f ;
                      }else {
                         i1 = 0;
                      }
                      i = i + 1;
                   }
                }
                b2 = a.a.contains(Integer.valueOf(mFansGroupEn));
                goto label_0053 ;
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
