package ej9.d;
import erd.g;
import ej9.g$a;
import java.lang.Object;
import com.yxcorp.gifshow.util.cdnresource.CdnResource;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.CharSequence;
import e17.i;
import java.util.Objects;
import ej9.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Map;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.utility.Log;

public final class d implements g	// class@002164
{
    public final g$a b;

    public void d(g$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       tb.i = 2;
       tb.a();
       if (tb.h != null) {
          i.d(R.style.arg_RES_7f11066a, "资源ID 为 "+tb.a+"的资源加载完成");
       }
       g$a f = tb.f;
       g$a g = tb.g;
       g$a a = tb.a;
       Objects.requireNonNull(f);
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(g), a, p0, f, g.class, "9")) {
          f.c.put(a, p0);
          f.a.remove(a);
          if (g != null) {
             f.e = null;
             f.h();
          }
          f.d.onNext(a);
          Log.d("FeedResourceManagerImpl", "CDN资源已加载 : resourceId = "+a);
       }
       return;
    }
}
