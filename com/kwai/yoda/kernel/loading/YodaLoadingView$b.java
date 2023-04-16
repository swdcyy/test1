package com.kwai.yoda.kernel.loading.YodaLoadingView$b;
import java.util.concurrent.Callable;
import com.kwai.yoda.kernel.loading.YodaLoadingView;
import wy7.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xa7.b;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public final class YodaLoadingView$b implements Callable	// class@0012ac
{
    public final YodaLoadingView b;
    public final b c;
    public final int d;
    public final String e;

    public void YodaLoadingView$b(YodaLoadingView p0,b p1,int p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object call(){
       b uob = PatchProxy.apply(null, this, YodaLoadingView$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          Context context = this.b.getContext();
          a.h(context, "context");
          View view = this.c.c(context);
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
          layoutParams.gravity = 17;
          view.setLayoutParams(layoutParams);
          this.b.getImgContainer().addView(view);
          this.c.e(this.d, this.e);
          uob = new b();
       }
       return uob;
    }
}
