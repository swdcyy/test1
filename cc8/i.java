package cc8.i;
import java.util.concurrent.Callable;
import com.mini.js.jsapi.ui.nativeui.PictureToastView;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import x88.d;
import ma8.i;
import ma8.g;
import n88.b;
import v88.h;
import ya8.n0$b;
import ya8.n0;
import com.mini.utils.i;

public final class i implements Callable	// class@0003e9
{
    public final PictureToastView b;
    public final String c;

    public void i(PictureToastView p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       Bitmap uBitmap = PatchProxy.applyOneRefs(tc, tb, PictureToastView.class, "4");
       if (uBitmap != PatchProxyResult.class) {
       }else {
          d uod = new d();
          n0.b(tc, tb.g.r1().i().Z()).a("binary", uod);
          uBitmap = i.e(uod.h, 0, 0);
       }
       return uBitmap;
    }
}
