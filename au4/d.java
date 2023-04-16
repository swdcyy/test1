package au4.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import au4.e;
import com.kuaishou.recruit.model.popularJob.RecruitPopularJobFeed;
import java.lang.Object;

public class d extends Accessor	// class@00030a
{
    public final RecruitPopularJobFeed c;
    public final e d;

    public void d(e p0,RecruitPopularJobFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c;
    }
}
