package ou1.f;
import android.view.View;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class f	// class@003592
{
    public final KwaiCDNImageView a;
    public final TextView b;
    public final TextView c;
    public TextView d;
    public int e;
    public Animator f;
    public Animator g;
    public final View h;
    public final LiveMultiPkViewStyle i;

    public void f(View p0,LiveMultiPkViewStyle p1){
       a.p(p0, "scoreContainer");
       a.p(p1, "viewStyle");
       super();
       this.h = p0;
       this.i = p1;
       View view = p0.findViewById(R.id.live_multi_pk_rank_icon);
       a.o(view, "scoreContainer.findViewB¡­.live_multi_pk_rank_icon\)");
       this.a = view;
       View view1 = p0.findViewById(R.id.live_multi_pk_rank_score);
       a.o(view1, "scoreContainer.findViewB¡­live_multi_pk_rank_score\)");
       this.b = view1;
       View view2 = p0.findViewById(R.id.live_multi_pk_rank_score_anim);
       a.o(view2, "scoreContainer.findViewB¡­multi_pk_rank_score_anim\)");
       this.c = view2;
       this.d = view1;
       this.e = 1;
       Typeface typeface = d0.a("fonts/AvenirNext-BoldItalic.ttf", p0.getContext());
       if (typeface != null) {
          view1.setTypeface(typeface);
          view2.setTypeface(typeface);
       }
       if (p1 == LiveMultiPkViewStyle.SIMPLE) {
          float f = (float)a1.d(0x7f070862);
          view1.setTextSize(0, f);
          view2.setTextSize(0, f);
          int i = a1.d(R.dimen.arg_RES_7f070861);
          p1.height = i;
          p1.width = i;
       }
       this.d.setVisibility(0);
       return;
    }
    public final void a(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       if (p0 != null && p0.isRunning()) {
          p0.cancel();
       }
       return;
    }
}
