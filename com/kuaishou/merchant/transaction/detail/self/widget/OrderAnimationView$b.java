package com.kuaishou.merchant.transaction.detail.self.widget.OrderAnimationView$b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.kuaishou.merchant.transaction.detail.self.widget.OrderAnimationView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;
import android.util.LruCache;
import zd4.a;
import q87.c;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.StringBuilder;
import java.lang.ref.SoftReference;

public class OrderAnimationView$b implements ImageCallback	// class@00076e
{
    public final String b;
    public final OrderAnimationView c;

    public void OrderAnimationView$b(OrderAnimationView p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderAnimationView$b.class, "1")) {
          return;
       }
       this.c.I.remove(this.b);
       String str = "OrderAnimationView";
       int i = 0;
       if (this.c.F.get(this.b) != null) {
          Object[] objArray = new Object[i];
          a.C().w(str, "cache hit !", objArray);
          return;
       }else if(this.c.g(p0)){
          OrderAnimationView$b tc = this.c;
          p0 = BitmapUtil.U(p0, (int)tc.C, (int)tc.D, p0.getConfig(), i);
          if (this.c.g(p0)) {
             p0 = BitmapUtil.k(p0);
             if (this.c.g(p0)) {
                Object[] objArray1 = new Object[i];
                a.C().w(str, "put bitmap "+this.b, objArray1);
                this.c.F.put(this.b, new SoftReference(p0));
             }
          }
       }
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
