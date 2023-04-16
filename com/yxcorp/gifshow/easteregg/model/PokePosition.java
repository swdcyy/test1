package com.yxcorp.gifshow.easteregg.model.PokePosition;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PokePosition	// class@001adc
{
    public final float commentX;
    public final float commentY;
    public final float x;
    public final float y;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PokePosition.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PokePosition && (!Float.compare(this.x, p0.x) && (!Float.compare(this.y, p0.y) && (!Float.compare(this.commentX, p0.commentX) && !Float.compare(this.commentY, p0.commentY)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PokePosition.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((((Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y)) * 31) + Float.floatToIntBits(this.commentX)) * 31) + Float.floatToIntBits(this.commentY));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PokePosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PokePosition\(x="+this.x+", y="+this.y+", commentX="+this.commentX+", commentY="+this.commentY+"\)";
    }
}
