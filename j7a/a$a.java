package j7a.a$a;
import hka.g;
import j7a.a;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public final class a$a implements g	// class@002921
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public final void a(boolean p0,Configuration p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, a$a.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
}
