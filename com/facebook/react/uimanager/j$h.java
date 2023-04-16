package com.facebook.react.uimanager.j$h;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$h extends j$b0	// class@00135a
{
    public final int e;
    public final ReadableArray f;
    public final String g;
    public final j h;

    public void j$h(j p0,int p1,int p2,String p3,ReadableArray p4){
       this.h = p0;
       super(p0, p1);
       this.e = p2;
       this.f = p4;
       this.g = p3;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$h.class, "1")) {
          return;
       }
       this.h.b.q(this.a, this.e, this.g, this.f);
       return;
    }
}
