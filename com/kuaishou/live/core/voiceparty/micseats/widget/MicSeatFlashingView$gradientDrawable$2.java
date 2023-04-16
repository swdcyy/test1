package com.kuaishou.live.core.voiceparty.micseats.widget.MicSeatFlashingView$gradientDrawable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.widget.MicSeatFlashingView;
import android.graphics.drawable.GradientDrawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MicSeatFlashingView$gradientDrawable$2 extends Lambda implements a	// class@00177e
{
    public final MicSeatFlashingView this$0;

    public void MicSeatFlashingView$gradientDrawable$2(MicSeatFlashingView p0){
       this.this$0 = p0;
       super(0);
    }
    public final GradientDrawable invoke(){
       MicSeatFlashingView$gradientDrawable$2 tthis$0;
       GradientDrawable obj = PatchProxy.apply(null, this, MicSeatFlashingView$gradientDrawable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GradientDrawable();
       int[] ointArray = new int[]{tthis$0.c,tthis$0.e};
       tthis$0 = this.this$0;
       obj.setColors(ointArray);
       obj.setGradientType(1);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
