package com.kuaishou.protobuf.photo.funnel.SubtitleStat$Type$a;
import com.google.protobuf.Internal$EnumLiteMap;
import java.lang.Object;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Type;

public final class SubtitleStat$Type$a implements Internal$EnumLiteMap	// class@000e6f
{

    public void SubtitleStat$Type$a(){
       super();
    }
    public Internal$EnumLite findValueByNumber(int p0){
       SubtitleStat$Type type;
       SubtitleStat$Type$a type$a = SubtitleStat$Type$a.class;
       if (PatchProxy.isSupport(type$a)) {
          type = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, type$a, "1");
          if (type != PatchProxyResult.class) {
          label_001d :
             return type;
          }
       }
       type = SubtitleStat$Type.forNumber(p0);
       goto label_001d ;
    }
}
