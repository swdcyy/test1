package eda.p;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class p	// class@002662
{
    public final String a;
    public final boolean b;

    public void p(String p0,boolean p1){
       a.p(p0, "photoId");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(){
       return this.a;
    }
    public final String b(){
       return this.a;
    }
    public final boolean c(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof p && (a.g(this.a, p0.a) && this.b == p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       p obj = PatchProxy.apply(null, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       p tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       return (i + tb);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OpenDetailAtlasEvent\(photoId="+this.a+", isFromCaptionOrCommentClick="+this.b+"\)";
    }
}
