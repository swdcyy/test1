package no1.c$a;
import com.kuaishou.live.common.core.component.line.matching.LiveLineMatchingUser;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatInvite;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatReady;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatMatched;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatEnd;
import java.nio.ByteBuffer;

public interface abstract c$a	// class@003398
{

    void a();
    void b(LiveLineMatchingUser p0);
    void c(LiveLineChatMessages$SCLiveLineChatInvite p0);
    void d(LiveLineChatMessages$SCLiveLineChatReady p0);
    void e(LiveLineChatMessages$SCLiveLineChatMatched p0);
    void f();
    void g(LiveLineChatMessages$SCLiveLineChatEnd p0);
    void h(ByteBuffer p0,int p1,int p2,int p3);
}
