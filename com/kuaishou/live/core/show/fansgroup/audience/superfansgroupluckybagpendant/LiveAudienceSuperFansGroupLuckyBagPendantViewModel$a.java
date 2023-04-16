package com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.LiveAudienceSuperFansGroupLuckyBagPendantViewModel$a;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.m$a;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.LiveAudienceSuperFansGroupLuckyBagPendantViewModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import java.lang.Long;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.text.DecimalFormat;

public class LiveAudienceSuperFansGroupLuckyBagPendantViewModel$a implements m$a	// class@000b2c
{
    public final LiveAudienceSuperFansGroupLuckyBagPendantViewModel a;

    public void LiveAudienceSuperFansGroupLuckyBagPendantViewModel$a(LiveAudienceSuperFansGroupLuckyBagPendantViewModel p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       LiveAudienceSuperFansGroupLuckyBagPendantViewModel$a uoa = LiveAudienceSuperFansGroupLuckyBagPendantViewModel$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0 < 1) {
          this.a.d.setValue(Boolean.FALSE);
          return;
       }else {
          this.a.d.setValue(Boolean.TRUE);
          this.a.b.setValue(String.valueOf(p0));
          return;
       }
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSuperFansGroupLuckyBagPendantViewModel$a.class, "2")) {
          return;
       }
       this.a.f.setValue(p0);
       return;
    }
    public void c(long p0){
       String str1;
       LiveAudienceSuperFansGroupLuckyBagPendantViewModel$a uoa = LiveAudienceSuperFansGroupLuckyBagPendantViewModel$a.class;
       String str = "3";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, str)) {
          return;
       }
       if (p0 - null <= 0) {
          this.a.f.setValue("¿ª¸£´ü");
          return;
       }else {
          uoa = this.a;
          LiveAudienceSuperFansGroupLuckyBagPendantViewModel f = uoa.f;
          Objects.requireNonNull(uoa);
          if (PatchProxy.isSupport(LiveAudienceSuperFansGroupLuckyBagPendantViewModel.class)) {
             str1 = PatchProxy.applyOneRefs(Long.valueOf(p0), uoa, LiveAudienceSuperFansGroupLuckyBagPendantViewModel.class, str);
             if (str1 != PatchProxyResult.class) {
             label_0068 :
                f.setValue(str1);
                return;
             }
          }
          DecimalFormat i = LiveAudienceSuperFansGroupLuckyBagPendantViewModel.i;
          str1 = i.format((long)(int)(p0 / 60))+":"+i.format((p0 % 60));
          goto label_0068 ;
       }
    }
}
