package com.yxcorp.gifshow.easteregg.model.PokeSize;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PokeSize	// class@001add
{
    public final int height;
    public final int width;

    public final int a(){
       return this.height;
    }
    public final int b(){
       return this.width;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof PokeSize && (this.width == p0.width && this.height == p0.height))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PokeSize.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.width * 31) + this.height);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PokeSize.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PokeSize\(width="+this.width+", height="+this.height+"\)";
    }
}
