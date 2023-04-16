package gsa.i$b;
import ub.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class i$b extends a	// class@002bf0
{
    public final KwaiImageView b;
    public final String c;
    public final Object d;

    public void i$b(KwaiImageView p0,String p1,Object p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$b.class, "1")) {
          return;
       }
       this.b.M(this.c, this.d);
       return;
    }
}
