package m29.c;
import mf5.s0$a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import lf5.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.commercial.photoreduce.a$a;
import m29.b;

public final class c extends s0$a	// class@002de7
{
    public final QPhoto a;
    public final Activity b;
    public final DislikeViewModel c;
    public final List d;

    public void c(QPhoto p0,Activity p1,DislikeViewModel p2,List p3){
       a.p(p0, "photo");
       a.p(p3, "reasonList");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new c());
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          b uob = new b(this.a, this.b, obj1, this.c, String.valueOf(obj1.a));
          obj.add(v2);
       }
       return obj;
    }
}
