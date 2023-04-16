package com.kuaishou.tuna_core.multi_web_page.TunaMultiWebViewActivity$finish$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaMultiWebViewActivity$finish$1 extends Lambda implements a	// class@0010e4
{
    public final String $stack;

    public void TunaMultiWebViewActivity$finish$1(String p0){
       this.$stack = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaMultiWebViewActivity$finish$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TunaMultiWebViewActivity onFinish stack:"+this.$stack;
    }
}
