package com.tencent.connect.avatar.ImageActivity$6;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.connect.avatar.ImageActivity;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import android.os.Handler;
import com.tencent.connect.avatar.ImageActivity$6$1;
import java.lang.Runnable;
import org.json.JSONException;
import com.tencent.tauth.UiError;

public class ImageActivity$6 extends DefaultUiListener	// class@000e35
{
    public final ImageActivity a;

    public void ImageActivity$6(ImageActivity p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       if (ImageActivity.n(this.a) < 2) {
          ImageActivity.o(this.a);
       }
       return;
    }
    public void onCancel(){
    }
    public void onComplete(Object p0){
       int i = -1;
       try{
          i = p0.getInt("ret");
          if (!i) {
             ImageActivity.m(this.a).post(new ImageActivity$6$1(this, p0.getString("nickname")));
             this.a.a("10659", 0);
          }else {
             this.a.a("10661", 0);
          }
       }catch(org.json.JSONException e6){
          e6.printStackTrace();
       }
       if (i) {
          this.a(i);
       }
       return;
    }
    public void onError(UiError p0){
       this.a(0);
    }
}
