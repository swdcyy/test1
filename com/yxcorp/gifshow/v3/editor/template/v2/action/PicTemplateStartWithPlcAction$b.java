package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartWithPlcAction$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import w46.b;

public final class PicTemplateStartWithPlcAction$b implements g	// class@00137a
{
    public static final PicTemplateStartWithPlcAction$b b;

    static {
       PicTemplateStartWithPlcAction$b.b = new PicTemplateStartWithPlcAction$b();
    }
    public void PicTemplateStartWithPlcAction$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateStartWithPlcAction$b.class, "1")) {
       }else {
          a.D().e("PicTemplateAction", "applyPlcTemplates: error", p0);
       }
       return;
    }
}
