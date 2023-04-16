package cia.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cia.p;
import com.yxcorp.gifshow.follow.slide.detail.data.FollowSlideDetailGlobalParams;
import java.lang.Object;
import bia.c;

public class k extends Accessor	// class@00050d
{
    public final FollowSlideDetailGlobalParams c;
    public final p d;

    public void k(p p0,FollowSlideDetailGlobalParams p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mItemSelectState;
    }
    public void set(Object p0){
       this.c.mItemSelectState = p0;
    }
}
