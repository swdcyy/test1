package com.kwai.sdk.eve.internal.inference.DataBundle;
import java.lang.Object;
import com.kwai.sdk.eve.internal.inference.DataBundle$TRANSFER;
import java.util.LinkedHashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ml5.a;
import ml5.a$a;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Map;
import java.util.HashMap;
import java.lang.Exception;

public final class DataBundle	// class@001542
{
    public DataBundle$TRANSFER a;
    public Map b;

    public void DataBundle(){
       super();
       this.a = DataBundle$TRANSFER.VALUE;
       this.b = new LinkedHashMap();
    }
    public final void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DataBundle.class, "1")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       if (!a.b.a(p1)) {
          throw new Exception("input value contains unsupported type");
       }
       if (!p1 instanceof GeneratedMessageLite) {
          this.b.put(p0, p1);
       }else {
          HashMap hashMap = new HashMap();
          String name = p1.getClass().getName();
          a.o(name, "value.javaClass.name");
          hashMap.put("protoType", name);
          hashMap.put("protoData", p1);
          this.b.put(p0, hashMap);
       }
       return;
    }
    public final void b(DataBundle$TRANSFER p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataBundle.class, "2")) {
          return;
       }
       a.p(p0, "type");
       this.a = p0;
       return;
    }
}
