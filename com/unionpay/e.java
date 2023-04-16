package com.unionpay.e;
import com.unionpay.u;
import com.unionpay.UPPayWapActivity;
import java.lang.Object;
import java.lang.String;
import com.unionpay.v;
import org.json.JSONObject;
import java.lang.Exception;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import java.lang.Class;
import android.app.Activity;

public final class e implements u	// class@000ff7
{
    public final UPPayWapActivity a;

    public void e(UPPayWapActivity p0){
       this.a = p0;
       super();
    }
    public final void a(String p0,v p1){
       String str = null;
       try{
          try{
             JSONObject jSONObject = new JSONObject(p0);
             p0 = jSONObject.get("url");
             String str1 = jSONObject.get("title");
          label_002d :
             Bundle uBundle = new Bundle();
             uBundle.putString("waptype", "new_page");
             uBundle.putString("magic_data", "949A1CC");
             uBundle.putString("wapurl", p0);
             uBundle.putString("waptitle", "");
             Intent intent = new Intent();
             intent.putExtras(uBundle);
             intent.setClass(this.a, UPPayWapActivity.class);
             this.a.startActivity(intent);
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
       }catch(java.lang.Exception e7){
          if (p1) {
             p1.a(UPPayWapActivity.a("1", e7.getMessage(), str));
          }
          return;
       }catch(java.lang.Exception e3){
          goto label_0020 ;
       }
    }
}
