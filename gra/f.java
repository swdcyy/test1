package gra.f;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import gra.g;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.ViewGroup;
import ea9.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class f extends RecyclerView$r	// class@002bab
{
    public final RecyclerView a;
    public final g b;
    public final List c;

    public void f(RecyclerView p0,g p1,List p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       float f;
       if (PatchProxy.isSupport2(f.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       int i = this.a.computeVerticalScrollOffset();
       Context context = this.a.getContext();
       a.o(context, "context");
       if (i >= (int)a.a(context, 44.00f)) {
          f = 0x3f800000;
       }else {
          context = this.a.getContext();
          a.o(context, "context");
          f = (float)i / a.a(context, 44.00f);
       }
       this.b.c9().setAlpha(f);
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
}
