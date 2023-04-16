package ara.e$c;
import wc.c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;

public class e$c extends c	// class@0002cc
{
    public final ImageCallback a;

    public void e$c(ImageCallback p0){
       this.a = p0;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "2")) {
          return;
       }
       this.a.onCompletedBitmap(null);
       return;
    }
    public void onNewResultImpl(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
          return;
       }
       this.a.onCompletedBitmap(p0);
       return;
    }
}
