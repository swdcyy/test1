package com.kwai.sdk.eve.internal.inference.EveExecutableAtomic$idHash$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.inference.EveExecutableAtomic;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.lang.Integer;

public final class EveExecutableAtomic$idHash$2 extends Lambda implements a	// class@001543
{
    public final EveExecutableAtomic this$0;

    public void EveExecutableAtomic$idHash$2(EveExecutableAtomic p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, EveExecutableAtomic$idHash$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Integer.toHexString(System.identityHashCode(this.this$0));
    }
}
