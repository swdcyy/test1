package fca.c;
import erd.g;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment;
import java.lang.Object;
import java.lang.Integer;
import com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel;

public final class c implements g	// class@0022fa
{
    public final FineTuningEditorFragment b;

    public void c(FineTuningEditorFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       FineTuningEditorFragment i = this.b.I;
       if (i != null) {
          i.p0(p0.intValue());
       }
       return;
    }
}
