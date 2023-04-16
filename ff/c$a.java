package ff.c$a;
import java.lang.Runnable;
import ff.c;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public class c$a implements Runnable	// class@001ff1
{
    public final Callback b;
    public final c c;

    public void c$a(c p0,Callback p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[]{Boolean.TRUE};
       this.b.invoke(objArray);
       return;
    }
}
