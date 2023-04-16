package tq.a;
import tq.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class a extends h	// class@00255e
{
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public void a(boolean p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean b(){
       return this.c;
    }
    public boolean c(){
       return this.b;
    }
    public boolean d(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof h) {
          return false;
       }
       if (this.a != p0.d() || (this.b != p0.c() || this.c != p0.b())) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       int i = 1231;
       int i1 = (this.a != null)? 1231: 1237;
       int i2 = 0xf4243;
       i1 = (i1 ^ i2) * i2;
       int i3 = (this.b != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i2;
       if (this.c == null) {
          i = 1237;
       }
       return (i1 ^ i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VaderSwitch{isCompressEnable="+this.a+", enableSendDBErrorLog="+this.b+", enableSendDBBlackLogs="+this.c+"}";
    }
}
