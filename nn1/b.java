package nn1.b;
import androidx.lifecycle.Observer;
import nn1.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class b implements Observer	// class@00337d
{
    public final g b;

    public void b(g p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          this.b.a.U(p0);
       }
       return;
    }
}
