package com.sina.weibo.sdk.web.b.b;
import java.lang.Object;
import com.sina.weibo.sdk.auth.AuthInfo;
import java.lang.String;
import com.sina.weibo.sdk.web.WebData;
import java.lang.StringBuilder;
import java.lang.System;
import android.os.Bundle;
import com.sina.weibo.sdk.web.b.b$a;
import android.os.Parcelable;
import android.content.Context;

public abstract class b	// class@000be6
{
    public Context Z;
    public WebData aC;
    public String aD;

    public void b(){
       super();
    }
    public void b(AuthInfo p0,int p1,String p2,String p3){
       super();
       this.aC = new WebData(p0, p1, p2, p3);
       this.aD = System.currentTimeMillis();
    }
    public abstract void a(Bundle p0);
    public void a(b$a p0){
    }
    public abstract void b(Bundle p0);
    public abstract String getUrl();
    public final void readFromBundle(Bundle p0){
       this.aC = p0.getParcelable("web_data");
       this.aD = p0.getString("_weibo_transaction");
       this.b(p0);
    }
    public final void setContext(Context p0){
       this.Z = p0;
    }
    public boolean t(){
       return false;
    }
    public final WebData u(){
       return this.aC;
    }
    public final Bundle writeToBundle(Bundle p0){
       p0.putParcelable("web_data", this.aC);
       int type = this.aC.getType();
       int i = 1;
       if (type != i) {
          i = 2;
          if (type != i) {
             String str = 3;
             if (type == str) {
                p0.putInt("web_type", str);
             }
          }else {
             p0.putInt("web_type", i);
          }
       }else {
          p0.putInt("web_type", i);
       }
       p0.putString("_weibo_transaction", this.aD);
       this.a(p0);
       return p0;
    }
}
