package com.tencent.open.SocialOperation$1;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.open.SocialOperation;
import com.tencent.tauth.IUiListener;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.tencent.open.log.SLog;
import com.tencent.tauth.UiError;
import org.json.JSONObject;

public class SocialOperation$1 extends DefaultUiListener	// class@000f2f
{
    public final IUiListener a;
    public final SocialOperation b;

    public void SocialOperation$1(SocialOperation p0,IUiListener p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onCancel(){
    }
    public void onComplete(Object p0){
       SLog.w("openSDK_LOG.GameAppOperation", "-->unbind group resp is: "+p0);
       if (p0 == null) {
          p0 = this.a;
          if (p0 != null) {
             p0.onError(new UiError(4001, "服务端错误，请稍后重试", "资格检查回包为null。"));
          }
          return;
       }else {
          SocialOperation$1 ta = this.a;
          if (ta != null) {
             ta.onComplete(p0);
          }
          return;
       }
    }
    public void onError(UiError p0){
       SLog.v("openSDK_LOG.GameAppOperation", "-->unbindQQGroup, error: "+p0);
       SocialOperation$1 ta = this.a;
       if (ta != null) {
          ta.onError(p0);
       }
       return;
    }
}
