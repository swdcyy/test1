package goa.a;
import java.lang.Object;
import com.yxcorp.plugin.kwaitoken.model.BigPictureDialogInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import com.google.gson.JsonElement;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import tb7.d;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import mp5.a;
import zn.b;
import java.lang.Integer;
import rn.b;
import usd.q;
import qrd.l1;
import com.kwai.framework.model.user.QCurrentUser;
import goa.k;
import wkd.b;
import joa.a;

public class a	// class@002b35
{
    public final String a;

    public void a(){
       super();
       this.a = "GrowthDialogUtil";
    }
    public final void a(BigPictureDialogInfo p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
          return;
       }
       a.p(p0, "info");
       BaseDialogInfo mExtParams = p0.mExtParams;
       if (mExtParams != null) {
          a.o(mExtParams, "info.mExtParams");
          if (!mExtParams.D()) {
             mExtParams = p0.mExtParams;
             String str = "GrowthTokenDialogA";
             String str1 = PatchProxy.applyTwoRefs(mExtParams, str, this, uoa, "5");
             int i = 0;
             if (str1 != PatchProxyResult.class) {
             }else {
                str1 = d.g(mExtParams, "tkBundleId", "");
                w ow = (str1 == null || !str1.length())? 1: null;
                if (ow) {
                   str1 = str;
                }
             }
             Object[] objArray = new Object[i];
             w.C().w(this.a, "使用tk展示口令弹窗@"+str1, objArray);
             JsonObject jsonObject = p0.mExtParams.d0();
             jsonObject.c0("kpn", p0.mOriginKpn);
             jsonObject.c0("subBiz", p0.mOriginSubBiz);
             jsonObject.c0("shareId", p0.mShareId);
             jsonObject.H("_useTokenCache", Boolean.TRUE);
             a uoa1 = d.a(0x68d1816a);
             a.o(jsonObject, "jsonObject");
             b uob = new b(str1, jsonObject);
             uob.f(Integer.valueOf(50));
             int i1 = (a.g(str1, str))? q.n(d.e(p0.mExtParams, "tkMinVer", -1), 16): d.e(p0.mExtParams, "tkMinVer", -1);
             uob.s(i1);
             uoa1.KI(uob);
          }
       }
       return;
    }
    public final void b(BigPictureDialogInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "info");
       int i = 0;
       Object[] objArray = new Object[i];
       w.C().t(this.a, "showTokenUnLoginDialog first", objArray);
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (mE.isLogined()) {
          return;
       }
       k.b.a(true);
       b.a(-415247079).e(d.g(p0.mExtParams, "InvitationCode", ""), d.e(p0.mExtParams, "sourceType", i), d.g(p0.mExtParams, "traceDetail", ""));
       Object[] objArray1 = new Object[i];
       w.C().t(this.a, "showTokenUnLoginDialog really", objArray1);
       this.a(p0);
       return;
    }
}
