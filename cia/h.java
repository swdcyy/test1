package cia.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cia.p;
import com.yxcorp.gifshow.follow.slide.detail.data.FollowSlideDetailGlobalParams;
import java.lang.Object;

public class h extends Accessor	// class@00050a
{
    public final FollowSlideDetailGlobalParams c;
    public final p d;

    public void h(p p0,FollowSlideDetailGlobalParams p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mFollowScreenState;
    }
}
