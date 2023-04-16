package com.kwai.social.startup.reminder.model.IMPluginLoggerConfig;
import java.io.Serializable;
import com.kwai.social.startup.reminder.model.IMPluginLoggerConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class IMPluginLoggerConfig implements Serializable	// class@000f5d
{
    public final boolean enable;
    public final double failSampleRate;
    public final double successSampleRate;
    public static final IMPluginLoggerConfig$a Companion;
    public static final long serialVersionUID;

    static {
       IMPluginLoggerConfig.Companion = new IMPluginLoggerConfig$a(null);
    }
    public void IMPluginLoggerConfig(){
       super(false, 0, 0, 7, null);
    }
    public void IMPluginLoggerConfig(boolean p0,double p1,double p2){
       super();
       this.enable = p0;
       this.successSampleRate = p1;
       this.failSampleRate = p2;
    }
    public void IMPluginLoggerConfig(boolean p0,double p1,double p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = false;
       }
       int i = (p3 & 0x02)? 0: p1;
       double d = (p3 & 0x04)? 0: p2;
       super(p0, i, d);
       return;
    }
    public static IMPluginLoggerConfig copy$default(IMPluginLoggerConfig p0,boolean p1,double p2,double p3,int p4,Object p5){
       IMPluginLoggerConfig enable;
       IMPluginLoggerConfig successSampl;
       IMPluginLoggerConfig iMPluginLogg1;
       if (p4 & 0x01) {
          enable = p0.enable;
       }
       if (p4 & 0x02) {
          successSampl = p0.successSampleRate;
       }
       IMPluginLoggerConfig iMPluginLogg = successSampl;
       if (p4 & 0x04) {
          iMPluginLogg1 = p0.failSampleRate;
       }
       return p0.copy(enable, iMPluginLogg, iMPluginLogg1);
    }
    public final boolean component1(){
       return this.enable;
    }
    public final double component2(){
       return this.successSampleRate;
    }
    public final double component3(){
       return this.failSampleRate;
    }
    public final IMPluginLoggerConfig copy(boolean p0,double p1,double p2){
       Object obj;
       if (PatchProxy.isSupport(IMPluginLoggerConfig.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), this, IMPluginLoggerConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       IMPluginLoggerConfig iMPluginLogg = new IMPluginLoggerConfig(p0, p1, p2);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMPluginLoggerConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof IMPluginLoggerConfig && (this.enable == p0.enable && (!Double.compare(this.successSampleRate, p0.successSampleRate) && !Double.compare(this.failSampleRate, p0.failSampleRate))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       IMPluginLoggerConfig obj = PatchProxy.apply(null, this, IMPluginLoggerConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enable;
       if (obj != null) {
          i = 1;
       }
       long l = Double.doubleToLongBits(this.successSampleRate);
       l = Double.doubleToLongBits(this.failSampleRate);
       return ((((i * 31) + (int)(l ^ (l >> 32))) * 31) + (int)(l ^ (l >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, IMPluginLoggerConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "IMPluginLoggerConfig\(enable="+this.enable+", successSampleRate="+this.successSampleRate+", failSampleRate="+this.failSampleRate+"\)";
    }
}
