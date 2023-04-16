package a5b.h;
import a5b.h$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class h	// class@000054
{
    public final String a;
    public final List b;
    public final String c;
    public final boolean d;
    public static final h$a e;

    static {
       h.e = new h$a(null);
    }
    public void h(String p0,List p1,String p2,boolean p3){
       a.p(p0, "keyword");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final String a(){
       return this.a;
    }
    public final List b(){
       return this.b;
    }
    public final String c(){
       return this.c;
    }
    public final boolean d(){
       return this.d;
    }
    public final boolean e(){
       boolean b = (this.b != null || this.d != null)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof h && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       h obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       h tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (i1 + i) * 31;
       h td = this.d;
       if (td != null) {
          td = 1;
       }
       return (i1 + td);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicSearchResult\(keyword="+this.a+", magicFaceData="+this.b+", selectedMagicFaceId="+this.c+", isError="+this.d+"\)";
    }
}
