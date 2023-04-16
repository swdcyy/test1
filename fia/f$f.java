package fia.f$f;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse$PymiTipModel;

public final class f$f implements o	// class@002901
{
    public static final f$f b;

    static {
       f$f.b = new f$f();
    }
    public void f$f(){
       super();
    }
    public Object apply(Object p0){
       PymiTipsShowResponse$PymiTipModel pymiTipModel = PatchProxy.applyOneRefs(p0, this, f$f.class, "1");
       if (pymiTipModel != PatchProxyResult.class) {
       }else {
          a.p(p0, "pymiTipsShowResponse");
          pymiTipModel = p0.mPymiUserBar.mInfos;
       }
       return pymiTipModel;
    }
}
