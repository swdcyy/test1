package bw4.a$c;
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

public class a$c extends b$b	// class@0003db
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super(p0);
    }
    public boolean a(Message p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.what != true) {
          return false;
       }
       a$c tb = this.b;
       tb.g(tb.e);
       tb = this.b;
       tb.h(tb.e, null);
       return true;
    }
    public String toString(){
       return "IdleState";
    }
}
