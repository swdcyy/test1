package ac2.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ac2.e;
import com.kuaishou.live.core.show.luckystar.currentinfo.LiveLuckyStarCurrentInfoFragment;
import java.lang.Object;
import java.lang.Runnable;

public class b extends Accessor	// class@0000ac
{
    public final LiveLuckyStarCurrentInfoFragment c;
    public final e d;

    public void b(e p0,LiveLuckyStarCurrentInfoFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.v;
    }
    public void set(Object p0){
       this.c.v = p0;
    }
}
