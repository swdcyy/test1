package ax0.a$b;
import erd.g;
import ax0.a;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$LiveDisplayAnonymousInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mb1.a;
import kotlin.jvm.internal.a;
import hf3.a;

public final class a$b implements g	// class@0002c1
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          p0 = p0.mDisplayAnonymousInfoConfig;
          if (p0 != null && (p0.mEnableShowAnonymousInfo != null && (!TextUtils.x(p0.mAnonymousInfoKey) && !TextUtils.x(p0.mAnonymousInfoIv)))) {
             a$b tb = this.b;
             LiveUserStatusResponse$LiveDisplayAnonymousInfo mAnonymousIn = p0.mAnonymousInfoKey;
             a.o(mAnonymousIn, "_config.mAnonymousInfoKey");
             p0 = p0.mAnonymousInfoIv;
             a.o(p0, "_config.mAnonymousInfoIv");
             a k = this.b.K;
             if (k == null) {
                a.S("liveLongConnection");
             }
             tb.M = new a(mAnonymousIn, p0, "1A2B", k);
          }
       }
       return;
    }
}
