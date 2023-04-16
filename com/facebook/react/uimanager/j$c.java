package com.facebook.react.uimanager.j$c;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;

public final class j$c extends j$b0	// class@001355
{
    public final int e;
    public final boolean f;
    public final boolean g;
    public final j h;

    public void j$c(j p0,int p1,int p2,boolean p3,boolean p4){
       this.h = p0;
       super(p0, p1);
       this.e = p2;
       this.g = p3;
       this.f = p4;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$c.class, "1")) {
          return;
       }
       if (this.g == null) {
          this.h.b.a(this.a, this.e, this.f);
       }else {
          this.h.b.h();
       }
       return;
    }
}
