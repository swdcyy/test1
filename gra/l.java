package gra.l;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import gra.m;
import java.util.List;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ea9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class l extends RecyclerView$r	// class@002bb8
{
    public final float a;
    public final RecyclerView b;
    public final m c;
    public final List d;

    public void l(RecyclerView p0,m p1,List p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
       Context context = p0.getContext();
       a.o(context, "context");
       this.a = a.a(context, 44.00f);
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport2(l.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, l.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       int i = this.b.computeVerticalScrollOffset();
       KwaiImageView kwaiImageVie = this.c.d9();
       l ta = this.a;
       float f = (i >= (int)ta)? 0x3f800000: (float)i / ta;
       kwaiImageVie.setAlpha(f);
       PatchProxy.onMethodExit(l.class, "1");
       return;
    }
}
