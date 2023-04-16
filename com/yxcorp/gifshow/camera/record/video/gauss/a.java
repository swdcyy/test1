package com.yxcorp.gifshow.camera.record.video.gauss.a;
import qi9.o1;
import com.yxcorp.gifshow.camera.record.video.gauss.b;
import java.lang.Object;
import com.kwai.camerasdk.video.VideoFrame;
import java.util.Objects;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import x6b.f;
import vh9.a;
import java.lang.Runnable;
import ekd.k1;

public final class a implements o1	// class@000f85
{
    public final b a;
    public final int b;

    public void a(b p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(VideoFrame p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       Bitmap uBitmap = BitmapUtil.V(p0.bitmap, 100, Bitmap$Config.ARGB_8888);
       f.a(uBitmap, 0, 0, uBitmap.getWidth(), uBitmap.getHeight(), 0, 50);
       k1.o(new a(ta, this.b, uBitmap));
    }
}
