package com.kuaishou.live.core.voiceparty.background.multiimage.Point;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Point	// class@001364
{
    public final String color;
    public final float x;
    public final float y;

    public final String a(){
       return this.color;
    }
    public final float b(){
       return this.x;
    }
    public final float c(){
       return this.y;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Point.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Point && (a.g(this.color, p0.color) && (!Float.compare(this.x, p0.x) && !Float.compare(this.y, p0.y))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Point obj = PatchProxy.apply(null, this, Point.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.color;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((((i * 31) + Float.floatToIntBits(this.x)) * 31) + Float.floatToIntBits(this.y));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Point.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Point\(color="+this.color+", x="+this.x+", y="+this.y+"\)";
    }
}
