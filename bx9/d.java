package bx9.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bx9.g;
import bx9.i$c;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;

public class d extends Accessor	// class@0004fe
{
    public final i$c c;
    public final g d;

    public void d(g p0,i$c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
