package com.facebook.react.uimanager.j$r;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.j$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$r extends j$b0	// class@001364
{
    public final int e;
    public final j f;

    public void j$r(j p0,int p1,int p2,j$a p3){
       this.f = p0;
       super(p0, p1);
       this.e = p2;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$r.class, "1")) {
          return;
       }
       this.f.b.sendAccessibilityEvent(this.a, this.e);
       return;
    }
}
