package com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PhotoTimestampStat$a;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$e;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PhotoTimestampStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class RecordBaseStat$PhotoTimestampStat$a extends GeneratedMessageLite$Builder implements RecordBaseStat$e	// class@000e4f
{

    public void RecordBaseStat$PhotoTimestampStat$a(){
       super(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE);
    }
    public void RecordBaseStat$PhotoTimestampStat$a(RecordBaseStat$a p0){
       super(RecordBaseStat$PhotoTimestampStat.DEFAULT_INSTANCE);
    }
    public long getEditFirstFrame(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$PhotoTimestampStat$a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getEditFirstFrame();
    }
    public long getPreEdit(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$PhotoTimestampStat$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getPreEdit();
    }
    public long getPreProcess(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$PhotoTimestampStat$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getPreProcess();
    }
    public long getSdkCallback(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$PhotoTimestampStat$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getSdkCallback();
    }
}
