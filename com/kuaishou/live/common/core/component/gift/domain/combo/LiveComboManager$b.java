package com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$b;
import zg1.c;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import java.lang.Object;
import zg1.a;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import aq5.d;

public final class LiveComboManager$b implements c	// class@00116d
{
    public final LiveComboManager a;

    public void LiveComboManager$b(LiveComboManager p0){
       this.a = p0;
       super();
    }
    public void a(a p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveComboManager$b.class, "2")) {
          return;
       }
       a.p(p0, "type");
       a.p(p1, "viewController");
       this.a.i.yj(AudienceBizRelation.GIFT_COMBO);
       return;
    }
    public void b(a p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveComboManager$b.class, "1")) {
          return;
       }
       a.p(p0, "type");
       a.p(p1, "viewController");
       this.a.i.Pj(AudienceBizRelation.GIFT_COMBO);
       return;
    }
}
