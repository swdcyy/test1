package com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget$b;
import vb5.a;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import jd.a;

public final class LiveMultiVideoSceneAudioWidget$b extends a	// class@000f1b
{

    public void LiveMultiVideoSceneAudioWidget$b(int p0){
       super(p0);
    }
    public void e(Bitmap p0,Bitmap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiVideoSceneAudioWidget$b.class, "1")) {
          return;
       }
       a.p(p0, "destBitmap");
       a.p(p1, "sourceBitmap");
       if (p1.hasAlpha()) {
          p0.eraseColor(-1);
          new Canvas(p0).drawBitmap(p1, 0, 0, null);
          this.d(p0);
       }else {
          super.e(p0, p1);
       }
       return;
    }
}
