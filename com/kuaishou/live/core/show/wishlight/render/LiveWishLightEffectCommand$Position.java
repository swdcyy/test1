package com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectCommand$Position;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveWishLightEffectCommand$Position	// class@0012ab
{
    public final float marginLeftPercent;
    public final float marginTopPercent;

    public void LiveWishLightEffectCommand$Position(float p0,float p1){
       super();
       this.marginLeftPercent = p0;
       this.marginTopPercent = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveWishLightEffectCommand$Position.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveWishLightEffectCommand$Position && (!Float.compare(this.marginLeftPercent, p0.marginLeftPercent) && !Float.compare(this.marginTopPercent, p0.marginTopPercent)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveWishLightEffectCommand$Position.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((Float.floatToIntBits(this.marginLeftPercent) * 31) + Float.floatToIntBits(this.marginTopPercent));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveWishLightEffectCommand$Position.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Position\(marginLeftPercent="+this.marginLeftPercent+", marginTopPercent="+this.marginTopPercent+"\)";
    }
}
