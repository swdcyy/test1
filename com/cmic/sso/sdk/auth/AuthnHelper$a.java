package com.cmic.sso.sdk.auth.AuthnHelper$a;
import java.lang.Runnable;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.a;
import java.lang.Object;
import android.content.Context;
import com.cmic.sso.sdk.e.s;
import java.lang.String;
import org.json.JSONObject;
import com.cmic.sso.sdk.auth.c;

public class AuthnHelper$a implements Runnable	// class@000f2c
{
    public final AuthnHelper a;
    public final a b;

    public void AuthnHelper$a(AuthnHelper p0,a p1){
       this.a = p0;
       super();
       this.b = p1;
    }
    public void run(){
       String str = "µÇÂ¼³¬Ê±";
       String str1 = "200023";
       JSONObject jSONObject = (!s.a(AuthnHelper.b(this.a)).a() && this.b.b("doNetworkSwitch", false))? c.a("102508", "Êý¾ÝÍøÂçÇÐ»»Ê§°Ü"): c.a(str1, str);
       this.a.callBackResult(jSONObject.optString("resultCode", str1), jSONObject.optString("resultString", str), this.b, jSONObject);
       return;
    }
}
