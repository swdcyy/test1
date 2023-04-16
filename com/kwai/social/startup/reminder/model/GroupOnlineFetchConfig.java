package com.kwai.social.startup.reminder.model.GroupOnlineFetchConfig;
import java.io.Serializable;
import com.kwai.social.startup.reminder.model.GroupOnlineFetchConfig$a;
import nsd.u;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GroupOnlineFetchConfig implements Serializable	// class@000f57
{
    public final int cacheLimit;
    public final Map occasion;
    public static final GroupOnlineFetchConfig$a Companion;
    public static final long serialVersionUID;

    static {
       GroupOnlineFetchConfig.Companion = new GroupOnlineFetchConfig$a(null);
    }
    public void GroupOnlineFetchConfig(int p0,Map p1){
       super();
       this.cacheLimit = p0;
       this.occasion = p1;
    }
    public void GroupOnlineFetchConfig(int p0,Map p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       super(p0, p1);
       return;
    }
    public static GroupOnlineFetchConfig copy$default(GroupOnlineFetchConfig p0,int p1,Map p2,int p3,Object p4){
       GroupOnlineFetchConfig cacheLimit;
       GroupOnlineFetchConfig occasion;
       if (p3 & 0x01) {
          cacheLimit = p0.cacheLimit;
       }
       if (p3 & 0x02) {
          occasion = p0.occasion;
       }
       return p0.copy(cacheLimit, occasion);
    }
    public final int component1(){
       return this.cacheLimit;
    }
    public final Map component2(){
       return this.occasion;
    }
    public final GroupOnlineFetchConfig copy(int p0,Map p1){
       if (PatchProxy.isSupport(GroupOnlineFetchConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, GroupOnlineFetchConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new GroupOnlineFetchConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GroupOnlineFetchConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GroupOnlineFetchConfig && (this.cacheLimit == p0.cacheLimit && a.g(this.occasion, p0.occasion)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, GroupOnlineFetchConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.cacheLimit * 31;
       GroupOnlineFetchConfig toccasion = this.occasion;
       int i1 = (toccasion != null)? toccasion.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GroupOnlineFetchConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GroupOnlineFetchConfig\(cacheLimit="+this.cacheLimit+", occasion="+this.occasion+"\)";
    }
}
