package com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$b;
import erd.g;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kf5.l$b;
import kf5.l;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import android.app.Dialog;

public final class NewPlayerFeedbackPanel$b implements g	// class@000a76
{
    public final NewPlayerFeedbackPanel b;

    public void NewPlayerFeedbackPanel$b(NewPlayerFeedbackPanel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewPlayerFeedbackPanel$b.class, "1")) {
       }else {
          this.b.u().d().clear();
          this.b.cancel();
       }
       return;
    }
}
