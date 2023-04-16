package com.kwai.component.photo.detail.core.log.NonnullFieldDelegate$lock$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NonnullFieldDelegate$lock$2 extends Lambda implements a	// class@000a22
{
    public static final NonnullFieldDelegate$lock$2 INSTANCE;

    static {
       NonnullFieldDelegate$lock$2.INSTANCE = new NonnullFieldDelegate$lock$2();
    }
    public void NonnullFieldDelegate$lock$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ReentrantLock invoke(){
       Object obj = PatchProxy.apply(null, this, NonnullFieldDelegate$lock$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReentrantLock();
    }
}
