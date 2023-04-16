package com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$a$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder;
import jn9.b;
import mqc.a;

public final class HighlightTimeViewBinder$a$b implements View$OnClickListener	// class@000f66
{
    public final HighlightTimeViewBinder$a b;

    public void HighlightTimeViewBinder$a$b(HighlightTimeViewBinder$a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighlightTimeViewBinder$a$b.class, "1")) {
          return;
       }
       HighlightTimeViewBinder$a$b tb = this.b;
       tb.b.l0(tb.a);
       this.b.b.Q().e();
       tb.a = null;
       return;
    }
}
