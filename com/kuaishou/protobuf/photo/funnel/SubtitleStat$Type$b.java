package com.kuaishou.protobuf.photo.funnel.SubtitleStat$Type$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Type;

public final class SubtitleStat$Type$b implements Internal$EnumVerifier	// class@000e70
{
    public static final Internal$EnumVerifier a;

    static {
       SubtitleStat$Type$b.a = new SubtitleStat$Type$b();
    }
    public void SubtitleStat$Type$b(){
       super();
    }
    public boolean isInRange(int p0){
       SubtitleStat$Type$b type$b = SubtitleStat$Type$b.class;
       if (PatchProxy.isSupport(type$b)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, type$b, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (SubtitleStat$Type.forNumber(p0) != null)? true: false;
       return b;
    }
}
