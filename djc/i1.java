package djc.i1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.KwaiUploadShareDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public final class i1 implements View$OnClickListener	// class@0021fc
{
    public final KwaiUploadShareDialog b;

    public void i1(KwaiUploadShareDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, KwaiUploadShareDialog.class, "8")) {
       }else {
          tb.dismiss();
       }
       return;
    }
}
