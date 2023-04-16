package com.facebook.react.uimanager.j$q;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$q extends j$b0	// class@001363
{
    public final j e;

    public void j$q(j p0,int p1){
       this.e = p0;
       super(p0, p1);
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$q.class, "1")) {
          return;
       }
       this.e.b.x(this.a);
       return;
    }
}
