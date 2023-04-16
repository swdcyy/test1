package mr1.k;
import z0.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.model.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import b61.b;

public final class k implements a	// class@0031fc
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public Object apply(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, k.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = b.a(p0.h);
       }
       return str;
    }
}
