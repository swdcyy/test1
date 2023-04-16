package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView$b;
import w4.b;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.String;
import android.graphics.Typeface;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zsd.u;
import android.content.Context;
import android.widget.ImageView;
import kotlin.jvm.internal.a;
import android.content.res.AssetManager;

public final class ThanosPlayMixLottieEndView$b extends b	// class@0015f5
{
    public final LottieAnimationView a;

    public void ThanosPlayMixLottieEndView$b(LottieAnimationView p0){
       this.a = p0;
       super();
    }
    public Typeface a(String p0){
       Typeface typeface;
       Object obj = PatchProxy.applyOneRefs(p0, this, ThanosPlayMixLottieEndView$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (u.J1(p0, "Alte-din", false, 2, null)) {
          Context context = this.a.getContext();
          a.o(context, "context");
          typeface = Typeface.createFromAsset(context.getAssets(), "alte-din.ttf");
       }else {
          typeface = Typeface.create(p0, false);
       }
       a.o(typeface, "if \(fontFamily.equals\(\"A¡­eface.NORMAL\)\n          }");
       return typeface;
    }
}
