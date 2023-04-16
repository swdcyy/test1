package bu6.b;
import au6.f;
import bu6.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Activity;
import au6.c;
import java.util.ArrayList;

public final class b extends f	// class@000606
{
    public final Activity e;
    public final int f;
    public final int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public ArrayList n;
    public String o;
    public String p;
    public String q;

    public void b(c p0){
       a.p(p0, "builder");
       c l = p0.l;
       c m = p0.m;
       c n = p0.n;
       a.p(l, "activity");
       super(l, m, n);
       this.e = l;
       this.f = m;
       this.g = n;
       this.h = p0.a;
       this.i = p0.b;
       this.j = p0.c;
       this.k = p0.d;
       this.l = p0.e;
       this.m = p0.f;
       this.n = p0.g;
       this.o = p0.h;
       this.p = p0.i;
       this.q = p0.j;
       this.e(p0.k);
    }
    public Activity a(){
       return this.e;
    }
    public int c(){
       return this.f;
    }
    public int d(){
       return this.g;
    }
    public final String f(){
       return this.m;
    }
    public final ArrayList g(){
       return this.n;
    }
    public final String h(){
       return this.l;
    }
    public final String i(){
       return this.o;
    }
    public final String j(){
       return this.p;
    }
    public final String k(){
       return this.q;
    }
    public final String l(){
       return this.k;
    }
    public final String m(){
       return this.j;
    }
    public final String n(){
       return this.i;
    }
}
