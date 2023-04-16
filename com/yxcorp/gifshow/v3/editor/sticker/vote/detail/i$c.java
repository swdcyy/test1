package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i$c;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class i$c	// class@0012da
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final i i;

    public void i$c(i p0,float p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8){
       this.i = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.h = p8;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "startX: "+this.a+", endX: "+this.b+", startY: "+this.c+", endY: "+this.d+", startScale: "+this.e+", endScale: "+this.f+", startOpacity: "+this.g+", endOpacity: "+this.h;
    }
}
