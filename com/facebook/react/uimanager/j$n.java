package com.facebook.react.uimanager.j$n;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import ze.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$n extends j$b0	// class@001360
{
    public final int[] e;
    public final a1[] f;
    public final int[] g;
    public final int[] h;
    public final j i;

    public void j$n(j p0,int p1,int[] p2,a1[] p3,int[] p4,int[] p5){
       this.i = p0;
       super(p0, p1);
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$n.class, "1")) {
          return;
       }
       this.i.b.e(this.a, this.e, this.f, this.g, this.h);
       return;
    }
}
