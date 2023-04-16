package com.kwai.feature.post.api.feature.memory.MemoryLogger$LogContent;
import java.lang.String;
import com.kwai.feature.post.api.feature.memory.MemoryLogger$LogContent$EntranceInfo;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import fg6.a;
import com.google.gson.Gson;

public final class MemoryLogger$LogContent	// class@0013b3
{
    public final long costTime;
    public final MemoryLogger$LogContent$EntranceInfo entranceInfo;
    public final String error;
    public final String resourceId;
    public final boolean success;
    public final String taskType;

    public void MemoryLogger$LogContent(String p0,String p1,long p2,boolean p3,String p4,MemoryLogger$LogContent$EntranceInfo p5){
       a.p(p0, "taskType");
       a.p(p1, "resourceId");
       a.p(p4, "error");
       a.p(p5, "entranceInfo");
       super();
       this.taskType = p0;
       this.resourceId = p1;
       this.costTime = p2;
       this.success = p3;
       this.error = p4;
       this.entranceInfo = p5;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MemoryLogger$LogContent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MemoryLogger$LogContent && (a.g(this.taskType, p0.taskType) && (a.g(this.resourceId, p0.resourceId) && (!this.costTime - p0.costTime && (this.success == p0.success && (a.g(this.error, p0.error) && a.g(this.entranceInfo, p0.entranceInfo)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MemoryLogger$LogContent obj = PatchProxy.apply(null, this, MemoryLogger$LogContent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.taskType;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MemoryLogger$LogContent tresourceId = this.resourceId;
       int i2 = (tresourceId != null)? tresourceId.hashCode(): 0;
       tresourceId = this.costTime;
       i1 = (((i1 + i2) * 31) + (int)(tresourceId ^ (tresourceId >> 32))) * 31;
       tresourceId = this.success;
       if (tresourceId != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tresourceId = this.error;
       i2 = (tresourceId != null)? tresourceId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tresourceId = this.entranceInfo;
       if (tresourceId != null) {
          i = tresourceId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, MemoryLogger$LogContent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.q(this);
       a.o(obj, "Gsons.KWAI_GSON.toJson\(this\)");
       return obj;
    }
}
