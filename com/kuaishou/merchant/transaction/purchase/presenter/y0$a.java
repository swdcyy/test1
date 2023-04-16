package com.kuaishou.merchant.transaction.purchase.presenter.y0$a;
import com.kuaishou.merchant.transaction.purchase.presenter.y0$b;
import com.kuaishou.merchant.transaction.purchase.presenter.y0;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import ue4.o;
import java.lang.Boolean;
import android.view.View;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.merchant.transaction.purchase.model.RechargeConfig;
import lnc.a1;

public class y0$a implements y0$b	// class@0009bd
{
    public final y0 a;

    public void y0$a(y0 p0){
       this.a = p0;
       super();
    }
    public String a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       y0 obj = PatchProxy.apply(objArray, this, y0$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.y;
       if (obj == null || TextUtils.x(obj.getText())) {
          return objArray;
       }
       y0$a ta = this.a;
       Editable text = ta.y.getText();
       Objects.requireNonNull(ta);
       Object[] objArray1 = PatchProxy.applyOneRefs(text, ta, y0.class, "8");
       if (objArray1 != patchProxyRe) {
       }else if(ta.t == 2){
          String str = o.e(text);
          if (o.s(str)) {
             objArray = str;
          }
          objArray1 = objArray;
       }else {
          objArray1 = text.toString();
       }
       return objArray1;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, y0$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return o.u(this.a.w);
    }
    public JsonObject c(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, y0$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       if (!TextUtils.x(obj)) {
          objArray = new JsonObject();
          objArray.a0("accountType", Integer.valueOf(this.d()));
          objArray.c0("account", obj);
       }
       return objArray;
    }
    public int d(){
       return this.a.t;
    }
    public String e(){
       y0 obj = PatchProxy.apply(null, this, y0$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.s;
       if (obj != null && !TextUtils.x(obj.mEmptyInputTips)) {
          return this.a.s.mEmptyInputTips;
       }
       return a1.p(0x7f10338c);
    }
}
