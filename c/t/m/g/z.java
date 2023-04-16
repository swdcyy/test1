package c.t.m.g.z;
import android.content.Context;
import java.lang.Object;
import c.t.m.g.z$1;
import c.t.m.g.x$a;
import android.content.Intent;
import java.lang.String;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import c.t.m.g.aj;

public class z	// class@000cb8
{
    public aj a;
    public ServiceConnection b;
    public Context c;

    public void z(Context p0){
       super();
       this.b = new z$1(this);
       this.c = p0;
    }
    public void a(x$a p0){
       Intent intent = new Intent();
       intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
       if (a.a(this.c, intent, this.b, 1)) {
          z ta = this.a;
          if (ta != null) {
             String str = ta.a();
             boolean b = this.a.c();
             if (p0 != null) {
                p0.a(str, b);
             }
          }
       }
       return;
    }
}
