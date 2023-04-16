package ak2.c;
import android.content.DialogInterface$OnDismissListener;
import ak2.l;
import java.lang.Object;
import android.content.DialogInterface;
import androidx.fragment.app.KwaiDialogFragment;

public final class c implements DialogInterface$OnDismissListener	// class@0000e6
{
    public final l b;

    public void c(l p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       c tb = this.b;
       tb.E.k0(null);
       tb.E = null;
    }
}
