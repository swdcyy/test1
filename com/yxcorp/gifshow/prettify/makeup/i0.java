package com.yxcorp.gifshow.prettify.makeup.i0;
import n0c.c;
import z0c.k0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.t;
import n0c.c$a;
import java.util.ArrayList;
import f1c.l2;
import io.reactivex.g;
import java.util.Objects;
import z0c.o0;
import erd.a;
import f1c.m2;
import erd.o;

public class i0 extends c	// class@001184
{
    public final k0 f;

    public void i0(k0 p0){
       super();
       this.f = p0;
       this.b = 1;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, i0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.f.e();
    }
    public t b(){
       Object obj = PatchProxy.apply(null, this, i0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          return t.just(new c$a(new ArrayList()));
       }
       i0 tf = this.f;
       Objects.requireNonNull(tf);
       return t.create(new l2(this)).doOnDispose(new o0(tf)).flatMap(new m2(this));
    }
}
