package com.tbruyelle.rxpermissions2.e;
import brd.x;
import com.tbruyelle.rxpermissions2.g;
import java.lang.String;
import java.lang.Object;
import brd.t;
import brd.w;
import com.tbruyelle.rxpermissions2.e$a;
import erd.o;

public class e implements x	// class@000e09
{
    public final String[] b;
    public final g c;

    public void e(g p0,String[] p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public w apply(t p0){
       return this.c.c(p0, this.b).buffer(this.b.length).flatMap(new e$a(this));
    }
}
