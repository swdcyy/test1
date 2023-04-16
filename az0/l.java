package az0.l;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$b;

public final class l implements View$OnClickListener	// class@0002da
{
    public final LiveGiftReceiverListDialog b;

    public void l(LiveGiftReceiverListDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveGiftReceiverListDialog.class, "7")) {
       }else {
          tb.dismiss();
          LiveGiftReceiverListDialog f = tb.F;
          if (f != null) {
             f.onClose();
          }
       }
       return;
    }
}
