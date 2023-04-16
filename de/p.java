package de.p;
import de.f;
import ze.m0;
import java.lang.Object;
import ce.b;
import java.util.Objects;
import com.facebook.react.bridge.UiThreadUtil;
import ce.b$a;
import com.facebook.react.bridge.ReadableNativeMap;
import android.view.View;
import ze.z;
import com.facebook.react.uimanager.ViewManager;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public class p implements f	// class@001e49
{
    public final int a;
    public final m0 b;

    public void p(int p0,m0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(b p0){
       p ta = this.a;
       p tb = this.b;
       Objects.requireNonNull(p0);
       UiThreadUtil.assertOnUiThread();
       b$a uoa = p0.f(ta);
       ReadableNativeMap readableNati = (tb == null)? null: tb.getState();
       b$a g = uoa.g;
       if (g != null && (!g.equals(readableNati) && (uoa.g != null || tb != null))) {
          uoa.g = readableNati;
          b$a d = uoa.d;
          if (d != null) {
             Object obj = d.updateState(uoa.a, uoa.e, tb);
             if (obj != null) {
                d.updateExtraData(uoa.a, obj);
             }
          }else {
             throw new IllegalStateException("Unable to find ViewManager for tag: "+ta);
          }
       }
       return;
    }
    public String toString(){
       return "UpdateStateMountItem ["+this.a+"]";
    }
}
