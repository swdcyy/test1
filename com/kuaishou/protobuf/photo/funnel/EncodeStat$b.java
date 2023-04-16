package com.kuaishou.protobuf.photo.funnel.EncodeStat$b;
import com.kuaishou.protobuf.photo.funnel.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.EncodeStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$Status;

public final class EncodeStat$b extends GeneratedMessageLite$Builder implements c	// class@000e1a
{

    public void EncodeStat$b(){
       super(EncodeStat.DEFAULT_INSTANCE);
    }
    public void EncodeStat$b(EncodeStat$a p0){
       super(EncodeStat.DEFAULT_INSTANCE);
    }
    public long getEncodeCost(){
       Object obj = PatchProxy.apply(null, this, EncodeStat$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getEncodeCost();
    }
    public long getStartTimeStamp(){
       Object obj = PatchProxy.apply(null, this, EncodeStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getStartTimeStamp();
    }
    public EncodeStat$Status getStatus(){
       Object obj = PatchProxy.apply(null, this, EncodeStat$b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getStatus();
    }
    public int getStatusValue(){
       Object obj = PatchProxy.apply(null, this, EncodeStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getStatusValue();
    }
}
