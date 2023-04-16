package ba4.h;
import erd.g;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.b;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import y94.c;

public final class h implements g	// class@000357
{
    public final b b;

    public void h(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else if(p0.longValue() <= 0){
          p0 = this.b.w;
          if (p0 == null) {
             a.S("mEndTimeView");
          }
          p0.setVisibility(8);
          p0 = this.b.A;
          if (p0 != null) {
             p0.l(5);
          }
       }else {
          this.b.S8(p0.longValue());
       }
       return;
    }
}
