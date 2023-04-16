package com.yxcorp.gifshow.v3.editor.text.element.vb.c;
import erd.r;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$e;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;

public final class c implements r	// class@00141a
{
    public final TextElementViewBinder$e b;

    public void c(TextElementViewBinder$e p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "drawer");
          b = (this.b.b.F != null)? p0 instanceof EditTextBaseElement: true;
       }
       return b;
    }
}
