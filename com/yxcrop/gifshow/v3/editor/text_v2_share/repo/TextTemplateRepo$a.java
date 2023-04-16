package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$TextParams;
import java.lang.Boolean;

public final class TextTemplateRepo$a	// class@000bee
{

    public void TextTemplateRepo$a(){
       super();
    }
    public void TextTemplateRepo$a(u p0){
       super();
    }
    public final int a(DynamicTextParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextTemplateRepo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "sk2cParams");
       p0 = p0.text;
       DynamicTextParams$TextParams textAlign = (p0 != null)? p0.textAlign: 1;
       return textAlign;
    }
    public final boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextTemplateRepo$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "textId");
       boolean b = (!a.g(p0, "20201230_black") && (a.g(p0, "20201230_yellow") || a.g(p0, "20201230_white")))? true: false;
       return b;
    }
}
