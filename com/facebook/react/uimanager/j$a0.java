package com.facebook.react.uimanager.j$a0;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$a0 extends j$b0	// class@001351
{
    public final Object e;
    public final j f;

    public void j$a0(j p0,int p1,Object p2){
       this.f = p0;
       super(p0, p1);
       this.e = p2;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$a0.class, "1")) {
          return;
       }
       this.f.b.s(this.a, this.e);
       return;
    }
}
