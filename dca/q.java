package dca.q;
import java.lang.Runnable;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import kotlin.jvm.internal.a;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;

public final class q implements Runnable	// class@001eff
{
    public final VideoTemplateViewBinder b;

    public void q(VideoTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       q tb = this.b;
       VideoTemplateViewBinder h = tb.h;
       if (h != null) {
          FragmentActivity uFragmentAct = tb.k.jh();
          a.o(uFragmentAct, "fragment.currentActivity");
          h.show(uFragmentAct.getSupportFragmentManager(), "VideoTemplateViewBinder");
       }
       return;
    }
}
