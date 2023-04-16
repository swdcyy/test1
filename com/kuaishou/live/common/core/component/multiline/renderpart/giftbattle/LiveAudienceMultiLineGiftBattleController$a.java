package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import or1.d;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import sq1.a;
import ir1.c;
import nq1.a;

public final class LiveAudienceMultiLineGiftBattleController$a implements ViewModelProvider$Factory	// class@00155f
{
    public final LiveAudienceMultiLineGiftBattleController a;

    public void LiveAudienceMultiLineGiftBattleController$a(LiveAudienceMultiLineGiftBattleController p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiLineGiftBattleController$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "aClass");
       if (a.g(p0, d.class)) {
          return new d(this.a.V2(), this.a.w);
       }
       if (a.g(p0, c.class)) {
          return new c(this.a.q);
       }
       return null;
    }
}
