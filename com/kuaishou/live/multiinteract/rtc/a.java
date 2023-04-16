package com.kuaishou.live.multiinteract.rtc.a;
import mh3.d;
import lh3.a;
import kh3.b;
import yg3.a$c;
import java.lang.Object;
import com.kuaishou.live.multiinteract.rtc.a$a;
import mh3.d$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import oh3.j;

public class a	// class@000cff
{
    public b a;
    public final d b;
    public a c;
    public final b d;
    public final a$c e;
    public String f;
    public int g;
    public String h;
    public String i;
    public final d$a j;

    public void a(d p0,a p1,b p2,a$c p3){
       super();
       a$a uoa = new a$a(this);
       this.j = uoa;
       this.b = p0;
       p0.f(uoa);
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public int a(){
       return this.g;
    }
    public String b(){
       return this.h;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.b.e(this.j);
       j.a(this.a);
       this.c = null;
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.b.b();
       return;
    }
}
