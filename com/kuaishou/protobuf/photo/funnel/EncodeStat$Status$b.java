package com.kuaishou.protobuf.photo.funnel.EncodeStat$Status$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$Status;

public final class EncodeStat$Status$b implements Internal$EnumVerifier	// class@000e17
{
    public static final Internal$EnumVerifier a;

    static {
       EncodeStat$Status$b.a = new EncodeStat$Status$b();
    }
    public void EncodeStat$Status$b(){
       super();
    }
    public boolean isInRange(int p0){
       EncodeStat$Status$b status$b = EncodeStat$Status$b.class;
       if (PatchProxy.isSupport(status$b)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, status$b, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (EncodeStat$Status.forNumber(p0) != null)? true: false;
       return b;
    }
}
