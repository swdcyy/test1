package com.unionpay.o;
import com.unionpay.u;
import com.unionpay.UPPayWapActivity;
import java.lang.Object;
import java.lang.String;
import com.unionpay.v;
import org.json.JSONObject;
import java.lang.Exception;

public final class o implements u	// class@001001
{
    public final UPPayWapActivity a;

    public void o(UPPayWapActivity p0){
       this.a = p0;
       super();
    }
    public final void a(String p0,v p1){
       String str = null;
       try{
          try{
             JSONObject jSONObject = new JSONObject(p0);
             p0 = jSONObject.get("resultCode");
             String str1 = jSONObject.get("resultData");
          label_002d :
             UPPayWapActivity.a(this.a, p0, "");
             if (p1 != null) {
                p1.a(UPPayWapActivity.a("0", "success", str));
             }
             return;
          }catch(java.lang.Exception e3){
             p0 = "";
          }
          if (p1 != null) {
             p1.a(UPPayWapActivity.a("1", e3.getMessage(), str));
             goto label_002d ;
          }else {
             goto label_002d ;
          }
       }catch(java.lang.Exception e6){
          if (p1) {
             p1.a(UPPayWapActivity.a("1", e6.getMessage(), str));
          }
          return;
       }catch(java.lang.Exception e3){
          goto label_0020 ;
       }
    }
}
