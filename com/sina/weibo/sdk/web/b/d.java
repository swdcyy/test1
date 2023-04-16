package com.sina.weibo.sdk.web.b.d;
import com.sina.weibo.sdk.web.b.b;
import android.content.Context;
import com.sina.weibo.sdk.auth.AuthInfo;
import java.lang.String;
import android.os.Bundle;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.web.b.b$a;
import com.sina.weibo.sdk.web.WebData;
import com.sina.weibo.sdk.a.d;
import com.sina.weibo.sdk.web.b.d$1;
import com.sina.weibo.sdk.net.c;
import com.sina.weibo.sdk.a.b;
import com.sina.weibo.sdk.a.b$a;
import com.sina.weibo.sdk.a.c;
import java.lang.StringBuilder;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.ImageObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import com.sina.weibo.sdk.b.e;
import java.io.IOException;
import java.lang.Exception;
import android.net.Uri;
import android.net.Uri$Builder;
import java.lang.Object;

public final class d extends b	// class@000be9
{
    public WeiboMultiMessage aE;
    public byte[] aF;
    public String aG;
    public String ae;
    public String packageName;
    public String text;

    public void d(Context p0){
       super();
       this.Z = p0;
    }
    public void d(AuthInfo p0){
       super(p0, 1, null, null);
    }
    public final void a(Bundle p0){
       d taE = this.aE;
       if (taE != null) {
          taE.writeToBundle(p0);
       }
       p0.putString("token", this.ae);
       p0.putString("packageName", this.packageName);
       return;
    }
    public final void a(b$a p0){
       d uod = new d(this.Z, new String(this.aF), this.aC.a().getAppKey(), this.ae, new d$1(this, p0));
       b$a.k().a(v7);
    }
    public final void b(Bundle p0){
       ImageObject imageData;
       FileInputStream uFileInputSt;
       WeiboMultiMessage weiboMultiMe = new WeiboMultiMessage();
       this.aE = weiboMultiMe;
       weiboMultiMe.readFromBundle(p0);
       this.ae = p0.getString("token");
       this.packageName = p0.getString("packageName");
       StringBuilder str = "";
       weiboMultiMe = this.aE.textObject;
       if (weiboMultiMe != null) {
          str = str+weiboMultiMe.text;
       }
       weiboMultiMe = this.aE.imageObject;
       if (weiboMultiMe != null) {
          ImageObject imagePath = weiboMultiMe.imagePath;
          if (!TextUtils.isEmpty(imagePath)) {
             File uFile = new File(imagePath);
             if (uFile.exists() && (uFile.canRead() && uFile.length() > 0)) {
                byte[] uobyteArray = new byte[(int)uFile.length()];
                try{
                   int i = 0;
                   try{
                      uFileInputSt = new FileInputStream(uFile);
                      uFileInputSt.read(uobyteArray);
                      uobyteArray = e.b(uobyteArray);
                      try{
                         this.aF = uobyteArray;
                         uFileInputSt.close();
                      }catch(java.io.IOException e0){
                         e0.printStackTrace();
                      }
                   }catch(java.lang.Exception e1){
                      FileInputStream uFileInputSt1 = uFileInputSt;
                   }
                   e1.printStackTrace();
                   if (i) {
                      try{
                         i.close();
                      }catch(java.io.IOException e1){
                         e1.printStackTrace();
                      }
                   }
                }catch(java.lang.Exception e1){
                   goto label_007b ;
                }
             }
          }
       }
    }
    public final String getUrl(){
       Uri$Builder uBuilder = Uri.parse("https://service.weibo.com/share/mobilesdk.php").buildUpon();
       uBuilder.appendQueryParameter("title", this.text);
       uBuilder.appendQueryParameter("version", "0041005000");
       String appKey = this.aC.a().getAppKey();
       if (!TextUtils.isEmpty(appKey)) {
          uBuilder.appendQueryParameter("source", appKey);
       }
       if (!TextUtils.isEmpty(this.ae)) {
          uBuilder.appendQueryParameter("access_token", this.ae);
       }
       if (!TextUtils.isEmpty(this.packageName)) {
          uBuilder.appendQueryParameter("packagename", this.packageName);
       }
       if (!TextUtils.isEmpty(this.aG)) {
          uBuilder.appendQueryParameter("picinfo", this.aG);
       }
       uBuilder.appendQueryParameter("luicode", "10000360");
       uBuilder.appendQueryParameter("lfid", ("OP_").concat(String.valueOf(appKey)));
       return uBuilder.build().toString();
    }
    public final boolean t(){
       d taF = this.aF;
       if (taF != null && taF.length > 0) {
          return true;
       }
       return super.t();
    }
}
