package cj4.b$f;
import mu4.d;
import cj4.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mu4.c;

public final class b$f implements d	// class@000480
{
    public final b a;

    public void b$f(b p0){
       this.a = p0;
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f.class, "1")) {
          return;
       }
       this.a.t9();
       return;
    }
    public void destroy(){
       c.a(this);
    }
}
