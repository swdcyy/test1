package androidx.fragment.app.DialogFragment$a;
import java.lang.Runnable;
import androidx.fragment.app.DialogFragment;
import java.lang.Object;
import android.content.DialogInterface;

public class DialogFragment$a implements Runnable	// class@000774
{
    public final DialogFragment b;

    public void DialogFragment$a(DialogFragment p0){
       this.b = p0;
       super();
    }
    public void run(){
       DialogFragment$a tb = this.b;
       DialogFragment mDialog = tb.mDialog;
       if (mDialog != null) {
          tb.onDismiss(mDialog);
       }
       return;
    }
}
