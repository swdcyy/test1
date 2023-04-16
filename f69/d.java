package f69.d;
import android.content.DialogInterface$OnCancelListener;
import f69.s;
import java.lang.Object;
import android.content.DialogInterface;

public final class d implements DialogInterface$OnCancelListener	// class@0022b3
{
    public final s b;

    public void d(s p0){
       this.b = p0;
    }
    public final void onCancel(DialogInterface p0){
       this.b.b9();
    }
}
