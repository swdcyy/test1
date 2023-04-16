package nn1.e;
import androidx.lifecycle.Observer;
import nn1.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class e implements Observer	// class@003380
{
    public final g b;

    public void e(g p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          this.b.d.U(p0);
       }
       return;
    }
}
