package bwc.c;
import java.lang.Object;
import com.yxcorp.gifshow.v3.mixed.MixImporterActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Build$VERSION;
import qka.a;
import android.view.Window;
import android.app.Activity;
import lnc.a1;
import android.view.View;
import com.yxcorp.utility.j;
import com.kwai.feature.post.api.util.g;
import bwc.b;
import java.lang.Runnable;

public class c	// class@0004a5
{

    public void c(){
       super();
    }
    public static void a(MixImporterActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "1")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 23 && a.a()) {
          p0.getWindow().setStatusBarColor(a1.a(R.color.arg_RES_7f0618c1));
       }
       View view = p0.findViewById(R.id.title);
       if (!a.a()) {
          if (p0.O == null) {
             p0.O = new j(p0.getWindow());
          }
          p0.O.a();
          return;
       }else {
          Window window = p0.getWindow();
          window.clearFlags(1024);
          window.addFlags(2048);
          window.getDecorView().setSystemUiVisibility(1280);
          g.w(window, 0);
          view.post(new b(view, p0));
          return;
       }
    }
}
