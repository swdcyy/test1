package p90.c;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.KuaishanVideoClipFragment;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import u80.e;
import java.lang.String;
import q87.c;

public final class c implements DialogInterface$OnDismissListener	// class@0028f0
{
    public final KuaishanVideoClipFragment b;

    public void c(KuaishanVideoClipFragment p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       e.D().s("KuaishanVideoClipFragment", "showProgressFragment onDismiss", objArray);
       tb.m = null;
    }
}
