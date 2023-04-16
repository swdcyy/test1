package b03.d;
import java.lang.String;
import nsd.u;
import java.lang.System;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@0002e4
{
    public final String a;
    public int b;
    public long c;

    public void d(String p0,int p1,long p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = System.currentTimeMillis();
       }
       a.p(p0, "magicId");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       return;
    }
    public final int a(){
       return this.b;
    }
    public final long b(){
       return this.c;
    }
    public final void c(int p0){
       this.b = p0;
    }
    public final void d(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       if (p0 >= this.b) {
          this.c = System.currentTimeMillis();
          this.b = p0;
       }
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (a.g(this.a, p0.a) && (this.b == p0.b && !this.c - p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       d tc = this.c;
       return ((((i * 31) + this.b) * 31) + (int)(tc ^ (tc >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveEffectDownloadRecord\(magicId="+this.a+", downloadFrom="+this.b+", downloadFromSetAt="+this.c+"\)";
    }
}
