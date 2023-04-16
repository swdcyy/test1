package com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper$config$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class KrnLocationHelper$config$2 extends Lambda implements a	// class@00138a
{
    public static final KrnLocationHelper$config$2 INSTANCE;

    static {
       KrnLocationHelper$config$2.INSTANCE = new KrnLocationHelper$config$2();
    }
    public void KrnLocationHelper$config$2(){
       super(0);
    }
    public final KrnLocationHelper$b invoke(){
       Object obj = PatchProxy.apply(null, this, KrnLocationHelper$config$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("KrnLocationConfig", KrnLocationHelper$b.class, new KrnLocationHelper$b());
    }
    public Object invoke(){
       return this.invoke();
    }
}
