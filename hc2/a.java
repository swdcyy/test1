package hc2.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import hc2.c;
import com.kuaishou.live.core.show.luckystar.v2.currentinfo.LiveLuckyStarCurrentInfoFragmentV2;
import java.lang.Object;
import com.google.common.base.Optional;

public class a extends Accessor	// class@002d56
{
    public final LiveLuckyStarCurrentInfoFragmentV2 c;
    public final c d;

    public void a(c p0,LiveLuckyStarCurrentInfoFragmentV2 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.D;
    }
    public void set(Object p0){
       this.c.D = p0;
    }
}
