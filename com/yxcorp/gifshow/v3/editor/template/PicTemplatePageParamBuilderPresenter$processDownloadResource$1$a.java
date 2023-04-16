package com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1$a;
import brd.d0;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1;
import brd.d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import crd.b;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter;
import faa.a;
import q87.c;
import msd.l;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$a;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1$3$onSuccess$2;
import brd.a;

public final class PicTemplatePageParamBuilderPresenter$processDownloadResource$1$a implements d0	// class@001308
{
    public final PicTemplatePageParamBuilderPresenter$processDownloadResource$1 b;
    public final d c;

    public void PicTemplatePageParamBuilderPresenter$processDownloadResource$1$a(PicTemplatePageParamBuilderPresenter$processDownloadResource$1 p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplatePageParamBuilderPresenter$processDownloadResource$1$a.class, "3")) {
          return;
       }
       a.p(p0, "e");
       this.c.onError(p0);
       return;
    }
    public void onSubscribe(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplatePageParamBuilderPresenter$processDownloadResource$1$a.class, "1")) {
          return;
       }
       a.p(p0, "disposable");
       this.c.onSubscribe(p0);
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplatePageParamBuilderPresenter$processDownloadResource$1$a.class, "2")) {
       }else {
          a.p(p0, "tasks");
          this.b.b.c = p0;
          if (p0.isEmpty()) {
             Object[] objArray = new Object[0];
             a.D().w("PicTemplatePageParamBuilderPresenter", "9253 createProcessDownloadResource don\'t need", objArray);
             this.c.onComplete();
          }else {
             this.b.c.a().invoke(new PicTemplatePageParamBuilderPresenter$processDownloadResource$1$3$onSuccess$2(this, p0)).a(this.c);
          }
       }
       return;
    }
}
