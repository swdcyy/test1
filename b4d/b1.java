package b4d.b1;
import wc.c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;

public class b1 extends c	// class@000358
{
    public final ImageCallback a;

    public void b1(ImageCallback p0){
       this.a = p0;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "2")) {
          return;
       }
       this.a.onCompletedBitmap(null);
       return;
    }
    public void onNewResultImpl(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "1")) {
          return;
       }
       p0 = (p0 == null || p0.isRecycled())? null: p0.copy(p0.getConfig(), false);
       this.a.onCompletedBitmap(p0);
       return;
    }
}
