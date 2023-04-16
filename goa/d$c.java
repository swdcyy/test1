package goa.d$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import com.yxcorp.gifshow.growth.model.response.InviteCodeResponse;
import goa.e;
import java.lang.Runnable;
import yb7.p;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;

public final class d$c implements g	// class@002b3d
{
    public static final d$c b;

    static {
       d$c.b = new d$c();
    }
    public void d$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
       }else {
          w ow = w.C();
          StringBuilder str = "inviteCode request failed! \n";
          String localizedMes = (p0 != null)? p0.getLocalizedMessage(): null;
          int i = 0;
          Object[] objArray = new Object[i];
          ow.t("GrowthModule", str+localizedMes, objArray);
          if (!p0 instanceof KwaiException) {
             p0 = null;
          }
          if (p0 != null) {
             p0 = p0.mResponse;
             if (p0 != null) {
                p0 = p0.a();
             label_0047 :
                if (!p0 instanceof InviteCodeResponse) {
                   p0 = null;
                }
                if (p0 != null) {
                   InviteCodeResponse mToastMessag = p0.mToastMessage;
                   str = 1;
                   e uoe = (mToastMessag == null || !mToastMessag.length())? 1: null;
                   if (!uoe) {
                      p.e(new e(p0), 1000);
                   }
                   mToastMessag = p0.mGotoUrl;
                   if (mToastMessag != null && mToastMessag.length()) {
                      str = null;
                   }
                   if (!str) {
                      Object[] objArray1 = new Object[i];
                      w.C().t("GrowthModule", "gotuUrl is "+p0.mGotoUrl, objArray1);
                      ActivityContext uActivityCon = ActivityContext.g();
                      a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                      a.b(b.j(uActivityCon.e(), p0.mGotoUrl), null);
                   }
                }
             }
          }
          p0 = null;
          goto label_0047 ;
       }
       return;
    }
}
