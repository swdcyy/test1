package bl2.j$b;
import j26.c$a;
import bl2.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wk2.s;

public class j$b implements c$a	// class@000413
{
    public final j a;

    public void j$b(j p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       this.a.a9(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, j$b.class, "2")) {
          return;
       }
       s.t((TextUtils.x(this.a.C) ^ 0x01));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, j$b.class, "1")) {
          return;
       }
       s.u((TextUtils.x(this.a.C) ^ 0x01));
       return;
    }
}
