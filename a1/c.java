package a1.c;
import android.view.LayoutInflater;
import a1.c$a;
import nsd.u;
import android.content.Context;
import msd.l;
import a1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import java.lang.Void;

public final class c extends LayoutInflater	// class@000047
{
    public final LayoutInflater a;
    public final l b;
    public static final c$a c;

    static {
       c.c = new c$a(null);
    }
    public void c(LayoutInflater p0,Context p1,l p2){
       super(p1);
       this.a = p0;
       this.b = p2;
    }
    public void c(LayoutInflater p0,Context p1,l p2,u p3){
       super(p0, p1, p2);
    }
    public static final void a(a p0,Context p1,l p2){
       c.c.a(p0, p1, p2);
    }
    public LayoutInflater cloneInContext(Context p0){
       LayoutInflater layoutInflat = LayoutInflater.from(p0);
       a.o(layoutInflat, "from\(newContext\)");
       return layoutInflat;
    }
    public View inflate(int p0,ViewGroup p1,boolean p2){
       View view = a.c(this.a, p0, p1, p2);
       c tb = this.b;
       if (tb != null) {
          tb.invoke(view);
       }
       return view;
    }
}
