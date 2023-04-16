package com.kuaishou.merchant.home2.dynamic.atmosphere.model.ChunkInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ChunkInfo	// class@001720
{
    public final List bgColors;
    public final int height;
    public final boolean isDarkMode;
    public final boolean scaling;
    public final String skinResource;
    public final int type;
    public final int width;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChunkInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ChunkInfo && (this.height == p0.height && (this.width == p0.width && (this.type == p0.type && (a.g(this.bgColors, p0.bgColors) && (a.g(this.skinResource, p0.skinResource) && (this.scaling == p0.scaling && this.isDarkMode == p0.isDarkMode)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ChunkInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((((this.height * 31) + this.width) * 31) + this.type) * 31;
       ChunkInfo tbgColors = this.bgColors;
       int i1 = 0;
       int i2 = (tbgColors != null)? tbgColors.hashCode(): 0;
       i = (i + i2) * 31;
       tbgColors = this.skinResource;
       if (tbgColors != null) {
          i1 = tbgColors.hashCode();
       }
       i = (i + i1) * 31;
       tbgColors = this.scaling;
       i1 = 1;
       if (tbgColors != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       tbgColors = this.isDarkMode;
       if (tbgColors == null) {
          ChunkInfo uChunkInfo = tbgColors;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ChunkInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ChunkInfo\(height="+this.height+", width="+this.width+", type="+this.type+", bgColors="+this.bgColors+", skinResource="+this.skinResource+", scaling="+this.scaling+", isDarkMode="+this.isDarkMode+"\)";
    }
}
