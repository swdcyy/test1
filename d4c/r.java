package d4c.r;
import erd.g;
import d4c.v;
import java.lang.Object;
import java.lang.Long;
import kob.r;
import android.widget.ProgressBar;

public final class r implements g	// class@0020db
{
    public final v b;

    public void r(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       tb.u.setMax((int)tb.D.m());
       tb.u.setProgress((int)tb.D.getCurrentPosition());
    }
}
