package com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewModel$a;
import z0.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewModel;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Pair;
import java.util.Objects;
import it2.g1;
import com.kuaishou.live.core.voiceparty.hat.VoicePartyHatInfo;
import com.kwai.framework.model.user.UserInfo;
import wkd.b;
import et2.a;
import com.yxcorp.gifshow.model.CDNUrl;
import android.net.Uri;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class HatPendantViewModel$a implements a	// class@00160a
{
    public final HatPendantViewModel a;

    public void HatPendantViewModel$a(HatPendantViewModel p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       g1 og1;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       Integer obj = PatchProxy.applyOneRefs(p0, this, HatPendantViewModel$a.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          HatPendantViewModel$a ta = this.a;
          HatPendantViewModel h = ta.h;
          Objects.requireNonNull(ta);
          og1 = PatchProxy.applyTwoRefs(p0, h, ta, HatPendantViewModel.class, str);
          if (og1 != patchProxyRe) {
          }else {
             VoicePartyHatInfo voicePartyHa = p0.component1();
             UserInfo userInfo = p0.component2();
             int i = 0x58c478c0;
             a uoa = b.a(i);
             b = false;
             boolean b1 = (userInfo != null)? userInfo.isMale(): false;
             CDNUrl[] uCDNUrlArray = uoa.b(voicePartyHa, b1);
             Uri uri = b.a(i).a(voicePartyHa.mIsBehindHat);
             if (h != null && h.intValue() < p0.getFirst().mHatLevel) {
                b = true;
             }
             a.o(uri, "imageUrl");
             og1 = new g1(uri, uCDNUrlArray, b);
          }
       }else {
          og1 = obj;
       }
       HatPendantViewModel$a ta1 = this.a;
       if (p0 != null) {
          p0 = p0.getFirst();
          if (p0 != null) {
             obj = Integer.valueOf(p0.mHatLevel);
          }
       }
       ta1.h = obj;
       return og1;
    }
}
