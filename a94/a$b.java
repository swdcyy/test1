package a94.a$b;
import ts3.b$b;
import a94.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import ts3.c;

public class a$b implements b$b	// class@000043
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(String p0,boolean p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (TextUtils.equals(p0, this.a.r)) {
          a$b ta = this.a;
          if (ta.q == -1) {
             ta.q = 0;
          }
          ta.S8(p1);
       }
       return;
    }
    public void b(String p0,boolean p1){
       c.b(this, p0, p1);
    }
}
