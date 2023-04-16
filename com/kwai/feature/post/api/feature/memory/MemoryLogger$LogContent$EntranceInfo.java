package com.kwai.feature.post.api.feature.memory.MemoryLogger$LogContent$EntranceInfo;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MemoryLogger$LogContent$EntranceInfo	// class@0013b1
{
    public final int entranceType;
    public final boolean isServerAlbum;
    public final boolean isTemplatePreview;
    public final String taskId;

    public void MemoryLogger$LogContent$EntranceInfo(int p0,String p1,boolean p2,boolean p3){
       a.p(p1, "taskId");
       super();
       this.entranceType = p0;
       this.taskId = p1;
       this.isServerAlbum = p2;
       this.isTemplatePreview = p3;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MemoryLogger$LogContent$EntranceInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MemoryLogger$LogContent$EntranceInfo && (this.entranceType == p0.entranceType && (a.g(this.taskId, p0.taskId) && (this.isServerAlbum == p0.isServerAlbum && this.isTemplatePreview == p0.isTemplatePreview))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, MemoryLogger$LogContent$EntranceInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.entranceType * 31;
       MemoryLogger$LogContent$EntranceInfo ttaskId = this.taskId;
       int i1 = (ttaskId != null)? ttaskId.hashCode(): 0;
       i = (i + i1) * 31;
       ttaskId = this.isServerAlbum;
       int i2 = 1;
       if (ttaskId != null) {
          i1 = 1;
       }
       i = (i + i1) * 31;
       ttaskId = this.isTemplatePreview;
       if (ttaskId == null) {
          i2 = ttaskId;
       }
       return (i + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MemoryLogger$LogContent$EntranceInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EntranceInfo\(entranceType="+this.entranceType+", taskId="+this.taskId+", isServerAlbum="+this.isServerAlbum+", isTemplatePreview="+this.isTemplatePreview+"\)";
    }
}
