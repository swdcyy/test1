package com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiteSideBarReplaceAnimController$a	// class@000b29
{
    public final float a;
    public final float b;
    public final float c;

    public void LiteSideBarReplaceAnimController$a(float p0,float p1,float p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiteSideBarReplaceAnimController$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiteSideBarReplaceAnimController$a && (!Float.compare(this.a, p0.a) && (!Float.compare(this.b, p0.b) && !Float.compare(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiteSideBarReplaceAnimController$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiteSideBarReplaceAnimController$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ViewStatus\(alpha="+this.a+", scaleX="+this.b+", scaleY="+this.c+"\)";
    }
}
