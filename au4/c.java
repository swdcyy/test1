package au4.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import au4.e;
import com.kuaishou.recruit.model.popularJob.RecruitPopularJobFeed;
import java.lang.Object;
import com.kuaishou.recruit.model.popularJob.RecruitPopularJobInfo;

public class c extends Accessor	// class@000309
{
    public final RecruitPopularJobFeed c;
    public final e d;

    public void c(e p0,RecruitPopularJobFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mSelectJobInfo;
    }
    public void set(Object p0){
       this.c.mSelectJobInfo = p0;
    }
}
