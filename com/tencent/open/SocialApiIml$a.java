package com.tencent.open.SocialApiIml$a;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.open.SocialApiIml;
import android.app.Activity;
import com.tencent.tauth.IUiListener;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.Throwable;
import com.tencent.open.log.SLog;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.tauth.UiError;
import java.lang.StringBuilder;

public class SocialApiIml$a extends DefaultUiListener	// class@000f2c
{
    public final SocialApiIml a;
    public IUiListener b;
    public String c;
    public String d;
    public Bundle e;
    public Activity f;

    public void SocialApiIml$a(SocialApiIml p0,Activity p1,IUiListener p2,String p3,String p4,Bundle p5){
       this.a = p0;
       super();
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p1;
    }
    public void onCancel(){
       this.b.onCancel();
    }
    public void onComplete(Object p0){
       String str = "openSDK_LOG.SocialApiIml";
       try{
          p0 = p0.getString("encry_token");
       }catch(org.json.JSONException e10){
          e10.printStackTrace();
          SLog.e(str, "OpenApi, EncrytokenListener\(\) onComplete error", e10);
          p0 = null;
       }
       this.e.putString("encrytoken", p0);
       SocialApiIml$a ta = this.a;
       SocialApiIml.a(ta, SocialApiIml.a(ta), this.c, this.e, this.d, this.b);
       if (TextUtils.isEmpty(p0)) {
          SLog.d(str, "The token get from qq or qzone is empty. Write temp token to localstorage.");
          this.a.writeEncryToken(this.f);
       }
       return;
    }
    public void onError(UiError p0){
       SLog.d("openSDK_LOG.SocialApiIml", "OpenApi, EncryptTokenListener\(\) onError"+p0.errorMessage);
       this.b.onError(p0);
    }
}
