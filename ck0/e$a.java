package ck0.e$a;
import com.facebook.react.uimanager.f$a;
import ck0.e;
import java.lang.Object;
import ze.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.f;
import ck0.e$a$a;
import java.lang.Runnable;
import ekd.s1;

public final class e$a implements f$a	// class@0004d5
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public final void a(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       p0.c = a.c();
       f uof = this.a.d();
       if (uof != null) {
          uof.A(null);
       }
       s1.d(new e$a$a(this));
       return;
    }
}
