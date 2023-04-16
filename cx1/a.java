package cx1.a;
import java.lang.String;
import yw1.a;
import brd.t;
import com.kuaishou.live.common.core.component.redpacket.model.LiveRedPacketActivityTokenResponse;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.util.Map;

public interface abstract a	// class@001e9b
{

    void a(int p0,String p1);
    void b(int p0,String p1,a p2);
    t c(int p0,String p1,int p2,boolean p3);
    LiveRedPacketActivityTokenResponse d(String p0);
    void e(String p0,boolean p1,UserInfos$PicUrl[] p2,String p3,Map p4);
    Map f(String p0);
}
