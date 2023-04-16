package com.kwai.performance.monitor.base.Monitor;
import java.lang.Object;
import msd.a;
import com.kwai.performance.monitor.base.Monitor$throwIfNotInitialized$1;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import java.lang.UnsupportedOperationException;
import com.kwai.performance.monitor.base.d;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.Class;
import zsd.u;
import java.lang.Boolean;
import kotlin.Pair;
import qrd.r0;
import trd.s0;

public abstract class Monitor	// class@000db1
{
    public d _commonConfig;
    public Object _monitorConfig;
    public boolean isInitialized;

    public void Monitor(){
       super();
    }
    public static void throwIfNotInitialized$default(Monitor p0,a p1,a p2,int p3,Object p4){
       Monitor$throwIfNotInitialized$1 iNSTANCE;
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throwIfNotInitialized");
       }
       if (p3 & 0x01) {
          iNSTANCE = Monitor$throwIfNotInitialized$1.INSTANCE;
       }
       a.q(iNSTANCE, "onDebug");
       a.q(p2, "onRelease");
       if (p0.isInitialized()) {
          return;
       }else if(MonitorBuildConfig.b()){
          iNSTANCE.invoke();
       }else {
          p2.invoke();
       }
       return;
    }
    public final d getCommonConfig(){
       Monitor t_commonConf = this._commonConfig;
       if (t_commonConf == null) {
          a.L();
       }
       return t_commonConf;
    }
    public Map getLogParams(){
       String simpleName = this.getClass().getSimpleName();
       a.h(simpleName, "javaClass.simpleName");
       return s0.k(r0.a(u.y1(simpleName)+"ingEnabled", Boolean.valueOf(this.isInitialized())));
    }
    public final Object getMonitorConfig(){
       Monitor t_monitorCon = this._monitorConfig;
       if (t_monitorCon == null) {
          a.L();
       }
       return t_monitorCon;
    }
    public void init(d p0,Object p1){
       a.q(p0, "commonConfig");
       this._commonConfig = p0;
       this._monitorConfig = p1;
       this.setInitialized(true);
    }
    public boolean isInitialized(){
       return this.isInitialized;
    }
    public void onApplicationPostAttachContext(){
    }
    public void onApplicationPostCreate(){
    }
    public void onApplicationPreAttachContext(){
    }
    public void onApplicationPreCreate(){
    }
    public void setInitialized(boolean p0){
       this.isInitialized = p0;
    }
    public final boolean syncToInitialized(boolean p0){
       boolean b = (p0 && this.isInitialized())? true: false;
       this.setInitialized(b);
       return p0;
    }
    public final void throwIfNotInitialized(a p0,a p1){
       a.q(p0, "onDebug");
       a.q(p1, "onRelease");
       if (this.isInitialized()) {
          return;
       }
       if (MonitorBuildConfig.b()) {
          p0.invoke();
       }else {
          p1.invoke();
       }
       return;
    }
}
