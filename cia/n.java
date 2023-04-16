package cia.n;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cia.p;
import com.yxcorp.gifshow.follow.slide.detail.data.FollowSlideDetailGlobalParams;
import java.lang.Object;

public class n extends Accessor	// class@000510
{
    public final FollowSlideDetailGlobalParams c;
    public final p d;

    public void n(p p0,FollowSlideDetailGlobalParams p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mPymiContainerCollapseObservableData;
    }
}
