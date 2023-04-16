package h01.d;
import java.lang.Runnable;
import h01.e;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import java.lang.Object;
import java.util.Objects;

public final class d implements Runnable	// class@0025e5
{
    public final e b;
    public final LiveWealthGradeInfo c;

    public void d(e p0,LiveWealthGradeInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       tb.R8(this.c.mCurrentGrade, 1);
    }
}
