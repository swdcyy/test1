package com.yxcorp.gifshow.v3.editor.text.n0$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.editor.text.n0;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import qvc.b;

public class n0$a extends DecorationContainerView$e	// class@001474
{
    public final n0 a;

    public void n0$a(n0 p0){
       this.a = p0;
       super();
    }
    public void h(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0$a.class, "1")) {
       }else {
          super.h(p0);
          p0.getTextDrawerLayout().a(this.a.R);
       }
       return;
    }
}
