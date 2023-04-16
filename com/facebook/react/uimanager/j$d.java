package com.facebook.react.uimanager.j$d;
import com.facebook.react.uimanager.j$w;
import com.facebook.react.uimanager.j;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import com.facebook.react.uimanager.j$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;

public class j$d implements j$w	// class@001356
{
    public final ReadableMap a;
    public final Callback b;
    public final j c;

    public void j$d(j p0,ReadableMap p1,Callback p2,j$a p3){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$d.class, "1")) {
          return;
       }
       this.c.b.n(this.a, this.b);
       return;
    }
}
