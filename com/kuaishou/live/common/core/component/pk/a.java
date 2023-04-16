package com.kuaishou.live.common.core.component.pk.a;
import w4.j;
import java.io.FileInputStream;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import java.lang.Object;
import w4.e;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import hw1.d;
import w4.c;
import android.widget.ImageView;

public final class a implements j	// class@001731
{
    public final FileInputStream a;
    public final LottieAnimationView b;
    public final LivePkResource$PkSkinResource c;
    public final boolean d;
    public final boolean e;

    public void a(FileInputStream p0,LottieAnimationView p1,LivePkResource$PkSkinResource p2,boolean p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final void onResult(Object p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       this.a.close();
       tb.setComposition(p0);
       if (tc.mLottieImageResFolderPath != null) {
          tb.setImageAssetDelegate(new d(tc));
       }
       if (td != null) {
          tb.setVisibility(0);
          tb.s();
          if (te != null) {
             tb.setRepeatCount(-1);
          }
       }
       return;
    }
}
