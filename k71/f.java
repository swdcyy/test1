package k71.f;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.f$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import com.kuaishou.live.common.core.component.encouragetreasure.LiveEncourageResultDialogFragment;
import lp3.e;
import xp5.i;
import lp3.c;
import kotlin.jvm.internal.a;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdEncourageTreasureShowResultDialog$showResultDialogFragment$dialogFragment$1;
import msd.l;
import rp5.a;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import csd.b;
import dsd.e;

public final class f extends AbstractLiveJsCommand	// class@002cae
{

    public void f(){
       super();
    }
    public Class a(){
       return f$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof f$a) {
          return m.g.c("invalid params");
       }
       h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
       if (!PatchProxy.applyVoidTwoRefs(p0, oh, this, f.class, "2")) {
          c uoc = this.h().a(i.class);
          a.o(uoc, "serviceManager.getServic¡­kageProvider::class.java\)");
          LiveEncourageResultDialogFragment liveEncourag = new LiveEncourageResultDialogFragment(uoc, p0, new LiveJsCmdEncourageTreasureShowResultDialog$showResultDialogFragment$dialogFragment$1(oh));
          liveEncourag.Cb(this.h().a(a.class).getChildFragmentManager(), "LiveEncourageResultDialogFragment");
       }
       p0 = oh.b();
       if (p0 == b.h()) {
          e.c(p2);
       }
       return p0;
    }
}
