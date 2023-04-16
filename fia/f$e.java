package fia.f$e;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse$PymiTipModel;
import java.util.Collection;
import ekd.q;

public final class f$e implements r	// class@002900
{
    public static final f$e b;

    static {
       f$e.b = new f$e();
    }
    public void f$e(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, f$e.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "pymiTipsShowResponse");
          p0 = p0.mPymiUserBar;
          b = (p0 != null && !q.f(p0.mInfos))? true: false;
       }
       return b;
    }
}
