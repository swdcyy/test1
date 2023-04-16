package de.e;
import de.f;
import java.lang.Object;
import ce.b;
import java.util.Objects;
import com.facebook.react.bridge.UiThreadUtil;
import ce.b$a;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import android.view.View;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public class e implements f	// class@001e3e
{
    public int a;
    public int b;
    public int c;

    public void e(int p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a(b p0){
       e ta = this.a;
       e tc = this.c;
       Objects.requireNonNull(p0);
       UiThreadUtil.assertOnUiThread();
       b$a uoa = p0.f(this.b);
       b$a a = uoa.a;
       b$a uoa1 = p0.f(ta);
       b$a a1 = uoa1.a;
       if (a1 == null) {
          throw new IllegalStateException("Unable to find view for viewState "+uoa1+" and tag "+ta);
       }
       b.e(uoa).addView(a, a1, tc);
       return;
    }
    public String toString(){
       return "InsertMountItem ["+this.a+"] - parentTag: "+this.b+" - index: "+this.c;
    }
}
