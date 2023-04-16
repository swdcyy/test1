package com.kwai.feature.api.danmaku.model.DanmakuMockDisplayInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DanmakuMockDisplayInfo	// class@000e7c
{
    public final float height;
    public final String url;
    public final float width;

    public void DanmakuMockDisplayInfo(){
       super();
       this.width = 0;
       this.height = 0;
       this.url = null;
    }
    public final float a(){
       return this.height;
    }
    public final String b(){
       return this.url;
    }
    public final float c(){
       return this.width;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DanmakuMockDisplayInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DanmakuMockDisplayInfo && (!Float.compare(this.width, p0.width) && (!Float.compare(this.height, p0.height) && a.g(this.url, p0.url))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, DanmakuMockDisplayInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((Float.floatToIntBits(this.width) * 31) + Float.floatToIntBits(this.height)) * 31;
       DanmakuMockDisplayInfo turl = this.url;
       int i1 = (turl != null)? turl.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DanmakuMockDisplayInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DanmakuMockDisplayInfo\(width="+this.width+", height="+this.height+", url="+this.url+"\)";
    }
}
