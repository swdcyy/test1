package com.kuaishou.merchant.transaction.purchase.presenter.w0$a;
import com.kuaishou.merchant.transaction.purchase.presenter.w0$c;
import com.kuaishou.merchant.transaction.purchase.presenter.w0;
import java.lang.Object;
import com.google.gson.JsonArray;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import ekd.q;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.purchase.model.RechargeConfig;
import com.kwai.library.widget.edittext.SafeEditText;
import android.text.Editable;
import java.util.Objects;
import java.lang.Integer;
import java.lang.CharSequence;
import ue4.o;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.merchant.transaction.purchase.presenter.w0$b;
import android.widget.EditText;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import java.lang.Boolean;
import android.view.View;

public class w0$a implements w0$c	// class@0009b3
{
    public final w0 a;

    public void w0$a(w0 p0){
       this.a = p0;
       super();
    }
    public JsonArray a(){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       JsonArray obj = PatchProxy.apply(null, this, w0$a.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (q.h(this.a.s)) {
          return new JsonArray();
       }
       obj = new JsonArray();
       Iterator iterator = this.a.s.keySet().iterator();
       while (iterator.hasNext()) {
          RechargeConfig rechargeConf = iterator.next();
          SafeEditText safeEditText = this.a.s.get(rechargeConf);
          if (rechargeConf == null || safeEditText == null) {
             continue ;
          }else {
             String str = "";
             if (safeEditText.getText() != null) {
                w0$a ta = this.a;
                Editable text = safeEditText.getText();
                RechargeConfig mAccountNumT = rechargeConf.mAccountNumType;
                Objects.requireNonNull(ta);
                if (PatchProxy.isSupport(w0.class)) {
                   Object obj1 = PatchProxy.applyTwoRefs(text, Integer.valueOf(mAccountNumT), ta, w0.class, "1");
                   if (obj1 != patchProxyRe) {
                      str = obj1;
                   }
                }
                if (mAccountNumT == 2) {
                   str1 = o.e(text);
                   if (!o.s(str1)) {
                   label_008b :
                      JsonObject jsonObject = new JsonObject();
                      jsonObject.a0("accountType", Integer.valueOf(rechargeConf.mAccountNumType));
                      jsonObject.c0("account", str);
                      obj.G(jsonObject);
                   }
                }else {
                   str1 = text.toString();
                }
                str = str1;
                goto label_008b ;
             }
          }
       }
       return obj;
    }
    public w0$b b(){
       RechargeConfig rechargeConf1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       Iterator obj = PatchProxy.apply(null, this, w0$a.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       String str1 = "";
       boolean b = true;
       if (q.h(this.a.s)) {
          return new w0$b(b, str1);
       }
       obj = this.a.s.keySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return new w0$b(b, str1);
          }
          RechargeConfig rechargeConf = obj.next();
          SafeEditText safeEditText = this.a.s.get(rechargeConf);
          if (rechargeConf == null || (safeEditText != null && !rechargeConf.isInputCorrect(TextUtils.G(safeEditText).toString()))) {
             w0$a ta = this.a;
             Objects.requireNonNull(ta);
             rechargeConf1 = PatchProxy.applyOneRefs(rechargeConf, ta, w0.class, str);
             if (rechargeConf1 != patchProxyRe) {
                break ;
             }else if(!TextUtils.x(rechargeConf.mEmptyInputTips)){
                rechargeConf1 = rechargeConf.mEmptyInputTips;
                break ;
             }else {
                rechargeConf1 = a1.r(R.string.arg_RES_7f103405, rechargeConf.mLabel);
                break ;
             }
          }
       }
       return new w0$b(false, rechargeConf1);
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, w0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return o.u(this.a.v);
    }
}
