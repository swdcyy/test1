package com.yxcorp.gifshow.detail.util.d;
import wc.c;
import android.content.Context;
import com.yxcorp.gifshow.detail.util.e$a;
import kb.c;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import com.yxcorp.gifshow.detail.util.d$a;
import w4.j;

public class d extends c	// class@001a30
{
    public final Context a;
    public final e$a b;

    public void d(Context p0,e$a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onFailureImpl(c p0){
    }
    public void onNewResultImpl(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       if (p0 != null) {
          Bitmap uBitmap = Bitmap.createBitmap(150, 150, Bitmap$Config.ARGB_8888);
          Matrix matrix = new Matrix();
          matrix.setScale((150.00f / (float)p0.getWidth()), (150.00f / (float)p0.getHeight()));
          new Canvas(uBitmap).drawBitmap(p0, matrix, null);
          LottieTask lottieTask = a.i(this.a, "https://static.yximgs.com/udata/pkg/kwai-client-image/feed_lose_weight/emotion_ciya.json");
          lottieTask.addListener(new d$a(this, uBitmap, lottieTask));
       }
       return;
    }
}
