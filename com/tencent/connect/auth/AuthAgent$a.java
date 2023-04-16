package com.tencent.connect.auth.AuthAgent$a;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.connect.auth.AuthAgent;
import com.tencent.tauth.IUiListener;
import java.lang.Object;
import java.lang.String;
import com.tencent.open.log.SLog;
import org.json.JSONObject;
import org.json.JSONException;
import com.tencent.tauth.UiError;

public class AuthAgent$a extends DefaultUiListener	// class@000e18
{
    public IUiListener a;
    public final AuthAgent b;

    public void AuthAgent$a(AuthAgent p0,IUiListener p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void onCancel(){
       AuthAgent$a ta = this.a;
       if (ta != null) {
          ta.onCancel();
       }
       return;
    }
    public void onComplete(Object p0){
       String str = "ret";
       if (p0 == null) {
          SLog.e("openSDK_LOG.AuthAgent", "CheckLoginListener response data is null");
          return;
       }else {
          try{
             int intx = p0.getInt(str);
             if (!intx) {
                p0 = "success";
             label_001d :
                AuthAgent$a ta = this.a;
                if (ta != null) {
                   ta.onComplete(new JSONObject().put(str, intx).put("msg", p0));
                }
             }else {
                p0 = p0.getString("msg");
                goto label_001d ;
             }
          }catch(org.json.JSONException e7){
             e7.printStackTrace();
             SLog.e("openSDK_LOG.AuthAgent", "CheckLoginListener response data format error");
          }
          return;
       }
    }
    public void onError(UiError p0){
       AuthAgent$a ta = this.a;
       if (ta != null) {
          ta.onError(p0);
       }
       return;
    }
}
