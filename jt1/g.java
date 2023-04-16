package jt1.g;
import androidx.lifecycle.Observer;
import jt1.i;
import java.lang.Object;
import pu1.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import ht1.a;

public final class g implements Observer	// class@002c0a
{
    public final i b;

    public void g(i p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          g tb = this.b;
          a.o(p0, "it");
          tb.a(tb.b, p0, this.b.e);
       }
       return;
    }
}
