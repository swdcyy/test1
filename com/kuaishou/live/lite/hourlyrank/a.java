package com.kuaishou.live.lite.hourlyrank.a;
import com.kuaishou.live.widget.ShootMarqueeView$c;
import com.kuaishou.live.lite.hourlyrank.c;
import java.lang.Object;
import java.util.Objects;
import qb3.h;
import java.lang.String;
import java.lang.Runnable;
import e93.f;

public final class a implements ShootMarqueeView$c	// class@0009b8
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final void a(){
       a ta = this.a;
       Objects.requireNonNull(ta);
       f.k("initMoreHourlyRank", new h(ta), ta, 500);
    }
}
