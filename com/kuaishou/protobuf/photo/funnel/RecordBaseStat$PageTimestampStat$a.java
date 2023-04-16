package com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PageTimestampStat$a;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$d;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$PageTimestampStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class RecordBaseStat$PageTimestampStat$a extends GeneratedMessageLite$Builder implements RecordBaseStat$d	// class@000e4d
{

    public void RecordBaseStat$PageTimestampStat$a(){
       super(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE);
    }
    public void RecordBaseStat$PageTimestampStat$a(RecordBaseStat$a p0){
       super(RecordBaseStat$PageTimestampStat.DEFAULT_INSTANCE);
    }
    public long getDealloc(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$PageTimestampStat$a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getDealloc();
    }
    public long getDidAppear(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$PageTimestampStat$a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getDidAppear();
    }
    public long getDidLoad(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$PageTimestampStat$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getDidLoad();
    }
    public long getInit(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$PageTimestampStat$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getInit();
    }
    public long getLoadView(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$PageTimestampStat$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getLoadView();
    }
}
