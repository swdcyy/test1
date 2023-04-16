package au4.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.recruit.model.popularJob.RecruitPopularJobFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import au4.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.mix.ExtMeta;
import au4.b;
import com.kuaishou.recruit.model.popularJob.RecruitPopularJobInfo;
import au4.c;
import au4.d;
import mm8.a;

public final class e implements b	// class@00030b
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(CommonMeta.class, new a(this, p1));
       p0.h(ExtMeta.class, new b(this, p1));
       RecruitPopularJobInfo recruitPopul = RecruitPopularJobInfo.class;
       c uoc = new c(this, p1);
       try{
          p0.h(recruitPopul, uoc);
          p0.h(RecruitPopularJobFeed.class, new d(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
