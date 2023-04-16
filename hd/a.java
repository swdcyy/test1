package hd.a;
import jd.a;
import android.content.Context;
import java.lang.Boolean;
import ab.e;
import java.lang.Object;
import com.facebook.cache.common.CacheKey;
import java.lang.Integer;
import java.util.Locale;
import java.lang.String;
import ta.d;
import android.graphics.Bitmap;
import ad.a;
import cb.a;
import android.renderscript.RenderScript;
import android.renderscript.Element;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Allocation;

public class a extends a	// class@00211f
{
    public final int c;
    public final Context d;
    public final int e;
    public CacheKey f;
    public static final boolean g = true;

    public void a(int p0,Context p1){
       super();
       boolean b = true;
       boolean b1 = (p0 > 0 && p0 <= 25)? true: false;
       e.a(Boolean.valueOf(b1));
       e.a(Boolean.valueOf(b));
       e.d(p1);
       this.c = 3;
       this.e = p0;
       this.d = p1;
       return;
    }
    public CacheKey a(){
       Object[] objArray;
       String str;
       if (this.f == null) {
          int i = 1;
          int i1 = 0;
          if (a.g) {
             objArray = new Object[i];
             objArray[i1] = Integer.valueOf(this.e);
             str = String.format(null, "IntrinsicBlur;%d", objArray);
          }else {
             objArray = new Object[]{Integer.valueOf(this.c),Integer.valueOf(this.e)};
             str = String.format(null, "IterativeBoxBlur;%d;%d", objArray);
          }
          this.f = new d(str);
       }
       return this.f;
    }
    public void d(Bitmap p0){
       a tc = this.c;
       a te = this.e;
       e.d(p0);
       e.a(Boolean.valueOf(p0.isMutable()));
       boolean b = ((float)p0.getHeight() - 0x45000000 <= 0)? true: false;
       e.a(Boolean.valueOf(b));
       b = ((float)p0.getWidth() - 0x45000000 <= 0)? true: false;
       e.a(Boolean.valueOf(b));
       b = (te > null && te <= 25)? true: false;
       e.a(Boolean.valueOf(b));
       b = (tc > null)? true: false;
       Boolean uBoolean = Boolean.valueOf(b);
       try{
          e.a(uBoolean);
          a.b(p0, tc, te);
          return;
       }catch(java.lang.OutOfMemoryError e2){
          Object[] objArray = new Object[4];
          objArray[v4] = Integer.valueOf(tc);
          objArray[v5] = Integer.valueOf(p0.getWidth());
          objArray[2] = Integer.valueOf(p0.getHeight());
          objArray[3] = Integer.valueOf(te);
          a.g("IterativeBoxBlurFilter", String.format(null, "OOM: %d iterations on %dx%d with %d radius", objArray));
          throw e2;
       }
    }
    public void e(Bitmap p0,Bitmap p1){
       if (a.g) {
          a td = this.d;
          a te = this.e;
          e.d(p0);
          e.d(p1);
          e.d(td);
          boolean b = (te > null && te <= 25)? true: false;
          e.a(Boolean.valueOf(b));
          RenderScript renderScript = RenderScript.create(td);
          ScriptIntrinsicBlur scriptIntrin = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
          Allocation uAllocation = Allocation.createFromBitmap(renderScript, p1);
          Allocation uAllocation1 = Allocation.createFromBitmap(renderScript, p0);
          scriptIntrin.setRadius((float)te);
          scriptIntrin.setInput(uAllocation);
          scriptIntrin.forEach(uAllocation1);
          uAllocation1.copyTo(p0);
          scriptIntrin.destroy();
          uAllocation.destroy();
          uAllocation1.destroy();
          if (renderScript != null) {
             renderScript.destroy();
          }
       }else {
          super.e(p0, p1);
       }
       return;
    }
}
