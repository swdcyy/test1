package djc.b1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import kotlin.jvm.internal.a;
import android.content.DialogInterface;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;

public final class b1 implements View$OnClickListener	// class@0021d3
{
    public final ImmerseSharePanelFragment b;

    public void b1(ImmerseSharePanelFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "1")) {
          return;
       }
       b1 tb = this.b;
       Dialog dialog = tb.getDialog();
       a.m(dialog);
       tb.onCancel(dialog);
       this.b.dismiss();
       return;
    }
}
