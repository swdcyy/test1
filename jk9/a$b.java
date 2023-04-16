package jk9.a$b;
import java.util.concurrent.Callable;
import jk9.a;
import android.content.Context;
import com.kwai.component.bifrost.res.BifrostImageResourceEntry;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import com.kwai.component.bifrost.res.BifrostCommonResourceEntry;
import kotlin.jvm.internal.a;
import java.util.Objects;
import wkd.b;
import te6.b;
import java.io.File;
import android.content.res.Resources;
import cw9.c;
import android.graphics.BitmapFactory$Options;
import ekd.h0;
import java.lang.Math;
import usd.q;
import ek9.m1;
import java.lang.Throwable;
import q87.c;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.w;
import android.graphics.drawable.BitmapDrawable;
import java.lang.StringBuilder;
import lnc.i3;
import yca.a;
import yca.a$a;

public final class a$b implements Callable	// class@002af1
{
    public final a b;
    public final Context c;
    public final BifrostImageResourceEntry d;

    public void a$b(a p0,Context p1,BifrostImageResourceEntry p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a$b obj = PatchProxy.apply(objArray, this, a$b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.b;
          a$b tc = this.c;
          String url = this.d.getUrl();
          a.m(url);
          a.o(url, "res.url!!");
          Objects.requireNonNull(obj);
          Object[] obj1 = PatchProxy.applyTwoRefs(tc, url, obj, a.class, "3");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             String str = b.a(-1427269270).B(url);
             if (str != null) {
                objArray = new File(str);
             }
             str = "COMMENT_AT_TAIL_TAG";
             b = false;
             if (objArray != null && objArray.exists()) {
                int i = c.b(tc.getResources(), a.g);
                String absolutePath = objArray.getAbsolutePath();
                a.o(absolutePath, "file.absolutePath");
                BitmapFactory$Options options = h0.a(absolutePath);
                options.inJustDecodeBounds = b;
                options.inSampleSize = q.n((int)(float)Math.ceil((double)((float)options.outWidth / (float)i)), 1);
                Bitmap uBitmap = w.g(a.f, objArray.getAbsolutePath(), options);
                if (uBitmap != null) {
                   BitmapDrawable uBitmapDrawa = new BitmapDrawable(tc.getResources(), uBitmap);
                   uBitmapDrawa.setBounds(b, b, i, i);
                   Object[] objArray1 = new Object[b];
                   m1.C().w(str, "showWarmUpImage:"+url, objArray1);
                   obj = uBitmapDrawa;
                }
             }
             obj1 = new Object[b];
             m1.C().w(str, "showDefaultImage:"+url, obj1);
             obj = obj.a(tc);
          }
       }
       return obj;
    }
}
