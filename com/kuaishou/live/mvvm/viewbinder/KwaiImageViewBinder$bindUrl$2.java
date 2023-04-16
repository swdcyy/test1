package com.kuaishou.live.mvvm.viewbinder.KwaiImageViewBinder$bindUrl$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import android.net.Uri;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KwaiImageViewBinder$bindUrl$2 extends Lambda implements l	// class@000d0f
{
    public static final KwaiImageViewBinder$bindUrl$2 INSTANCE;

    static {
       KwaiImageViewBinder$bindUrl$2.INSTANCE = new KwaiImageViewBinder$bindUrl$2();
    }
    public void KwaiImageViewBinder$bindUrl$2(){
       super(1);
    }
    public final Uri invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiImageViewBinder$bindUrl$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       Uri uri = Uri.parse(p0);
       a.o(uri, "Uri.parse\(it\)");
       return uri;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
