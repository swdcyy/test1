package eod.h$a;
import androidx.recyclerview.widget.RecyclerView$n;
import eod.h;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import jn9.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2;
import java.util.Objects;

public final class h$a extends RecyclerView$n	// class@000dc1
{
    public final int a;
    public final int b;
    public final h c;

    public void h$a(h p0,int p1,int p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, h$a.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       int childAdapter = p2.getChildAdapterPosition(p1);
       h$a ta = this.a;
       int i = this.c.h.m().size() / ta;
       int i1 = childAdapter % ta;
       int i2 = childAdapter / ta;
       h$a tb = this.b;
       p0.left = (i1 * tb) / ta;
       p0.right = tb - (((i1 + 1) * tb) / ta);
       if (childAdapter < ta) {
          p0.top = TextTemplateConstantV2.m.d();
       }
       if (i2 == i) {
          p0.bottom = TextTemplateConstantV2.m.d();
       }else {
          Objects.requireNonNull(TextTemplateConstantV2.m);
          p0.bottom = TextTemplateConstantV2.i;
       }
       return;
    }
}
