package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel$b;
import erd.g;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.MicSeatLevelInfoTodayResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import java.util.ArrayList;
import com.kuaishou.live.core.voiceparty.model.MicSeatLevelUserInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collection;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import com.kuaishou.live.core.voiceparty.model.MicSeatLevelInfo;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logPrivilegeBadgeShow$1;
import msd.p;
import yx2.d;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logPrivilegeButtonShow$1;
import com.kuaishou.live.core.voiceparty.model.MicSeatLevelInfoTodayResponse$ExperienceInfo;
import java.lang.Long;
import java.lang.Float;

public final class UserLevelInfoViewModel$b implements g	// class@001a69
{
    public final UserLevelInfoViewModel b;

    public void UserLevelInfoViewModel$b(UserLevelInfoViewModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       List list;
       String userId;
       MicSeatLevelInfo micSeatLevel;
       MicSeatLevelInfo obj = this;
       MicSeatLevelInfoTodayResponse obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, UserLevelInfoViewModel$b.class, "1")) {
       }else {
          UserLevelInfoViewModel$b b = obj.b;
          a.o(obj1, "it");
          Objects.requireNonNull(b);
          UserMicSeatLevelLogger userMicSeatL = UserMicSeatLevelLogger.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, UserLevelInfoViewModel.class, "2")) {
             b.a = obj1.levelInfo;
             MicSeatLevelInfoTodayResponse userInfo = obj1.userInfo;
             if (userInfo != null) {
                ArrayList uArrayList = new ArrayList();
                MicSeatLevelUserInfo avatar = userInfo.avatar;
                if (avatar != null) {
                   a.o(avatar, "it.avatar");
                   uArrayList.add(avatar);
                }
                MicSeatLevelUserInfo avatars = userInfo.avatars;
                a.o(avatars, "it.avatars");
                ArrayList uArrayList1 = new ArrayList(avatars.length);
                int len = avatars.length;
                for (int i = 0; i < len; i = i + 1) {
                   object oobject = avatars[i];
                   a.o(oobject, "cdnUrl");
                   uArrayList1.add(oobject.getUrl());
                }
                uArrayList.addAll(uArrayList1);
                b.r0(b.b).setValue(uArrayList);
             }
             userInfo = obj1.levelInfo;
             int i1 = 1;
             if (userInfo != null) {
                b.r0(b.i).setValue(Integer.valueOf(TextUtils.J(userInfo.levelColor, 0xffff0000)));
                b.r0(b.l).setValue(Boolean.valueOf(userInfo.canLevelUp));
                MicSeatLevelInfo levelIconUrl = userInfo.levelIconUrls;
                if (levelIconUrl != null) {
                   list = ArraysKt___ArraysKt.uy(levelIconUrl);
                   if (list != null) {
                   label_00a9 :
                      String str = "";
                      if (list.isEmpty() ^ i1) {
                         b.r0(b.e).setValue(list);
                         UserLevelInfoViewModel p = b.p;
                         userId = b.o.getUserId();
                         if (userId == null) {
                            userId = str;
                         }
                         a.o(userId, "seatData.userId ?: \"\"");
                         MicSeatLevelInfo level = userInfo.level;
                         MicSeatLevelInfo subLevel = userInfo.subLevel;
                         Objects.requireNonNull(p);
                         if (PatchProxy.isSupport(userMicSeatL)) {
                            micSeatLevel = subLevel;
                            obj = level;
                            if (!PatchProxy.applyVoidThreeRefs(userId, Integer.valueOf(level), Integer.valueOf(subLevel), p, UserMicSeatLevelLogger.class, "4")) {
                            }
                         }else {
                            micSeatLevel = subLevel;
                            obj = level;
                         }
                      }
                   label_0109 :
                      UserLevelInfoViewModel p1 = b.p;
                      String userId1 = b.o.getUserId();
                      if (userId1 != null) {
                         str = userId1;
                      }
                      a.o(str, "seatData.userId ?: \"\"");
                      micSeatLevel = userInfo.level;
                      MicSeatLevelInfo subLevel1 = userInfo.subLevel;
                      Objects.requireNonNull(p1);
                      if (!PatchProxy.isSupport(userMicSeatL) || !PatchProxy.applyVoidThreeRefs(str, Integer.valueOf(micSeatLevel), Integer.valueOf(subLevel1), p1, UserMicSeatLevelLogger.class, "6")) {
                         a.p(str, "uid");
                         p1.a("SEE_MIC_PRIVILEGE_BUTTON", str, new UserMicSeatLevelLogger$logPrivilegeButtonShow$1(micSeatLevel, subLevel1)).g();
                      }
                   }
                }
                list = CollectionsKt__CollectionsKt.E();
                goto label_00a9 ;
             }
             MicSeatLevelInfoTodayResponse experienceIn = obj1.experienceInfo;
             if (experienceIn != null) {
                obj1 = obj1.levelInfo;
                micSeatLevel = (obj1 != null)? obj1.canLevelUp: 1;
                MicSeatLevelInfoTodayResponse$ExperienceInfo alreadyGain = (micSeatLevel != null)? experienceIn.alreadyGain: experienceIn.maxGain;
                b.r0(b.f).setValue(Long.valueOf(alreadyGain));
                b.r0(b.g).setValue(Long.valueOf(experienceIn.maxGain));
                b.r0(b.h).setValue(Float.valueOf(((float)alreadyGain / (float)experienceIn.maxGain)));
                b.r0(b.j).setValue(Long.valueOf(experienceIn.expNextGain));
                b.r0(b.k).setValue(Integer.valueOf(experienceIn.nextGainRestTime));
             }
          }
       }
       return;
    }
}
