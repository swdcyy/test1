package c47.u;
import android.content.DialogInterface$OnDismissListener;
import com.kwai.live.gzone.commandlottery.d;
import java.lang.Object;
import android.content.DialogInterface;

public class u implements DialogInterface$OnDismissListener	// class@0004e0
{
    public final d b;

    public void u(d p0){
       this.b = p0;
       super();
    }
    public void onDismiss(DialogInterface p0){
       p0.E = null;
    }
}
