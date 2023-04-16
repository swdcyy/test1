package com.yxcorp.gifshow.message_camera.effect.IMEffectManager$magicController$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IMEffectManager$magicController$2 extends Lambda implements a	// class@001d86
{
    public static final IMEffectManager$magicController$2 INSTANCE;

    static {
       IMEffectManager$magicController$2.INSTANCE = new IMEffectManager$magicController$2();
    }
    public void IMEffectManager$magicController$2(){
       super(0);
    }
    public final IMMagicEffectController invoke(){
       Object obj = PatchProxy.apply(null, this, IMEffectManager$magicController$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMMagicEffectController();
    }
    public Object invoke(){
       return this.invoke();
    }
}
