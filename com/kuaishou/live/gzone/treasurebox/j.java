package com.kuaishou.live.gzone.treasurebox.j;
import ok.h;
import com.kuaishou.live.gzone.treasurebox.k;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import m53.o;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;

public final class j implements h	// class@001c71
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       o oo = new o(tb);
       return t.interval(1, TimeUnit.SECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(oo, e.b);
    }
}
