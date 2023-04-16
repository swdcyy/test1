package eod.g;
import androidx.recyclerview.widget.RecyclerView$r;
import eod.e;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2;
import java.util.Objects;
import com.yxcorp.gifshow.v3.widget.FadingEdgeContainer;
import android.view.ViewGroup;
import eod.g$a;
import java.lang.Runnable;

public final class g extends RecyclerView$r	// class@000dc0
{
    public final e a;

    public void g(e p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       Objects.requireNonNull(TextTemplateConstantV2.m);
       this.a.f.a(2, TextTemplateConstantV2.j);
       if (!p1 && !this.a.e.getAlpha() - null) {
          this.a.e.post(new g$a(this));
       }
       return;
    }
}
