package bw4.a$b;
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

public class a$b extends b$b	// class@0003da
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super(p0);
    }
    public boolean a(Message p0){
       Message obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.what;
       if (obj != null) {
          if (obj != 2) {
             return false;
          }
          a$b tb = this.b;
          tb.g(tb.f);
          tb = this.b;
          tb.h(tb.f, null);
          return true;
       }else {
          a$b tb1 = this.b;
          tb1.g(tb1.d);
          tb1 = this.b;
          tb1.h(tb1.d, p0.obj);
          return true;
       }
    }
    public String toString(){
       return "ConnectingState";
    }
}
