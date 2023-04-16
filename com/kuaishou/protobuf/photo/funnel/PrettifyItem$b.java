package com.kuaishou.protobuf.photo.funnel.PrettifyItem$b;
import pr4.m;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PrettifyItem;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.PrettifyItem$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;
import java.lang.Number;

public final class PrettifyItem$b extends GeneratedMessageLite$Builder implements m	// class@000e40
{

    public void PrettifyItem$b(){
       super(PrettifyItem.DEFAULT_INSTANCE);
    }
    public void PrettifyItem$b(PrettifyItem$a p0){
       super(PrettifyItem.DEFAULT_INSTANCE);
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, PrettifyItem$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getId();
    }
    public ByteString getIdBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyItem$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getIdBytes();
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, PrettifyItem$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyItem$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getNameBytes();
    }
    public float getValue(){
       Object obj = PatchProxy.apply(null, this, PrettifyItem$b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getValue();
    }
}
