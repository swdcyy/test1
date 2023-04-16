package com.facebook.react.uimanager.j$e;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import ze.n0;
import java.lang.String;
import ze.z;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$e extends j$b0	// class@001357
{
    public final n0 e;
    public final String f;
    public final z g;
    public final j h;

    public void j$e(j p0,n0 p1,int p2,String p3,z p4){
       this.h = p0;
       super(p0, p2);
       this.e = p1;
       this.f = p3;
       this.g = p4;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$e.class, "1")) {
          return;
       }
       this.h.b.c(this.e, this.a, this.f, this.g);
       return;
    }
}
