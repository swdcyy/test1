package bi9.c;
import erd.g;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.lang.Object;
import bi9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import j8c.a;
import q87.c;
import java.lang.StringBuilder;
import km6.d;
import java.util.List;

public final class c implements g	// class@0004ad
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(tb, p0, b.class, "6")) {
       }else {
          ArrayList uArrayList = new ArrayList(tb.f);
          ArrayList uArrayList1 = new ArrayList(p0.c);
          if (uArrayList.size() < uArrayList1.size()) {
             Object[] objArray = new Object[0];
             a.D().A("RecordSampling", "prepareIntentForPreviewActivityInWorkThread return as zoom is too more", objArray);
          }else {
             int i = 0;
             while (i < uArrayList1.size()) {
                if (uArrayList.get(i) == null) {
                   Object[] objArray1 = new Object[0];
                   a.D().A("RecordSampling", "record part is null at "+i, objArray1);
                }else {
                   p0.a(uArrayList.get(i), uArrayList1.get(i));
                }
                i = i + 1;
             }
          }
       }
       return;
    }
}
