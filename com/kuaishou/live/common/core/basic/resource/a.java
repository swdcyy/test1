package com.kuaishou.live.common.core.basic.resource.a;
import w4.j;
import java.io.FileInputStream;
import com.airbnb.lottie.LottieAnimationView;
import ia1.b;
import com.kuaishou.live.common.core.basic.resource.c$b;
import java.lang.Object;
import w4.e;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import ia1.c;
import w4.c;
import android.widget.ImageView;

public final class a implements j	// class@000ebd
{
    public final FileInputStream a;
    public final LottieAnimationView b;
    public final b c;
    public final c$b d;
    public final boolean e;

    public void a(FileInputStream p0,LottieAnimationView p1,b p2,c$b p3,boolean p4){
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
       if (tc.d()) {
          tb.setImageAssetDelegate(new c(tc));
       }
       if (td != null) {
          td.a();
       }
       if (te != null) {
          tb.setVisibility(0);
          tb.s();
       }
       return;
    }
}
