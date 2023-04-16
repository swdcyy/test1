package com.kuaishou.protobuf.photo.funnel.AlbumStat$NextMode$a;
import com.google.protobuf.Internal$EnumLiteMap;
import java.lang.Object;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.photo.funnel.AlbumStat$NextMode;

public final class AlbumStat$NextMode$a implements Internal$EnumLiteMap	// class@000e04
{

    public void AlbumStat$NextMode$a(){
       super();
    }
    public Internal$EnumLite findValueByNumber(int p0){
       AlbumStat$NextMode nextMode;
       AlbumStat$NextMode$a nextMode$a = AlbumStat$NextMode$a.class;
       if (PatchProxy.isSupport(nextMode$a)) {
          nextMode = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, nextMode$a, "1");
          if (nextMode != PatchProxyResult.class) {
          label_001d :
             return nextMode;
          }
       }
       nextMode = AlbumStat$NextMode.forNumber(p0);
       goto label_001d ;
    }
}
