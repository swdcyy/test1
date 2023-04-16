package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$l;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;

public final class TextElementViewBinder$l implements r	// class@00140a
{
    public static final TextElementViewBinder$l b;

    static {
       TextElementViewBinder$l.b = new TextElementViewBinder$l();
    }
    public void TextElementViewBinder$l(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, TextElementViewBinder$l.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "editDecorationBaseDrawer");
          b = (p0 instanceof EditTextBaseElement && p0.getEditTextBaseElementData().y0())? true: false;
       }
       return b;
    }
}
