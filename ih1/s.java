package ih1.s;
import yg1.d;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import ih1.l;
import ih1.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hh1.g;
import yg1.e;
import yg1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yg1.f;
import ih1.s$a;
import hh1.j;

public final class s implements d	// class@0028f4
{
    public final g a;
    public f b;
    public final LiveGiftPanelConfig c;
    public final l d;
    public final i e;

    public void s(LiveGiftPanelConfig p0,l p1,i p2){
       a.p(p0, "config");
       a.p(p1, "giftStoreRepository");
       a.p(p2, "listener");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.a = new g(p0);
    }
    public void a(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       s tb = this.b;
       if (tb != null && tb.e()) {
          p2.a(p0, tb);
       }else {
          this.b(p0, p1, p2);
       }
       return;
    }
    public void b(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "2")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       this.a.a(p0, p1, new s$a(this, p2));
       return;
    }
    public final l c(){
       return this.d;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       this.b = null;
       this.a.clear();
       return;
    }
}
