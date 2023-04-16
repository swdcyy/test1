package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2$c;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.BaseEditor;

public final class PicTemplateEditorV2$c implements g	// class@00133f
{
    public final PicTemplateEditorV2 b;

    public void PicTemplateEditorV2$c(PicTemplateEditorV2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       PicTemplateEditorV2$c uoc = PicTemplateEditorV2$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoc, "1")) {
          uoc = this.b;
          Objects.requireNonNull(uoc);
          PicTemplateEditorV2 picTemplateE = PicTemplateEditorV2.class;
          if (!PatchProxy.isSupport(picTemplateE) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uoc, picTemplateE, "9")) {
             uoc.t(b);
             uoc.c(uoc.q(), false);
          }
       }
       return;
    }
}
