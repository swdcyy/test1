package com.kwai.user.base.chat.target.bean.I18NText;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra6.a;
import java.lang.StringBuilder;
import k2b.u1;
import com.yxcorp.utility.TextUtils;

public class I18NText extends HashMap	// class@001976
{
    public static final long serialVersionUID = 0x4d0880f22aa4d4f7;

    public void I18NText(){
       super();
    }
    public String getText(){
       String obj = PatchProxy.apply(null, this, I18NText.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = a.d();
       String str = "zh";
       if (i != 1) {
          obj = (i != 2)? "en": "zh_TW";
       }else {
          obj = str;
       }
       String str1 = this.get(obj);
       if (str1 != null) {
          return str1;
       }else if(str.equals(obj)){
          u1.Q("I18NText", "invalid content: "+this.toString());
       }else {
          u1.Q("I18NText", "unknown lang: "+obj+" - "+this.toString());
          str1 = this.get(str);
       }
       return TextUtils.I(str1);
    }
}
