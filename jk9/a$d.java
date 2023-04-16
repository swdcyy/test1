package jk9.a$d;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import jk9.a;
import mrd.a;
import com.kwai.component.bifrost.res.BifrostImageResourceEntry;
import android.content.Context;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m0d.l;
import lnc.i3;
import com.kwai.component.bifrost.res.BifrostCommonResourceEntry;
import yca.a;
import kotlin.jvm.internal.a;
import yca.a$a;
import android.graphics.Bitmap;

public final class a$d implements ImageCallback	// class@002af3
{
    public final a b;
    public final int c;
    public final a d;
    public final BifrostImageResourceEntry e;
    public final Context f;

    public void a$d(a p0,int p1,a p2,BifrostImageResourceEntry p3,Context p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
          return;
       }
       l.a(this, p0);
       if (p0 != null) {
          p0.setBounds(0, 0, this.c, this.c);
          this.d.onNext(p0);
       }else {
          i3 oi3 = i3.f();
          oi3.d("urls", this.e.getUrl());
          String str = oi3.e();
          a.o(str, "sceneInfo");
          a.d.b("comment_tail_image", "image_download_error", str);
          this.d.onNext(this.b.a(this.f));
       }
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
