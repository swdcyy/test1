package na0.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class g	// class@001f1d
{
    public final boolean forceDegrade;
    public final boolean needLowDeviceDegrade;
    public final long requestMemoryMB;
    public final String scene;

    public final long a(){
       return this.requestMemoryMB;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof g && (a.g(this.scene, p0.scene) && (this.forceDegrade == p0.forceDegrade && (!this.requestMemoryMB - p0.requestMemoryMB && this.needLowDeviceDegrade == p0.needLowDeviceDegrade))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       g obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.scene;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       g tforceDegrad = this.forceDegrade;
       int i1 = 1;
       if (tforceDegrad != null) {
          tforceDegrad = 1;
       }
       g trequestMemo = this.requestMemoryMB;
       i = (((i + tforceDegrad) * 31) + (int)(trequestMemo ^ (trequestMemo >> 32))) * 31;
       tforceDegrad = this.needLowDeviceDegrade;
       if (tforceDegrad == null) {
          i1 = tforceDegrad;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DegradeSceneConfig\(scene="+this.scene+", forceDegrade="+this.forceDegrade+", requestMemoryMB="+this.requestMemoryMB+", needLowDeviceDegrade="+this.needLowDeviceDegrade+"\)";
    }
}
