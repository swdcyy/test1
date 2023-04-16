package com.yxcorp.gifshow.v3.editor.effectv2.data.HTTextDefaultPosition;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class HTTextDefaultPosition	// class@000f49
{
    public final float x;
    public final float y;

    public void HTTextDefaultPosition(){
       super(0, 0, 3, null);
    }
    public void HTTextDefaultPosition(float p0,float p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0x3f000000;
       }
       if (p2 & 0x02) {
          p1 = 0x3f000000;
       }
       super();
       this.x = p0;
       this.y = p1;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HTTextDefaultPosition.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof HTTextDefaultPosition && (!Float.compare(this.x, p0.x) && !Float.compare(this.y, p0.y)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, HTTextDefaultPosition.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HTTextDefaultPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HTTextDefaultPosition\(x="+this.x+", y="+this.y+')';
    }
}
