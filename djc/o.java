package djc.o;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.DownloadForwardDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class o implements View$OnClickListener	// class@002215
{
    public final DownloadForwardDialog b;

    public void o(DownloadForwardDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, DownloadForwardDialog.class, "8")) {
       }else {
          tb.dismiss();
       }
       return;
    }
}
