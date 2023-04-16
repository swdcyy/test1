package k59.s2$b$b;
import erd.o;
import k59.s2$b;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import x6b.f;
import android.graphics.Matrix;
import android.widget.AbsoluteLayout;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import k59.s2;

public final class s2$b$b implements o	// class@002b14
{
    public final s2$b b;
    public final float c;
    public final WebView d;

    public void s2$b$b(s2$b p0,float p1,WebView p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       float f;
       s2$b a;
       Bitmap uBitmap = PatchProxy.applyOneRefs(p0, this, s2$b$b.class, "1");
       if (uBitmap != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          f.a(p0, 0, 0, p0.getWidth(), p0.getHeight(), 0, 50);
          Matrix matrix = new Matrix();
          matrix.setScale(this.c, this.c);
          s2$b$b td = this.d;
          int width = (td != null)? td.getWidth(): n.z(this.b.a.getContext());
          f = this.c - (float)1;
          float f1 = (float)2;
          int i = (int)(((float)width * f) / f1);
          a = this.b.a;
          int i1 = (int)(((float)a.w * f) / f1);
          s2$b$b td1 = this.d;
          width = (td1 != null)? td1.getWidth(): n.z(a.getContext());
          f1 = f1 - this.c;
          uBitmap = Bitmap.createBitmap(p0, i, i1, (int)((float)width * f1), (int)((float)this.b.a.w * f1), matrix, 0);
       }
       return uBitmap;
    }
}
