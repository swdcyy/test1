package l3.i$b;
import z0.a;
import l3.i;
import java.lang.Object;
import java.util.List;
import androidx.work.WorkInfo;
import u3.r$c;

public class i$b implements a	// class@002507
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public WorkInfo a(List p0){
       WorkInfo workInfo = (p0 != null && p0.size() > 0)? p0.get(0).a(): null;
       return workInfo;
    }
    public Object apply(Object p0){
       return this.a(p0);
    }
}
