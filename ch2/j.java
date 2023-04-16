package ch2.j;
import java.lang.Runnable;
import com.kuaishou.live.core.show.redpacket.krn.l;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.util.List;
import com.kuaishou.android.live.log.b;
import io.reactivex.subjects.PublishSubject;

public final class j implements Runnable	// class@00053b
{
    public final l b;
    public final String c;

    public void j(l p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       j tb = this.b;
       j tc = this.c;
       if (!tb.p.containsKey(tc)) {
       }else {
          b.S(l.v, "removeShowingRedPacket", "redPacketId", tc);
          tb.p.remove(tc);
          tb.r.onNext(tb.p);
       }
       return;
    }
}
