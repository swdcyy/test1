package ct2.c$d;
import tu2.b;
import ct2.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import co2.f2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.model.VoicePartyAbParams;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$FollowGuestGuide;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import ct2.b;
import qs2.r;
import pt2.b;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.follow.cache.c;
import ct2.d;
import java.lang.Math;
import java.lang.Runnable;

public final class c$d implements b	// class@0023de
{
    public final c a;

    public void c$d(c p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       String userId;
       SharedPreferences a;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
          return;
       }
       a.p(p0, "data");
       c$d ta = this.a;
       Objects.requireNonNull(ta);
       c uoc = c.class;
       if (!PatchProxy.applyVoidOneRefs(p0, ta, uoc, "5") && p0 != null) {
          ta.f = p0;
          if (!PatchProxy.applyVoidOneRefs(p0, ta, uoc, "9") && (!p0.isEmpty() && ta.p.G())) {
             Object[] objArray = null;
             LiveVoicePartyCommonConfig$FollowGuestGuide obj = PatchProxy.apply(objArray, ta, uoc, "23");
             boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): ta.p.u().mEnableFollowGuestGuide;
             if (b != null) {
                obj = ta.d();
                if (obj != null && ta.a - (long)obj.mMaxOnlineUser <= 0) {
                   if (!PatchProxy.applyVoid(objArray, ta, uoc, "13") && ta.b < null) {
                      a = a.a;
                      userId = "user";
                      String str1 = "VoicePartyMicGuideFollowGuestLastShowDayMs";
                      if (DateUtils.H(a.getLong(b.d(userId)+str1, 0))) {
                         ta.b = a.getInt(b.d(userId)+"VoicePartyMicGuideFollowGuestTodayShowTime", 0);
                      }else {
                         ta.b = 0;
                         SharedPreferences$Editor uEditor = a.edit();
                         uEditor.putLong(b.d(userId)+str1, System.currentTimeMillis());
                         g.a(uEditor);
                         a.d2(0);
                      }
                      b.Z(LiveVoicePartyLogTag.OTHER, "initFollowGuideShowTimePreference "+ta.b);
                   }
                   if (ta.b < obj.mMaxDisplayTimes) {
                      if (!PatchProxy.applyVoidOneRefs(p0, ta, uoc, "12")) {
                         ArrayList uArrayList = new ArrayList(p0.size());
                         Iterator iterator1 = p0.iterator();
                         while (iterator1.hasNext()) {
                            userId = iterator1.next().getUserId();
                            if (userId != null) {
                               uArrayList.add(userId);
                            }
                         }
                         iterator1 = ta.c.entrySet().iterator();
                         while (iterator1.hasNext()) {
                            Map$Entry uEntry = iterator1.next();
                            if (!uArrayList.contains(uEntry.getKey())) {
                               b value = uEntry.getValue();
                               if (value != null) {
                                  value.a();
                               }
                               iterator1.remove();
                            }
                         }
                      }
                      if (!PatchProxy.applyVoidTwoRefs(obj, p0, ta, uoc, "10")) {
                         Iterator iterator = p0.iterator();
                         while (iterator.hasNext()) {
                            VoicePartyMicSeatData voicePartyMi = iterator.next();
                            if (voicePartyMi.isOccupied() && !r.g(voicePartyMi)) {
                               VoicePartyMicSeatData mMicUser = voicePartyMi.mMicUser;
                               String str = (mMicUser != null && mMicUser.e != null)? 1: null;
                               if (!str) {
                                  str = voicePartyMi.getUserId();
                                  if (str != null && (!ta.d.containsKey(str) && !c.b().c(str))) {
                                     long l = System.currentTimeMillis() - voicePartyMi.mReadyTime;
                                     if (l - (long)obj.mDelayMillis < 0 && !ta.c.containsKey(str)) {
                                        a.o(str, "userId");
                                        ta.d.put(str, Boolean.TRUE);
                                        long l1 = (long)obj.mDelayMillis - l;
                                        ta.c.put(str, new b(new d(str, ta, voicePartyMi, obj), Math.max(0, l1)));
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_01e6 :
       return;
    }
}
