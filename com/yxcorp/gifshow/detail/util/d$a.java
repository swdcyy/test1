package com.yxcorp.gifshow.detail.util.d$a;
import w4.j;
import com.yxcorp.gifshow.detail.util.d;
import android.graphics.Bitmap;
import com.airbnb.lottie.LottieTask;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import w4.i;
import com.yxcorp.gifshow.detail.util.e$a;
import com.yxcorp.gifshow.detail.util.e$b;

public class d$a implements j	// class@001a2f
{
    public final Bitmap a;
    public final LottieTask b;
    public final d c;

    public void d$a(d p0,Bitmap p1,LottieTask p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else {
          Iterator iterator = p0.g().values().iterator();
          while (iterator.hasNext()) {
             iterator.next().f(this.a);
          }
          e$a d = this.c.b.d;
          if (d != null) {
             d.a(p0);
          }
          this.b.removeListener(this);
       }
       return;
    }
}
