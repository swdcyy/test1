package lw1.a;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class a	// class@003067
{
    public final CDNUrl[] a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public void a(CDNUrl[] p0,int p1,int p2,int p3,int p4){
       a.p(p0, "picUrls");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean a(){
       boolean b = (this.b == -1 || this.c == -1)? true: false;
       return b;
    }
    public final boolean b(){
       boolean b = (this.d == -1 || this.e == -1)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && this.e == p0.e)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? Arrays.hashCode(obj): 0;
       return ((((((((i * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveNinePatchBackgroundViewInfo\(picUrls="+Arrays.toString(this.a)+", xDivStart="+this.b+", xDivEnd="+this.c+", yDivStart="+this.d+", yDivEnd="+this.e+"\)";
    }
}
