package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedForNewPanel$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedForNewPanel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import kotlin.jvm.internal.a;
import p5a.e;
import de5.a;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import java.lang.Float;

public final class OperationSpeedForNewPanel$1 extends Lambda implements a	// class@001487
{
    public final OperationSpeedForNewPanel this$0;

    public void OperationSpeedForNewPanel$1(OperationSpeedForNewPanel p0){
       this.this$0 = p0;
       super(0);
    }
    public final float invoke(){
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       OperationSpeedForNewPanel$1 obj = PatchProxy.apply(objArray, this, OperationSpeedForNewPanel$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.floatValue();
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, OperationSpeedForNewPanel.class, "4");
       if (obj1 != patchProxyRe) {
          f = obj1.floatValue();
       }else {
          OperationSpeedForNewPanel f1 = obj.F;
          a.o(f1, "mPlayModule");
          e player = f1.getPlayer();
          if (player != null) {
             IKwaiMediaPlayer iKwaiMediaPl = player.getIKwaiMediaPlayer();
             if (iKwaiMediaPl != null) {
                f = iKwaiMediaPl.getSpeed(0x3f800000);
             }
          }
          f = 0x3f800000;
       }
       return f;
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
