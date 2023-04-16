package sc.c;
import jb.a;
import ed.v;
import java.lang.Object;
import ed.n;
import sc.b;
import com.facebook.common.memory.b;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import com.facebook.common.references.a;
import bd.d;
import nc.a;
import com.facebook.imageformat.a;
import android.graphics.BitmapFactory$Options;
import com.facebook.common.memory.PooledByteBuffer;
import android.graphics.BitmapFactory;
import ab.e;

public class c implements a	// class@002408
{
    public final b a;
    public final n b;

    public void c(v p0){
       super();
       this.b = p0.b();
       this.a = new b(p0.e());
    }
    public Bitmap a(int p0,int p1,Bitmap$Config p2){
       a uoa = this.a.a((short)p0, (short)p1);
       d uod = new d(uoa);
       uod.A(a.a);
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inDither = true;
       options.inPreferredConfig = p2;
       options.inPurgeable = true;
       options.inInputShareable = true;
       options.inSampleSize = uod.o();
       options.inMutable = true;
       int i = uoa.j().size();
       a uoa1 = this.b.a((i + 2));
       byte[] uobyteArray = uoa1.j();
       uoa.j().D(0, uobyteArray, 0, i);
       Bitmap uBitmap = BitmapFactory.decodeByteArray(uobyteArray, 0, i, options);
       e.d(uBitmap);
       uBitmap.setHasAlpha(true);
       uBitmap.eraseColor(0);
       a.f(uoa1);
       d.b(uod);
       a.f(uoa);
       return uBitmap;
    }
}
