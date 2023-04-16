package h01.c;
import java.lang.Runnable;
import h01.e;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import java.lang.Object;
import java.util.Objects;

public final class c implements Runnable	// class@0025e4
{
    public final e b;
    public final LiveWealthGradeInfo c;

    public void c(e p0,LiveWealthGradeInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tb = this.b;
       Objects.requireNonNull(tb);
       tb.R8(this.c.mCurrentGrade, 2);
    }
}
