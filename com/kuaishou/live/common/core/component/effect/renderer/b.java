package com.kuaishou.live.common.core.component.effect.renderer.b;
import ok.x;
import com.kuaishou.live.common.core.component.effect.renderer.c;
import java.lang.Object;
import java.util.Objects;
import dz2.c;
import ag1.f;
import dz2.c$a;

public final class b implements x	// class@0010ed
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final Object get(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       return new c(new f(tb));
    }
}
