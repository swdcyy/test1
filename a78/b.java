package a78.b;
import a78.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class b extends a	// class@000042
{
    public final boolean f;
    public final boolean g;
    public final String h;
    public String i;

    public void b(String p0,String p1,String p2,String p3,boolean p4,boolean p5){
       super(p0, p1, p2, false);
       this.f = p4;
       this.g = p5;
       this.h = p2;
       this.i = p3;
    }
    public boolean a(){
       return false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LocalScope{requiredToDeclareInAppConfig="+this.f+", forbidden="+this.g+", alertTitle=\'"+this.h+'''+", alertMessage=\'"+this.i+'''+", jsScope=\'"+this.a+'''+", serverScope=\'"+this.b+'''+", name=\'"+this.c+'''+", showAlways="+this.d+'}';
    }
}
