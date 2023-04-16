package er2.c;
import ok.o;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserInfo;

public final class c implements o	// class@0027b9
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b;
       if (p0 != null) {
          p0 = p0.userInfo;
          if (p0 != null && p0.user != null) {
             b = true;
          label_000f :
             return b;
          }
       }
       b = false;
       goto label_000f ;
    }
}
