package com.tencent.open.SocialOperation$3;
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

public class SocialOperation$3 extends DefaultUiListener	// class@000f31
{
    public final IUiListener a;
    public final Activity b;
    public final Intent c;
    public final SocialOperation d;

    public void SocialOperation$3(SocialOperation p0,IUiListener p1,Activity p2,Intent p3){
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
       SLog.w(str, "-->bind group resp is: "+p0);
       if (p0 == null) {
          p0 = this.a;
          if (p0 != null) {
             p0.onError(new UiError(4001, "����˴������Ժ�����", "�ʸ���ذ�Ϊnull��"));
          }
          return;
       }else if(p0.optInt("bind") != 1){
          try{
             SocialOperation.b(this.d, this.b, 0x2780, this.c, false);
          }catch(java.lang.Exception e6){
             SLog.e(str, "-->bind group, start activity exception.", e6);
             SocialOperation.a(this.d, this.b);
          }
       }else {
          p0 = this.a;
          if (p0 != null) {
             p0.onError(new UiError(3002, "��Ⱥ�Ѱ󶨣�", "�󶨹���Ⱥ�����ٴΰ󶨡�"));
          }
          SLog.i(str, "-->bindQQGroup\(\) binded return.");
       }
    }
    public void onError(UiError p0){
       SLog.v("openSDK_LOG.GameAppOperation", "-->bindQQGroup, error: "+p0);
       SocialOperation$3 ta = this.a;
       if (ta != null) {
          ta.onError(p0);
       }
       return;
    }
}