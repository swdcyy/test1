package com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$faceMagicLoadEffectFailedListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$faceMagicLoadEffectFailedListener$2$a;

public final class IMFilterController$faceMagicLoadEffectFailedListener$2 extends Lambda implements a	// class@001dc8
{
    public final IMFilterController this$0;

    public void IMFilterController$faceMagicLoadEffectFailedListener$2(IMFilterController p0){
       this.this$0 = p0;
       super(0);
    }
    public final FaceMagicController$FaceMagicLoadEffectFailedListener invoke(){
       Object obj = PatchProxy.apply(null, this, IMFilterController$faceMagicLoadEffectFailedListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMFilterController$faceMagicLoadEffectFailedListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
