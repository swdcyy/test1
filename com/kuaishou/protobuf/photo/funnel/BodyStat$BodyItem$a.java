package com.kuaishou.protobuf.photo.funnel.BodyStat$BodyItem$a;
import com.kuaishou.protobuf.photo.funnel.BodyStat$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.BodyStat$BodyItem;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.BodyStat$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;
import java.lang.Number;

public final class BodyStat$BodyItem$a extends GeneratedMessageLite$Builder implements BodyStat$b	// class@000e0d
{

    public void BodyStat$BodyItem$a(){
       super(BodyStat$BodyItem.DEFAULT_INSTANCE);
    }
    public void BodyStat$BodyItem$a(BodyStat$a p0){
       super(BodyStat$BodyItem.DEFAULT_INSTANCE);
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, BodyStat$BodyItem$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       Object obj = PatchProxy.apply(null, this, BodyStat$BodyItem$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getNameBytes();
    }
    public float getValue(){
       Object obj = PatchProxy.apply(null, this, BodyStat$BodyItem$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getValue();
    }
}
