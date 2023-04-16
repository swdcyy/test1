package com.kwai.component.photo.detail.core.log.vse.opt.a;
import ok.h;
import com.kwai.component.photo.detail.core.log.vse.opt.b;
import java.lang.Object;
import java.lang.Void;
import java.util.concurrent.TimeUnit;
import brd.t;
import zd5.i;
import erd.g;
import crd.b;

public final class a implements h	// class@000a2c
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       return t.interval(tb.a, tb.a, TimeUnit.SECONDS).subscribe(new i(tb));
    }
}
