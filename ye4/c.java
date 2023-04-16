package ye4.c;
import android.app.Activity;
import java.lang.Object;
import crd.a;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.framework.plugin.PluginManager;
import android.content.res.Resources;
import android.content.Context;
import android.view.ViewGroup;
import xm4.a;

public abstract class c	// class@00471f
{
    public View a;
    public a b;
    public ViewGroup c;
    public Activity d;

    public void c(Activity p0){
       super();
       this.d = p0;
       this.b = new a();
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.b.c(p0);
       return;
    }
    public abstract void b(Object p0);
    public abstract int c();
    public final View d(){
       return this.a;
    }
    public final void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       PluginManager.K(PluginManager.H, this.d.getResources(), false, 2, objArray);
       View view = (!this.c())? new View(this.d): a.b(this.d, this.c(), this.c);
       this.a = view;
       if (view != null) {
          this.g(view);
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.a = null;
       this.b.dispose();
       return;
    }
    public void g(View p0){
    }
}
