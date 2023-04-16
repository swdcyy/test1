package com.heytap.mcssdk.d.a;
import com.heytap.mcssdk.d.c;
import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.mcssdk.c.b;
import java.lang.String;
import com.heytap.mcssdk.utils.b;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.heytap.mcssdk.utils.d;
import java.lang.Exception;

public class a extends c	// class@000532
{

    public void a(){
       super();
    }
    public BaseMode a(Context p0,int p1,Intent p2){
       if (4105 == p1) {
          return this.a(p2, p1);
       }
       return null;
    }
    public BaseMode a(Intent p0,int p1){
       try{
          b uob = new b();
          uob.a(Integer.parseInt(b.d(p0.getStringExtra("command"))));
          uob.b(Integer.parseInt(b.d(p0.getStringExtra("code"))));
          uob.e(b.d(p0.getStringExtra("content")));
          uob.a(b.d(p0.getStringExtra("appKey")));
          uob.b(b.d(p0.getStringExtra("appSecret")));
          uob.f(b.d(p0.getStringExtra("appPackage")));
          d.b("OnHandleIntent-message:"+uob.toString());
          return uob;
       }catch(java.lang.Exception e2){
          d.b("OnHandleIntent--"+e2.getMessage());
          return null;
       }
    }
}
