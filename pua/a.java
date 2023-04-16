package pua.a;
import pua.a$a;
import nsd.u;
import pua.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.graphics.Canvas;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.res.Configuration;
import java.lang.Number;

public abstract class a	// class@003bd3
{
    public View a;
    public boolean b;
    public static final b c;
    public static final a$a d;

    static {
       a.d = new a$a(null);
       a.c = new b();
    }
    public void a(){
       super();
    }
    public final void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.a = p0;
       Context context = p0.getContext();
       a.o(context, "view.context");
       this.e(context);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       this.b = false;
       a ta = this.a;
       a.m(ta);
       Context context = ta.getContext();
       a.o(context, "mView!!.context");
       this.g(context);
       this.a = null;
       return;
    }
    public abstract void c(Canvas p0);
    public abstract String d();
    public void e(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.p(p0, "context");
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof a) {
          return false;
       }
       if (!this.getClass().isInstance(p0)) {
          return false;
       }
       return a.g(this.d(), p0.d());
    }
    public void f(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       a.p(p0, "newConfig");
       return;
    }
    public void g(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       a.p(p0, "context");
       return;
    }
    public abstract void h(int p0);
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.d()).hashCode();
    }
    public void i(int p0,int p1,int p2,int p3){
    }
}
