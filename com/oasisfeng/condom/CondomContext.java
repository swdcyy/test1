package com.oasisfeng.condom.CondomContext;
import android.content.ContextWrapper;
import com.oasisfeng.condom.CondomCore;
import android.content.Context;
import java.lang.String;
import com.oasisfeng.condom.CondomContext$14;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.UserHandle;
import android.content.ComponentName;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Bundle;
import com.oasisfeng.condom.CondomOptions;
import android.app.Application;
import com.oasisfeng.condom.CondomApplication;
import com.oasisfeng.condom.OutboundType;
import java.lang.Boolean;
import com.oasisfeng.condom.CondomContext$1;
import java.lang.Object;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedureThrows;
import com.oasisfeng.condom.CondomCore$CondomEvent;
import android.os.Process;
import com.oasisfeng.condom.util.Lazy;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import com.oasisfeng.condom.CondomContext$3;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import com.oasisfeng.condom.CondomContext$4;
import com.oasisfeng.condom.CondomContext$5;
import com.oasisfeng.condom.CondomContext$6;
import com.oasisfeng.condom.CondomContext$7;
import com.oasisfeng.condom.CondomContext$8;
import com.oasisfeng.condom.CondomContext$9;
import com.oasisfeng.condom.CondomContext$10;
import com.oasisfeng.condom.CondomContext$11;
import com.oasisfeng.condom.CondomContext$12;
import com.oasisfeng.condom.CondomContext$13;
import com.oasisfeng.condom.CondomContext$2;

public class CondomContext extends ContextWrapper	// class@000a6d
{
    public final String TAG;
    public final Context mApplicationContext;
    public final Lazy mBaseContext;
    public CondomCore mCondom;

