package com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements$a;
import w4.j;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater;
import ho2.k;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Animatable;
import ho2.j;
import ho2.a;

public final class Inflater$InitElements$a implements j	// class@001350
{
    public final Inflater$InitElements a;
    public final LottieAnimationView b;
    public final Ref$IntRef c;
    public final Ref$IntRef d;

    public void Inflater$InitElements$a(Inflater$InitElements p0,LottieAnimationView p1,Ref$IntRef p2,Ref$IntRef p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onResult(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, Inflater$InitElements$a.class, str)) {
       }else {
          this.b.setComposition(p0);
          this.b.setRepeatMode(this.c.element);
          this.b.setRepeatCount(this.d.element);
          this.b.setVisibility(0);
          this.b.s();
          p0 = this.a.b.a;
          Inflater$InitElements$a tb = this.b;
          j oj = PatchProxy.applyOneRefs(tb, null, k.class, str);
          if (oj != PatchProxyResult.class) {
          }else {
             oj = new j(tb);
          }
          p0.a(oj);
       }
       return;
    }
}
