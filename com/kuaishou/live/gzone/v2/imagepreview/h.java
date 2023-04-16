package com.kuaishou.live.gzone.v2.imagepreview.h;
import erd.o;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.gzone.v2.imagepreview.m;
import io.reactivex.g;
import brd.t;

public final class h implements o	// class@001ccd
{
    public final n b;

    public void h(n p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       return t.create(new m(tb));
    }
}
