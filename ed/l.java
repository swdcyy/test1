package ed.l;
import ed.d;
import java.lang.Object;
import android.graphics.Bitmap;
import ab.e;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import com.facebook.common.memory.MemoryTrimType;

public class l implements d	// class@001f2c
{

    public void l(){
       super();
    }
    public void a(Object p0){
       e.d(p0);
       p0.recycle();
    }
    public Object get(int p0){
       return Bitmap.createBitmap(1, (int)Math.ceil(((double)p0 / 2.00f)), Bitmap$Config.RGB_565);
    }
    public void o(MemoryTrimType p0){
    }
}
