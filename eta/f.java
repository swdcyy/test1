package eta.f;
import erd.o;
import java.lang.Object;
import android.graphics.Bitmap;
import eta.i;
import lnc.a1;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class f implements o	// class@0027de
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       int i = a1.e(24.00f);
       if (i && p0.getHeight()) {
          i = Math.min(i, p0.getHeight());
       }
       return BitmapUtil.U(p0, i, i, p0.getConfig(), false);
    }
}
