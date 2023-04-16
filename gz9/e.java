package gz9.e;
import erd.g;
import gz9.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import uw9.o;
import q87.c;

public final class e implements g	// class@00251a
{
    public final b b;

    public void e(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else if(p0 instanceof KwaiException){
          KwaiException mErrorMessag = p0.mErrorMessage;
          if (!TextUtils.x(mErrorMessag)) {
             i.d(R.style.arg_RES_7f11066a, mErrorMessag);
          }
       }
       o.C().e("PayCoursePaymentController", "pay request failed ", p0);
       this.b.c();
       return;
    }
}
