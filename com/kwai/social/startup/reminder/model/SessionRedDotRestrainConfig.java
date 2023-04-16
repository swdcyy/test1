package com.kwai.social.startup.reminder.model.SessionRedDotRestrainConfig;
import java.io.Serializable;
import com.kwai.social.startup.reminder.model.SessionRedDotRestrainConfig$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SessionRedDotRestrainConfig implements Serializable	// class@000f73
{
    public final List categories;
    public final List subBizs;
    public static final SessionRedDotRestrainConfig$a Companion;
    public static final long serialVersionUID;

    static {
       SessionRedDotRestrainConfig.Companion = new SessionRedDotRestrainConfig$a(null);
    }
    public void SessionRedDotRestrainConfig(List p0,List p1){
       super();
       this.categories = p0;
       this.subBizs = p1;
    }
    public static SessionRedDotRestrainConfig copy$default(SessionRedDotRestrainConfig p0,List p1,List p2,int p3,Object p4){
       SessionRedDotRestrainConfig categories;
       SessionRedDotRestrainConfig subBizs;
       if (p3 & 0x01) {
          categories = p0.categories;
       }
       if (p3 & 0x02) {
          subBizs = p0.subBizs;
       }
       return p0.copy(categories, subBizs);
    }
    public final List component1(){
       return this.categories;
    }
    public final List component2(){
       return this.subBizs;
    }
    public final SessionRedDotRestrainConfig copy(List p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SessionRedDotRestrainConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SessionRedDotRestrainConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SessionRedDotRestrainConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SessionRedDotRestrainConfig && (a.g(this.categories, p0.categories) && a.g(this.subBizs, p0.subBizs)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       SessionRedDotRestrainConfig obj = PatchProxy.apply(null, this, SessionRedDotRestrainConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.categories;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SessionRedDotRestrainConfig tsubBizs = this.subBizs;
       if (tsubBizs != null) {
          i = tsubBizs.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SessionRedDotRestrainConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SessionRedDotRestrainConfig\(categories="+this.categories+", subBizs="+this.subBizs+"\)";
    }
}
