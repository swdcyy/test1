package en9.c;
import yv8.a;
import java.lang.Object;
import com.yxcorp.gifshow.action.model.RealActionFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class c implements a	// class@002220
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final boolean a(RealActionFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.x(p0.mSubBizTag);
    }
}
