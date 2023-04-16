package de.n;
import de.f;
import java.lang.Object;
import ce.b;
import java.util.Objects;
import com.facebook.react.bridge.UiThreadUtil;
import ce.b$a;
import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public class n implements f	// class@001e47
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public void n(int p0,int p1,int p2,int p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void a(b p0){
       n ta = this.a;
       n tb = this.b;
       n tc = this.c;
       n td = this.d;
       n te = this.e;
       Objects.requireNonNull(p0);
       UiThreadUtil.assertOnUiThread();
       b$a uoa = p0.f(ta);
       if (uoa.c != null) {
       }else {
          b$a a = uoa.a;
          if (a != null) {
             b$a d = uoa.d;
             if (d != null) {
                d.setPadding(a, tb, tc, td, te);
             }else {
                throw new IllegalStateException("Unable to find ViewManager for view: "+uoa);
             }
          }else {
             throw new IllegalStateException("Unable to find View for tag: "+ta);
          }
       }
       return;
    }
    public String toString(){
       return "UpdatePaddingMountItem ["+this.a+"] - left: "+this.b+" - top: "+this.c+" - right: "+this.d+" - bottom: "+this.e;
    }
}
