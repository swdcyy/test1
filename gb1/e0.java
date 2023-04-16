package gb1.e0;
import android.content.DialogInterface$OnDismissListener;
import android.app.Activity;
import java.lang.Object;
import android.content.DialogInterface;

public final class e0 implements DialogInterface$OnDismissListener	// class@002456
{
    public final Activity b;

    public void e0(Activity p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       this.b.setRequestedOrientation(6);
    }
}
