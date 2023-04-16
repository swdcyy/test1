package ei1.a;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import java.lang.Throwable;
import java.lang.String;
import com.kuaishou.live.core.show.gift.GiftMessage;

public interface abstract a	// class@00216e
{

    void a(LiveSendGiftBaseTraceInfo p0,boolean p1,Throwable p2);
    void b(LiveSendGiftBaseTraceInfo p0,boolean p1,int p2,int p3,String p4);
    void c(GiftMessage p0);
}
