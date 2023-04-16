package ac2.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ac2.e;
import com.kuaishou.live.core.show.luckystar.currentinfo.LiveLuckyStarCurrentInfoFragment;
import java.lang.Object;
import com.google.common.base.Optional;

public class c extends Accessor	// class@0000ad
{
    public final LiveLuckyStarCurrentInfoFragment c;
    public final e d;

    public void c(e p0,LiveLuckyStarCurrentInfoFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.u;
    }
    public void set(Object p0){
       this.c.u = p0;
    }
}
