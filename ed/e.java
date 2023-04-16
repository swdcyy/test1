package ed.e;
import ed.p;
import java.lang.Object;
import android.graphics.Bitmap;
import nd.a;
import java.lang.String;
import cb.a;

public class e extends p	// class@001f26
{

    public void e(){
       super();
    }
    public int a(Object p0){
       return a.d(p0);
    }
    public boolean c(Bitmap p0){
       Object[] objArray;
       if (p0 == null) {
          return false;
       }
       if (p0.isRecycled()) {
          objArray = new Object[]{p0};
          a.B("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", objArray);
          return false;
       }else if(!p0.isMutable()){
          objArray = new Object[]{p0};
          a.B("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", objArray);
          return false;
       }else {
          return 1;
       }
    }
    public Object get(int p0){
       Bitmap uBitmap = super.get(p0);
       if (uBitmap != null && this.c(uBitmap)) {
          uBitmap.eraseColor(0);
       }else {
          uBitmap = null;
       }
       return uBitmap;
    }
    public void put(Object p0){
       if (this.c(p0)) {
          super.put(p0);
       }
       return;
    }
}
