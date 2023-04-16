package com.yxcorp.gifshow.profile.collect.network.CollectionSlidePageList$Orientation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CollectionSlidePageList$Orientation extends Enum	// class@0012cb
{
    public final String type;
    public static final CollectionSlidePageList$Orientation[] $VALUES;
    public static final CollectionSlidePageList$Orientation NEXT;
    public static final CollectionSlidePageList$Orientation PREV;
    public static final CollectionSlidePageList$Orientation UNSPECIFIED;

    static {
       CollectionSlidePageList$Orientation orientation;
       CollectionSlidePageList$Orientation[] orientationA = new CollectionSlidePageList$Orientation[]{orientation,orientation,orientation};
       orientation = new CollectionSlidePageList$Orientation("UNSPECIFIED", 0, "1");
       CollectionSlidePageList$Orientation.UNSPECIFIED = orientation;
       orientation = new CollectionSlidePageList$Orientation("PREV", 1, "2");
       CollectionSlidePageList$Orientation.PREV = orientation;
       orientation = new CollectionSlidePageList$Orientation("NEXT", 2, "3");
       CollectionSlidePageList$Orientation.NEXT = orientation;
       CollectionSlidePageList$Orientation.$VALUES = orientationA;
    }
    public void CollectionSlidePageList$Orientation(String p0,int p1,String p2){
       super(p0, p1);
       this.type = p2;
    }
    public static CollectionSlidePageList$Orientation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CollectionSlidePageList$Orientation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CollectionSlidePageList$Orientation.class, p0);
    }
    public static CollectionSlidePageList$Orientation[] values(){
       Object obj = PatchProxy.apply(null, null, CollectionSlidePageList$Orientation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionSlidePageList$Orientation.$VALUES.clone();
    }
    public final String getType(){
       return this.type;
    }
}
