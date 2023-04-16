package g5a.a;
import erd.g;
import g5a.b;
import java.lang.Object;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.util.Objects;
import tkd.b;
import tkd.d;
import ju5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import v3a.e;

public final class a implements g	// class@0023ae
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       if (p0 != null && p0.mBizType == 25) {
          i = 1;
       }
       if (i) {
          g og = d.a(0x6ea0c3d0);
          String str = PatchProxy.applyOneRefs(p0, tb, b.class, "3");
          if (str != PatchProxyResult.class) {
          }else {
             str = e.a(p0, null);
          }
          og.t9(str, tb.q);
       }
       return;
    }
}
