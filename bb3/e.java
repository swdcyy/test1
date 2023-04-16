package bb3.e;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import mrd.a;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import d93.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import java.lang.Float;
import bb3.b;
import xc3.l;
import com.kuaishou.live.lite.framework.layoutmanager.LayoutManagerLateInitLogic$setupRecommendSideBarLogic$1;
import msd.a;
import u63.a;

public final class e	// class@00035e
{
    public final a a;
    public final a b;
    public final LifecycleOwner c;

    public void e(LifecycleOwner p0){
       a.p(p0, "lifecycleOwner");
       super();
       this.c = p0;
       a uoa = a.h(Boolean.FALSE);
       a.o(uoa, "BehaviorSubject.createDefault\(false\)");
       this.a = uoa;
       uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Float>\(\)");
       this.b = uoa;
    }
    public final a a(){
       return this.b;
    }
    public final a b(){
       return this.a;
    }
    public final void c(LiveLiteLayoutManager p0,c p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "2")) {
          return;
       }
       a.p(p0, "layoutManager");
       a.p(p1, "serviceManager");
       LiveLiteRecommendSideBarService liveLiteReco = p1.a(LiveLiteRecommendSideBarService.class);
       if (!PatchProxy.applyVoidTwoRefs(p0, liveLiteReco, this, uoe, "4")) {
          if (liveLiteReco.C4()) {
             this.b.onNext(Float.valueOf(0));
          }
          b uob = new b(this);
          liveLiteReco.Q5(uob);
          a.a(this.c, new LayoutManagerLateInitLogic$setupRecommendSideBarLogic$1(liveLiteReco, uob));
       }
       return;
    }
}
