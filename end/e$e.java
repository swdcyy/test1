package end.e$e;
import wba.r;
import end.e;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import kod.a;

public final class e$e implements r	// class@000dab
{
    public final e a;

    public void e$e(e p0){
       this.a = p0;
       super();
    }
    public Object get(Object p0){
       Pair pair = PatchProxy.applyOneRefs(p0, this, e$e.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "oldAndNewElement");
          String[] stringArray = new String[]{String.valueOf(p0.getSecond().l0())};
          pair = this.a.b0(stringArray, (float)(p0.getSecond().m0() + (p0.getSecond().j0() / (double)2)), p0.getFirst());
       }
       return pair;
    }
}
