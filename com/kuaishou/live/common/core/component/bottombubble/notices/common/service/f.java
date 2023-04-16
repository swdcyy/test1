package com.kuaishou.live.common.core.component.bottombubble.notices.common.service.f;
import erd.o;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.g;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import nc1.e;
import io.reactivex.g;
import brd.t;

public final class f implements o	// class@000f9e
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       return t.create(new e(tb, p0));
    }
}
