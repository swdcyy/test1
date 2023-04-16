package com.facebook.react.uimanager.j$f;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$f extends j$b0	// class@001358
{
    public final int e;
    public final int f;
    public final j g;

    public void j$f(j p0,int p1,int p2,int p3){
       this.g = p0;
       super(p0, p1);
       this.e = p2;
       this.f = p3;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$f.class, "1")) {
          return;
       }
       this.g.b.b(this.a, this.e, this.f);
       return;
    }
}
