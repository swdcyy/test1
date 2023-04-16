package com.kuaishou.live.lite.util.viewupdater.c;
import msd.a;
import java.lang.String;
import java.lang.Runnable;
import java.lang.Object;
import vd3.b;
import ec3.r;
import qrd.l1;

public final class c implements a	// class@000ba8
{
    public final String b;
    public final Runnable c;

    public void c(String p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(){
       r.a(this.b, new b(this.c));
       return l1.a;
    }
}
