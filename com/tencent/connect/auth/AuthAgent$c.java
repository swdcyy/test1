package com.tencent.connect.auth.AuthAgent$c;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.connect.auth.AuthAgent;
import android.content.Context;
import com.tencent.tauth.IUiListener;
import java.lang.String;
import com.tencent.open.log.SLog;
import java.lang.Object;
import org.json.JSONObject;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.a.a;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Exception;
import java.lang.Throwable;
import com.kuaishou.webkit.CookieSyncManager;
import org.json.JSONException;
import com.tencent.tauth.UiError;

public class AuthAgent$c extends DefaultUiListener	// class@000e1e
{
    public final AuthAgent a;
    public final IUiListener b;
    public final boolean c;
    public final Context d;

    public void AuthAgent$c(AuthAgent p0,Context p1,IUiListener p2,boolean p3,boolean p4){
       this.a = p0;
       super();
       this.d = p1;
       this.b = p2;
       this.c = p3;
       SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener\(\)");
    }
    public void onCancel(){
       SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener\(\) onCancel");
       this.b.onCancel();
       SLog.release();
    }
    public void onComplete(Object p0){
       String str = "pf";
       SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener\(\) onComplete");
       try{
          String str1 = p0.getString("access_token");
          String str2 = p0.getString("expires_in");
          String str3 = p0.getString("openid");
          if (str1 != null && (AuthAgent.a(this.a) != null && str3 != null)) {
             AuthAgent.b(this.a).setAccessToken(str1, str2);
             AuthAgent.c(this.a).setOpenId(str3);
             a.d(this.d, AuthAgent.d(this.a));
          label_0048 :
             str1 = p0.getString(str);
             if (str1 != null) {
                try{
                   g.b(o.c(this.d, "pfStore", 0).edit().putString(str, str1));
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                   SLog.e("openSDK_LOG.AuthAgent", "OpenUi, TokenListener\(\) onComplete error", e0);
                }
             }
          }else {
             goto label_0048 ;
          }
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
          SLog.e("openSDK_LOG.AuthAgent", "OpenUi, TokenListener\(\) onComplete error", e0);
       }
       this.b.onComplete(p0);
       this.a.releaseResource();
       SLog.release();
       return;
    }
    public void onError(UiError p0){
       SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener\(\) onError");
       this.b.onError(p0);
       SLog.release();
    }
}
