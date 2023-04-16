package cia.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cia.p;
import com.yxcorp.gifshow.follow.slide.detail.data.FollowSlideDetailGlobalParams;
import java.lang.Object;
import bia.g;

public class d extends Accessor	// class@000506
{
    public final FollowSlideDetailGlobalParams c;
    public final p d;

    public void d(p p0,FollowSlideDetailGlobalParams p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mSwipeProfileState;
    }
    public void set(Object p0){
       this.c.mSwipeProfileState = p0;
    }
}
