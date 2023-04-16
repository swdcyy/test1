package com.kuaishou.live.basic.tk.LiveTkCommandParams;
import java.io.Serializable;
import o63.p;
import java.lang.String;
import java.util.Map;
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

public final class LiveTkCommandParams implements Serializable, p	// class@000d1e
{
    public final String command;
    public final Map params;

    public void LiveTkCommandParams(String p0,Map p1){
       super();
       this.command = p0;
       this.params = p1;
    }
    public static LiveTkCommandParams copy$default(LiveTkCommandParams p0,String p1,Map p2,int p3,Object p4){
       LiveTkCommandParams command;
       LiveTkCommandParams params;
       if (p3 & 0x01) {
          command = p0.command;
       }
       if (p3 & 0x02) {
          params = p0.params;
       }
       return p0.copy(command, params);
    }
    public final String component1(){
       return this.command;
    }
    public final Map component2(){
       return this.params;
    }
    public final LiveTkCommandParams copy(String p0,Map p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveTkCommandParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveTkCommandParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveTkCommandParams.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveTkCommandParams && (a.g(this.command, p0.command) && a.g(this.params, p0.params)))) {
          return true;
       }
       return false;
    }
    public final String getCommand(){
       return this.command;
    }
    public String getCommandName(){
       LiveTkCommandParams tcommand = this.command;
       if (tcommand != null) {
       }else {
          tcommand = "";
       }
       return tcommand;
    }
    public String getCommandParams(){
       Object obj = PatchProxy.apply(null, this, LiveTkCommandParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this.params);
    }
    public String getNameSpace(){
       return "KwaiLive";
    }
    public final Map getParams(){
       return this.params;
    }
    public int hashCode(){
       LiveTkCommandParams obj = PatchProxy.apply(null, this, LiveTkCommandParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.command;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveTkCommandParams tparams = this.params;
       if (tparams != null) {
          i = tparams.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveTkCommandParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveTkCommandParams\(command="+this.command+", params="+this.params+"\)";
    }
}
