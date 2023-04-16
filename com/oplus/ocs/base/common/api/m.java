package com.oplus.ocs.base.common.api.m;
import com.oplus.ocs.base.common.api.OplusApiClient;
import android.content.Context;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.common.api.Api$ApiOptions;
import com.oplus.ocs.base.internal.ClientSettings;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import com.oplus.ocs.base.common.api.Api$AbstractClientBuilder;
import android.os.Looper;
import com.oplus.ocs.base.common.api.Api$Client;
import com.oplus.ocs.base.common.api.TaskListenerHolder;
import java.util.concurrent.locks.Lock;
import java.lang.Exception;
import com.oplus.ocs.base.common.AuthResult;
import android.os.IBinder;
import com.oplus.ocs.base.common.api.i;
import com.oplus.ocs.base.common.api.j;
import com.oplus.ocs.base.common.api.OnConnectionFailedListener;
import android.os.Handler;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;

public class m implements OplusApiClient	// class@000af4
{
    public Lock b;
    public Api c;
    public Api$Client d;
    public static final String a = "m";

    public void m(Context p0,Api p1,Api$ApiOptions p2,ClientSettings p3){
       super();
       this.b = new ReentrantLock();
       this.c = p1;
       this.d = p1.getClientBuilder().buildClient(p0, Looper.getMainLooper(), p3, p2);
    }
    public void addQueue(TaskListenerHolder p0){
       m td = this.d;
       if (td != null) {
          td.addQueue(p0);
       }
       return;
    }
    public void connect(){
       m tb = this.b;
       try{
          tb.lock();
          tb = this.d;
          if (tb != null) {
             tb.connect();
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       this.b.unlock();
       return;
    }
    public void disconnect(){
       m tb = this.b;
       try{
          tb.lock();
          tb = this.d;
          if (tb != null && tb.isConnected()) {
             this.d.disconnect();
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       this.b.unlock();
       return;
    }
    public Api getApi(){
       return this.c;
    }
    public AuthResult getAuthResult(){
       m td = this.d;
       if (td != null) {
          return td.getAuthResult();
       }
       return null;
    }
    public Looper getLooper(){
       m td = this.d;
       if (td != null) {
          return td.getLooper();
       }
       return null;
    }
    public IBinder getRemoteService(){
       m td = this.d;
       if (td != null) {
          return td.getRemoteService();
       }
       return null;
    }
    public int getRemoteVersion(){
       m td = this.d;
       if (td != null) {
          return td.getMinApkVersion();
       }
       return 0;
    }
    public boolean isConnected(){
       m td = this.d;
       if (td != null) {
          return td.isConnected();
       }
       return false;
    }
    public boolean isConnecting(){
       m td = this.d;
       if (td != null) {
          return td.isConnecting();
       }
       return false;
    }
    public void setOnCapabilityAuthListener(i p0){
       m td = this.d;
       if (td != null) {
          td.setOnCapabilityAuthListener(p0);
       }
       return;
    }
    public void setOnClearListener(j p0){
       m td = this.d;
       if (td != null) {
          td.setOnClearListener(p0);
       }
       return;
    }
    public void setOnConnectionFailedListener(OnConnectionFailedListener p0,Handler p1){
       m td = this.d;
       if (td != null) {
          td.setOnConnectionFailedListener(p0, p1);
       }
       return;
    }
    public void setOnConnectionSucceedListener(OnConnectionSucceedListener p0,Handler p1){
       m td = this.d;
       if (td != null) {
          td.setOnConnectionSucceedListener(p0, p1);
       }
       return;
    }
}
