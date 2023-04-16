package com.yxcorp.gifshow.ad.response.NeoOrderStatusActionBarInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.NeoOrderStatusActionBarInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NeoOrderStatusActionBarInfo implements Serializable	// class@0017e0
{
    public final String actionBar;
    public static final NeoOrderStatusActionBarInfo$a Companion;
    public static final long serialVersionUID;

    static {
       NeoOrderStatusActionBarInfo.Companion = new NeoOrderStatusActionBarInfo$a(null);
    }
    public void NeoOrderStatusActionBarInfo(String p0){
       super();
       this.actionBar = p0;
    }
    public static NeoOrderStatusActionBarInfo copy$default(NeoOrderStatusActionBarInfo p0,String p1,int p2,Object p3){
       NeoOrderStatusActionBarInfo actionBar;
       if (p2 & 0x01) {
          actionBar = p0.actionBar;
       }
       return p0.copy(actionBar);
    }
    public final String component1(){
       return this.actionBar;
    }
    public final NeoOrderStatusActionBarInfo copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NeoOrderStatusActionBarInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NeoOrderStatusActionBarInfo(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NeoOrderStatusActionBarInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NeoOrderStatusActionBarInfo && a.g(this.actionBar, p0.actionBar))) {
          return true;
       }
       return false;
    }
    public final String getActionBar(){
       return this.actionBar;
    }
    public int hashCode(){
       NeoOrderStatusActionBarInfo obj = PatchProxy.apply(null, this, NeoOrderStatusActionBarInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.actionBar;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NeoOrderStatusActionBarInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NeoOrderStatusActionBarInfo\(actionBar="+this.actionBar+"\)";
    }
}
