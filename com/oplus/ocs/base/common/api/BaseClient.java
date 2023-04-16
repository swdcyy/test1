package com.oplus.ocs.base.common.api.BaseClient;
import com.oplus.ocs.base.common.api.Api$Client;
import com.oplus.ocs.base.common.api.k;
import android.content.Context;
import android.os.Looper;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.String;
import java.util.Objects;
import com.oplus.ocs.base.common.api.c;
import com.oplus.ocs.base.common.api.b;
import com.oplus.ocs.base.common.api.e;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.AuthResult;
import java.util.ArrayList;
import java.util.List;
import java.lang.IllegalStateException;
import com.oplus.ocs.base.utils.a;
import android.os.Handler;
import android.os.Message;
import com.oplus.ocs.base.common.api.d;
import com.oplus.ocs.base.common.api.TaskListenerHolder;
import java.util.Queue;
import com.oplus.ocs.base.common.api.j;
import android.os.IBinder;
import com.oplus.ocs.base.common.api.i;
import com.oplus.ocs.base.common.api.OnConnectionFailedListener;
import com.oplus.ocs.base.common.ConnectionResult;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;
import com.oplus.ocs.base.common.api.BaseClient$1;
import java.lang.Runnable;

public abstract class BaseClient implements Api$Client, k	// class@000aca
{
    public int b;
    public CapabilityInfo c;
    public Queue d;
    public j e;
    public i f;
    public d g;
    public e h;
    public Context i;
    public Looper j;
    public c k;
    public static final String a = "BaseClient";

    public void BaseClient(Context p0,Looper p1){
       super();
       this.b = 4;
       this.d = new LinkedList();
       this.g = null;
       Objects.requireNonNull(p0, "null reference");
       this.i = p0;
       Objects.requireNonNull(p1, "Looper must not be null");
       this.j = p1;
       this.k = c.a(this);
       b.a();
       this.h = b.a(this.i, this.getClientName(), this.k, this);
    }
    public static CapabilityInfo b(int p0){
       byte[] uobyteArray = new byte[0];
       AuthResult uAuthResult = new AuthResult("", 0, 0, p0, uobyteArray);
       return new CapabilityInfo(new ArrayList(), 1, v6);
    }
    public final void a(){
       if (this.isConnected()) {
          return;
       }
       throw new IllegalStateException("Not connected. Call connect\(\) and wait for onConnected\(\) to be called.");
    }
    public final void a(int p0){
       a.a(BaseClient.a, "handleAuthenticateFailure");
       if (this.g == null) {
          this.a(null);
       }
       Message message = Message.obtain();
       message.what = 101;
       message.arg1 = p0;
       this.g.sendMessage(message);
       return;
    }
    public final void a(Handler p0){
       BaseClient tg = this.g;
       if (tg == null) {
          if (p0 == null) {
             this.g = new d(this.j, this.k);
             return;
          }else {
             this.g = new d(p0.getLooper(), this.k);
             return;
          }
       }else if(p0 != null && tg.getLooper() != p0.getLooper()){
          a.a(BaseClient.a, "the new handler looper is not the same as the old one.");
       }
       return;
    }
    public final void a(TaskListenerHolder p0){
       BaseClient tc = this.c;
       if (tc != null && tc.getAuthResult() != null) {
          if (this.c.getAuthResult().getErrrorCode() == 1001) {
             p0.setErrorCode(0);
             return;
          }else {
             p0.setErrorCode(this.c.getAuthResult().getErrrorCode());
          }
       }
       return;
    }
    public final void a(TaskListenerHolder p0,boolean p1){
       this.d.add(p0);
       if (p1) {
          this.connect();
       }
       return;
    }
    public void addQueue(TaskListenerHolder p0){
       int i;
       if (this.isConnected()) {
          this.a(p0);
          return;
       }else if(this.b == 13){
          i = 1;
       }else {
          i = 0;
       }
       if (i) {
          this.a(p0, true);
          return;
       }else {
          this.a(p0, false);
          return;
       }
    }
    public void connect(){
       BaseClient th = this.h;
       if (th != null) {
          th.a();
          return;
       }else {
          this.c = BaseClient.b(3);
          this.a(3);
          th = this.e;
          if (th != null) {
             th.a();
          }
          return;
       }
    }
    public void disconnect(){
       this.h.c();
    }
    public AuthResult getAuthResult(){
       return this.c.getAuthResult();
    }
    public abstract String getClientName();
    public Looper getLooper(){
       return this.j;
    }
    public int getMinApkVersion(){
       this.a();
       return this.c.getVersion();
    }
    public IBinder getRemoteService(){
       this.a();
       return this.c.getBinder();
    }
    public boolean isConnected(){
       if (this.b == true) {
          return true;
       }
       return false;
    }
    public boolean isConnecting(){
       if (this.b == 2) {
          return true;
       }
       return false;
    }
    public void onStateChange(int p0){
       this.b = p0;
    }
    public void setOnCapabilityAuthListener(i p0){
       this.f = p0;
    }
    public void setOnClearListener(j p0){
       this.e = p0;
    }
    public void setOnConnectionFailedListener(OnConnectionFailedListener p0,Handler p1){
       BaseClient tc = this.c;
       if (tc != null && (tc.getAuthResult() != null && this.c.getAuthResult().getErrrorCode() != 1001)) {
          if (p0 != null) {
             p0.onConnectionFailed(new ConnectionResult(this.c.getAuthResult().getErrrorCode()));
             return;
          }
       }else {
          this.a(p1);
          p1.b = p0;
       }
       return;
    }
    public void setOnConnectionSucceedListener(OnConnectionSucceedListener p0,Handler p1){
       BaseClient tc = this.c;
       if (tc != null && (tc.getAuthResult() != null && this.c.getAuthResult().getErrrorCode() == 1001)) {
          if (p0 != null) {
             if (p1 == null) {
                p0.onConnectionSucceed();
                return;
             }else {
                p1.post(new BaseClient$1(this, p0));
                return;
             }
          }
       }else {
          this.a(p1);
          p1.a = p0;
       }
       return;
    }
}
