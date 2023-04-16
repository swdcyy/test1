package k59.s2$b$a;
import erd.o;
import k59.s2$b;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import kotlin.jvm.internal.a;
import java.util.Objects;
import k59.s2;
import android.view.View;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;

public final class s2$b$a implements o	// class@002b13
{
    public final s2$b b;
    public final WebView c;

    public void s2$b$a(s2$b p0,WebView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s2$b$a obj = PatchProxy.applyOneRefs(p0, this, s2$b$a.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          p0 = this.b.a;
          obj = this.c;
          Objects.requireNonNull(p0);
          object oobject = PatchProxy.applyOneRefs(obj, p0, s2.class, "4");
          if (oobject != patchProxyRe) {
          }else {
             oobject = null;
             if (obj != null) {
                int width = obj.getWidth();
                s2 w = p0.w;
                Bitmap$Config rGB_565 = Bitmap$Config.RGB_565;
                if (PatchProxy.isSupport(s2.class)) {
                   Object[] objArray = new Object[]{obj,Integer.valueOf(width),Integer.valueOf(w),rGB_565,oobject};
                   p0 = PatchProxy.apply(objArray, p0, s2.class, "5");
                   if (p0 != patchProxyRe) {
                   label_0071 :
                      obj = p0;
                   }
                }
                a.m(rGB_565);
                p0 = Bitmap.createBitmap(width, w, rGB_565);
                obj.draw(new Canvas(p0));
                goto label_0071 ;
             }
          }
          obj = oobject;
       }
       return obj;
    }
}
