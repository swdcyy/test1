package com.oplus.ocs.base.common.api.OplusApi;
import android.app.Activity;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.common.api.Api$ApiOptions;
import com.oplus.ocs.base.internal.ClientSettings;
import android.content.Context;
import java.lang.Object;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.common.api.l;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.oplus.ocs.base.common.api.Api$AbstractClientBuilder;
import android.os.Looper;
import com.oplus.ocs.base.common.api.Api$Client;
import com.oplus.ocs.base.common.api.BaseClient;
import com.oplus.ocs.base.common.api.InternalClient;
import com.oplus.ocs.base.IAuthenticationListener;
import com.oplus.ocs.base.utils.ServiceCheck;
import com.oplus.ocs.base.common.api.OnConnectionFailedListener;
import android.os.Handler;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;
import com.oplus.ocs.base.common.api.OplusApi$1;
import java.lang.Runnable;
import com.oplus.ocs.base.common.CapabilityInfo;
import android.os.Message;
import com.oplus.ocs.base.common.api.TaskListenerHolder$SuccessNotifier;
import com.oplus.ocs.base.common.api.TaskListenerHolder$FailureNotifier;
import com.oplus.ocs.base.task.Task;
import com.oplus.ocs.base.utils.a;
import com.oplus.ocs.base.task.TaskImpl;
import com.oplus.ocs.base.common.api.TaskListenerHolder;
import com.oplus.ocs.base.common.AuthResult;
import android.os.IBinder;
import com.oplus.ocs.base.common.api.Api$ClientKey;

public abstract class OplusApi	// class@000ad1
{
    public Api$ApiOptions a;
    public Context b;
    public Api c;
    public l d;
    public ClientSettings e;
    public boolean f;

    public void OplusApi(Activity p0,Api p1,Api$ApiOptions p2,ClientSettings p3){
       super(p0, p1, p2, p3, true);
    }
    public void OplusApi(Context p0,Api p1,Api$ApiOptions p2,ClientSettings p3){
       super(p0, p1, p2, p3, true);
    }
    public void OplusApi(Context p0,Api p1,Api$ApiOptions p2,ClientSettings p3,boolean p4){
       super();
       d.a(p0, "Null context is not permitted.");
       d.a(p1, "Api must not be null.");
       this.b = p0;
       this.c = p1;
       this.a = p2;
       this.e = p3;
       this.f = p4;
       if (p4) {
          l ol = l.a(p0);
          this.d = ol;
          ol.a(this, this.e);
          return;
       }else if(!p1.isAuth()){
          String clientName = this.getClientName();
          if (TextUtils.isEmpty(clientName)) {
             Api$Client uClient = this.getApi().getClientBuilder().buildClient(this.b, Looper.getMainLooper(), p3, null);
             if (uClient instanceof BaseClient) {
                clientName = uClient.getClientName();
             }
          }
          String str = clientName;
          if (TextUtils.isEmpty(str)) {
             return;
          }else {
             OplusApi tb = this.b;
             InternalClient internalClie = new InternalClient(tb, tb.getPackageName(), str, 0, false, null);
             TextUtils.isEmpty(str).connect4Stat();
          }
       }
       return;
    }
    public void OplusApi(Context p0,Api p1,ClientSettings p2){
       super(p0, p1, null, p2, true);
    }
    public static boolean checkInternal(Context p0){
       return ServiceCheck.a(p0);
    }
    public OplusApi addOnConnectionFailedListener(OnConnectionFailedListener p0){
       return this.addOnConnectionFailedListener(p0, new Handler(Looper.getMainLooper()));
    }
    public OplusApi addOnConnectionFailedListener(OnConnectionFailedListener p0,Handler p1){
       if (this.f != null) {
          l.a(this, p0, p1);
       }
       return this;
    }
    public OplusApi addOnConnectionSucceedListener(OnConnectionSucceedListener p0){
       return this.addOnConnectionSucceedListener(p0, new Handler(Looper.getMainLooper()));
    }
    public OplusApi addOnConnectionSucceedListener(OnConnectionSucceedListener p0,Handler p1){
       if (this.f != null) {
          this.d.a(this, p0, p1);
       }else if(p0 != null){
          if (p1 == null) {
             p0.onConnectionSucceed();
          }else {
             p1.post(new OplusApi$1(this, p0));
          }
       }
       return this;
    }
    public void addThis2Cache(){
       if (this.f != null) {
          this.d.a(this, this.e);
       }
       return;
    }
    public void checkAuthResult(CapabilityInfo p0){
    }
    public void checkCapability(){
       if (this.d != null) {
          l.a(this);
       }
       return;
    }
    public boolean checkExist(){
       if (ServiceCheck.check(this.b, "com.coloros.ocs.opencapabilityservice") || ServiceCheck.check(this.b, "com.oplus.ocs")) {
          return true;
       }
       return false;
    }
    public void disconnect(){
       if (this.f != null) {
          OplusApi td = this.d;
          Message message = td.b.obtainMessage();
          message.what = 1;
          message.obj = this.c;
          td.b.sendMessage(message);
       }
       return;
    }
    public Task doRegisterListener(Looper p0,TaskListenerHolder$SuccessNotifier p1,TaskListenerHolder$FailureNotifier p2){
       a.a("capability doRegisterListener");
       TaskImpl taskImpl = new TaskImpl();
       TaskListenerHolder taskListener = new TaskListenerHolder(p0, taskImpl, p1, p2);
       if (this.f != null) {
          l.a(this, taskListener);
       }
       return taskImpl;
    }
    public Task doRegisterListener(TaskListenerHolder$SuccessNotifier p0,TaskListenerHolder$FailureNotifier p1){
       return this.doRegisterListener(Looper.getMainLooper(), p0, p1);
    }
    public Api getApi(){
       return this.c;
    }
    public AuthResult getAuthResult(){
       if (this.f != null) {
          return l.d(this);
       }
       return null;
    }
    public String getClientName(){
       return "";
    }
    public IBinder getRemoteService(){
       if (this.f != null) {
          return l.b(this);
       }
       return null;
    }
    public int getRemoteVersion(){
       if (this.f != null) {
          return l.c(this);
       }
       return 0;
    }
    public abstract int getVersion();
    public abstract boolean hasFeature(String p0);
    public abstract void init();
    public boolean isConnected(){
       if (this.f != null) {
          return l.e(this);
       }
       return true;
    }
    public void releaseClientKey(){
       if (this.f != null) {
          l.a(this.c.getClientKey());
       }
       return;
    }
}
