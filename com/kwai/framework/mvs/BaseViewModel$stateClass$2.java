package com.kwai.framework.mvs.BaseViewModel$stateClass$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.mvs.BaseViewModel;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BaseViewModel$stateClass$2 extends Lambda implements a	// class@001782
{
    public final BaseViewModel this$0;

    public void BaseViewModel$stateClass$2(BaseViewModel p0){
       this.this$0 = p0;
       super(0);
    }
    public final Class invoke(){
       Object obj = PatchProxy.apply(null, this, BaseViewModel$stateClass$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.h.getClass();
    }
    public Object invoke(){
       return this.invoke();
    }
}
