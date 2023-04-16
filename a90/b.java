package a90.b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@000100
{
    public final int a;
    public final int b;
    public final boolean c;
    public final List d;

    public void b(){
       super(0, 1, 0, CollectionsKt__CollectionsKt.E());
    }
    public void b(int p0,int p1,boolean p2,List p3){
       a.p(p3, "attrInfoList");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final List a(){
       return this.d;
    }
    public final int b(){
       return this.a;
    }
    public final int c(){
       return this.b;
    }
    public final boolean d(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && a.g(this.d, p0.d)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.a * 31) + this.b) * 31;
       b tc = this.c;
       if (tc != null) {
          tc = 1;
       }
       i = (i + tc) * 31;
       tc = this.d;
       int i1 = (tc != null)? tc.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RichTextGenerateConfig\(ellipsis="+this.a+", maxLines="+this.b+", isFakeBold="+this.c+", attrInfoList="+this.d+"\)";
    }
}
