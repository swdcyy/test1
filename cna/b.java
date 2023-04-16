package cna.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import com.yxcorp.retrofit.model.KwaiException;
import com.google.common.base.b;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import cna.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.HomeActivity;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class b implements g	// class@00052f
{
    public final int b;

    public void b(int p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       String str;
       b tb = this.b;
       a.l(p0);
       if (p0 instanceof KwaiException) {
          i3 obj = null;
          try{
             p0 = b.c(p0);
          }catch(java.lang.Exception e0){
             p0 = obj;
          }
          if (p0 != null) {
             p0 = p0.getMessage();
             if (!TextUtils.isEmpty(p0)) {
                if (e0 == 3) {
                   str = "CHURN_BACK";
                }else if(e0 == 4){
                   str = "NEW";
                }else {
                   str = "";
                }
                if (!PatchProxy.applyVoidTwoRefs(p0, str, obj, c.class, "3")) {
                   HomeActivity homeActivity = HomeActivity.H3();
                   if (homeActivity != null && !homeActivity.isFinishing()) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "CHURN_BACK_FIRST_DAY_CASH_POP_TOAST";
                      obj = i3.f();
                      obj.d("toast_content", p0);
                      obj.d("device_type", str);
                      uElementPack.params = obj.e();
                      u1.D0("2904671", homeActivity, 3, uElementPack, null, null);
                   }
                }
             }
          }
       }
       return;
    }
}
