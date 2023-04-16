package sc.a;
import sc.d;
import ed.d;
import vc.a;
import android.graphics.Bitmap$Config;
import com.facebook.common.references.a;
import nd.a;
import java.lang.Object;
import eb.e;
import android.graphics.Bitmap;
import java.lang.Boolean;
import ab.e;
import lnc.a0;
import fb.c;

public class a extends d	// class@002406
{
    public final d a;
    public final a b;

    public void a(d p0,a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public a i(int p0,int p1,Bitmap$Config p2){
       Bitmap uBitmap = this.a.get(a.c(p0, p1, p2));
       boolean b = (uBitmap.getAllocationByteCount() >= ((p0 * p1) * a.b(p2)))? true: false;
       e.a(Boolean.valueOf(b));
       a0.a(uBitmap, p0, p1, p2);
       return this.b.a(uBitmap, this.a);
    }
}
