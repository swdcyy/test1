package com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier$SelectType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveEntryCoverSelectSupplier$SelectType extends Enum	// class@000d50
{
    public static final LiveEntryCoverSelectSupplier$SelectType[] $VALUES;
    public static final LiveEntryCoverSelectSupplier$SelectType CAMERA;
    public static final LiveEntryCoverSelectSupplier$SelectType PHOTOALBUM;

    static {
       LiveEntryCoverSelectSupplier$SelectType selectType = new LiveEntryCoverSelectSupplier$SelectType("CAMERA", 0);
       LiveEntryCoverSelectSupplier$SelectType.CAMERA = selectType;
       LiveEntryCoverSelectSupplier$SelectType selectType1 = new LiveEntryCoverSelectSupplier$SelectType("PHOTOALBUM", 1);
       LiveEntryCoverSelectSupplier$SelectType.PHOTOALBUM = selectType1;
       LiveEntryCoverSelectSupplier$SelectType[] selectTypeAr = new LiveEntryCoverSelectSupplier$SelectType[]{selectType,selectType1};
       LiveEntryCoverSelectSupplier$SelectType.$VALUES = selectTypeAr;
    }
    public void LiveEntryCoverSelectSupplier$SelectType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveEntryCoverSelectSupplier$SelectType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveEntryCoverSelectSupplier$SelectType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveEntryCoverSelectSupplier$SelectType.class, p0);
    }
    public static LiveEntryCoverSelectSupplier$SelectType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveEntryCoverSelectSupplier$SelectType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveEntryCoverSelectSupplier$SelectType.$VALUES.clone();
    }
}
