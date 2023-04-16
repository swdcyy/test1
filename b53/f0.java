package b53.f0;
import erd.g;
import com.kuaishou.live.gzone.barrage.l;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import pm8.a;
import t02.a0;
import java.lang.String;
import p91.m;
import java.util.List;
import com.kwai.live.gzone.barrage.LiveGzoneColorBarrageRight;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import java.util.Set;
import java.util.Iterator;

public final class f0 implements g	// class@000309
{
    public final l b;

    public void f0(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f0 tb = this.b;
       Objects.requireNonNull(tb);
       LinkedHashMap linkedHashMa = a.J(l.J);
       String str = tb.x.Z2.d();
       tb.s.Yh(tb.B.get(p0.intValue()).mLevel);
       if (!p0.intValue()) {
          tb.s.Zh(null);
          if (linkedHashMa != null && linkedHashMa.containsKey(str)) {
             linkedHashMa.put(str, null);
          }
       }else {
          tb.s.Zh(tb.B.get(p0.intValue()).mColorValue);
          if (linkedHashMa == null) {
             linkedHashMa = new LinkedHashMap();
          }
          linkedHashMa.put(str, Integer.valueOf(tb.B.get(p0.intValue()).mLevel));
          if (linkedHashMa.size() > 100) {
             linkedHashMa.remove(linkedHashMa.keySet().iterator().next());
          }
       }
    label_0086 :
       if (linkedHashMa != null) {
          a.o1(linkedHashMa);
       }
       tb.R8(true);
       return;
    }
}
