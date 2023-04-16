package ed.h;
import ed.d;
import com.facebook.imagepipeline.memory.BasePool;
import eb.c;
import ed.w;
import ed.x;
import java.lang.Object;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import ab.e;
import ed.f;

public class h extends BasePool implements d	// class@001530
{

    public void h(c p0,w p1,x p2,boolean p3){
       super(p0, p1, p2);
       this.j = p3;
       this.x();
    }
    public Object d(int p0){
       return Bitmap.createBitmap(1, (int)Math.ceil(((double)p0 / 2.00f)), Bitmap$Config.RGB_565);
    }
    public void r(Object p0){
       e.d(p0);
       p0.recycle();
    }
    public int t(int p0){
       return p0;
    }
    public int u(Object p0){
       e.d(p0);
       return p0.getAllocationByteCount();
    }
    public int v(int p0){
       return p0;
    }
    public Object w(f p0){
       Bitmap uBitmap = super.w(p0);
       if (uBitmap != null) {
          uBitmap.eraseColor(0);
       }
       return uBitmap;
    }
    public boolean z(Object p0){
       e.d(p0);
       boolean b = (!p0.isRecycled() && p0.isMutable())? true: false;
       return b;
    }
}
