package de.m;
import de.f;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import ce.b;
import java.util.Objects;
import com.facebook.react.bridge.UiThreadUtil;
import ce.b$a;
import java.lang.String;
import ze.z;
import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class m implements f	// class@001e46
{
    public final int a;
    public final ReadableMap b;

    public void m(int p0,ReadableMap p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(b p0){
       m ta = this.a;
       m tb = this.b;
       Objects.requireNonNull(p0);
       UiThreadUtil.assertOnUiThread();
       b$a uoa = p0.f(ta);
       if (uoa.e == null) {
          throw new IllegalStateException("Can not update local data to view without props: "+ta);
       }
       if (uoa.f != null) {
          String str = "hash";
          if (!tb.hasKey(str) || (uoa.f.getDouble(str) - tb.getDouble(str) || !uoa.f.equals(tb))) {
          label_0035 :
             uoa.f = tb;
             b$a d = uoa.d;
             if (d != null) {
                Object obj = d.updateLocalData(uoa.a, uoa.e, new z(tb));
                if (obj != null) {
                   d.updateExtraData(uoa.a, obj);
                }
             }else {
                throw new IllegalStateException("Unable to find ViewManager for view: "+uoa);
             }
          }
       }else {
          goto label_0035 ;
       }
       return;
    }
    public String toString(){
       return "UpdateLocalDataMountItem ["+this.a+"]";
    }
}
