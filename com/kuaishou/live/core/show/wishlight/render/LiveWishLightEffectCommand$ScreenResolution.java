package com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectCommand$ScreenResolution;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveWishLightEffectCommand$ScreenResolution	// class@0012ac
{
    public final int height;
    public final int width;

    public void LiveWishLightEffectCommand$ScreenResolution(int p0,int p1){
       super();
       this.width = p0;
       this.height = p1;
    }
    public final int a(){
       return this.height;
    }
    public final int b(){
       return this.width;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveWishLightEffectCommand$ScreenResolution && (this.width == p0.width && this.height == p0.height))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveWishLightEffectCommand$ScreenResolution.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.width * 31) + this.height);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveWishLightEffectCommand$ScreenResolution.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ScreenResolution\(width="+this.width+", height="+this.height+"\)";
    }
}