    public void CondomContext(CondomCore p0,Context p1,String p2){
       super(p0.mBase);
       this.mCondom = p0;
       if (p1 != null) {
       }else {
          ContextWrapper uContextWrap = this;
       }
       this.mApplicationContext = p1;
       this.mBaseContext = new CondomContext$14(this);
       this.TAG = CondomCore.buildLogTag("Condom", "Condom.", p2);
       return;
    }
    public static boolean access$001(CondomContext p0,Intent p1,ServiceConnection p2,int p3){
       return super.bindService(p1, p2, p3);
    }
    public static void access$1001(CondomContext p0,Intent p1,UserHandle p2){
       super.sendStickyBroadcastAsUser(p1, p2);
    }
    public static ComponentName access$101(CondomContext p0,Intent p1){
       return super.startService(p1);
    }
    public static void access$1101(CondomContext p0,Intent p1,BroadcastReceiver p2,Handler p3,int p4,String p5,Bundle p6){
       super.sendStickyOrderedBroadcast(p1, p2, p3, p4, p5, p6);
    }
    public static void access$1201(CondomContext p0,Intent p1,UserHandle p2,BroadcastReceiver p3,Handler p4,int p5,String p6,Bundle p7){
       super.sendStickyOrderedBroadcastAsUser(p1, p2, p3, p4, p5, p6, p7);
    }
    public static void access$201(CondomContext p0,Intent p1){
       super.sendBroadcast(p1);
    }
    public static void access$301(CondomContext p0,Intent p1,String p2){
       super.sendBroadcast(p1, p2);
    }
    public static void access$401(CondomContext p0,Intent p1,UserHandle p2){
       super.sendBroadcastAsUser(p1, p2);
    }
    public static void access$501(CondomContext p0,Intent p1,UserHandle p2,String p3){
       super.sendBroadcastAsUser(p1, p2, p3);
    }
    public static void access$601(CondomContext p0,Intent p1,String p2){
       super.sendOrderedBroadcast(p1, p2);
    }
    public static void access$701(CondomContext p0,Intent p1,String p2,BroadcastReceiver p3,Handler p4,int p5,String p6,Bundle p7){
       super.sendOrderedBroadcast(p1, p2, p3, p4, p5, p6, p7);
    }
    public static void access$801(CondomContext p0,Intent p1,UserHandle p2,String p3,BroadcastReceiver p4,Handler p5,int p6,String p7,Bundle p8){
       super.sendOrderedBroadcastAsUser(p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public static void access$901(CondomContext p0,Intent p1){
       super.sendStickyBroadcast(p1);
    }
    public static CondomContext wrap(Context p0,String p1){
       return CondomContext.wrap(p0, p1, new CondomOptions());
    }
    public static CondomContext wrap(Context p0,String p1,CondomOptions p2){
       CondomContext uCondomConte1;
       if (p0 instanceof CondomContext) {
          return p0;
       }
       Context applicationC = p0.getApplicationContext();
       CondomCore uCondomCore = new CondomCore(p0, p2, CondomCore.buildLogTag("Condom", "Condom.", p1));
       if (applicationC instanceof Application) {
          Context uContext = applicationC;
          CondomApplication uCondomAppli = new CondomApplication(uCondomCore, uContext, p1);
          CondomContext uCondomConte = new CondomContext(uCondomCore, uCondomAppli, p1);
          uCondomConte1 = (p0 == applicationC)? uCondomConte: new CondomContext(uCondomCore, uContext, p1);
          uCondomAppli.attachBaseContext(uCondomConte1);
          return uCondomConte;
       }else if(p0 == applicationC){
          p0 = null;
       }else {
          uCondomConte1 = new CondomContext(uCondomCore, applicationC, p1);
       }
       return new CondomContext(uCondomCore, p0, p1);
    }
    public boolean bindService(Intent p0,ServiceConnection p1,int p2){
       boolean b = this.mCondom.proceed(OutboundType.BIND_SERVICE, p0, Boolean.FALSE, new CondomContext$1(this, p0, p1, p2)).booleanValue();
       if (b) {
          this.mCondom.logIfOutboundPass(this.TAG, p0, CondomCore.getTargetPackage(p0), CondomCore$CondomEvent.BIND_PASS);
       }
       return b;
    }
    public int checkPermission(String p0,int p1,int p2){
       int i = (p1 == Process.myPid() && (p2 == Process.myUid() && this.mCondom.shouldSpoofPermission(p0)))? 0: super.checkPermission(p0, p1, p2);
       return i;
    }
    public int checkSelfPermission(String p0){
       int i = (this.mCondom.shouldSpoofPermission(p0))? 0: super.checkSelfPermission(p0);
       return i;
    }
    public Context getApplicationContext(){
       return this.mApplicationContext;
    }
    public Context getBaseContext(){
       this.mCondom.logConcern(this.TAG, "getBaseContext");
       return this.mBaseContext.get();
    }
    public ContentResolver getContentResolver(){
       return this.mCondom.getContentResolver();
    }
    public PackageManager getPackageManager(){
       return this.mCondom.getPackageManager();
    }
    public Object getSystemService(String p0){
       Object systemServic = this.mCondom.getSystemService(p0);
       if (systemServic != null) {
       }else {
          systemServic = super.getSystemService(p0);
       }
       return systemServic;
    }
    public CondomContext preventBroadcastToBackgroundPackages(boolean p0){
       this.mCondom.mExcludeBackgroundReceivers = p0;
       return this;
    }
    public CondomContext preventServiceInBackgroundPackages(boolean p0){
       if (Build$VERSION.SDK_INT < 26) {
          this.mCondom.mExcludeBackgroundServices = p0;
       }
       return this;
    }
    public CondomContext preventWakingUpStoppedPackages(boolean p0){
       this.mCondom.mExcludeStoppedPackages = p0;
       return this;
    }
    public void sendBroadcast(Intent p0){
       this.mCondom.proceedBroadcast(this, p0, new CondomContext$3(this, p0), null);
    }
    public void sendBroadcast(Intent p0,String p1){
       this.mCondom.proceedBroadcast(this, p0, new CondomContext$4(this, p0, p1), null);
    }
    public void sendBroadcastAsUser(Intent p0,UserHandle p1){
       this.mCondom.proceedBroadcast(this, p0, new CondomContext$5(this, p0, p1), null);
    }
    public void sendBroadcastAsUser(Intent p0,UserHandle p1,String p2){
       this.mCondom.proceedBroadcast(this, p0, new CondomContext$6(this, p0, p1, p2), null);
    }
    public void sendOrderedBroadcast(Intent p0,String p1){
       this.mCondom.proceedBroadcast(this, p0, new CondomContext$7(this, p0, p1), null);
    }
    public void sendOrderedBroadcast(Intent p0,String p1,BroadcastReceiver p2,Handler p3,int p4,String p5,Bundle p6){
       CondomContext$8 u8 = new CondomContext$8(this, p0, p1, p2, p3, p4, p5, p6);
       this.mCondom.proceedBroadcast(this, p0, v11, p2);
    }
    public void sendOrderedBroadcastAsUser(Intent p0,UserHandle p1,String p2,BroadcastReceiver p3,Handler p4,int p5,String p6,Bundle p7){
       CondomContext$9 u9 = new CondomContext$9(this, p0, p1, p2, p3, p4, p5, p6, p7);
       this.mCondom.proceedBroadcast(this, p0, v12, p3);
    }
    public void sendStickyBroadcast(Intent p0){
       this.mCondom.proceedBroadcast(this, p0, new CondomContext$10(this, p0), null);
    }
    public void sendStickyBroadcastAsUser(Intent p0,UserHandle p1){
       this.mCondom.proceedBroadcast(this, p0, new CondomContext$11(this, p0, p1), null);
    }
    public void sendStickyOrderedBroadcast(Intent p0,BroadcastReceiver p1,Handler p2,int p3,String p4,Bundle p5){
       CondomContext$12 u12 = new CondomContext$12(this, p0, p1, p2, p3, p4, p5);
       this.mCondom.proceedBroadcast(this, p0, v10, p1);
    }
    public void sendStickyOrderedBroadcastAsUser(Intent p0,UserHandle p1,BroadcastReceiver p2,Handler p3,int p4,String p5,Bundle p6){
       CondomContext$13 u13 = new CondomContext$13(this, p0, p1, p2, p3, p4, p5, p6);
       this.mCondom.proceedBroadcast(this, p0, v11, p2);
    }
    public CondomContext setDryRun(boolean p0){
       CondomContext tmCondom = this.mCondom;
       if (p0 == tmCondom.mDryRun) {
          return this;
       }
       tmCondom.mDryRun = p0;
       return this;
    }
    public ComponentName startService(Intent p0){
       ComponentName uComponentNa = this.mCondom.proceed(OutboundType.START_SERVICE, p0, null, new CondomContext$2(this, p0));
       if (uComponentNa != null) {
          this.mCondom.logIfOutboundPass(this.TAG, p0, uComponentNa.getPackageName(), CondomCore$CondomEvent.START_PASS);
       }
       return uComponentNa;
    }
}
