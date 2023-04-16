package dt1.d;
import erd.g;
import dt1.b;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$LiveCohesionPkJoinState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import msd.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;

public final class d implements g	// class@002017
{
    public final b b;

    public void d(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          d tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "5") || (p0.mAlreadySendGift == null || (TextUtils.n(p0.mPkId, tb.e.invoke()) && a.g(tb.b.getValue(), Boolean.FALSE)))) {
             tb.b.setValue(Boolean.TRUE);
          }
       }
       return;
    }
}
