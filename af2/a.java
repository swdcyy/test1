package af2.a;
import af2.b;
import java.lang.Object;
import ok.x;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import java.lang.String;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import java.lang.Class;
import com.yxcorp.retrofit.e;

public final class a	// class@0000c5
{

    static {
    }
    public static b a(){
       return a.d();
    }
    public static b b(){
       return b.a.get();
    }
    public static String c(LiveProfileMode p0){
       if (p0 == LiveProfileMode.LITE_AUDIENCE_VIEW_OTHERS || p0 == LiveProfileMode.LITE_SPECIAL_ROLE) {
          return "/lite";
       }
       return "";
    }
    public static b d(){
       return e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), b.class);
    }
}
