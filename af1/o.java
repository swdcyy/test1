package af1.o;
import ok.h;
import af1.x;
import java.lang.Object;
import df1.f;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import df1.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import df1.e;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;

public final class o implements h	// class@000079
{
    public final x b;

    public void o(x p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.applyOneRefs(p0, tb, x.class, "13");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else if(TextUtils.n(p0.h(), "highFrequency_multiLike_v2")){
          p0 = new e(p0.c);
       }
       return p0;
    }
}
