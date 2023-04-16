package com.yxcorp.gifshow.v3.editor.text.element.vb.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.element.vb.b$a;
import t36.f$a;
import t36.f;

public final class b implements View$OnClickListener	// class@001419
{
    public final TextElementViewBinder$c b;

    public void b(TextElementViewBinder$c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (!this.b.b.P()) {
          this.b.b.J().R();
       }else {
          TextElementViewBinder.F(this.b.b, false, 1, null);
       }
       TextElementViewBinder c = this.b.b.C;
       if (c != null) {
          c.s0(b$a.a);
       }
       return;
    }
}
