package av7.e;
import java.util.concurrent.Callable;
import java.lang.String;
import java.lang.Object;
import tkd.b;
import tkd.d;
import zu7.a;

public final class e implements Callable	// class@000384
{
    public final String b;

    public void e(String p0){
       this.b = p0;
    }
    public final Object call(){
       e tb = this.b;
       int i = -2117944241;
       if (!d.a(i).hasInit()) {
          d.a(i).Yw();
       }
       String str = "";
       if (d.a(i).cZ(tb)) {
          str = d.a(i).vX(tb, str);
       }
       return str;
    }
}
