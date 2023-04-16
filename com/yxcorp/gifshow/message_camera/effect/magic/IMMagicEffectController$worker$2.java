package com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$worker$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kib.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kib.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.worker.Worker;

public final class IMMagicEffectController$worker$2 extends Lambda implements a	// class@001d92
{
    public static final IMMagicEffectController$worker$2 INSTANCE;

    static {
       IMMagicEffectController$worker$2.INSTANCE = new IMMagicEffectController$worker$2();
    }
    public void IMMagicEffectController$worker$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, IMMagicEffectController$worker$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Worker worker = PatchProxy.applyOneRefs("MagicEffectController", objArray, c.class, "1");
       if (worker != patchProxyRe) {
       }else {
          a.p("MagicEffectController", "name");
          worker = new Worker("MagicEffectController");
       }
       return worker;
    }
}
