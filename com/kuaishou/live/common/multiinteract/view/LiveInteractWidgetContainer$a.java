package com.kuaishou.live.common.multiinteract.view.LiveInteractWidgetContainer$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveInteractWidgetContainer$a	// class@001805
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final String e;

    public void LiveInteractWidgetContainer$a(float p0,float p1,float p2,float p3,String p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final String a(){
       return this.e;
    }
    public final float b(){
       return this.d;
    }
    public final float c(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveInteractWidgetContainer$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveInteractWidgetContainer$a && (!Float.compare(this.a, p0.a) && (!Float.compare(this.b, p0.b) && (!Float.compare(this.c, p0.c) && (!Float.compare(this.d, p0.d) && a.g(this.e, p0.e))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveInteractWidgetContainer$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31;
       LiveInteractWidgetContainer$a te = this.e;
       int i1 = (te != null)? te.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveInteractWidgetContainer$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ViewPosition\(viewPositionTop="+this.a+", viewPositionLeft="+this.b+", viewPositionWidth="+this.c+", viewPositionHeight="+this.d+", userId="+this.e+"\)";
    }
}
