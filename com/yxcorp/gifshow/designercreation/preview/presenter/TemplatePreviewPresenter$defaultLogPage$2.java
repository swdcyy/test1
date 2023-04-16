package com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$defaultLogPage$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter;
import com.yxcorp.gifshow.designercreation.logger.TemplateDefaultLogPage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hw9.b;

public final class TemplatePreviewPresenter$defaultLogPage$2 extends Lambda implements a	// class@001316
{
    public final TemplatePreviewPresenter this$0;

    public void TemplatePreviewPresenter$defaultLogPage$2(TemplatePreviewPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final TemplateDefaultLogPage invoke(){
       Object obj = PatchProxy.apply(null, this, TemplatePreviewPresenter$defaultLogPage$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TemplateDefaultLogPage(this.this$0.C);
    }
    public Object invoke(){
       return this.invoke();
    }
}
