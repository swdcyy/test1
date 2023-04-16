package com.kwai.feature.api.danmaku.model.DanmakuShowTypeConfig;
import java.io.Serializable;
import com.kwai.feature.api.danmaku.model.DanmakuShowType;
import com.kwai.feature.api.danmaku.model.DanmakuShowDirection;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DanmakuShowTypeConfig implements Serializable	// class@000e80
{
    public final DanmakuShowDirection direction;
    public final DanmakuShowType type;

    public void DanmakuShowTypeConfig(DanmakuShowType p0,DanmakuShowDirection p1){
       super();
       this.type = p0;
       this.direction = p1;
    }
    public static DanmakuShowTypeConfig copy$default(DanmakuShowTypeConfig p0,DanmakuShowType p1,DanmakuShowDirection p2,int p3,Object p4){
       DanmakuShowTypeConfig type;
       DanmakuShowTypeConfig direction;
       if (p3 & 0x01) {
          type = p0.type;
       }
       if (p3 & 0x02) {
          direction = p0.direction;
       }
       return p0.copy(type, direction);
    }
    public final DanmakuShowType component1(){
       return this.type;
    }
    public final DanmakuShowDirection component2(){
       return this.direction;
    }
    public final DanmakuShowTypeConfig copy(DanmakuShowType p0,DanmakuShowDirection p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DanmakuShowTypeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DanmakuShowTypeConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DanmakuShowTypeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DanmakuShowTypeConfig && (a.g(this.type, p0.type) && a.g(this.direction, p0.direction)))) {
          return true;
       }
       return false;
    }
    public final DanmakuShowDirection getDirection(){
       return this.direction;
    }
    public final DanmakuShowType getType(){
       return this.type;
    }
    public int hashCode(){
       DanmakuShowTypeConfig obj = PatchProxy.apply(null, this, DanmakuShowTypeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.type;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       DanmakuShowTypeConfig tdirection = this.direction;
       if (tdirection != null) {
          i = tdirection.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DanmakuShowTypeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DanmakuShowTypeConfig\(type="+this.type+", direction="+this.direction+"\)";
    }
}
