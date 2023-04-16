package com.vivo.push.ups.VUpsManager;
import java.lang.Object;
import com.vivo.push.ups.VUpsManager$a;
import android.content.Context;
import android.os.Bundle;
import java.lang.String;
import com.vivo.push.ups.UPSRegisterCallback;
import com.vivo.push.PushClient;
import com.vivo.push.ups.a;
import com.vivo.push.IPushActionListener;
import com.vivo.push.ups.UPSTurnCallback;
import com.vivo.push.ups.d;
import com.vivo.push.ups.c;
import com.vivo.push.ups.b;

public class VUpsManager	// class@0010a3
{

    public void VUpsManager(){
       super();
    }
    public static VUpsManager getInstance(){
       return VUpsManager$a.a();
    }
    public void onCommandResult(Context p0,Bundle p1){
    }
    public void registerToken(Context p0,String p1,String p2,String p3,UPSRegisterCallback p4){
       PushClient.getInstance(p0).turnOnPush(new a(this, p4, p0));
    }
    public void turnOffPush(Context p0,UPSTurnCallback p1){
       PushClient.getInstance(p0).turnOffPush(new d(this, p1));
    }
    public void turnOnPush(Context p0,UPSTurnCallback p1){
       PushClient.getInstance(p0).turnOnPush(new c(this, p1));
    }
    public void unRegisterToken(Context p0,UPSRegisterCallback p1){
       PushClient.getInstance(p0).turnOffPush(new b(this, p1));
    }
}
