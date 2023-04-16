package com.kuaishou.protobuf.photo.funnel.PrettifyBlockStat$b;
import pr4.l;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PrettifyBlockStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.PrettifyBlockStat$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;

public final class PrettifyBlockStat$b extends GeneratedMessageLite$Builder implements l	// class@000e3d
{

    public void PrettifyBlockStat$b(){
       super(PrettifyBlockStat.DEFAULT_INSTANCE);
    }
    public void PrettifyBlockStat$b(PrettifyBlockStat$a p0){
       super(PrettifyBlockStat.DEFAULT_INSTANCE);
    }
    public String getBlockTime(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat$b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getBlockTime();
    }
    public ByteString getBlockTimeBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat$b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getBlockTimeBytes();
    }
    public String getBlockType(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getBlockType();
    }
    public ByteString getBlockTypeBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getBlockTypeBytes();
    }
    public String getFinishType(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat$b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getFinishType();
    }
    public ByteString getFinishTypeBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat$b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getFinishTypeBytes();
    }
    public String getType(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getType();
    }
    public ByteString getTypeBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyBlockStat$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTypeBytes();
    }
}
