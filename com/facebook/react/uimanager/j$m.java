package com.facebook.react.uimanager.j$m;
import com.facebook.react.uimanager.j$w;
import com.facebook.react.uimanager.j;
import ze.x;
import com.facebook.react.uimanager.f$a;
import com.facebook.react.uimanager.j$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class j$m implements j$w	// class@00135f
{
    public final x a;
    public final f$a b;
    public final j c;

    public void j$m(j p0,x p1,f$a p2,j$a p3){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$m.class, "1")) {
          return;
       }
       this.b.a(this.a);
       return;
    }
}
