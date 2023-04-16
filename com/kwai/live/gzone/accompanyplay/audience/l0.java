package com.kwai.live.gzone.accompanyplay.audience.l0;
import brd.x;
import com.kwai.live.gzone.accompanyplay.audience.k0$f;
import java.lang.Object;
import brd.t;
import brd.w;
import java.util.Objects;
import k37.k0;
import erd.g;
import k37.j0;
import erd.a;

public final class l0 implements x	// class@000b95
{
    public final k0$f b;

    public void l0(k0$f p0){
       this.b = p0;
    }
    public final w apply(t p0){
       l0 tb = this.b;
       Objects.requireNonNull(tb);
       return p0.doOnSubscribe(new k0(tb)).doFinally(new j0(tb));
    }
}
