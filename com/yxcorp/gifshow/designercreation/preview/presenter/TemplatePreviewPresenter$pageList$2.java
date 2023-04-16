package com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$pageList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationTemplatePageList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationPageListManager;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationPageListManager$a;

public final class TemplatePreviewPresenter$pageList$2 extends Lambda implements a	// class@001318
{
    public final TemplatePreviewPresenter this$0;

    public void TemplatePreviewPresenter$pageList$2(TemplatePreviewPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final ProfileCreationTemplatePageList invoke(){
       Object obj = PatchProxy.apply(null, this, TemplatePreviewPresenter$pageList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProfileCreationPageListManager.c.a().a(this.this$0.v);
    }
    public Object invoke(){
       return this.invoke();
    }
}
