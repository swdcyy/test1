package a2c.c;
import android.content.DialogInterface$OnDismissListener;
import a2c.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public final class c implements DialogInterface$OnDismissListener	// class@00003d
{
    public final a b;
    public final GifshowActivity c;

    public void c(a p0,GifshowActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       b9.a(this.b.b);
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
