package cm0.c;
import y00.a;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionNotice;

public final class c implements a	// class@0004e2
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       return LiveAdSocialMessages$LiveAdSocialConversionNotice.parseFrom(p0);
    }
}
