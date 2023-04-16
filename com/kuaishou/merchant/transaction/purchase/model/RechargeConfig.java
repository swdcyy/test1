package com.kuaishou.merchant.transaction.purchase.model.RechargeConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ue4.o;
import java.lang.Boolean;
import ok.k;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import java.lang.Number;
import java.lang.Integer;
import kc4.x;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RechargeConfig implements Serializable	// class@00094d
{
    public int mAccountNumType;
    public String mEmptyInputTips;
    public String mHint;
    public String mInputHint;
    public String mLabel;
    public String mPhoneNumber;
    public static final long serialVersionUID = 0x6b44fa276a038e51;

    public void RechargeConfig(){
       super();
    }
    public String convertInput2RequiredForm(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RechargeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mAccountNumType != 2) {
          return p0.toString();
       }
       String str = o.e(p0);
       if (!o.s(str)) {
          str = "";
       }
       return str;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RechargeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mAccountNumType != p0.mAccountNumType || (!k.a(this.mLabel, p0.mLabel) || (!k.a(this.mInputHint, p0.mInputHint) || (!k.a(this.mHint, p0.mHint) || (!k.a(this.mEmptyInputTips, p0.mEmptyInputTips) || !k.a(this.mPhoneNumber, p0.mPhoneNumber)))))) {
          b = false;
       }
       return b;
    }
    public String getInputIncorrectTip(){
       Object obj = PatchProxy.apply(null, this, RechargeConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(this.mEmptyInputTips)) {
          return this.mEmptyInputTips;
       }
       return a1.r(0x7f103405, this.mLabel);
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, RechargeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mAccountNumType),this.mLabel,this.mInputHint,this.mHint,this.mEmptyInputTips,this.mPhoneNumber};
       return k.b(obj);
    }
    public boolean isInputCorrect(CharSequence p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RechargeConfig obj = PatchProxy.applyOneRefs(p0, this, RechargeConfig.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.mAccountNumType;
       int i = 2;
       if (obj == i) {
          return o.s(o.e(p0));
       }
       int i1 = 1;
       if (obj != 11) {
          return (TextUtils.x(p0) ^ i1);
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, null, o.class, "23");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(TextUtils.x(p0)){
          b = false;
       }else if(p0.length() >= i && p0.length() <= 20){
          obj1 = PatchProxy.applyOneRefs(p0, null, x.class, "14");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): x.c.matcher(p0).find();
          if (!b1 && !x.g(p0)) {
          label_0078 :
             b = i1;
          }
       }
    label_0077 :
       i1 = 0;
       goto label_0078 ;
       return b;
    }
}
