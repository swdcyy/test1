package com.hpplay.sdk.source.process.b$1;
import com.hpplay.sdk.source.browse.api.AuthListener;
import com.hpplay.sdk.source.process.b;
import java.lang.Object;
import java.lang.String;
import com.hpplay.sdk.source.a.a;
import com.hpplay.sdk.source.g;
import java.lang.Throwable;
import java.lang.StringBuilder;

public class b$1 implements AuthListener	// class@000690
{
    public final b a;

    public void b$1(b p0){
       this.a = p0;
       super();
    }
    public void onAuthFailed(int p0){
       String str = "LelinkSdkManager";
       try{
          a.f(str, "onAuthFailed ");
          if (b.a(this.a) != null) {
             b.a(this.a).onAuthFailed(p0);
          label_0018 :
             if (b.b(this.a) != null) {
                b.b(this.a).onAuthFailed(p0);
             }
          }else {
             goto label_0018 ;
          }
       }catch(java.lang.Exception e3){
          a.b(str, e3);
       }
       return;
    }
    public void onAuthSuccess(String p0,String p1){
       boolean b;
       String str = "LelinkSdkManager";
       try{
          StringBuilder str1 = "onAuthSuccess "+p0+" tid "+p1+"  mPcAuthListener == null ";
          if (b.a(this.a) == null) {
             b = true;
          label_0027 :
             a.f(str, str1+b);
             if (b.a(this.a) != null) {
                b.a(this.a).onAuthSuccess(p0, p1);
             }
             if (b.b(this.a) != null) {
                b.b(this.a).onAuthSuccess(p0, p1);
             }
          }else {
             b = false;
             goto label_0027 ;
          }
       }catch(java.lang.Exception e4){
          a.b(str, e4);
       }
       return;
    }
}
