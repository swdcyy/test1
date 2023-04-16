package com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.i;
import ekd.f$j;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.h;
import com.kuaishou.live.widget.ShootMarqueeView$c;
import com.kuaishou.live.widget.ShootMarqueeView;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;

public class i extends f$j	// class@000b85
{
    public final e a;

    public void i(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.a.r.setMarqueeListener(new h(this));
       e r = this.a.r;
       r.u(r.getText(), 1, 0, 0);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.a.r.setVisibility(0);
       return;
    }
}
