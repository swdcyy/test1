package co2.g;
import erd.g;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse;
import co2.f2;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatInfo;
import qs2.r;
import e17.i;
import ht2.a;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState;
import com.kuaishou.live.core.voiceparty.d0;
import yx2.g;
import co2.r;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kwai.framework.model.user.QCurrentUser;
import pt2.b;
import xx2.b;
import java.util.Objects;
import xx2.b$a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo$Decoration;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class g implements g	// class@00058c
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h h;
       LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo obj;
       int i1;
       object oobject1;
       ArrayList uArrayList;
       int len;
       ArrayList uArrayList2;
       g b = this.b;
       LiveVoicePartyMicSeatsReadyResponse liveVoicePar = p0;
       b.c.k = liveVoicePar.mMicSeatsVersion;
       int i = (r.f(liveVoicePar.mMicSeatInfo.mMicState))? 0x7f102e11: 0x7f102e10;
       i.a(R.style.arg_RES_7f11066a, i);
       LiveVoicePartyMicSeatsReadyResponse mMicSeatsRea = liveVoicePar.mMicSeatsReason;
       LiveVoicePartyMicSeatsReadyResponse mVoicePartyU = liveVoicePar.mVoicePartyUserInitialState;
       a uoa = new a(liveVoicePar.mMicSeatInfo, liveVoicePar.mMicSeatsVersion, liveVoicePar.mUserMicSeatLevelInfo);
       object oobject = 3;
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(mMicSeatsRea), mVoicePartyU, uoa, b, h.class, "21")) {
          b.a.f("onEnterMicSeat shouldMute = "+d0.t(mVoicePartyU));
          h = b.c;
          if (h != null) {
             b.f = true;
             h.c = oobject;
             b.e.n(mMicSeatsRea, mVoicePartyU, uoa);
          }
       }
       h = b.h;
       if (h != null && !PatchProxy.applyVoidOneRefs(liveVoicePar, h, AudienceMicSeatsDataManager.class, "5")) {
          a.p(liveVoicePar, "response");
          LiveVoicePartyMicSeatsReadyResponse mMicSeatInfo = liveVoicePar.mMicSeatInfo;
          LiveVoicePartyMicSeatsReadyResponse mUserMicSeat = liveVoicePar.mUserMicSeatLevelInfo;
          Iterator iterator = h.k().iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                i1 = (obj.mId == mMicSeatInfo.mMicSeatId)? 1: 0;
                if (!i1) {
                   continue ;
                }
             }else {
                len = 0;
             }
             if (obj != null) {
                obj.mMicState = mMicSeatInfo.mMicState;
                obj.mMicSeatTypes = mMicSeatInfo.mMicSeatTypes;
                QCurrentUser qCurrentUser = QCurrentUser.me();
                a.o(qCurrentUser, "QCurrentUser.me\(\)");
                b uob = h.y(qCurrentUser);
                obj.mMicUser = uob;
                a.m(uob);
                uob.g = liveVoicePar.mKsCoin;
                VoicePartyMicSeatData mMicUser = obj.mMicUser;
                a.m(mMicUser);
                mMicUser.h = liveVoicePar.mUserLevel;
                if (mUserMicSeat != null) {
                   mMicUser = obj.mMicUser;
                   a.m(mMicUser);
                   b$a e = b.e;
                   Objects.requireNonNull(e);
                   b uob1 = PatchProxy.applyOneRefs(mUserMicSeat, e, b$a.class, "2");
                   if (uob1 != PatchProxyResult.class) {
                   }else {
                      a.p(mUserMicSeat, "levelInfo");
                      LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo mAvatarFrame = mUserMicSeat.mAvatarFramePreference;
                      obj = mUserMicSeat.mDecorations;
                      if (obj != null) {
                         i1 = obj.length;
                         int i2 = 0;
                         while (true) {
                            if (i2 < i1) {
                               oobject1 = obj[i2];
                               object oobject2 = (oobject1.mType == true)? 1: null;
                               if (oobject2) {
                               label_011c :
                                  if (oobject1 != null) {
                                     LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo$Decoration mMaterialUrl = oobject1.mMaterialUrls;
                                     if (mMaterialUrl != null) {
                                        uArrayList = new ArrayList(mMaterialUrl.length);
                                        i2 = mMaterialUrl.length;
                                        for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                                           oobject2 = mMaterialUrl[i3];
                                           a.o(oobject2, "it");
                                           uArrayList.add(oobject2.getUrl());
                                        }
                                        obj = mUserMicSeat.mDecorations;
                                        if (obj != null) {
                                           i2 = obj.length;
                                           i3 = 0;
                                           while (true) {
                                              if (i3 < i2) {
                                                 oobject2 = obj[i3];
                                                 ArrayList uArrayList1 = (oobject2.mType == 2)? 1: null;
                                                 if (uArrayList1) {
                                                 label_0158 :
                                                    if (oobject2 != null) {
                                                       mMaterialUrl = oobject2.mMaterialUrls;
                                                       if (mMaterialUrl != null) {
                                                          uArrayList1 = new ArrayList(mMaterialUrl.length);
                                                          i2 = mMaterialUrl.length;
                                                          for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                                                             oobject2 = mMaterialUrl[i3];
                                                             a.o(oobject2, "it");
                                                             uArrayList1.add(oobject2.getUrl());
                                                          }
                                                          LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo mDecorations = mUserMicSeat.mDecorations;
                                                          if (mDecorations != null) {
                                                             len = mDecorations.length;
                                                             i2 = 0;
                                                             while (true) {
                                                                if (i2 < len) {
                                                                   oobject1 = mDecorations[i2];
                                                                   LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo$Decoration userMicSeatL = (oobject1.mType == oobject)? 1: null;
                                                                   if (userMicSeatL) {
                                                                   label_0193 :
                                                                      if (oobject1 != null) {
                                                                         LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo$Decoration mMaterialUrl1 = oobject1.mMaterialUrls;
                                                                         if (mMaterialUrl1 != null) {
                                                                            uArrayList2 = new ArrayList(mMaterialUrl1.length);
                                                                            i2 = mMaterialUrl1.length;
                                                                            for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                                                                               oobject = mMaterialUrl1[i3];
                                                                               a.o(oobject, "it");
                                                                               uArrayList2.add(oobject.getUrl());
                                                                            }
                                                                            uob1 = new b(mAvatarFrame, uArrayList, uArrayList1, uArrayList2);
                                                                         }
                                                                      }
                                                                   }else {
                                                                      i2 = i2 + 1;
                                                                   }
                                                                }else {
                                                                   oobject1 = null;
                                                                   goto label_0193 ;
                                                                }
                                                             }
                                                          }
                                                       label_01b2 :
                                                          uArrayList2 = CollectionsKt__CollectionsKt.E();
                                                          goto label_01b6 ;
                                                       }
                                                    }
                                                 }else {
                                                    i3 = i3 + 1;
                                                 }
                                              }else {
                                                 oobject2 = null;
                                                 goto label_0158 ;
                                              }
                                           }
                                        }
                                     label_0177 :
                                        List list = CollectionsKt__CollectionsKt.E();
                                        goto label_017b ;
                                     }
                                  }
                               }else {
                                  i2 = i2 + 1;
                               }
                            }else {
                               oobject1 = null;
                               goto label_011c ;
                            }
                         }
                      }
                   label_013b :
                      uArrayList = CollectionsKt__CollectionsKt.E();
                      goto label_013f ;
                   }
                   mMicUser.m = uob1;
                }
                h.C(h.k(), false);
                break ;
             }
          }
       }
       return;
    }
}
