package bj3.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.os.Build$VERSION;
import bj3.g$a;
import android.view.ViewOutlineProvider;

public class g	// class@0003de
{

    public void g(){
       super();
    }
    public static void a(View p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, og, "1")) {
          return;
       }
       if (Build$VERSION.SDK_INT > 21) {
          p0.setClipToOutline(true);
          p0.setOutlineProvider(new g$a(p1));
       }
       return;
    }
}
