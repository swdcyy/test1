package laa.n0;
import erd.g;
import com.yxcorp.gifshow.edit.draft.model.b0;
import java.lang.Object;
import android.util.Pair;
import java.util.Objects;
import haa.g;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import haa.f;
import q87.c;
import java.util.LinkedHashMap;

public final class n0 implements g	// class@002d94
{
    public final b0 b;

    public void n0(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n0 tb = this.b;
       Objects.requireNonNull(tb);
       Pair first = p0.first;
       boolean b = p0.second.booleanValue();
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && (!PatchProxy.applyVoidTwoRefs(first, Boolean.valueOf(b), tb, uob0, "2") && b)) {
          Object[] objArray = new Object[]{first.a};
          f.D().w("WorkspaceSimpleMapManager", "addToSimpleMap\(\) called and added", objArray);
          tb.b.put(first.a, first);
       }
       return;
    }
}
