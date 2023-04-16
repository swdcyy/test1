package a78.c;
import a78.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class c extends a	// class@000043
{
    public final boolean f;

    public void c(String p0,String p1,String p2,boolean p3,boolean p4){
       super(p0, p1, p2, p4);
       this.f = p3;
    }
    public boolean a(){
       return true;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RemoteScope{isCustomized="+this.f+", jsScope=\'"+this.a+'''+", serverScope=\'"+this.b+'''+", name=\'"+this.c+'''+", showAlways="+this.d+'}';
    }
}
