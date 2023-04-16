package com.kuaishou.live.core.voiceparty.micseats.a$e;
import erd.g;
import com.kuaishou.live.core.voiceparty.micseats.a;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import co2.f2;
import e17.i;
import co2.y1;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import brd.t;
import brd.x;
import yx2.i;
import cjd.e;
import erd.o;
import qs2.j;
import com.kuaishou.live.core.voiceparty.micseats.b;
import crd.b;
import android.app.Activity;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class a$e implements g	// class@001567
{
    public final a b;
    public final VoicePartyMicSeatData c;
    public final int d;

    public void a$e(a p0,VoicePartyMicSeatData p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       int b1;
       boolean b = p0.booleanValue();
       a$e uoe = a$e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoe, "1")) {
          if (b) {
             b = this.b;
             uoe = this.c;
             a$e td = this.d;
             Objects.requireNonNull(b);
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(uoe, Integer.valueOf(td), b, uoa, "25")) {
                Object obj = PatchProxy.apply(null, b, uoa, "29");
                VoicePartyMicSeatData voicePartyMi = null;
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if(b.s.g() == 3){
                   i.a(R.style.arg_RES_7f11066a, 0x7f102dd6);
                   b1 = false;
                }else {
                   b1 = true;
                }
                if (b1 && b.S(uoe, td)) {
                   b1 = (td == 4)? 13: 0;
                   if (b.s.g() == 1) {
                      b.P(uoe, b1);
                   }else if(b.s.g() == 2){
                      if (b.f.b()) {
                         b.g0("LONG_WAIT", td);
                      }else if(PatchProxy.applyVoidOneRefs(uoe, b, uoa, "26")){
                         if (uoe != null) {
                            voicePartyMi = uoe.mId;
                         }
                         LiveVoicePartyApi.b().m(b.V(), b.s.y(), voicePartyMi).compose(b.L()).map(new e()).subscribe(new j(b, voicePartyMi), new b(b, uoe));
                      }
                   }
                }
             }
          }else {
             String[] stringArray = new String[]{"android.permission.RECORD_AUDIO"};
             PermissionUtils.n(this.b.o, stringArray);
          }
       }
       return;
    }
}
