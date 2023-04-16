package j8a.r0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k;
import java.lang.Object;
import fda.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class r0 implements g	// class@002972
{
    public final k b;

    public void r0(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, k.class, "7")) {
       }else if(tb.T != null && (!TextUtils.isEmpty(p0.a()) && ("up_slide").equals(p0.a()))){
          if (!tb.Z8() && tb.S8()) {
             tb.D = true;
             tb.l9(true);
          }else {
             tb.h9("t");
          }
       }
       return;
    }
}
