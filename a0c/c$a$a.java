package a0c.c$a$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import a0c.c$a;
import brd.v;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;
import a0c.g;
import java.lang.StringBuilder;
import java.io.File;
import q87.c;
import java.lang.Throwable;
import android.graphics.Bitmap;
import m0d.l;

public final class c$a$a implements ImageCallback	// class@000008
{
    public final c$a b;
    public final v c;

    public void c$a$a(c$a p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.c.onNext(p0);
          this.c.onComplete();
       }else {
          Object[] objArray = new Object[0];
          g.C().t("home_entrance_bubble", "fetchImage error, path:"+this.b.b.getAbsolutePath(), objArray);
          this.c.onError(new Throwable("empty image file"));
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
