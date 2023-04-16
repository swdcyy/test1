package com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordCoreFunctionStat$a;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$RecordCoreFunctionStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public final class RecordBaseStat$RecordCoreFunctionStat$a extends GeneratedMessageLite$Builder implements RecordBaseStat$f	// class@000e51
{

    public void RecordBaseStat$RecordCoreFunctionStat$a(){
       super(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE);
    }
    public void RecordBaseStat$RecordCoreFunctionStat$a(RecordBaseStat$a p0){
       super(RecordBaseStat$RecordCoreFunctionStat.DEFAULT_INSTANCE);
    }
    public boolean getIsSuccess(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$RecordCoreFunctionStat$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getIsSuccess();
    }
    public float getPlayerStart(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$RecordCoreFunctionStat$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getPlayerStart();
    }
    public float getToast(){
       Object obj = PatchProxy.apply(null, this, RecordBaseStat$RecordCoreFunctionStat$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getToast();
    }
}
