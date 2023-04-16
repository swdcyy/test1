package o41.a$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$b	// class@003471
{
    public final String pageKey;
    public final String pageUrl;

    public void a$b(){
       a.p("", "pageKey");
       a.p("", "pageUrl");
       super();
       this.pageKey = "";
       this.pageUrl = "";
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$b && (a.g(this.pageKey, p0.pageKey) && a.g(this.pageUrl, p0.pageUrl)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$b obj = PatchProxy.apply(null, this, a$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.pageKey;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$b tpageUrl = this.pageUrl;
       if (tpageUrl != null) {
          i = tpageUrl.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PageConfig\(pageKey="+this.pageKey+", pageUrl="+this.pageUrl+"\)";
    }
}
