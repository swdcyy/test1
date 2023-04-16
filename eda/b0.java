package eda.b0;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b0	// class@00264d
{
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;

    public void b0(String p0,int p1,int p2,boolean p3,int p4,int p5,u p6){
       if (p5 & 0x04) {
          p2 = 0;
       }
       if (p5 & 0x08) {
          p3 = false;
       }
       if (p5 & 0x10) {
          p4 = 0;
       }
       a.p(p0, "photoId");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       return;
    }
    public final int a(){
       return this.b;
    }
    public final String b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b0 && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && this.e == p0.e)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b0 obj = PatchProxy.apply(null, this, b0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       i = ((((i * 31) + this.b) * 31) + this.c) * 31;
       b0 td = this.d;
       if (td != null) {
          td = 1;
       }
       return (((i + td) * 31) + this.e);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SyncImagePositionEvent\(photoId="+this.a+", currentPage="+this.b+", offset="+this.c+", isCaptionContentShowed="+this.d+", totalOffset="+this.e+"\)";
    }
}
