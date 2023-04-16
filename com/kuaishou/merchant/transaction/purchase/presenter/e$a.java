package com.kuaishou.merchant.transaction.purchase.presenter.e$a;
import com.kuaishou.merchant.transaction.purchase.presenter.e$c;
import com.kuaishou.merchant.transaction.purchase.presenter.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import e17.i;
import com.kuaishou.merchant.transaction.purchase.presenter.d0$b;
import com.google.gson.JsonObject;
import android.widget.ImageView;
import java.util.Objects;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.merchant.transaction.base.model.PayAgreement;
import com.kuaishou.merchant.transaction.purchase.model.AgreementInfoV2;
import com.kuaishou.merchant.transaction.purchase.model.AgreementInfoV2$AgreementModule;

public class e$a implements e$c	// class@00096f
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       boolean b = (!this.a.y.getVisibility() && (!this.a.B.getVisibility() && this.a.E == null))? true: false;
       if (b) {
          i.a(R.style.arg_RES_7f11066a, 0x7f103213);
          e$a ta = this.a;
          e q = ta.q;
          if (q != null) {
             int i1 = q.c(ta.y);
             e y = this.a.y;
             if (y != null) {
                i = y.getHeight();
             }
             q.b((i1 + i));
          }
       }
       return b;
    }
    public JsonObject b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       e$a obj = PatchProxy.apply(objArray, this, e$a.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!this.a.y.getVisibility() && !this.a.z.getVisibility()) {
          obj = this.a;
          Objects.requireNonNull(obj);
          objArray = PatchProxy.apply(objArray, obj, e.class, str);
          if (objArray != patchProxyRe) {
          }else {
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0("serverTime", Long.valueOf(obj.v));
             jsonObject.a0("localTime", Long.valueOf(obj.w));
             e x = obj.x;
             if (x != null) {
                jsonObject.G("payAgreementUrl", x);
             }
             objArray = jsonObject;
          }
       }
       return objArray;
    }
    public void c(PayAgreement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       if (this.a.R8()) {
          this.a.S8(p0);
          e$a ta = this.a;
          ta.X8(ta.P8(ta.t.mMandatoryAgreement, p0), true);
       }
       return;
    }
}
