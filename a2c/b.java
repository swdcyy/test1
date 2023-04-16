package a2c.b;
import com.yxcorp.gifshow.widget.m;
import a2c.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import e17.i;

public final class b extends m	// class@00003b
{
    public final a c;
    public final GifshowActivity d;

    public void b(a p0,GifshowActivity p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "v");
       i.a(R.style.arg_RES_7f11066a, 0x7f1042c2);
       this.c.a();
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
