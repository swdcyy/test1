package e01.b$a;
import e01.f;
import e01.b;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import brd.y;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxComboTextAnimationView;

public class b$a implements f	// class@002075
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(Gift p0,View p1,boolean p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, b$a.class, "2")) {
          return;
       }
       if (p2) {
          b$a ta = this.a;
          ta.u.onNext(ta.v);
       }
       this.a.P8(p0, p1);
       return;
    }
    public void b(Gift p0,View p1,int p2,boolean p3,boolean p4){
       int i = 1;
       if (PatchProxy.isSupport(b$a.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
             return;
          }
       }
       if (p3) {
          b$a ta = this.a;
          ta.u.onNext(ta.v);
       }
       this.a.P8(p0, p1);
       LiveGiftComboButtonAnimationUtils$a h = LiveGiftComboButtonAnimationUtils.h;
       Objects.requireNonNull(h);
       if (p2 != 2) {
          i = false;
       }
       Objects.requireNonNull(h);
       this.a.r.c(p2, p1, 0, i);
       return;
    }
}
