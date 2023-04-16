package iz9.b$b;
import erd.g;
import iz9.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.Objects;
import uw9.o;
import q87.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import brd.y;

public final class b$b implements g	// class@0028d8
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       b$b uob = b$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uob, "1")) {
          String str = "notifyLoading";
          if (b) {
             b = this.b;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(str, b, b.class, "8")) {
                if (b.z == null) {
                   b.z = true;
                   Object[] objArray = new Object[0];
                   o.C().s("PlayLoadingElement", "startLoading notifyLoading", objArray);
                }
                b.q0("startLoading");
                b v = b.v;
                if (v == null || v.getBizType() != 4) {
                   v = b.v;
                   if (v == null || v.getBizType() != 5) {
                   label_006e :
                      return;
                   }
                }
                b = b.y;
                if (b != null) {
                   b.onNext(Boolean.TRUE);
                   goto label_006e ;
                }else {
                   goto label_006e ;
                }
             }
          }else {
             this.b.o0(str);
             goto label_006e ;
          }
       }
    }
}
