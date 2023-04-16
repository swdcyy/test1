package n90.g$n;
import erd.g;
import n90.g;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.Number;
import androidx.lifecycle.MutableLiveData;

public final class g$n implements g	// class@0026e1
{
    public final g b;
    public final boolean c;

    public void g$n(g p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$n.class, "1")) {
       }else {
          Integer first = p0.getFirst();
          int i = 100;
          int i1 = 0;
          first = (first != null && first.intValue() == i)? 1: 0;
          if (first) {
             Object[] objArray = new Object[i1];
             e.D().w("KuaiShanAlbumDataHelper", "downloadTemplate progress completed", objArray);
             m1 om1 = m1.w0();
             a.o(om1, "KuaiShanManager.getInstance\(\)");
             Object second = p0.getSecond();
             Objects.requireNonNull(second, "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.logic.KuaiShanProject");
             om1.y0(second);
          }
          if (this.b.d == null) {
             g$n tc = this.c;
             if (tc == null) {
                i = 50;
             }
             p0 = p0.getFirst();
             if (tc != null) {
             }else {
                p0 = Integer.valueOf((int)(p0.floatValue() * 0x3f000000));
             }
             MutableLiveData mutableLiveD = this.b.g();
             if (first) {
                p0 = Integer.valueOf(i);
             }
             mutableLiveD.setValue(p0);
          }
       }
       return;
    }
}
