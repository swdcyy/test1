package ai8.b;
import erd.o;
import com.mini.rxintentapi.b;
import android.content.Intent;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import ai8.c;
import java.util.Objects;
import com.mini.rxintentapi.RxIntentApiFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import androidx.fragment.app.Fragment;
import java.lang.RuntimeException;

public final class b implements o	// class@0000a4
{
    public final b b;
    public final int c;
    public final Intent d;

    public void b(b p0,int p1,Intent p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       c obj;
       p0 = this.b;
       b tc = this.c;
       b td = this.d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c a = p0.d.a;
       Objects.requireNonNull(a);
       if (PatchProxy.isSupport(RxIntentApiFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(tc), a, RxIntentApiFragment.class, "3");
          if (obj != patchProxyRe) {
          label_0035 :
             if (obj == null) {
                PublishSubject publishSubje = PublishSubject.g();
                obj = p0.d.a;
                Objects.requireNonNull(obj);
                if (PatchProxy.isSupport(RxIntentApiFragment.class) && PatchProxy.applyTwoRefs(Integer.valueOf(tc), publishSubje, obj, RxIntentApiFragment.class, "4") != patchProxyRe) {
                }else {
                   PublishSubject publishSubje1 = obj.b.put(Integer.valueOf(tc), publishSubje);
                }
                p0 = p0.d;
                Objects.requireNonNull(p0);
                c uoc = c.class;
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(td, Integer.valueOf(tc), p0, uoc, "5")) {
                   p0.a.startActivityForResult(td, tc);
                }
                return publishSubje;
             }else {
                throw new RuntimeException("duplicate request");
             }
          }
       }
       obj = a.b.get(Integer.valueOf(tc));
       goto label_0035 ;
    }
}
