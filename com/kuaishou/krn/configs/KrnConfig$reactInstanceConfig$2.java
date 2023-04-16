package com.kuaishou.krn.configs.KrnConfig$reactInstanceConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import kj0.f;
import java.lang.Object;
import sj0.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import javax.inject.Provider;

public final class KrnConfig$reactInstanceConfig$2 extends Lambda implements a	// class@00084f
{
    public final f this$0;

    public void KrnConfig$reactInstanceConfig$2(f p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, KrnConfig$reactInstanceConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.f.get();
    }
}
