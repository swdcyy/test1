package com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class TemplatePreviewPresenter$e implements View$OnClickListener	// class@001317
{
    public final TemplatePreviewPresenter b;

    public void TemplatePreviewPresenter$e(TemplatePreviewPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplatePreviewPresenter$e.class, "1")) {
          return;
       }
       Activity activity = this.b.getActivity();
       if (activity != null) {
          activity.onBackPressed();
       }
       return;
    }
}
