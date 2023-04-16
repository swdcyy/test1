package com.yxcorp.gifshow.widget.adv.e;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$b;
import com.yxcorp.gifshow.widget.adv.f;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.k;
import wyc.e;
import p16.c;
import java.util.Locale;
import java.lang.Number;
import java.lang.Math;

public class e extends LinearBitmapContainer$b	// class@00191f
{
    public final f d;

    public void e(f p0){
       this.d = p0;
       super();
    }
    public Bitmap d(int p0,int p1,int p2){
       int this;
       Object[] this1;
       e uoe = this;
       int i = p0;
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i1 = uoe.d.c(i) + i;
       this = 0;
       if (i1 > this.getCount() || !uoe.b(i1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          this1 = new Object[this];
          a.D().s("TimelineBitmapAdapter", String.format(Locale.US, "getBitmap current index %d is not available", objArray), this1);
          return null;
       }else {
          this1 = new Object[this];
          a.D().s("TimelineBitmapAdapter", "getBitmap index: "+i1, this1);
          return k.f().b((((double)((float)i1 + 0x3f000000) * uoe.d.d) / (double)this.getCount()), p1, p2, new e(uoe, i));
       }
    }
    public int getCount(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)Math.ceil((double)this.d.c);
    }
}
