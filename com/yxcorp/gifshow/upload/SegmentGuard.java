package com.yxcorp.gifshow.upload.SegmentGuard;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SegmentGuard extends Enum	// class@001e4e
{
    public static final SegmentGuard[] $VALUES;
    public static final SegmentGuard CANCEL;
    public static final SegmentGuard END;
    public static final SegmentGuard NORMAL;

    static {
       SegmentGuard segmentGuard = new SegmentGuard("NORMAL", 0);
       SegmentGuard.NORMAL = segmentGuard;
       SegmentGuard segmentGuard1 = new SegmentGuard("END", 1);
       SegmentGuard.END = segmentGuard1;
       SegmentGuard segmentGuard2 = new SegmentGuard("CANCEL", 2);
       SegmentGuard.CANCEL = segmentGuard2;
       SegmentGuard[] segmentGuard3 = new SegmentGuard[]{segmentGuard,segmentGuard1,segmentGuard2};
       SegmentGuard.$VALUES = segmentGuard3;
    }
    public void SegmentGuard(String p0,int p1){
       super(p0, p1);
    }
    public static SegmentGuard valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SegmentGuard.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SegmentGuard.class, p0);
    }
    public static SegmentGuard[] values(){
       Object obj = PatchProxy.apply(null, null, SegmentGuard.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SegmentGuard.$VALUES.clone();
    }
}
