package nn1.i;
import androidx.lifecycle.Observer;
import nn1.m;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class i implements Observer	// class@003388
{
    public final m b;

    public void i(m p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else if(p0 != null){
          this.b.a.U(p0);
       }
       return;
    }
}
