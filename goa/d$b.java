package goa.d$b;
import erd.g;
import goa.d;
import java.lang.Object;
import com.yxcorp.gifshow.growth.model.response.InviteCodeResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cra.w;
import q87.c;
import wkd.b;
import joa.a;
import java.lang.CharSequence;
import e17.i;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import java.util.Objects;
import tkd.b;
import tkd.d;
import mp5.a;
import zn.b;
import goa.j;
import msd.a;
import qn.l;
import rn.b;
import qrd.l1;

public final class d$b implements g	// class@002b3c
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
       }else {
          a.p(p0, "response");
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "GrowthModule";
          w.C().t(str, "inviteCode request success!", objArray);
          b.a(-415247079).clearCache();
          if (!p0.mResult - 1) {
             InviteCodeResponse mToastMessag = p0.mToastMessage;
             String str1 = 1;
             mToastMessag = (mToastMessag == null || !mToastMessag.length())? 1: null;
             if (!mToastMessag) {
                i.d(R.style.arg_RES_7f11066a, p0.mToastMessage);
             }
             mToastMessag = p0.mGotoUrl;
             if (mToastMessag != null && mToastMessag.length()) {
                str1 = null;
             }
             if (!str1) {
                ActivityContext uActivityCon = ActivityContext.g();
                a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                Activity uActivity = uActivityCon.e();
                if (uActivity != null) {
                   a.b(b.j(uActivity, p0.mGotoUrl), null);
                }
             }else {
                p0 = p0.mPopup;
                if (p0 != null) {
                   d$b tb = this.b;
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.applyVoidTwoRefs(p0, null, tb, d.class, "9")) {
                      Object[] objArray1 = new Object[i];
                      w.C().w(str, "使用tk弹窗展示1元弹窗", objArray1);
                      b uob = new b("GrowthInviteRwdDialog", p0);
                      uob.k(new j(null));
                      d.a(0x68d1816a).KI(uob);
                   }
                }
             }
          }
       }
       return;
    }
}
