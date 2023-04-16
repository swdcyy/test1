package oc.d;
import oc.b;
import java.lang.Object;
import ab.e;
import oc.e;
import com.facebook.common.references.a;
import java.util.Collection;
import java.util.List;

public class d	// class@00277c
{
    public final b a;
    public final int b;
    public a c;
    public List d;
    public a e;

    public void d(b p0){
       super();
       e.d(p0);
       this.a = p0;
       this.b = 0;
    }
    public void d(e p0){
       super();
       e a = p0.a;
       e.d(a);
       this.a = a;
       this.b = p0.d;
       this.c = a.d(p0.b);
       this.d = a.e(p0.c);
       this.e = p0.e;
    }
    public static d a(b p0){
       return new d(p0);
    }
    public static e e(b p0){
       return new e(p0);
    }
    public int b(){
       return this.b;
    }
    public b c(){
       return this.a;
    }
    public synchronized a d(){
       return a.d(this.c);
    }
}
