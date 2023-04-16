package gqa.j;
import mn5.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mn5.b;

public final class j implements c	// class@002b6d
{
    public static WeakReference a;
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       b.a(this);
       j.a = null;
       return;
    }
}
