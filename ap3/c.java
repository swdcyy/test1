package ap3.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.report.LiveReportFragment;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.KwaiDialogFragment;

public final class c implements View$OnClickListener	// class@000292
{
    public final LiveReportFragment b;

    public void c(LiveReportFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.dismiss();
    }
}
