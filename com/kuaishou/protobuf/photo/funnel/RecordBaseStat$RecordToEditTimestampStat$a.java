package com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordToEditTimestampStat$a;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$g;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordToEditTimestampStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class RecordBaseStat$RecordToEditTimestampStat$a extends GeneratedMessageLite$Builder implements RecordBaseStat$g	// class@000e53
{

    public void RecordBaseStat$RecordToEditTimestampStat$a(){
       super(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE);
    }
    public void RecordBaseStat$RecordToEditTimestampStat$a(RecordBaseStat$a p0){
       super(RecordBaseStat$RecordToEditTimestampStat.DEFAULT_INSTANCE);
    }
    public long getEditFirstFrame(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$RecordToEditTimestampStat$a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getEditFirstFrame();
    }
    public long getEditPre(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$RecordToEditTimestampStat$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getEditPre();
    }
    public long getRecordFinish(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$RecordToEditTimestampStat$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getRecordFinish();
    }
    public long getRecordPre(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$RecordToEditTimestampStat$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getRecordPre();
    }
}
