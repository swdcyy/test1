package m29.a;
import mf5.v0$a;
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
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.commercial.photoreduce.a$a;
import m29.b;
import java.util.Collection;

public final class a extends v0$a	// class@002de5
{
    public final QPhoto a;
    public final Activity b;
    public final DislikeViewModel c;
    public final List d;

    public void a(QPhoto p0,Activity p1,DislikeViewModel p2,List p3){
       a.p(p0, "qPhoto");
       a.p(p3, "reasonList");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public List a(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          b uob = new b(this.a, this.b, obj1, this.c, String.valueOf(obj1.a));
          uArrayList.add(v2);
       }
       return uArrayList;
    }
}
