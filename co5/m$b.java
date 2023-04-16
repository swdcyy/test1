package co5.m$b;
import java.lang.Object;
import co5.m$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.graphics.Typeface;

public class m$b	// class@00071f
{
    public int a;
    public String b;
    public int c;
    public float d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public Typeface k;

    public void m$b(){
       super();
       this.a = 0;
       this.b = null;
       this.c = Integer.MIN_VALUE;
       this.d = 0xff800000;
       this.e = false;
       this.f = Integer.MIN_VALUE;
       this.g = Integer.MIN_VALUE;
       this.h = Integer.MIN_VALUE;
       this.i = Integer.MIN_VALUE;
       this.j = 0;
    }
    public m$a a(){
       Object obj = PatchProxy.apply(null, this, m$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m$a(this);
    }
    public m$b b(int p0){
       this.h = p0;
       return this;
    }
    public m$b c(int p0){
       m$b uob = m$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a = p0;
       String str = (p0 > 99)? "99+": String.valueOf(p0);
       this.b = str;
       return this;
    }
    public m$b d(int p0){
       this.j = p0;
       return this;
    }
    public m$b e(int p0){
       this.i = p0;
       return this;
    }
    public m$b f(Typeface p0){
       this.k = p0;
       return this;
    }
}
