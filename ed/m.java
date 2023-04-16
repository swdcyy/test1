package ed.m;
import ed.d;
import java.lang.Object;
import java.util.Set;
import ab.g;
import android.graphics.Bitmap;
import ab.e;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import com.facebook.common.memory.MemoryTrimType;

public class m implements d	// class@001f2d
{
    public final Set a;

    public void m(){
       super();
       this.a = g.a();
    }
    public void a(Object p0){
       e.d(p0);
       this.a.remove(p0);
       p0.recycle();
    }
    public Object get(int p0){
       Bitmap uBitmap = Bitmap.createBitmap(1, (int)Math.ceil(((double)p0 / 2.00f)), Bitmap$Config.RGB_565);
       this.a.add(uBitmap);
       return uBitmap;
    }
    public void o(MemoryTrimType p0){
    }
}
