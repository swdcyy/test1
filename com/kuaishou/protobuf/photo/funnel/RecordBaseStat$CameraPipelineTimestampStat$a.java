package com.kuaishou.protobuf.photo.funnel.RecordBaseStat$CameraPipelineTimestampStat$a;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$CameraPipelineTimestampStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class RecordBaseStat$CameraPipelineTimestampStat$a extends GeneratedMessageLite$Builder implements RecordBaseStat$c	// class@000e4b
{

    public void RecordBaseStat$CameraPipelineTimestampStat$a(){
       super(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE);
    }
    public void RecordBaseStat$CameraPipelineTimestampStat$a(RecordBaseStat$a p0){
       super(RecordBaseStat$CameraPipelineTimestampStat.DEFAULT_INSTANCE);
    }
    public long getAccess(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$CameraPipelineTimestampStat$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getAccess();
    }
    public long getFirstFrame(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$CameraPipelineTimestampStat$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getFirstFrame();
    }
    public long getLoad(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$CameraPipelineTimestampStat$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getLoad();
    }
}
