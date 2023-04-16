package er2.b;
import ok.h;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.String;

public final class b implements h	// class@0027b8
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       return String.valueOf(p0.userInfo.user.userId);
    }
}
