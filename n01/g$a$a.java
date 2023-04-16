package n01.g$a$a;
import n01.g$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d61.l0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class g$a$a extends g$b	// class@003264
{
    public final String d;
    public final String e;

    public void g$a$a(String p0,String p1,String p2){
       this.d = p0;
       this.e = p1;
       super(p2);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, g$a$a.class, "2")) {
          return;
       }
       g$a$a td = this.d;
       if (!PatchProxy.applyVoidOneRefs(td, this, g$b.class, "2")) {
          a.p(td, "newValue");
          if (TextUtils.x(td)) {
             this.c.a();
          }else {
             this.c.i(td);
          }
       }
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, g$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.n(this.b, this.d) ^ 0x01);
    }
}
