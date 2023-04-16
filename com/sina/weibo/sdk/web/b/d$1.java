package com.sina.weibo.sdk.web.b.d$1;
import com.sina.weibo.sdk.net.c;
import com.sina.weibo.sdk.web.b.d;
import com.sina.weibo.sdk.web.b.b$a;
import java.lang.Object;
import java.lang.String;
import com.sina.weibo.sdk.b.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.Throwable;

public final class d$1 implements c	// class@000be8
{
    public final b$a aH;
    public final d aI;

    public void d$1(d p0,b$a p1){
       this.aI = p0;
       this.aH = p1;
       super();
    }
    public final void a(Object p0){
       int i;
       c.a("WbShareTag", ("handle image result :").concat(String.valueOf(p0)));
       if (!TextUtils.isEmpty(p0)) {
          try{
             JSONObject jSONObject = new JSONObject(p0);
             i = jSONObject.optInt("code");
             String str = jSONObject.optString("data");
             if (i == 1 && !TextUtils.isEmpty(str)) {
                i.aG = str;
                i = this.aH;
                if (i != null) {
                   i.onComplete();
                   return;
                }
             }else {
                i = this.aH;
                if (i != null) {
                   i.onError("图片内容不合适，禁止上传！");
                }
             }
             return;
          }catch(org.json.JSONException e3){
             e3.printStackTrace();
             i = this.aH;
             if (i != null) {
                i.onError("解析服务端返回的字符串时发生异常！");
             }
             return;
          }
       }else {
          p0 = this.aH;
          if (p0 != null) {
             p0.onError("处理图片，服务端返回null!");
          }
          return;
       }
    }
    public final void onError(Throwable p0){
       d$1 taH = this.aH;
       if (taH != null) {
          taH.onError(p0.getMessage());
       }
       return;
    }
}
