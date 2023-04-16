package com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1;
import brd.e;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$a;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$c;
import java.lang.Object;
import brd.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider;
import java.util.List;
import faa.a;
import q87.c;
import brd.a;
import brd.a0;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1$a;
import brd.d0;
import mrd.c;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$b;
import msd.l;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1$5;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1$8;

public final class PicTemplatePageParamBuilderPresenter$processDownloadResource$1 implements e	// class@001309
{
    public final PicTemplatePageParamBuilderPresenter b;
    public final PicTemplatePageParamBuilderPresenter$a c;
    public final PicTemplatePageParamBuilderPresenter$c d;

    public void PicTemplatePageParamBuilderPresenter$processDownloadResource$1(PicTemplatePageParamBuilderPresenter p0,PicTemplatePageParamBuilderPresenter$a p1,PicTemplatePageParamBuilderPresenter$c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void a(d p0){
       Object[] objArray;
       a0 uoa0;
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplatePageParamBuilderPresenter$processDownloadResource$1.class, "1")) {
          return;
       }
       a.p(p0, "up");
       int i = 0;
       if (this.c.d != null) {
          this.b.b.a = i;
       }
       PicTemplatePageParamBuilderPresenter$processDownloadResource$1 tb = this.b;
       PicTemplatePageParamBuilderPresenter d = tb.d;
       PicTemplatePageParamBuilderPresenter c = tb.c;
       if (c != null && c.isEmpty() == true) {
          objArray = new Object[i];
          a.D().w("PicTemplatePageParamBuilderPresenter", "8378 createProcessDownloadResource don\'t need", objArray);
          a.g().a(p0);
       }else if(d == null){
          objArray = new Object[i];
          a.D().w("PicTemplatePageParamBuilderPresenter", "8379 createProcessDownloadResource start", objArray);
          if (c != null) {
             uoa0 = a0.B(c);
             if (uoa0 != null) {
             label_0062 :
                uoa0.b(new PicTemplatePageParamBuilderPresenter$processDownloadResource$1$a(this, p0));
             }
          }
          uoa0 = this.b.a(this.c, this.d);
          goto label_0062 ;
       }else if(d.a().e()){
          objArray = new Object[i];
          a.D().w("PicTemplatePageParamBuilderPresenter", "5792 createProcessDownloadResource retry", objArray);
          this.c.a().invoke(new PicTemplatePageParamBuilderPresenter$processDownloadResource$1$5(this, c)).a(p0);
       }else if(d.a().c()){
          objArray = new Object[i];
          a.D().w("PicTemplatePageParamBuilderPresenter", "2141 createProcessDownloadResource downloaded", objArray);
          a.g().a(p0);
       }else {
          objArray = new Object[i];
          a.D().w("PicTemplatePageParamBuilderPresenter", "2108 createProcessDownloadResource downloading", objArray);
          this.c.a().invoke(new PicTemplatePageParamBuilderPresenter$processDownloadResource$1$8(d)).a(p0);
       }
       return;
    }
}
