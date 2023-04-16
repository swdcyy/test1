package com.facebook.react.uimanager.j$v;
import com.facebook.react.uimanager.j$w;
import com.facebook.react.uimanager.j;
import ze.q0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.m;

public class j$v implements j$w	// class@001368
{
    public final q0 a;
    public final j b;

    public void j$v(j p0,q0 p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$v.class, "1")) {
          return;
       }
       this.a.a(this.b.m());
       return;
    }
}
