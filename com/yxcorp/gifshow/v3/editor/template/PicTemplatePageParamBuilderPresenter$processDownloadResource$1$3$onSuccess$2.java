package com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1$3$onSuccess$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1$a;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter;
import brd.t;
import mrd.c;
import brd.y;

public final class PicTemplatePageParamBuilderPresenter$processDownloadResource$1$3$onSuccess$2 extends Lambda implements a	// class@001304
{
    public final List $tasks;
    public final PicTemplatePageParamBuilderPresenter$processDownloadResource$1$a this$0;

    public void PicTemplatePageParamBuilderPresenter$processDownloadResource$1$3$onSuccess$2(PicTemplatePageParamBuilderPresenter$processDownloadResource$1$a p0,List p1){
       this.this$0 = p0;
       this.$tasks = p1;
       super(0);
    }
    public final PicTemplatePageParamBuilderPresenter$b invoke(){
       PicTemplatePageParamBuilderPresenter$b obj = PatchProxy.apply(null, this, PicTemplatePageParamBuilderPresenter$processDownloadResource$1$3$onSuccess$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PicTemplatePageParamBuilderPresenter$b();
       PicTemplatePageParamBuilderPresenter$processDownloadResource$1 b = this.this$0.b.b;
       b.d = obj;
       b.b(this.$tasks).subscribe(obj.a());
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
