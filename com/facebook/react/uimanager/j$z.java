package com.facebook.react.uimanager.j$z;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import ze.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$z extends j$b0	// class@00136c
{
    public final z e;
    public final j f;

    public void j$z(j p0,int p1,z p2){
       this.f = p0;
       super(p0, p1);
       this.e = p2;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$z.class, "1")) {
          return;
       }
       this.f.b.m(this.a, this.e);
       return;
    }
}
