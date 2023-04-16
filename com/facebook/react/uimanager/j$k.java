package com.facebook.react.uimanager.j$k;
import com.facebook.react.uimanager.j$w;
import com.facebook.react.uimanager.j;
import com.facebook.react.bridge.Callback;
import com.facebook.react.uimanager.j$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.f;
import ze.p;
import java.lang.Integer;
import java.lang.Float;

public final class j$k implements j$w	// class@00135d
{
    public final int a;
    public final float b;
    public final float c;
    public final Callback d;
    public final j e;

    public void j$k(j p0,int p1,float p2,float p3,Callback p4,j$a p5){
       this.e = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
    }
    public void execute(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, j$k.class, "1")) {
          return;
       }
       int i = 0;
       try{
          j$k te = this.e;
          te.b.o(this.a, te.a);
          te = this.e;
          j a = te.a;
          float f = (float)a[i];
          float f1 = (float)a[1];
          int i1 = te.b.y(this.a, this.b, this.c);
          try{
             j$k te1 = this.e;
             te1.b.o(i1, te1.a);
             Object[] objArray1 = new Object[]{Integer.valueOf(i1),Float.valueOf(p.a(((float)this.e.a[i] - f))),Float.valueOf(p.a(((float)this.e.a[1] - f1))),Float.valueOf(p.a((float)this.e.a[2])),Float.valueOf(p.a((float)this.e.a[3]))};
             this.d.invoke(objArray1);
             return;
          }catch(com.facebook.react.uimanager.IllegalViewOperationException e0){
             objArray = new Object[e0];
             this.d.invoke(objArray);
             return;
          }
       }catch(com.facebook.react.uimanager.IllegalViewOperationException e0){
          objArray = new Object[e0];
          this.d.invoke(objArray);
          return;
       }
    }
}
