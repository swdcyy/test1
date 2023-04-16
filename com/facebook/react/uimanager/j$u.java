package com.facebook.react.uimanager.j$u;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$u extends j$b0	// class@001367
{
    public final ReadableArray e;
    public final Callback f;
    public final Callback g;
    public final j h;

    public void j$u(j p0,int p1,ReadableArray p2,Callback p3,Callback p4){
       this.h = p0;
       super(p0, p1);
       this.e = p2;
       this.f = p3;
       this.g = p4;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$u.class, "1")) {
          return;
       }
       this.h.b.l(this.a, this.e, this.g, this.f);
       return;
    }
}
