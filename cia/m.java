package cia.m;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cia.p;
import com.yxcorp.gifshow.follow.slide.detail.data.FollowSlideDetailGlobalParams;
import java.lang.Object;
import java.lang.Boolean;

public class m extends Accessor	// class@00050f
{
    public final FollowSlideDetailGlobalParams c;
    public final p d;

    public void m(p p0,FollowSlideDetailGlobalParams p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.mLiveTipsShow);
    }
    public void set(Object p0){
       this.c.mLiveTipsShow = p0.booleanValue();
    }
}
