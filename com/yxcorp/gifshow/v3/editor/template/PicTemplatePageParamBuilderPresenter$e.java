package com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$e;
import brd.w;
import java.lang.Object;
import brd.y;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PicTemplatePageParamBuilderPresenter$e implements w	// class@001300
{
    public static final PicTemplatePageParamBuilderPresenter$e b;

    static {
       PicTemplatePageParamBuilderPresenter$e.b = new PicTemplatePageParamBuilderPresenter$e();
    }
    public void PicTemplatePageParamBuilderPresenter$e(){
       super();
    }
    public final void subscribe(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplatePageParamBuilderPresenter$e.class, "1")) {
          return;
       }
       a.p(p0, "observer");
       p0.onComplete();
       return;
    }
}
