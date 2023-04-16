package dy8.d;
import java.lang.Runnable;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Math;
import dy8.f;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;
import dy8.e;
import ekd.k1;

public final class d implements Runnable	// class@0020fd
{
    public final int b;
    public final String c;
    public final WeakReference d;

    public void d(int p0,String p1,WeakReference p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       Drawable uDrawable;
       BitmapDrawable obj;
       d tc = this.c;
       d td = this.d;
       int i = Math.min(Math.max(this.b, 0), 50);
       int i1 = 0;
       int i2 = 5;
       while (i1 < i2) {
          String str = "FF";
          int i3 = 0x7f080df1;
          if (i > i2) {
             uDrawable = f.b(i3, f.a(tc, str));
          }else {
             String str1 = "4C";
             if (i > 0) {
                i3 = 0x7f080df2;
                int i4 = 0x7f080df3;
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (PatchProxy.isSupport(f.class)) {
                   Object[] objArray = new Object[i2];
                   objArray[0] = tc;
                   objArray[1] = Integer.valueOf(i3);
                   objArray[2] = Integer.valueOf(i4);
                   objArray[3] = str;
                   objArray[4] = str1;
                   obj = PatchProxy.apply(objArray, null, f.class, "1");
                   if (obj != patchProxyRe) {
                   }else {
                   label_005e :
                      uDrawable = f.b(i3, f.a(tc, str));
                      Drawable uDrawable1 = f.b(i4, f.a(tc, str1));
                      Object obj1 = PatchProxy.applyTwoRefs(uDrawable, uDrawable1, null, f.class, "2");
                      if (obj1 != patchProxyRe) {
                         obj = obj1;
                      }else {
                         i3 = uDrawable.getIntrinsicHeight();
                         int i5 = uDrawable.getIntrinsicWidth() + uDrawable1.getIntrinsicWidth();
                         Bitmap uBitmap = Bitmap.createBitmap(i5, i3, Bitmap$Config.ARGB_8888);
                         Canvas uCanvas = new Canvas(uBitmap);
                         uDrawable.draw(uCanvas);
                         uDrawable1.setBounds(uDrawable.getIntrinsicWidth(), 0, i5, i3);
                         uDrawable1.draw(uCanvas);
                         obj = uBitmap;
                      }
                   }
                }else {
                   goto label_005e ;
                }
                obj = new BitmapDrawable(a1.m(), obj);
             }else {
                uDrawable = f.b(i3, f.a(tc, str1));
             }
          }
          i = i - 10;
          k1.o(new e(td, i1, uDrawable));
          i1 = i1 + 1;
       }
       return;
    }
}
