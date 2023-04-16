package a29.e;
import erd.g;
import a29.k;
import java.lang.Object;
import kotlin.Pair;
import java.util.Objects;
import java.lang.Boolean;
import qp7.b;
import qp7.x0;
import lr7.e0;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;

public final class e implements g	// class@000031
{
    public final k b;

    public void e(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.getFirst().booleanValue()) {
          tb.c0();
          tb.E().g(true);
          tb.E().j(DanmakuSwitchUtils.h.f());
          tb.E().k(false);
          if (tb.E == null) {
             if (tb.z != null) {
                tb.o0();
             }else {
                tb.F = true;
             }
          }
       }else {
          tb.E().g(false);
          tb.E().h();
       }
       return;
    }
}
