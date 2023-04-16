package cm0.d;
import y00.a;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionState;

public final class d implements a	// class@0004e3
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       return LiveAdSocialMessages$LiveAdSocialConversionState.parseFrom(p0);
    }
}
