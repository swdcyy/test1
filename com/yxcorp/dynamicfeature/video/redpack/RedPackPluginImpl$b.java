package com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RedPackPluginImpl$b	// class@0011d5
{
    public double a;
    public final int b;
    public final int c;

    public void RedPackPluginImpl$b(double p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final double a(){
       return this.a;
    }
    public final int b(){
       return this.c;
    }
    public final int c(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RedPackPluginImpl$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RedPackPluginImpl$b && (!Double.compare(this.a, p0.a) && (this.b == p0.b && this.c == p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, RedPackPluginImpl$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = Double.doubleToLongBits(this.a);
       return (((((int)(l ^ (l >> 32)) * 31) + this.b) * 31) + this.c);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RedPackPluginImpl$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VideoInfo\(duration="+this.a+", width="+this.b+", height="+this.c+"\)";
    }
}
