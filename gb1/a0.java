package gb1.a0;
import android.content.DialogInterface$OnDismissListener;
import gb1.d0;
import java.lang.Object;
import android.content.DialogInterface;
import eb1.e;
import android.app.Activity;
import bb1.b;

public final class a0 implements DialogInterface$OnDismissListener	// class@002446
{
    public final d0 b;

    public void a0(d0 p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       this.b.b.getActivity().setRequestedOrientation(6);
    }
}
