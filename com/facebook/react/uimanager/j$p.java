package com.facebook.react.uimanager.j$p;
import com.facebook.react.uimanager.j$w;
import com.facebook.react.uimanager.j;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;
import ze.p;
import java.lang.Integer;
import java.lang.Float;

public final class j$p implements j$w	// class@001362
{
    public final int a;
    public final Callback b;
    public final j c;

    public void j$p(j p0,int p1,Callback p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$p.class, "1")) {
          return;
       }
       int i = 0;
       try{
          j$p tc = this.c;
          tc.b.o(this.a, tc.a);
          Object[] objArray = new Object[]{Integer.valueOf(i),Integer.valueOf(i),Float.valueOf(p.a((float)this.c.a[2])),Float.valueOf(p.a((float)this.c.a[3])),Float.valueOf(p.a((float)this.c.a[i])),Float.valueOf(p.a((float)this.c.a[1]))};
          this.b.invoke(objArray);
          return;
       }catch(com.facebook.react.uimanager.NoSuchNativeViewException e0){
          Object[] objArray1 = new Object[e0];
          this.b.invoke(objArray1);
          return;
       }
    }
}
