package be.c$a;
import de.f;
import be.c;
import java.lang.Object;
import ce.b;
import android.view.ViewParent;
import we.a;
import ce.b$a;
import java.lang.StringBuilder;
import java.lang.String;
import com.facebook.react.bridge.SoftAssertions;
import android.view.View;

public class c$a implements f	// class@000b1e
{
    public final int a;
    public final int b;
    public final boolean c;
    public final c d;

    public void c$a(c p0,int p1,int p2,boolean p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(b p0){
       c$a ta = this.a;
       c$a tb = this.b;
       _monitor_enter(p0);
       if (this.c == null) {
          p0.b.d(tb, null);
          _monitor_exit(p0);
       }else {
          b$a uoa = p0.f(ta);
          b$a a = uoa.a;
          if (tb != ta && a instanceof ViewParent) {
             p0.b.d(tb, a);
             _monitor_exit(p0);
          }else if(a == null){
             SoftAssertions.assertUnreachable("Cannot find view for tag "+ta+".");
             _monitor_exit(p0);
          }else if(uoa.c != null){
             SoftAssertions.assertUnreachable("Cannot block native responder on "+ta+" that is a root view");
          }
          p0.b.d(tb, a.getParent());
          _monitor_exit(p0);
       }
       return;
    }
}
