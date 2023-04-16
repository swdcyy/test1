package ik1.p;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.gift.i$a;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import java.lang.Object;
import eg1.e;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.util.Set;
import java.lang.Class;
import lp3.c;
import lp3.i;
import pz2.c;
import ii1.a;
import g03.a;
import sz2.c;

public final class p implements Runnable	// class@002935
{
    public final i$a b;
    public final BroadcastGiftMessage c;

    public void p(i$a p0,BroadcastGiftMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       p tb = this.b;
       p tc = this.c;
       e uoe = e.class;
       tb.a.M.add(tc.mMergeKey);
       boolean i = 0x7ffffbb3;
       tc.mRank = i;
       c uoc = tb.a.F.a(uoe).H();
       i = (uoc == null || uoc.z() < i)? true: false;
       tb.a.F.a(uoe).o1(new a(tc, i, tb.a.G.Bl()));
       return;
    }
}
