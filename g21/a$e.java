package g21.a$e;
import a32.b;
import g21.a;
import java.lang.Object;
import a32.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g21.b;
import java.lang.Boolean;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class a$e implements b	// class@002404
{
    public final a a;

    public void a$e(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       a.a(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$e.class, "1")) {
          return;
       }
       b.S(b.a, "onExitMultiWindowMode", "isMultiLineMode", Boolean.valueOf(this.a.e()));
       if (this.a.e()) {
          this.a.a();
       }
       return;
    }
}
