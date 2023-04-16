package com.kuaishou.protobuf.photo.funnel.TemplateStat$b;
import pr4.s;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.TemplateStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.TemplateStat$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;

public final class TemplateStat$b extends GeneratedMessageLite$Builder implements s	// class@000e79
{

    public void TemplateStat$b(){
       super(TemplateStat.DEFAULT_INSTANCE);
    }
    public void TemplateStat$b(TemplateStat$a p0){
       super(TemplateStat.DEFAULT_INSTANCE);
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, TemplateStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getId();
    }
    public ByteString getIdBytes(){
       Object obj = PatchProxy.apply(null, this, TemplateStat$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getIdBytes();
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, TemplateStat$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       Object obj = PatchProxy.apply(null, this, TemplateStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getNameBytes();
    }
}
