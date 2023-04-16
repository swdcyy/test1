package com.tencent.connect.avatar.ImageActivity$5;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.connect.avatar.ImageActivity;
import java.lang.Object;
import android.widget.Button;
import android.widget.ProgressBar;
import org.json.JSONObject;
import java.lang.String;
import org.json.JSONException;
import com.tencent.open.b.e;
import com.tencent.connect.auth.QQToken;
import android.content.Intent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.app.Activity;
import android.content.pm.ResolveInfo;
import com.tencent.tauth.UiError;
import java.lang.CharSequence;

public class ImageActivity$5 extends DefaultUiListener	// class@000e33
{
    public final ImageActivity a;

    public void ImageActivity$5(ImageActivity p0){
       this.a = p0;
       super();
    }
    public void onCancel(){
    }
    public void onComplete(Object p0){
       boolean b = true;
       ImageActivity.e(this.a).setEnabled(b);
       int i = -1;
       ImageActivity.e(this.a).setTextColor(i);
       ImageActivity.f(this.a).setEnabled(b);
       ImageActivity.f(this.a).setTextColor(i);
       ImageActivity.d(this.a).setVisibility(8);
       try{
          i = p0.getInt("ret");
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       if (!i) {
          ImageActivity.b(this.a, "设置成功", 0);
          this.a.a("10658", 0);
          e.a().a(ImageActivity.k(this.a).getOpenId(), ImageActivity.k(this.a).getAppId(), "ANDROIDSDK.SETAVATAR.SUCCEED", "12", "3", "0");
          ImageActivity$5 ta = this.a;
          if (ImageActivity.l(ta) != null && !("").equals(ImageActivity.l(this.a))) {
             Intent intent = new Intent();
             intent.setClassName(ta, ImageActivity.l(this.a));
             if (ta.getPackageManager().resolveActivity(intent, 0) != null) {
                ta.startActivity(intent);
             }
          }
          ImageActivity.a(this.a, 0, p0.toString(), null, null);
          ImageActivity.j(this.a);
       }else {
          ImageActivity.b(this.a, "设置出错了，请重新登录再尝试下呢：）", b);
          e.a().a(ImageActivity.k(this.a).getOpenId(), ImageActivity.k(this.a).getAppId(), "ANDROIDSDK.SETAVATAR.SUCCEED", "12", "19", "1");
       }
       return;
    }
    public void onError(UiError p0){
       ImageActivity.e(this.a).setEnabled(true);
       ImageActivity.e(this.a).setTextColor(-1);
       ImageActivity.f(this.a).setEnabled(true);
       ImageActivity.f(this.a).setTextColor(-1);
       ImageActivity.f(this.a).setText("重试");
       ImageActivity.d(this.a).setVisibility(8);
       ImageActivity.a(this.a, true);
       ImageActivity.b(this.a, p0.errorMessage, true);
       this.a.a("10660", 0);
    }
}
