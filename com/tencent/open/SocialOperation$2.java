package com.tencent.open.SocialOperation$2;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.open.SocialOperation;
import com.tencent.tauth.IUiListener;
import android.app.Activity;
import android.content.Intent;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.tencent.open.log.SLog;
import com.tencent.tauth.UiError;
import org.json.JSONObject;
import java.lang.Throwable;

public class SocialOperation$2 extends DefaultUiListener	// class@000f30
{
    public final IUiListener a;
    public final Activity b;
    public final Intent c;
    public final SocialOperation d;

    public void SocialOperation$2(SocialOperation p0,IUiListener p1,Activity p2,Intent p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onCancel(){
    }
    public void onComplete(Object p0){
       String str = "openSDK_LOG.GameAppOperation";
       SLog.w(str, "-->join group resp is: "+p0);
       if (p0 == null) {
          p0 = this.a;
          if (p0 != null) {
             p0.onError(new UiError(4001, "服务端错误，请稍后重试", "资格检查回包为null。"));
          }
          return;
       }else if(p0.optInt("bind") == 1){
          try{
             SocialOperation.a(this.d, this.b, 0x277f, this.c, false);
          }catch(java.lang.Exception e6){
             SLog.e(str, "-->join group, start activity exception.", e6);
             SocialOperation.a(this.d, this.b);
          }
       }else {
          p0 = this.a;
          if (p0 != null) {
             p0.onError(new UiError(3003, "该组织未绑群，无法加入", "该组织未绑群，无法加入。"));
          }
       }
    }
    public void onError(UiError p0){
       SLog.v("openSDK_LOG.GameAppOperation", "-->joinQQGroup, error: "+p0);
       SocialOperation$2 ta = this.a;
       if (ta != null) {
          ta.onError(p0);
       }
       return;
    }
}
