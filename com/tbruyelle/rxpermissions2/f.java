package com.tbruyelle.rxpermissions2.f;
import brd.x;
import com.tbruyelle.rxpermissions2.g;
import java.lang.String;
import java.lang.Object;
import brd.t;
import brd.w;
import com.tbruyelle.rxpermissions2.f$a;
import erd.o;

public class f implements x	// class@000e0b
{
    public final String[] b;
    public final g c;

    public void f(g p0,String[] p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public w apply(t p0){
       return this.c.c(p0, this.b).buffer(this.b.length).flatMap(new f$a(this));
    }
}
