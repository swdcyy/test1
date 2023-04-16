package com.kwai.sdk.eve.internal.inference.internal.DelegateExecutableAtomic$callback$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;

public final class DelegateExecutableAtomic$callback$2 extends Lambda implements a	// class@00156a
{
    public static final DelegateExecutableAtomic$callback$2 INSTANCE;

    static {
       DelegateExecutableAtomic$callback$2.INSTANCE = new DelegateExecutableAtomic$callback$2();
    }
    public void DelegateExecutableAtomic$callback$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object obj = PatchProxy.apply(null, this, DelegateExecutableAtomic$callback$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
}
