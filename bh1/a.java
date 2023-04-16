package bh1.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$a;
import java.lang.Integer;
import java.lang.Number;
import k2b.u1;

public class a	// class@000388
{

    public void a(){
       super();
    }
    public static void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "2")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("result", "failed");
       oi3.d("reason", p1);
       oi3.c("isLowPhone", Integer.valueOf(LiveGiftComboButtonAnimationUtils.h.e()));
       oi3.d("scene", p0);
       p0 = oi3.e();
       u1.R("LIVE_GIFT_EFFECT_V2_DISPLAY_RESULT", p0, 3);
       return;
    }
    public static void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("result", "success");
       oi3.d("reason", "");
       oi3.c("isLowPhone", Integer.valueOf(LiveGiftComboButtonAnimationUtils.h.e()));
       oi3.d("scene", p0);
       p0 = oi3.e();
       u1.R("LIVE_GIFT_EFFECT_V2_DISPLAY_RESULT", p0, 3);
       return;
    }
}
