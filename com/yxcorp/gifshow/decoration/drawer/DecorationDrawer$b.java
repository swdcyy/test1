package com.yxcorp.gifshow.decoration.drawer.DecorationDrawer$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class DecorationDrawer$b	// class@0012aa
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public void DecorationDrawer$b(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0x3f800000;
       this.d = 0x3f800000;
       this.e = 0x3f000000;
       this.f = 0x3f000000;
       this.g = true;
       this.h = true;
       this.i = true;
       this.j = true;
       this.k = true;
       this.l = true;
       this.m = true;
    }
    public void DecorationDrawer$b(float p0,float p1){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0x3f800000;
       this.d = 0x3f800000;
       this.e = 0x3f000000;
       this.f = 0x3f000000;
       this.g = true;
       this.h = true;
       this.i = true;
       this.j = true;
       this.k = true;
       this.l = true;
       this.m = true;
       this.e = p0;
       this.f = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DecorationDrawer$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TransformParam{mRotate="+this.a+"mExtraRotate="+this.b+", mScale="+this.c+", mAlpha="+this.d+", mMoveX="+this.e+", mMoveY="+this.f+'}';
    }
}
