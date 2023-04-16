package dx1.a$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import e17.i;
import e17.s;

public final class a$a implements Runnable	// class@00205a
{
    public final String b;

    public void a$a(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       s.q(this.b);
       return;
    }
}
