package com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter$b;
import android.view.View$OnClickListener;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.multi_web_page.model.a;
import io.reactivex.subjects.PublishSubject;

public final class TunaMultiWebTitlePresenter$b implements View$OnClickListener	// class@0010f7
{
    public final TunaMultiWebTitlePresenter b;

    public void TunaMultiWebTitlePresenter$b(TunaMultiWebTitlePresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaMultiWebTitlePresenter$b.class, str)) {
          return;
       }
       TunaMultiWebTitlePresenter t = this.b.t;
       if (t != null && !PatchProxy.applyVoidOneRefs(p0, t, a.class, str)) {
          t.c.onNext(p0);
       }
       return;
    }
}
