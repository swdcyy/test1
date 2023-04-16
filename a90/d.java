package a90.d;
import java.lang.String;
import a90.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@000102
{
    public final String a;
    public final String b;
    public final String c;
    public final b d;

    public void d(String p0,String p1,String p2,b p3){
       a.p(p0, "text");
       a.p(p1, "kyTextId");
       a.p(p2, "assetTag");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void d(String p0,String p1,String p2,b p3,int p4,u p5){
       super(p0, p1, p2, null);
    }
    public final String a(){
       return this.c;
    }
    public final b b(){
       return this.d;
    }
    public final String c(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && a.g(this.d, p0.d)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       d tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TextStickerGenerateConfig\(text="+this.a+", kyTextId="+this.b+", assetTag="+this.c+", richTextConfig="+this.d+"\)";
    }
}
