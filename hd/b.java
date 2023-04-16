package hd.b;
import jd.a;
import java.lang.Boolean;
import ab.e;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import java.lang.Integer;
import java.util.Locale;
import java.lang.String;
import ta.d;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

public class b extends a	// class@002120
{
    public final int c;
    public final int d;
    public CacheKey e;

    public void b(int p0){
       super(3, p0);
    }
    public void b(int p0,int p1){
       super();
       boolean b = true;
       boolean b1 = (p0 > 0)? true: false;
       e.a(Boolean.valueOf(b1));
       if (p1 <= 0) {
          b = false;
       }
       e.a(Boolean.valueOf(b));
       this.c = p0;
       this.d = p1;
       return;
    }
    public CacheKey a(){
       if (this.e == null) {
          Object[] objArray = new Object[]{Integer.valueOf(this.c),Integer.valueOf(this.d)};
          this.e = new d(String.format(null, "i%dr%d", objArray));
       }
       return this.e;
    }
    public void d(Bitmap p0){
       b tc = this.c;
       b td = this.d;
       e.d(p0);
       boolean b = false;
       boolean b1 = (tc > null)? true: false;
       e.a(Boolean.valueOf(b1));
       if (td > null) {
          b = true;
       }
       e.a(Boolean.valueOf(b));
       NativeBlurFilter.nativeIterativeBoxBlur(p0, tc, td);
       return;
    }
}
