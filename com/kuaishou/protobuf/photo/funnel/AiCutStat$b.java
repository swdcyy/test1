package com.kuaishou.protobuf.photo.funnel.AiCutStat$b;
import pr4.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.AiCutStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.AiCutStat$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;

public final class AiCutStat$b extends GeneratedMessageLite$Builder implements b	// class@000e02
{

    public void AiCutStat$b(){
       super(AiCutStat.DEFAULT_INSTANCE);
    }
    public void AiCutStat$b(AiCutStat$a p0){
       super(AiCutStat.DEFAULT_INSTANCE);
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, AiCutStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getId();
    }
    public ByteString getIdBytes(){
       Object obj = PatchProxy.apply(null, this, AiCutStat$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getIdBytes();
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, AiCutStat$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       Object obj = PatchProxy.apply(null, this, AiCutStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getNameBytes();
    }
}
