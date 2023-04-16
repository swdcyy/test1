package com.kuaishou.protobuf.photo.funnel.PrettifyRestore$b;
import pr4.n;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;

public final class PrettifyRestore$b extends GeneratedMessageLite$Builder implements n	// class@000e43
{

    public void PrettifyRestore$b(){
       super(PrettifyRestore.DEFAULT_INSTANCE);
    }
    public void PrettifyRestore$b(PrettifyRestore$a p0){
       super(PrettifyRestore.DEFAULT_INSTANCE);
    }
    public String getErrorCode(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getErrorCode();
    }
    public ByteString getErrorCodeBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getErrorCodeBytes();
    }
    public String getLastSessionId(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore$b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLastSessionId();
    }
    public ByteString getLastSessionIdBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore$b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLastSessionIdBytes();
    }
    public String getLastSuitId(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore$b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLastSuitId();
    }
    public ByteString getLastSuitIdBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore$b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLastSuitIdBytes();
    }
    public String getSuitId(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getSuitId();
    }
    public ByteString getSuitIdBytes(){
       Object obj = PatchProxy.apply(null, this, PrettifyRestore$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getSuitIdBytes();
    }
}
