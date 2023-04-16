package com.facebook.react.uimanager.j$y;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$y extends j$b0	// class@00136b
{
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final j j;

    public void j$y(j p0,int p1,int p2,int p3,int p4,int p5,int p6){
       this.j = p0;
       super(p0, p2);
       this.e = p1;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$y.class, "1")) {
          return;
       }
       this.j.b.f(this.e, this.a, this.f, this.g, this.h, this.i);
       return;
    }
}
