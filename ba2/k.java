package ba2.k;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.c$d;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import java.lang.Object;

public final class k implements Runnable	// class@00039a
{
    public final c$d b;
    public final LiveFancyRankResultViewV2 c;

    public void k(c$d p0,LiveFancyRankResultViewV2 p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.j(this.c);
    }
}
