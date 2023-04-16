package h22.a0;
import ok.x;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import java.lang.Object;
import com.kuaishou.live.common.core.component.follow.cache.c;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.String;
import java.lang.Boolean;

public final class a0 implements x	// class@002bea
{
    public final LiveTreasureBoxMessage$LiveTreasureBoxShow b;

    public void a0(LiveTreasureBoxMessage$LiveTreasureBoxShow p0){
       this.b = p0;
    }
    public final Object get(){
       a0 tb = this.b;
       boolean b = (tb.disableFollowShow != null && c.b().c(String.valueOf(tb.userInfo.userId)))? true: false;
       return Boolean.valueOf(b);
    }
}
