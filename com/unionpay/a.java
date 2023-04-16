package com.unionpay.a;
import java.lang.Runnable;
import java.lang.Object;
import com.unionpay.a.c;
import com.unionpay.a.d;
import com.unionpay.UPPayAssistEx;
import android.content.Context;
import java.lang.String;
import org.json.JSONObject;
import com.unionpay.utils.i;
import java.lang.Integer;
import android.util.Base64;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.unionpay.utils.UPUtils;
import com.unionpay.utils.b;

public final class a implements Runnable	// class@000ff3
{

    public void a(){
       super();
    }
    public final void run(){
       int i;
       String str = "sePayConf";
       String str1 = "configs";
       try{
          c uoc = new c(UPPayAssistEx.a(), UPPayAssistEx.b());
          uoc.a();
          String str2 = uoc.b();
          if (str2 != null) {
             JSONObject jSONObject = new JSONObject(str2);
             String str3 = i.a(jSONObject, "sign");
             try{
                i = 0;
                i = Integer.parseInt(UPPayAssistEx.c());
                String str4 = new String(Base64.decode(jSONObject.getString(str1), 2));
                String str5 = "";
                String str6 = (jSONObject.has(e0))? new String(Base64.decode(jSONObject.getString(e0), 2)): str5;
                if (!TextUtils.isEmpty(str6)) {
                   str5 = str6;
                }
                str = b.a(UPUtils.a(str4+str5+UPPayAssistEx.d()));
                String str7 = UPUtils.forConfig(i, str3);
                if (!TextUtils.isEmpty(str7) && str7.equals(str)) {
                   UPUtils.a(UPPayAssistEx.b(), str2, str1);
                   UPUtils.a(UPPayAssistEx.b(), UPPayAssistEx.c(), "mode");
                   UPUtils.a(UPPayAssistEx.b(), UPPayAssistEx.d(), "or");
                }
             }catch(java.lang.NumberFormatException e0){
             }
          }
       label_00aa :
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
