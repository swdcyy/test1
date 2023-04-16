package com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$d;
import android.content.DialogInterface$OnDismissListener;
import zm5.a;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class NasaCommentExternalEditorPresenter$d implements DialogInterface$OnDismissListener	// class@001850
{
    public final a b;

    public void NasaCommentExternalEditorPresenter$d(a p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaCommentExternalEditorPresenter$d.class, "1")) {
          return;
       }
       this.b.b(true, 2);
       return;
    }
}
