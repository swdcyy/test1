package com.kuaishou.protobuf.photo.funnel.EncodeStat$Status$a;
import com.google.protobuf.Internal$EnumLiteMap;
import java.lang.Object;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$Status;

public final class EncodeStat$Status$a implements Internal$EnumLiteMap	// class@000e16
{

    public void EncodeStat$Status$a(){
       super();
    }
    public Internal$EnumLite findValueByNumber(int p0){
       EncodeStat$Status status;
       EncodeStat$Status$a status$a = EncodeStat$Status$a.class;
       if (PatchProxy.isSupport(status$a)) {
          status = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, status$a, "1");
          if (status != PatchProxyResult.class) {
          label_001d :
             return status;
          }
       }
       status = EncodeStat$Status.forNumber(p0);
       goto label_001d ;
    }
}
