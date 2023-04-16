package com.kuaishou.tuna_core.multi_web_page.fragment.TunaMultiWebFragment$onCreate$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaMultiWebFragment$onCreate$3 extends Lambda implements a	// class@0010e8
{
    public final String $stack;

    public void TunaMultiWebFragment$onCreate$3(String p0){
       this.$stack = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaMultiWebFragment$onCreate$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TunaMultiWebViewActivity onFinish stack:"+this.$stack;
    }
}
