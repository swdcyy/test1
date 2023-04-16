package e09.a;
import a09.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import mxb.c;

public final class a extends a	// class@002110
{

    public void a(){
       super();
    }
    public boolean S8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != patchProxyRe) {
       }else {
          obj = this.p;
          if (obj == null) {
             a.S("mPhoto");
          }
       }
       return c.W(k.B(obj));
    }
    public int W8(){
       return 0x7f0a3698;
    }
}
