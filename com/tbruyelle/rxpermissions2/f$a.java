package com.tbruyelle.rxpermissions2.f$a;
import erd.o;
import com.tbruyelle.rxpermissions2.f;
import java.lang.Object;
import java.util.List;
import brd.t;
import zq8.a;

public class f$a implements o	// class@000e0a
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = (p0.isEmpty())? t.empty(): t.just(new a(p0));
       return p0;
    }
}
