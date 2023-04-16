package au4.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import au4.e;
import com.kuaishou.recruit.model.popularJob.RecruitPopularJobFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.ExtMeta;

public class b extends Accessor	// class@000308
{
    public final RecruitPopularJobFeed c;
    public final e d;

    public void b(e p0,RecruitPopularJobFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mExtMeta;
    }
    public void set(Object p0){
       this.c.mExtMeta = p0;
    }
}
