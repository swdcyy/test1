package com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.h;
import com.kuaishou.live.widget.ShootMarqueeView$c;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.i;
import java.lang.Object;
import b11.g;
import java.lang.String;
import java.lang.Runnable;
import e93.f;

public final class h implements ShootMarqueeView$c	// class@000b84
{
    public final i a;

    public void h(i p0){
       this.a = p0;
    }
    public final void a(){
       h ta = this.a;
       g og = new g(ta);
       f.k("startGradeUpOutAnimation", og, ta.a, 2000);
    }
}
