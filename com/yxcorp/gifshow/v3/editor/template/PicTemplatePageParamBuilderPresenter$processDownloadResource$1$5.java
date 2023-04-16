package com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1$5;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter;
import brd.a0;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$a;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$c;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1$5$a;
import erd.o;
import brd.t;
import mrd.c;
import brd.y;

public final class PicTemplatePageParamBuilderPresenter$processDownloadResource$1$5 extends Lambda implements a	// class@001306
{
    public final List $needDownloadTasks;
    public final PicTemplatePageParamBuilderPresenter$processDownloadResource$1 this$0;

    public void PicTemplatePageParamBuilderPresenter$processDownloadResource$1$5(PicTemplatePageParamBuilderPresenter$processDownloadResource$1 p0,List p1){
       this.this$0 = p0;
       this.$needDownloadTasks = p1;
       super(0);
    }
    public final PicTemplatePageParamBuilderPresenter$b invoke(){
       a0 uoa0;
       PicTemplatePageParamBuilderPresenter$b obj = PatchProxy.apply(null, this, PicTemplatePageParamBuilderPresenter$processDownloadResource$1$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PicTemplatePageParamBuilderPresenter$b();
       this.this$0.b.d = obj;
       PicTemplatePageParamBuilderPresenter$processDownloadResource$1$5 t$needDownlo = this.$needDownloadTasks;
       if (t$needDownlo != null) {
          uoa0 = a0.B(t$needDownlo);
          if (uoa0 != null) {
          label_0032 :
             uoa0.w(new PicTemplatePageParamBuilderPresenter$processDownloadResource$1$5$a(this)).subscribe(obj.a());
             return obj;
          }
       }
       t$needDownlo = this.this$0;
       uoa0 = t$needDownlo.b.a(t$needDownlo.c, t$needDownlo.d);
       goto label_0032 ;
    }
    public Object invoke(){
       return this.invoke();
    }
}
