package com.tencent.map.geolocation.TencentLocationRequest;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import java.lang.IllegalArgumentException;
import c.t.m.g.dk;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class TencentLocationRequest	// class@000e60
{
    public long a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public int g;
    public String h;
    public String i;
    public Bundle j;

    public void TencentLocationRequest(){
       super();
    }
    public void TencentLocationRequest(TencentLocationRequest p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.d = p0.d;
       this.f = p0.f;
       this.g = p0.g;
       this.c = p0.c;
       this.e = p0.e;
       this.i = p0.i;
       this.h = p0.h;
       Bundle uBundle = new Bundle();
       this.j = uBundle;
       uBundle.putAll(p0.j);
    }
    public static void copy(TencentLocationRequest p0,TencentLocationRequest p1){
       p0.a = p1.a;
       p0.b = p1.b;
       p0.d = p1.d;
       p0.f = p1.f;
       p0.g = p1.g;
       p0.e = p1.e;
       p0.c = p1.c;
       p0.i = p1.i;
       p0.h = p1.h;
       p0.j.clear();
       p0.j.putAll(p1.j);
    }
    public static TencentLocationRequest create(){
       TencentLocationRequest tencentLocat = new TencentLocationRequest();
       tencentLocat.a = 5000;
       tencentLocat.b = 3;
       tencentLocat.d = false;
       tencentLocat.e = false;
       tencentLocat.f = Long.MAX_VALUE;
       tencentLocat.g = Integer.MAX_VALUE;
       tencentLocat.c = true;
       tencentLocat.i = "";
       tencentLocat.h = "";
       tencentLocat.j = new Bundle();
       return tencentLocat;
    }
    public Bundle getExtras(){
       return this.j;
    }
    public long getInterval(){
       return this.a;
    }
    public String getPhoneNumber(){
       String str = this.j.getString("phoneNumber");
       if (str == null) {
          str = "";
       }
       return str;
    }
    public String getQQ(){
       return this.i;
    }
    public int getRequestLevel(){
       return this.b;
    }
    public String getSmallAppKey(){
       return this.h;
    }
    public boolean isAllowDirection(){
       return this.d;
    }
    public boolean isAllowGPS(){
       return this.c;
    }
    public boolean isIndoorLocationMode(){
       return this.e;
    }
    public TencentLocationRequest setAllowDirection(boolean p0){
       this.d = p0;
       return this;
    }
    public TencentLocationRequest setAllowGPS(boolean p0){
       this.c = p0;
       return this;
    }
    public TencentLocationRequest setIndoorLocationMode(boolean p0){
       this.e = p0;
       return this;
    }
    public TencentLocationRequest setInterval(long p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("interval should >= 0");
       }
       this.a = p0;
       return this;
    }
    public TencentLocationRequest setPhoneNumber(String p0){
       if (p0 == null) {
          p0 = "";
       }
       this.j.putString("phoneNumber", p0);
       return this;
    }
    public TencentLocationRequest setQQ(String p0){
       this.i = p0;
       return this;
    }
    public TencentLocationRequest setRequestLevel(int p0){
       if (!dk.a(p0)) {
          throw new IllegalArgumentException("request_level: "+p0+" not supported!");
       }
       this.b = p0;
       return this;
    }
    public TencentLocationRequest setSmallAppKey(String p0){
       if (!TextUtils.isEmpty(p0)) {
          this.h = p0;
       }
       return this;
    }
    public String toString(){
       return "TencentLocationRequest {interval = "+this.a+"ms , level = "+this.b+", allowGps = "+this.c+", allowDirection = "+this.d+", isIndoorMode = "+this.e+", QQ = "+this.i+"}";
    }
}
