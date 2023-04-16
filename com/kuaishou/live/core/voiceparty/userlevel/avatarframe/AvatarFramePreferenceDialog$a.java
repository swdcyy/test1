package com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog;
import java.lang.Object;
import rx2.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rx2.c;
import kotlin.jvm.internal.a;
import java.util.Objects;
import rx2.l$b;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.userlevel.logger.AvatarDecorationCardClickType;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logAvatarDecorationCardClick$1;
import msd.p;
import yx2.d;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import rx2.q$a;
import crd.b;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import brd.t;
import cjd.e;
import erd.o;
import brd.x;
import rh3.b;
import t45.d;
import brd.z;
import rx2.d;
import rx2.e;
import rx2.f;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logAvatarFrameSetClick$1;
import rx2.l$a;

public final class AvatarFramePreferenceDialog$a implements g	// class@001a6f
{
    public final AvatarFramePreferenceDialog b;

    public void AvatarFramePreferenceDialog$a(AvatarFramePreferenceDialog p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       AvatarDecorationCardClickType nONE;
       c a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AvatarFramePreferenceDialog$a.class, "1")) {
       }else {
          c uoc = this.b.Y2();
          String str = "intent";
          a.o(p0, str);
          Objects.requireNonNull(uoc);
          c uoc1 = c.class;
          if (!PatchProxy.applyVoidOneRefs(p0, uoc, uoc1, "3")) {
             a.p(p0, str);
             if (p0 instanceof l$b) {
                p0 = p0.a;
                String str1 = "2";
                if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoc, uoc1, str1)) {
                   c d = uoc.d;
                   if (p0 != 1) {
                      if (p0 != 2) {
                         nONE = (p0 != 3)? AvatarDecorationCardClickType.NONE: AvatarDecorationCardClickType.GIFT;
                      }else {
                         nONE = AvatarDecorationCardClickType.MIC;
                      }
                   }else {
                      nONE = AvatarDecorationCardClickType.NONE;
                   }
                   Objects.requireNonNull(d);
                   if (!PatchProxy.applyVoidOneRefs(nONE, d, UserMicSeatLevelLogger.class, str1)) {
                      a.p(nONE, "itemType");
                      UserMicSeatLevelLogger.b(d, "AVATAR_FRAME_SET_CARD", null, new UserMicSeatLevelLogger$logAvatarDecorationCardClick$1(nONE), 2, null).f();
                   }
                   if (uoc.b != p0) {
                      uoc.r0(uoc.c).setValue(new q$a(p0));
                      a = uoc.a;
                      if (a != null) {
                         a.dispose();
                      }
                      uoc.a = LiveVoicePartyApi.b().C(p0).map(new e()).compose(b.a(uoc)).observeOn(d.a).doOnError(new d(uoc)).subscribe(new e(uoc, p0), f.b);
                      d = uoc.d;
                      Objects.requireNonNull(d);
                      if (!PatchProxy.isSupport(UserMicSeatLevelLogger.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), d, UserMicSeatLevelLogger.class, "15")) {
                         if (p0 != 1) {
                            if (p0 != 2) {
                               p0 = (p0 != 3)? "": "GIFT";
                            }else {
                               p0 = "MIC";
                            }
                         }else {
                            p0 = "NONE";
                         }
                         UserMicSeatLevelLogger.b(d, "MIC_LEVEL_UPGRADE_POPUP", null, new UserMicSeatLevelLogger$logAvatarFrameSetClick$1(p0), 2, null).f();
                      }
                   }
                }
             }else if(p0 instanceof l$a){
                uoc.v0();
             }
          }
          PatchProxy.onMethodExit(AvatarFramePreferenceDialog$a.class, "1");
       }
       return;
    }
}
