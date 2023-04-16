package com.kuaishou.live.external.invoke.krn.LiveRnCommandParams;
import java.io.Serializable;
import o63.p;
import java.lang.String;
import java.util.Map;
import com.kuaishou.live.external.invoke.krn.LiveJsContainerParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveRnCommandParams implements Serializable, p	// class@001b97
{
    public final String command;
    public final LiveJsContainerParams containerParams;
    public final Map params;

    public void LiveRnCommandParams(String p0,Map p1,LiveJsContainerParams p2){
       super();
       this.command = p0;
       this.params = p1;
       this.containerParams = p2;
    }
    public static LiveRnCommandParams copy$default(LiveRnCommandParams p0,String p1,Map p2,LiveJsContainerParams p3,int p4,Object p5){
       LiveRnCommandParams command;
       LiveRnCommandParams params;
       LiveRnCommandParams containerPar;
       if (p4 & 0x01) {
          command = p0.command;
       }
       if (p4 & 0x02) {
          params = p0.params;
       }
       if (p4 & 0x04) {
          containerPar = p0.containerParams;
       }
       return p0.copy(command, params, containerPar);
    }
    public final String component1(){
       return this.command;
    }
    public final Map component2(){
       return this.params;
    }
    public final LiveJsContainerParams component3(){
       return this.containerParams;
    }
    public final LiveRnCommandParams copy(String p0,Map p1,LiveJsContainerParams p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveRnCommandParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveRnCommandParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRnCommandParams.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveRnCommandParams && (a.g(this.command, p0.command) && (a.g(this.params, p0.params) && a.g(this.containerParams, p0.containerParams))))) {
          return true;
       }
       return false;
    }
    public final String getCommand(){
       return this.command;
    }
    public String getCommandName(){
       LiveRnCommandParams tcommand = this.command;
       if (tcommand != null) {
       }else {
          tcommand = "";
       }
       return tcommand;
    }
    public String getCommandParams(){
       Object obj = PatchProxy.apply(null, this, LiveRnCommandParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this.params);
    }
    public final LiveJsContainerParams getContainerParams(){
       return this.containerParams;
    }
    public String getNameSpace(){
       return "KwaiLive";
    }
    public final Map getParams(){
       return this.params;
    }
    public int hashCode(){
       LiveRnCommandParams obj = PatchProxy.apply(null, this, LiveRnCommandParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.command;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveRnCommandParams tparams = this.params;
       int i2 = (tparams != null)? tparams.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tparams = this.containerParams;
       if (tparams != null) {
          i = tparams.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRnCommandParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveRnCommandParams\(command="+this.command+", params="+this.params+", containerParams="+this.containerParams+"\)";
    }
}
