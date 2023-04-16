package de.o;
import de.f;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import ce.b;
import java.util.Objects;
import com.facebook.react.bridge.UiThreadUtil;
import ce.b$a;
import ze.z;
import od.a;
import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public class o implements f	// class@001e48
{
    public final int a;
    public final ReadableMap b;

    public void o(int p0,ReadableMap p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(b p0){
       o ta = this.a;
       o tb = this.b;
       Objects.requireNonNull(p0);
       if (tb == null) {
       }else {
          UiThreadUtil.assertOnUiThread();
          b$a uoa = p0.f(ta);
          uoa.e = new z(tb);
          b$a a = uoa.a;
          if (a != null) {
             b$a d = uoa.d;
             a.c(d);
             d.updateProperties(a, uoa.e);
          }else {
             throw new IllegalStateException("Unable to find view for tag "+ta);
          }
       }
       return;
    }
    public String toString(){
       return "UpdatePropsMountItem ["+this.a+"]";
    }
}
