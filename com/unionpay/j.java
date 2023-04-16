package com.unionpay.j;
import com.unionpay.u;
import com.unionpay.UPPayWapActivity;
import java.lang.Object;
import java.lang.String;
import com.unionpay.v;
import org.json.JSONObject;
import java.util.Iterator;
import android.content.Context;
import com.unionpay.utils.UPUtils;
import java.lang.Exception;

public final class j implements u	// class@000ffc
{
    public final UPPayWapActivity a;

    public void j(UPPayWapActivity p0){
       this.a = p0;
       super();
    }
    public final void a(String p0,v p1){
       String str = null;
       try{
          JSONObject jSONObject = new JSONObject(p0);
          Iterator iterator = jSONObject.keys();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             UPUtils.a(this.a, jSONObject.getString(str1), str1);
          }
          if (p1 != null) {
             p1.a(UPPayWapActivity.a("0", "success", str));
          }
          return;
       }catch(java.lang.Exception e6){
          if (p1 != null) {
             p1.a(UPPayWapActivity.a("1", e6.getMessage(), str));
          }
          return;
       }
    }
}
