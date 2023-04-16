package com.facebook.react.uimanager.j$i;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$i extends j$b0	// class@00135b
{
    public final String e;
    public final ReadableArray f;
    public final String g;
    public final j h;

    public void j$i(j p0,int p1,String p2,String p3,ReadableArray p4){
       this.h = p0;
       super(p0, p1);
       this.e = p2;
       this.f = p4;
       this.g = p3;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$i.class, "1")) {
          return;
       }
       this.h.b.j(this.a, this.e, this.g, this.f);
       return;
    }
}
