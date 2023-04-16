package a08.h;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import java.lang.Object;
import e08.b;
import c08.a;
import java.lang.String;
import f08.f;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import java.util.List;

public final class h implements g	// class@00000d
{
    public final b b;

    public void h(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       f.e(tb.e, "RxBus receive pendantAction");
       if (p0 != null && p0.a() != null) {
          b e = tb.e;
          if (e == null || (e.d() != null && (p0.a()).equals(tb.e.d().getLiveId()))) {
             tb.i(p0.a);
          }
       }
    label_0037 :
       return;
    }
}
