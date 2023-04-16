package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$c;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MultiTakePictureController$c	// class@000ece
{
    public final MultiTakePictrueItem a;
    public final double b;
    public int c;

    public void MultiTakePictureController$c(MultiTakePictrueItem p0,double p1,int p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = -1;
       }
       a.p(p0, "data");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       return;
    }
    public final double a(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiTakePictureController$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MultiTakePictureController$c && (a.g(this.a, p0.a) && (!Double.compare(this.b, p0.b) && this.c == p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MultiTakePictureController$c obj = PatchProxy.apply(null, this, MultiTakePictureController$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       long l = Double.doubleToLongBits(this.b);
       return ((((i * 31) + (int)(l ^ (l >> 32))) * 31) + this.c);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MultiTakePictureController$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MultiTakePictureItemWithScore\(data="+this.a+", score="+this.b+", i="+this.c+"\)";
    }
}
