package com.kwai.performance.overhead.io.monitor.IoMonitor;
import com.kwai.performance.monitor.base.loop.LoopMonitor;
import com.kwai.performance.overhead.io.monitor.IoMonitor$a;
import nsd.u;
import com.kwai.performance.overhead.io.monitor.IoMonitor$LoadState;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b;
import com.kwai.performance.overhead.io.monitor.NativeHandler;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$a;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$b;
import java.lang.Object;
import java.lang.String;
import yf7.t;
import com.kwai.performance.monitor.base.d;
import com.kwai.performance.monitor.base.Monitor;
import android.app.Application;
import dg7.a;
import android.content.Context;
import kotlin.jvm.internal.a;

public final class IoMonitor extends LoopMonitor	// class@001153
{
    public boolean mIsNativeInit;
    public IoMonitor$LoadState mLoadState;
    public static final IoMonitor$a Companion;

    static {
       IoMonitor.Companion = new IoMonitor$a(null);
    }
    public void IoMonitor(){
       super();
       this.mLoadState = IoMonitor$LoadState.UnLoad;
    }
    public LoopMonitor$b call(){
       if (this.mLoadState != IoMonitor$LoadState.LoadSuc) {
          return LoopMonitor$b$b.a;
       }
       if (NativeHandler.getInstance().loopCheck()) {
          return LoopMonitor$b$a.a;
       }
       return LoopMonitor$b$b.a;
    }
    public Object call(){
       return this.call();
    }
    public final void checkStartMonitor(int p0){
       if (this.mIsNativeInit == null) {
          this.mIsNativeInit = true;
          if (this.mLoadState == IoMonitor$LoadState.UnLoad) {
             if (t.a("io-detector")) {
                this.mLoadState = IoMonitor$LoadState.LoadSuc;
                NativeHandler instance = NativeHandler.getInstance();
                instance.init(this.getCommonConfig().a(), this.getMonitorConfig(), p0);
                instance.startDetect();
                if (p0 == 2) {
                   LoopMonitor.startLoop$default(this, false, false, 0, 7, null);
                }
             }else {
                this.mLoadState = IoMonitor$LoadState.LoadFail;
             }
          }
       }
       return;
    }
    public long getLoopInterval(){
       return 5000;
    }
    public final void setCurrentActivity(String p0){
       a.q(p0, "activity");
       if (this.mIsNativeInit == null) {
          return;
       }
       NativeHandler.getInstance().setCurrentActivity(p0);
       return;
    }
    public final void setCurrentPage(String p0){
       a.q(p0, "page");
       if (this.mIsNativeInit == null) {
          return;
       }
       NativeHandler.getInstance().setCurrentPage(p0);
       return;
    }
    public final void setLaunchStatus(boolean p0){
       if (this.mIsNativeInit == null) {
          return;
       }
       NativeHandler.getInstance().setLaunchStatus(p0);
       return;
    }
}
