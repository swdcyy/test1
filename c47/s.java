package c47.s;
import android.content.DialogInterface$OnDismissListener;
import com.kwai.live.gzone.commandlottery.d;
import java.lang.Object;
import android.content.DialogInterface;

public class s implements DialogInterface$OnDismissListener	// class@0004de
{
    public final d b;

    public void s(d p0){
       this.b = p0;
       super();
    }
    public void onDismiss(DialogInterface p0){
       p0.F = null;
    }
}
