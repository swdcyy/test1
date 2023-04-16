package com.oasisfeng.condom.CondomApplication;
import android.app.Application;
import com.oasisfeng.condom.CondomCore;
import java.lang.String;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import com.oasisfeng.condom.OutboundType;
import java.lang.Boolean;
import com.oasisfeng.condom.CondomApplication$1;
import java.lang.Object;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedureThrows;
import com.oasisfeng.condom.CondomCore$CondomEvent;
import android.os.Process;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.app.Application$ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks;
import android.app.Application$OnProvideAssistDataListener;
import com.oasisfeng.condom.CondomApplication$3;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import android.content.BroadcastReceiver;
import com.oasisfeng.condom.CondomApplication$4;
import android.os.UserHandle;
import com.oasisfeng.condom.CondomApplication$5;
import com.oasisfeng.condom.CondomApplication$6;
import com.oasisfeng.condom.CondomApplication$7;
import android.os.Handler;
import android.os.Bundle;
import com.oasisfeng.condom.CondomApplication$8;
import com.oasisfeng.condom.CondomApplication$9;
import com.oasisfeng.condom.CondomApplication$10;
import com.oasisfeng.condom.CondomApplication$11;
import com.oasisfeng.condom.CondomApplication$12;
import com.oasisfeng.condom.CondomApplication$13;
import android.content.ComponentName;
import com.oasisfeng.condom.CondomApplication$2;

public class CondomApplication extends Application	// class@000a5c
{
    public final CondomCore b;
    public final Application c;
    public final String d;

    public void CondomApplication(CondomCore p0,Application p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = CondomCore.buildLogTag("CondomApp", "CondomApp.", p2);
    }
    public void attachBaseContext(Context p0){
       super.attachBaseContext(p0);
    }
    public boolean bindService(Intent p0,ServiceConnection p1,int p2){
       boolean b = this.b.proceed(OutboundType.BIND_SERVICE, p0, Boolean.FALSE, new CondomApplication$1(this, p0, p1, p2)).booleanValue();
       if (b) {
          this.b.logIfOutboundPass(this.d, p0, CondomCore.getTargetPackage(p0), CondomCore$CondomEvent.BIND_PASS);
       }
       return b;
    }
    public int checkPermission(String p0,int p1,int p2){
       int i = (p1 == Process.myPid() && (p2 == Process.myUid() && this.b.shouldSpoofPermission(p0)))? 0: super.checkPermission(p0, p1, p2);
       return i;
    }
    public int checkSelfPermission(String p0){
       int i = (this.b.shouldSpoofPermission(p0))? 0: super.checkSelfPermission(p0);
       return i;
    }
    public Context getApplicationContext(){
       return this;
    }
    public Context getBaseContext(){
       this.b.logConcern(this.d, "Application.getBaseContext");
       return super.getBaseContext();
    }
    public ContentResolver getContentResolver(){
       return this.b.getContentResolver();
    }
    public PackageManager getPackageManager(){
       return this.b.getPackageManager();
    }
    public Object getSystemService(String p0){
       Object systemServic = this.b.getSystemService(p0);
       if (systemServic != null) {
       }else {
          systemServic = super.getSystemService(p0);
       }
       return systemServic;
    }
    public void registerActivityLifecycleCallbacks(Application$ActivityLifecycleCallbacks p0){
       this.c.registerActivityLifecycleCallbacks(p0);
    }
    public void registerComponentCallbacks(ComponentCallbacks p0){
       this.c.registerComponentCallbacks(p0);
    }
    public void registerOnProvideAssistDataListener(Application$OnProvideAssistDataListener p0){
       this.c.registerOnProvideAssistDataListener(p0);
    }
    public void sendBroadcast(Intent p0){
       this.b.proceedBroadcast(this, p0, new CondomApplication$3(this, p0), null);
    }
    public void sendBroadcast(Intent p0,String p1){
       this.b.proceedBroadcast(this, p0, new CondomApplication$4(this, p0, p1), null);
    }
    public void sendBroadcastAsUser(Intent p0,UserHandle p1){
       this.b.proceedBroadcast(this, p0, new CondomApplication$5(this, p0, p1), null);
    }
    public void sendBroadcastAsUser(Intent p0,UserHandle p1,String p2){
       this.b.proceedBroadcast(this, p0, new CondomApplication$6(this, p0, p1, p2), null);
    }
    public void sendOrderedBroadcast(Intent p0,String p1){
       this.b.proceedBroadcast(this, p0, new CondomApplication$7(this, p0, p1), null);
    }
    public void sendOrderedBroadcast(Intent p0,String p1,BroadcastReceiver p2,Handler p3,int p4,String p5,Bundle p6){
       CondomApplication$8 u8 = new CondomApplication$8(this, p0, p1, p2, p3, p4, p5, p6);
       this.b.proceedBroadcast(this, p0, v11, p2);
    }
    public void sendOrderedBroadcastAsUser(Intent p0,UserHandle p1,String p2,BroadcastReceiver p3,Handler p4,int p5,String p6,Bundle p7){
       CondomApplication$9 u9 = new CondomApplication$9(this, p0, p1, p2, p3, p4, p5, p6, p7);
       this.b.proceedBroadcast(this, p0, v12, p3);
    }
    public void sendStickyBroadcast(Intent p0){
       this.b.proceedBroadcast(this, p0, new CondomApplication$10(this, p0), null);
    }
    public void sendStickyBroadcastAsUser(Intent p0,UserHandle p1){
       this.b.proceedBroadcast(this, p0, new CondomApplication$11(this, p0, p1), null);
    }
    public void sendStickyOrderedBroadcast(Intent p0,BroadcastReceiver p1,Handler p2,int p3,String p4,Bundle p5){
       CondomApplication$12 u12 = new CondomApplication$12(this, p0, p1, p2, p3, p4, p5);
       this.b.proceedBroadcast(this, p0, v10, p1);
    }
    public void sendStickyOrderedBroadcastAsUser(Intent p0,UserHandle p1,BroadcastReceiver p2,Handler p3,int p4,String p5,Bundle p6){
       CondomApplication$13 u13 = new CondomApplication$13(this, p0, p1, p2, p3, p4, p5, p6);
       this.b.proceedBroadcast(this, p0, v11, p2);
    }
    public ComponentName startService(Intent p0){
       ComponentName uComponentNa = this.b.proceed(OutboundType.START_SERVICE, p0, null, new CondomApplication$2(this, p0));
       if (uComponentNa != null) {
          this.b.logIfOutboundPass(this.d, p0, uComponentNa.getPackageName(), CondomCore$CondomEvent.START_PASS);
       }
       return uComponentNa;
    }
    public void unregisterActivityLifecycleCallbacks(Application$ActivityLifecycleCallbacks p0){
       this.c.unregisterActivityLifecycleCallbacks(p0);
    }
    public void unregisterComponentCallbacks(ComponentCallbacks p0){
       this.c.unregisterComponentCallbacks(p0);
    }
    public void unregisterOnProvideAssistDataListener(Application$OnProvideAssistDataListener p0){
       this.c.unregisterOnProvideAssistDataListener(p0);
    }
}
