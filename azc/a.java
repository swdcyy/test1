package azc.a;
import jd.a;
import jd.c;
import com.facebook.cache.common.CacheKey;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.util.Locale;
import ta.d;
import android.graphics.Bitmap;
import sc.d;
import com.facebook.common.references.a;

public class a extends a	// class@00030f
{
    public final c c;
    public final int d;
    public CacheKey e;

    public void a(c p0,int p1){
       super();
       this.c = p0;
       this.d = p1;
    }
    public static c f(c p0,int p1){
       return new a(p0, p1);
    }
    public CacheKey a(){
       if (this.e == null) {
          a tc = this.c;
          String str = (tc != null && tc.a() != null)? this.c.a().toString(): "";
          Object[] objArray = new Object[]{str,Integer.valueOf(this.d)};
          this.e = new d(String.format(null, "BasePostprocessorDelegate;%s;%d", objArray));
       }
       return this.e;
    }
    public a b(Bitmap p0,d p1){
       a tc = this.c;
       if (tc == null) {
          return super.b(p0, p1);
       }
       a uoa = tc.b(p0, p1);
       this.g(uoa.j());
       return uoa;
    }
    public void d(Bitmap p0){
       this.g(p0);
       a tc = this.c;
       if (tc instanceof a) {
          tc.d(p0);
       }
       return;
    }
    public void e(Bitmap p0,Bitmap p1){
       a tc = this.c;
       if (tc instanceof a) {
          tc.e(p0, p1);
          this.g(p0);
       }else {
          super.e(p0, p1);
       }
       return;
    }
    public final void g(Bitmap p0){
       if (p0 != null) {
          p0.setDensity(this.d);
       }
       return;
    }
    public String getName(){
       a tc = this.c;
       if (tc != null) {
          return tc.getName();
       }
       return "Unknown postprocessor";
    }
}
