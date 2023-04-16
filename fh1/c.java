package fh1.c;
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

public final class c	// class@002338
{
    public final int code;
    public final List data;
    public final String message;

    public void c(){
       List list = CollectionsKt__CollectionsKt.E();
       a.p("", "message");
       a.p(list, "data");
       super();
       this.code = 1;
       this.message = "";
       this.data = list;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (this.code == p0.code && (a.g(this.message, p0.message) && a.g(this.data, p0.data))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.code * 31;
       c tmessage = this.message;
       int i1 = 0;
       int i2 = (tmessage != null)? tmessage.hashCode(): 0;
       i = (i + i2) * 31;
       tmessage = this.data;
       if (tmessage != null) {
          i1 = tmessage.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftPanelTabResponse\(code="+this.code+", message="+this.message+", data="+this.data+"\)";
    }
}
