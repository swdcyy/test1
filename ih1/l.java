package ih1.l;
import java.lang.Object;
import cm1.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.Boolean;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import em1.b;
import java.util.Objects;
import cm1.b;
import kotlin.jvm.internal.a;

public final class l	// class@0028eb
{
    public final a a;
    public final boolean b;

    public void l(){
       super(false);
    }
    public void l(boolean p0){
       super();
       this.b = p0;
       this.a = new a();
       b.c0(LiveGiftTag.GIFT_STORE, "[LiveGiftStoreRepository][init]", "loadGiftImagesOnWorkerThread", Boolean.valueOf(p0));
    }
    public final Gift a(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.a(p0);
    }
    public final void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
          return;
       }
       if (this.b != null) {
          if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "12")) {
             a.a.p(p0);
          }
       }else {
          a.e(p0);
       }
       return;
    }
    public final void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       l ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "21")) {
          a.a.e(p0);
       }
       return;
    }
    public final void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       a.p(p0, "listener");
       l ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "19")) {
          a.a.d(p0);
       }
       return;
    }
    public final void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       l ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "20")) {
          a.a.k(p0);
       }
       return;
    }
}
