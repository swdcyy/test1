package com.facebook.react.uimanager.j$t;
import com.facebook.react.uimanager.j$w;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.j$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;

public class j$t implements j$w	// class@001366
{
    public final boolean a;
    public final j b;

    public void j$t(j p0,boolean p1,j$a p2){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$t.class, "1")) {
          return;
       }
       this.b.b.t(this.a);
       return;
    }
}
