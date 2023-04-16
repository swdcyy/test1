package bu6.c;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import au6.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bu6.b;
import java.util.ArrayList;
import au6.c;

public final class c	// class@000607
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public ArrayList g;
    public String h;
    public String i;
    public String j;
    public c k;
    public final Activity l;
    public final int m;
    public final int n;

    public void c(Activity p0,int p1,int p2){
       a.p(p0, "activity");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
    }
    public final f a(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this);
    }
    public final c b(ArrayList p0){
       this.g = p0;
       return this;
    }
    public final c c(String p0){
       this.e = p0;
       return this;
    }
    public final c d(c p0){
       this.k = p0;
       return this;
    }
    public final c e(String p0){
       this.d = p0;
       return this;
    }
    public final c f(String p0){
       this.c = p0;
       return this;
    }
    public final c g(String p0){
       this.b = p0;
       return this;
    }
}
