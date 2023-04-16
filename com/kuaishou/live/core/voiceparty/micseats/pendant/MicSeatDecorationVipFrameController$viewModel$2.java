package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameController;
import ts2.f;
import brd.t;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;

public final class MicSeatDecorationVipFrameController$viewModel$2 extends Lambda implements a	// class@001671
{
    public final t $decorationInfoObservable;
    public final f $micSeatStateService;
    public final MicSeatDecorationVipFrameController this$0;

    public void MicSeatDecorationVipFrameController$viewModel$2(MicSeatDecorationVipFrameController p0,f p1,t p2){
       this.this$0 = p0;
       this.$micSeatStateService = p1;
       this.$decorationInfoObservable = p2;
       super(0);
    }
    public final MicSeatDecorationVipFrameModel invoke(){
       Object obj = PatchProxy.apply(null, this, MicSeatDecorationVipFrameController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       MicSeatDecorationVipFrameController$viewModel$2 t$micSeatSta = this.$micSeatStateService;
       MicSeatDecorationVipFrameController$viewModel$2 t$decoration = this.$decorationInfoObservable;
       MicSeatDecorationVipFrameController$viewModel$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       boolean b = (tthis$0.m != MicSeatStyle.Video)? true: false;
       return new MicSeatDecorationVipFrameModel(t$micSeatSta, t$decoration, b);
    }
    public Object invoke(){
       return this.invoke();
    }
}
