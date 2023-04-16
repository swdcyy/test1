package gf.c;
import gf.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Long;
import java.lang.Boolean;
import com.facebook.react.uimanager.a;

public class c implements a	// class@0020a4
{
    public long a;
    public long b;

    public void c(){
       super();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FMT"+","+this.b;
    }
    public boolean b(long p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uoc = this.a;
       if (!uoc) {
          this.a = p0;
          return true;
       }else if(uoc && !this.b){
          this.b = a.c();
          return true;
       }else {
          return false;
       }
    }
    public boolean hasValue(){
       boolean b = (this.b)? true: false;
       return b;
    }
}
