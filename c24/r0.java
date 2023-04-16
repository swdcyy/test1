package c24.r0;
import erd.g;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import com.kuaishou.merchant.live.base.model.PopupClickResponse;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import us3.f;
import us3.h;

public final class r0 implements g	// class@000495
{
    public final RouterRequest b;

    public void r0(RouterRequest p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r0 tb = this.b;
       if (!TextUtils.x(p0.mToast)) {
          i.d(R.style.arg_RES_7f11066a, p0.mToast);
       }
       if (tb.b() != null) {
          tb.b().a(new h());
       }
       return;
    }
}
