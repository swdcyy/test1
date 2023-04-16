package com.kwai.library.wolverine.elements.devicelevel.DeviceLevelConfig;
import java.io.Serializable;
import com.kwai.library.wolverine.entity.ScoreConfig;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.String;
import java.lang.StringBuilder;

public final class DeviceLevelConfig implements Serializable	// class@000ab5
{
    public final ScoreConfig lowPhone;
    public final ScoreConfig otherPhone;

    public void DeviceLevelConfig(){
       super(null, null, 3, null);
    }
    public void DeviceLevelConfig(ScoreConfig p0,ScoreConfig p1){
       super();
       this.lowPhone = p0;
       this.otherPhone = p1;
    }
    public void DeviceLevelConfig(ScoreConfig p0,ScoreConfig p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static DeviceLevelConfig copy$default(DeviceLevelConfig p0,ScoreConfig p1,ScoreConfig p2,int p3,Object p4){
       DeviceLevelConfig lowPhone;
       DeviceLevelConfig otherPhone;
       if (p3 & 0x01) {
          lowPhone = p0.lowPhone;
       }
       if (p3 & 0x02) {
          otherPhone = p0.otherPhone;
       }
       return p0.copy(lowPhone, otherPhone);
    }
    public final ScoreConfig component1(){
       return this.lowPhone;
    }
    public final ScoreConfig component2(){
       return this.otherPhone;
    }
    public final DeviceLevelConfig copy(ScoreConfig p0,ScoreConfig p1){
       return new DeviceLevelConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof DeviceLevelConfig && (a.g(this.lowPhone, p0.lowPhone) && a.g(this.otherPhone, p0.otherPhone)))) {
          return true;
       }
       return false;
    }
    public final ScoreConfig getLowPhone(){
       return this.lowPhone;
    }
    public final ScoreConfig getOtherPhone(){
       return this.otherPhone;
    }
    public int hashCode(){
       DeviceLevelConfig tlowPhone = this.lowPhone;
       int i = 0;
       int i1 = (tlowPhone != null)? tlowPhone.hashCode(): 0;
       i1 = i1 * 31;
       DeviceLevelConfig totherPhone = this.otherPhone;
       if (totherPhone != null) {
          i = totherPhone.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "DeviceLevelConfig\(lowPhone="+this.lowPhone+", otherPhone="+this.otherPhone+"\)";
    }
}
