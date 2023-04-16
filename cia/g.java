package cia.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cia.p;
import com.yxcorp.gifshow.follow.slide.detail.data.FollowSlideDetailGlobalParams;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class g extends Accessor	// class@000509
{
    public final FollowSlideDetailGlobalParams c;
    public final p d;

    public void g(p p0,FollowSlideDetailGlobalParams p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mCreateTimeState;
    }
    public void set(Object p0){
       this.c.mCreateTimeState = p0;
    }
}
