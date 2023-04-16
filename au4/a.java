package au4.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import au4.e;
import com.kuaishou.recruit.model.popularJob.RecruitPopularJobFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CommonMeta;

public class a extends Accessor	// class@000307
{
    public final RecruitPopularJobFeed c;
    public final e d;

    public void a(e p0,RecruitPopularJobFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mCommonMeta;
    }
    public void set(Object p0){
       this.c.mCommonMeta = p0;
    }
}
