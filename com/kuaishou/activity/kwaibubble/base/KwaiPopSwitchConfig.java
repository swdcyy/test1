package com.kuaishou.activity.kwaibubble.base.KwaiPopSwitchConfig;
import java.io.Serializable;
import com.kuaishou.activity.kwaibubble.base.KwaiPopSwitchConfig$a;
import nsd.u;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KwaiPopSwitchConfig implements Serializable	// class@000775
{
    public final ArrayList enableList;
    public final boolean switch;
    public final long timeOut;
    public static final KwaiPopSwitchConfig$a Companion;
    public static final long serialVersionUID;

    static {
       KwaiPopSwitchConfig.Companion = new KwaiPopSwitchConfig$a(null);
    }
    public void KwaiPopSwitchConfig(){
       super(false, 0, null, 7, null);
    }
    public void KwaiPopSwitchConfig(boolean p0){
       super(p0, 0, null, 6, null);
    }
    public void KwaiPopSwitchConfig(boolean p0,long p1){
       super(p0, p1, null, 4, null);
    }
    public void KwaiPopSwitchConfig(boolean p0,long p1,ArrayList p2){
       super();
       this.switch = p0;
       this.timeOut = p1;
       this.enableList = p2;
    }
    public void KwaiPopSwitchConfig(boolean p0,long p1,ArrayList p2,int p3,u p4){
       Integer[] integerArray;
       if (p3 & 0x01) {
          p0 = true;
       }
       if (p3 & 0x02) {
          p1 = 0xea60;
       }
       if (p3 & 0x04) {
          integerArray = new Integer[]{Integer.valueOf(0),Integer.valueOf(1)};
          integerArray = CollectionsKt__CollectionsKt.r(integerArray);
       }
       super(p0, p1, integerArray);
       return;
    }
    public static KwaiPopSwitchConfig copy$default(KwaiPopSwitchConfig p0,boolean p1,long p2,ArrayList p3,int p4,Object p5){
       KwaiPopSwitchConfig switch;
       KwaiPopSwitchConfig timeOut;
       KwaiPopSwitchConfig enableList;
       if (p4 & 0x01) {
          switch = p0.switch;
       }
       if (p4 & 0x02) {
          timeOut = p0.timeOut;
       }
       if (p4 & 0x04) {
          enableList = p0.enableList;
       }
       return p0.copy(switch, timeOut, enableList);
    }
    public final boolean component1(){
       return this.switch;
    }
    public final long component2(){
       return this.timeOut;
    }
    public final ArrayList component3(){
       return this.enableList;
    }
    public final KwaiPopSwitchConfig copy(boolean p0,long p1,ArrayList p2){
       if (PatchProxy.isSupport(KwaiPopSwitchConfig.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Long.valueOf(p1), p2, this, KwaiPopSwitchConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new KwaiPopSwitchConfig(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPopSwitchConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KwaiPopSwitchConfig && (this.switch == p0.switch && (!this.timeOut - p0.timeOut && a.g(this.enableList, p0.enableList))))) {
          return true;
       }
       return false;
    }
    public final ArrayList getEnableList(){
       return this.enableList;
    }
    public final boolean getSwitch(){
       return this.switch;
    }
    public final long getTimeOut(){
       return this.timeOut;
    }
    public int hashCode(){
       int i;
       KwaiPopSwitchConfig obj = PatchProxy.apply(null, this, KwaiPopSwitchConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.switch;
       if (obj != null) {
          i = 1;
       }
       KwaiPopSwitchConfig ttimeOut = this.timeOut;
       i = ((i * 31) + (int)(ttimeOut ^ (ttimeOut >> 32))) * 31;
       ttimeOut = this.enableList;
       int i1 = (ttimeOut != null)? ttimeOut.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KwaiPopSwitchConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KwaiPopSwitchConfig\(switch="+this.switch+", timeOut="+this.timeOut+", enableList="+this.enableList+"\)";
    }
}
