package b90.c$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public final class c$a implements View$OnClickListener	// class@000aeb
{
    public final ProgressFragment b;

    public void c$a(ProgressFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.b.dismissAllowingStateLoss();
       return;
    }
}
