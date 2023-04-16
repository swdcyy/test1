package com.kuaishou.protobuf.photo.funnel.AlbumStat$NextMode$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.protobuf.photo.funnel.AlbumStat$NextMode;

public final class AlbumStat$NextMode$b implements Internal$EnumVerifier	// class@000e05
{
    public static final Internal$EnumVerifier a;

    static {
       AlbumStat$NextMode$b.a = new AlbumStat$NextMode$b();
    }
    public void AlbumStat$NextMode$b(){
       super();
    }
    public boolean isInRange(int p0){
       AlbumStat$NextMode$b nextMode$b = AlbumStat$NextMode$b.class;
       if (PatchProxy.isSupport(nextMode$b)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, nextMode$b, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (AlbumStat$NextMode.forNumber(p0) != null)? true: false;
       return b;
    }
}
