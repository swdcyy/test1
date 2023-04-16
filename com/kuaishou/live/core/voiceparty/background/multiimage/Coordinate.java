package com.kuaishou.live.core.voiceparty.background.multiimage.Coordinate;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Coordinate	// class@00134c
{
    public final int height;
    public final int width;

    public void Coordinate(){
       super();
       this.width = 0;
       this.height = 0;
    }
    public final int a(){
       return this.height;
    }
    public final int b(){
       return this.width;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof Coordinate && (this.width == p0.width && this.height == p0.height))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, Coordinate.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.width * 31) + this.height);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Coordinate.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Coordinate\(width="+this.width+", height="+this.height+"\)";
    }
}
