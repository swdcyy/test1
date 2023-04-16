package com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$c;
import android.content.DialogInterface$OnShowListener;
import zm5.a;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class NasaCommentExternalEditorPresenter$c implements DialogInterface$OnShowListener	// class@00184f
{
    public final a b;

    public void NasaCommentExternalEditorPresenter$c(a p0){
       this.b = p0;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaCommentExternalEditorPresenter$c.class, "1")) {
          return;
       }
       this.b.b(false, 2);
       return;
    }
}
