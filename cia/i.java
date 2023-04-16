package cia.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cia.p;
import com.yxcorp.gifshow.follow.slide.detail.data.FollowSlideDetailGlobalParams;
import java.lang.Object;
import java.lang.Integer;

public class i extends Accessor	// class@00050b
{
    public final FollowSlideDetailGlobalParams c;
    public final p d;

    public void i(p p0,FollowSlideDetailGlobalParams p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.mFollowVersion);
    }
}
