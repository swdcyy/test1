package com.gifshow.kanim.a$f;
import com.gifshow.kanim.a$g;
import com.gifshow.kanim.a;
import java.lang.Object;
import bh.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$f implements a$g	// class@0015b2
{
    public final int a;
    public final a b;

    public void a$f(a p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
          return;
       }
       this.b.f(this.a);
       return;
    }
}
