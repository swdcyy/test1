package ap3.d;
import java.lang.Runnable;
import com.kuaishou.live.report.LiveReportFragment;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment;

public final class d implements Runnable	// class@000293
{
    public final LiveReportFragment b;
    public final c c;
    public final String d;

    public void d(LiveReportFragment p0,c p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.Cb(this.c, this.d);
    }
}
