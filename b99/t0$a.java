package b99.t0$a;
import f4a.z;
import b99.t0;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import f4a.i;

public class t0$a implements z	// class@0003bb
{
    public final PlcEntryStyleInfo a;
    public final t0 b;

    public void t0$a(t0 p0,PlcEntryStyleInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       t0$a obj = PatchProxy.apply(null, this, t0$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj.T == null) {
          return false;
       }
       return this.b.T.c(obj.R8(this.a));
    }
    public boolean b(){
       t0$a obj = PatchProxy.apply(null, this, t0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = false;
       if (obj.T == null) {
          return b;
       }
       String str = obj.R8(this.a);
       if (!this.b.T.g(str) && (this.b.T.a(str) || this.b.T.d(str))) {
          b = true;
       }
       return b;
    }
}
