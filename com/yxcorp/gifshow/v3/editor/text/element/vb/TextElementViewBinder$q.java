package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$q;
import t36.f$a;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import wpc.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;

public final class TextElementViewBinder$q implements f$a	// class@001412
{
    public final TextElementViewBinder a;

    public void TextElementViewBinder$q(TextElementViewBinder p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$q.class, "1")) {
       }else {
          p0.g(this.a.J().getSelectDrawer());
       }
       return;
    }
}
