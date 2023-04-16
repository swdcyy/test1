package ni0.b;
import oi0.b$a;
import com.kuaishou.krn.apm.wsd.model.WsdReportData;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import ek0.d;
import com.kuaishou.krn.apm.wsd.WhiteScreenDetector;
import android.content.Context;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.io.File;
import ni0.d;
import java.lang.Runnable;
import ekd.s1;

public final class b implements b$a	// class@003321
{
    public final WsdReportData a;
    public final View b;
    public final String c;

    public void b(WsdReportData p0,View p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(boolean p0,Bitmap p1){
       String str;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       this.a.mShotVerifyIsWhite = Boolean.valueOf(p0);
       d.e("WhiteScreenDetector verifyWhiteView result is "+p0);
       if (p1 != null) {
          WhiteScreenDetector i = WhiteScreenDetector.i;
          Context context = this.b.getContext();
          a.o(context, "rootView.context");
          b tc = this.c;
          Objects.requireNonNull(i);
          if (!PatchProxy.isSupport(WhiteScreenDetector.class) || !PatchProxy.applyVoidFourRefs(context, p1, tc, Boolean.valueOf(p0), i, WhiteScreenDetector.class, "9")) {
             if (WhiteScreenDetector.g == null) {
                if (!i.a(context)) {
                   d.i("WhiteScreenDetector saveBitmapToFile for "+tc+": permission not granted");
                   str = context.getFilesDir().toString();
                   a.o(str, "context.filesDir.toString\(\)");
                }else {
                   str = String.valueOf(context.getExternalFilesDir(null));
                }
                WhiteScreenDetector.g = str;
             }
             s1.d(new d(p0, tc, p1));
          }
       }
       return;
    }
    public void onError(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "errorMsg");
       d.a("WhiteScreenDetector captureViewVerify: verifyWhiteView occurred error="+p0+" for "+this.c);
       return;
    }
}
