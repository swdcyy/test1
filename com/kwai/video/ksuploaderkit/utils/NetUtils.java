package com.kwai.video.ksuploaderkit.utils.NetUtils;
import java.lang.Object;
import android.content.Context;
import android.net.NetworkInfo$State;
import android.os.Build$VERSION;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import com.kwai.video.ksuploaderkit.utils.NetUtils$1;
import android.net.ConnectivityManager$NetworkCallback;
import java.lang.Boolean;
import android.net.NetworkInfo;

public class NetUtils	// class@0009e2
{
    public boolean mAlwaysQueryState;
    public Context mContext;
    public NetworkInfo$State mNetState;
    public final Object mNetStateLock;
    public static NetUtils mInstance;
    public static final Object mInstanceLock;

    static {
       NetUtils.mInstanceLock = new Object();
    }
    public void NetUtils(Context p0){
       super();
       this.mNetStateLock = new Object();
       this.mNetState = NetworkInfo$State.UNKNOWN;
       this.mContext = p0;
       if (Build$VERSION.SDK_INT >= 24) {
          this.mAlwaysQueryState = false;
          this.addNetStateListener();
       }else {
          this.mAlwaysQueryState = true;
       }
       return;
    }
    public static NetUtils getInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NetUtils.mInstanceLock;
       _monitor_enter(obj);
       if (NetUtils.mInstance == null) {
          NetUtils.mInstance = new NetUtils(p0);
       }
       _monitor_exit(obj);
       return NetUtils.mInstance;
    }
    public final void addNetStateListener(){
       if (PatchProxy.applyVoid(null, this, NetUtils.class, "4")) {
          return;
       }
       if (!this.mContext.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.mContext.getPackageName())) {
          ConnectivityManager systemServic = this.mContext.getSystemService("connectivity");
          if (systemServic != null) {
             this.queryDeviceNetState();
             systemServic.registerDefaultNetworkCallback(new NetUtils$1(this));
          }
       }
       return;
    }
    public boolean isNetworkAvailable(){
       NetUtils obj = PatchProxy.apply(null, this, NetUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mNetStateLock;
       _monitor_enter(obj);
       if (this.mAlwaysQueryState != null) {
          this.queryDeviceNetState();
       }
       NetUtils tmNetState = this.mNetState;
       boolean b = true;
       if (NetworkInfo$State.UNKNOWN == tmNetState || (NetworkInfo$State.CONNECTED != tmNetState && NetworkInfo$State.CONNECTING != tmNetState)) {
          b = false;
       }
    label_0030 :
       _monitor_exit(obj);
       return b;
    }
    public final void queryDeviceNetState(){
       if (PatchProxy.applyVoid(null, this, NetUtils.class, "3")) {
          return;
       }
       if (!this.mContext.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.mContext.getPackageName())) {
          ConnectivityManager systemServic = this.mContext.getSystemService("connectivity");
          if (systemServic != null) {
             NetworkInfo activeNetwor = systemServic.getActiveNetworkInfo();
             if (activeNetwor != null) {
                this.mNetState = activeNetwor.getState();
             }
          }
       }
       return;
    }
}
