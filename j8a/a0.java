package j8a.a0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import java.lang.Object;
import fda.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class a0 implements g	// class@00293b
{
    public final h b;

    public void a0(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "4")) {
       }else if(tb.R != null && (!TextUtils.x(p0.a()) && ("left_slide").equals(p0.a()))){
          tb.b9(1);
       }
       return;
    }
}
