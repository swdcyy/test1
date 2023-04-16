package dod.a;
import pn9.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.widget.TextColorViewV2;
import nn9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mn9.a;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.widget.TextColorBaseViewV3;

public final class a extends a	// class@000ce4
{
    public final TextColorViewV2 f;

    public void a(View p0){
       a.p(p0, "itemView");
       super(p0);
       p0 = p0.findViewById(R.id.text_color_view);
       a.o(p0, "itemView.findViewById\(R.id.text_color_view\)");
       this.f = p0;
    }
    public void f(b p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p1, "newState");
       a uoa = p1.g();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager.TextColorData");
       uoa.b = p1.d();
       this.f.setTextColor(uoa);
       return;
    }
}
