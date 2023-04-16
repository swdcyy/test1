package br1.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.vm.LiveMultiLineArenaLineHeaderViewModel;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.vm.LiveMultiLineArenaLineHeaderViewModel$b$a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import ar1.a;

public final class b extends m	// class@0003f9
{
    public final LiveMultiLineArenaLineHeaderViewModel c;

    public void b(LiveMultiLineArenaLineHeaderViewModel p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tc = this.c;
       LiveMultiLineArenaLineHeaderViewModel$b$a a = LiveMultiLineArenaLineHeaderViewModel$b$a.a;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(a, tc, LiveMultiLineArenaLineHeaderViewModel.class, "2")) {
          a.p(a, "intent");
          if (a instanceof LiveMultiLineArenaLineHeaderViewModel$b$a) {
             tc.h.a();
          }
       }
       return;
    }
}
