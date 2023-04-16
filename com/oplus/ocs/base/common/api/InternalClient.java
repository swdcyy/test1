package com.oplus.ocs.base.common.api.InternalClient;
import android.os.Handler$Callback;
import android.content.Context;
import java.lang.String;
import com.oplus.ocs.base.IAuthenticationListener;
import java.lang.Object;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Handler;
import com.oplus.ocs.base.common.api.b;
import com.oplus.ocs.base.common.api.e;
import android.content.Intent;
import android.content.ComponentName;
import java.lang.StringBuilder;
import android.os.Message;
import java.lang.Thread;
import java.lang.Integer;
import com.oplus.ocs.base.utils.a;

public class InternalClient implements Handler$Callback	// class@000acd
{
    public e mAuthenticateCustomer;
    public String mClient;
    public Context mContext;
    public Handler mHandler;
    public boolean mIsActiveWritePermits;
    public boolean mIsWaitService;
    public IAuthenticationListener mListener;
    public String mPackageName;
    public int mThirdPid;
    public static final String TAG;

    static {
       InternalClient.TAG = "InternalClient";
    }
    public void InternalClient(Context p0,String p1,String p2,int p3,boolean p4,IAuthenticationListener p5){
       super(p0, p1, p2, p3, p4, false, p5);
    }
    public void InternalClient(Context p0,String p1,String p2,int p3,boolean p4,boolean p5,IAuthenticationListener p6){
       super();
       this.mIsActiveWritePermits = false;
       this.mContext = p0.getApplicationContext();
       this.mListener = p6;
       this.mPackageName = p1;
       this.mClient = p2;
       this.mThirdPid = p3;
       this.mIsActiveWritePermits = p4;
       this.mIsWaitService = p5;
       HandlerThread handlerThrea = new HandlerThread("internal");
       handlerThrea.start();
       this.mHandler = (handlerThrea.getLooper() != null)? new Handler(handlerThrea.getLooper(), this): new Handler(this);
       b.a();
       this.mAuthenticateCustomer = b.a(this.mContext, this, this.mListener);
       return;
    }
    public boolean connect(){
       InternalClient tmAuthentica = this.mAuthenticateCustomer;
       if (tmAuthentica != null) {
          return tmAuthentica.a();
       }
       return false;
    }
    public boolean connect4Stat(){
       InternalClient tmAuthentica = this.mAuthenticateCustomer;
       if (tmAuthentica != null) {
          return tmAuthentica.b();
       }
       return false;
    }
    public Intent getServiceIntent(String p0,String p1,String p2){
       Intent intent = new Intent(p0);
       intent.setComponent(new ComponentName(p1, p2));
       intent.putExtra("bind_type", 1);
       intent.putExtra("internal_third_packagename", this.mPackageName);
       intent.putExtra("internal_capability_client", this.mClient);
       intent.putExtra("internal_third_pid", this.mThirdPid);
       intent.putExtra("internal_active_write_permits", this.mIsActiveWritePermits);
       intent.putExtra("internal_base_version", "1.0.11");
       intent.putExtra("internal_wait_service", this.mIsWaitService);
       intent.setType("internal_service_"+this.mClient);
       return intent;
    }
    public Intent getServiceIntent4Stat(String p0,String p1,String p2){
       Intent intent = new Intent(p0);
       intent.setComponent(new ComponentName(p1, p2));
       intent.putExtra("bind_type", 2);
       intent.putExtra("internal_third_packagename", this.mPackageName);
       intent.putExtra("internal_capability_client", this.mClient);
       intent.setType("internal_service_"+this.mClient);
       return intent;
    }
    public boolean handleMessage(Message p0){
       Object[] objArray = new Object[]{Thread.currentThread().getName(),Integer.valueOf(p0.what)};
       a.a(InternalClient.TAG, String.format("current thread - %s and what - %d", objArray));
       if (p0.what != 1001) {
       }else {
          InternalClient tmAuthentica = this.mAuthenticateCustomer;
          if (tmAuthentica != null) {
             tmAuthentica.c();
          }
       }
       return 0;
    }
    public void serviceUnbind(){
       this.mHandler.sendEmptyMessage(1001);
    }
}
