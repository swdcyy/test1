package g7a.m0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g7a.s0;
import g7a.j0;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class m0 extends Accessor	// class@0023eb
{
    public final j0 c;
    public final s0 d;

    public void m0(s0 p0,j0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
