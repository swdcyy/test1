package i01.h;
import erd.g;
import i01.j;
import java.lang.Object;
import java.lang.Throwable;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.retrofit.model.KwaiException;
import e17.i;
import z1.a;
import f82.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import l95.c;
import android.os.SystemClock;
import com.google.gson.JsonElement;

public final class h implements g	// class@0027e0
{
    public final j b;
    public final long c;

    public void h(j p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       if (tb.getActivity() == null || tb.getActivity().isFinishing()) {
          tb.Y8(8, (SystemClock.elapsedRealtime() - tc), null);
       }else if(p0 instanceof KwaiException){
          KwaiException kwaiExceptio = p0;
          if (kwaiExceptio.getErrorCode() == 0x13ade) {
             tb.R8();
             tb.b9();
             i.a(R.style.arg_RES_7f11066a, 0x7f10225c);
          }else {
             c.p(p0, null);
             if (!PatchProxy.applyVoidOneRefs(kwaiExceptio, tb, j.class, "23") && FansGroupKswitchUtil.b()) {
                p0 = tb.P8(404);
                p0.b(kwaiExceptio.getErrorCode());
                String str = (TextUtils.x(kwaiExceptio.getMessage()))? "join error": kwaiExceptio.getMessage();
                p0.c(str);
                c.a(p0);
             }
          }
       }
       tb.Y8(8, (SystemClock.elapsedRealtime() - tc), null);
       tb.V8();
       return;
    }
}
