package hn1.i;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class i implements Observer	// class@002736
{
    public final KwaiImageView b;

    public void i(KwaiImageView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          this.b.U(p0);
       }
       return;
    }
}
