package ce.b$a;
import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class b$a	// class@000d07
{
    public final View a;
    public final int b;
    public final boolean c;
    public final ViewManager d;
    public z e;
    public ReadableMap f;
    public ReadableMap g;
    public EventEmitterWrapper h;

    public void b$a(int p0,View p1,ViewManager p2,boolean p3){
       super();
       this.e = null;
       this.f = null;
       this.g = null;
       this.h = null;
       this.b = p0;
       this.a = p1;
       this.c = p3;
       this.d = p2;
    }
    public String toString(){
       boolean b = (this.d == null)? true: false;
       return "ViewState ["+this.b+"] - isRoot: "+this.c+" - props: "+this.e+" - localData: "+this.f+" - viewManager: "+this.d+" - isLayoutOnly: "+b;
    }
}
