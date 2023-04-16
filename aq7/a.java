package aq7.a;
import ub.a;
import aq7.e;
import com.facebook.imagepipeline.request.ImageRequest;
import cs7.c;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import lnc.a1;

public final class a extends a	// class@00033d
{
    public final e b;
    public final ImageRequest[] c;
    public final c d;

    public void a(e p0,ImageRequest[] p1,c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "throwable");
       ViewGroup$LayoutParams layoutParams = e.v(this.b).getLayoutParams();
       a.o(layoutParams, "mIconView.layoutParams");
       layoutParams.height = a1.d(0x7f070295);
       layoutParams.width = a1.d(0x7f0702da);
       e.v(this.b).setLayoutParams(layoutParams);
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
