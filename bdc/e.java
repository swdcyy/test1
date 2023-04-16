package bdc.e;
import ok.o;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class e implements o	// class@000455
{
    public final String b;

    public void e(String p0){
       this.b = p0;
       super();
    }
    public boolean apply(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.m(p0);
          b = TextUtils.n(r1.t1(p0.mEntity), this.b);
       }
       return b;
    }
}
