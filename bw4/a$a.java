package bw4.a$a;
import bw4.b$b;
import bw4.a;
import bw4.b;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class a$a extends b$b	// class@0003d9
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super(p0);
    }
    public boolean a(Message p0){
       a$a obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.what != null) {
          return false;
       }
       obj = this.b;
       obj.g(obj.d);
       obj = this.b;
       obj.h(obj.d, p0.obj);
       return true;
    }
    public String toString(){
       return "ConnectedState";
    }
}
