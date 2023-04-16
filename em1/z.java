package em1.z;
import msd.a;
import em1.a0;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import dm1.a;
import com.kwai.robust.PatchProxyResult;
import dm1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.concurrent.ConcurrentHashMap;
import dm1.i;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.a;
import com.yxcorp.download.DownloadManager;
import dm1.i$a;
import com.yxcorp.gifshow.util.BitmapUtil;
import em1.x;
import k51.a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import k51.b;

public final class z implements a	// class@0021cc
{
    public final a0 b;
    public final List c;
    public final String d;

    public void z(a0 p0,List p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object invoke(){
       int i;
       z tb = this.b;
       z tc = this.c;
       z td = this.d;
       a0 g = tb.g;
       Objects.requireNonNull(g);
       i$a obj = PatchProxy.applyThreeRefs(null, tc, td, g, d.class, "4");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
       }else {
          boolean b1 = false;
          if (q.f(tc)) {
             obj = b1;
          }else {
             obj = PatchProxy.applyOneRefs(tc, g, d.class, "7");
             if (obj != PatchProxyResult.class) {
             }else if(q.f(tc)){
                Iterator iterator = tc.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Bitmap uBitmap1 = g.a.get(a.b(iterator.next()));
                      if (uBitmap1 != null) {
                         obj = uBitmap1;
                         break ;
                      }
                   }
                }
             }
             obj = b1;
             if (!obj) {
                if (!i.c()) {
                   obj = PatchProxy.applyOneRefs(tc, b1, a.class, "1");
                   if (obj != PatchProxyResult.class) {
                   }else {
                      ImageRequest[] imageRequest = a.d(tc);
                      if (imageRequest != null) {
                         int len = imageRequest.length;
                         i = 0;
                         while (true) {
                            if (i < len) {
                               Bitmap uBitmap = a.f(imageRequest[i]);
                               if (uBitmap != null && uBitmap.getHeight() > 0) {
                                  obj = uBitmap;
                                  break ;
                               }else {
                                  i = i + 1;
                               }
                            }
                         }
                      }
                      obj = b1;
                   }
                   if (!obj) {
                   label_0098 :
                      DownloadManager.C("live_gift", b1);
                      obj = PatchProxy.applyOneRefs(tc, b1, a.class, "2");
                      if (obj != PatchProxyResult.class) {
                      }else {
                         obj = PatchProxy.applyOneRefs(tc, b1, i.class, "5");
                         if (obj != PatchProxyResult.class) {
                            b1 = obj;
                         }else if(i.c()){
                            obj = i.b(tc, true);
                            if (i.d(obj)) {
                               b1 = BitmapUtil.s(obj.a());
                            }else {
                               obj = i.b(tc, b);
                               if (i.d(obj)) {
                                  b1 = BitmapUtil.s(obj.a());
                               }
                            }
                         }else {
                            obj = i.b(tc, b);
                            if (i.d(obj)) {
                               b1 = BitmapUtil.s(obj.a());
                            }
                         }
                         obj = b1;
                      }
                      if (obj) {
                         g.b(a.c(tc), obj);
                      }
                   }
                }else {
                   goto label_0098 ;
                }
             }
          }
       }
       if (!obj) {
          if (i.c()) {
             if (!q.f(tc)) {
                tb.m(tc, b, td);
             }
          }else {
             b.d(new x(tb, tc), a.g());
          }
       }
       return obj;
    }
}
