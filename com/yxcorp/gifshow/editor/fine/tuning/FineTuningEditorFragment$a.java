package com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$b;
import com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel;

public class FineTuningEditorFragment$a implements Runnable	// class@001b98
{
    public final FineTuningEditorFragment b;

    public void FineTuningEditorFragment$a(FineTuningEditorFragment p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FineTuningEditorFragment$a.class, "1")) {
          return;
       }
       if (!this.b.isVisible()) {
          i1.c(new RuntimeException("mPositionChangedRunnable fragment not visible"));
          return;
       }else {
          FineTuningEditorFragment$a tb = this.b;
          tb.I.p0(tb.G.f);
          return;
       }
    }
}
