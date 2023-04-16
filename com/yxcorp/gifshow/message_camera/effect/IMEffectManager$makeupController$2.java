package com.yxcorp.gifshow.message_camera.effect.IMEffectManager$makeupController$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.IMEffectManager;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n0c.a;
import h1c.c;

public final class IMEffectManager$makeupController$2 extends Lambda implements a	// class@001d87
{
    public final IMEffectManager this$0;

    public void IMEffectManager$makeupController$2(IMEffectManager p0){
       this.this$0 = p0;
       super(0);
    }
    public final IMMakeupController invoke(){
       Object obj = PatchProxy.apply(null, this, IMEffectManager$makeupController$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMMakeupController(this.this$0.c().e());
    }
    public Object invoke(){
       return this.invoke();
    }
}
