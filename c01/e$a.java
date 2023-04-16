package c01.e$a;
import hl1.a;
import c01.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.gift.audience.LiveGiftReceiver;
import java.util.Objects;
import android.view.ViewPropertyAnimator;
import c01.f;
import android.animation.Animator$AnimatorListener;

public class e$a implements a	// class@00043f
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.a.q.getVisibility())? true: false;
       return b;
    }
    public void b(LiveGiftReceiver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.a.S8(p0);
       return;
    }
    public void c(boolean p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoa, uoe, "10") && !uoa.q.getVisibility())) {
          if (p0) {
             uoa.q.animate().alpha(0).setListener(new f(uoa)).start();
          }else {
             uoa.q.setVisibility(8);
          }
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "3")) {
          return;
       }
       this.a.V8();
       return;
    }
}
