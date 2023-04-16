package ha2.a;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.show.increasefans.b;
import java.lang.Object;
import android.content.DialogInterface;

public final class a implements DialogInterface$OnDismissListener	// class@002d36
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.q = null;
    }
}
