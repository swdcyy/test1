package com.kwai.library.slide.base.pagelist.DetailProfileFeedBidirectionalPageList$Orientation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DetailProfileFeedBidirectionalPageList$Orientation extends Enum	// class@0008e8
{
    public final int type;
    public static final DetailProfileFeedBidirectionalPageList$Orientation[] $VALUES;
    public static final DetailProfileFeedBidirectionalPageList$Orientation NEXT;
    public static final DetailProfileFeedBidirectionalPageList$Orientation PREV;
    public static final DetailProfileFeedBidirectionalPageList$Orientation UNSPECIFIED;

    static {
       DetailProfileFeedBidirectionalPageList$Orientation orientation;
       DetailProfileFeedBidirectionalPageList$Orientation[] orientationA = new DetailProfileFeedBidirectionalPageList$Orientation[]{orientation,orientation,orientation};
       orientation = new DetailProfileFeedBidirectionalPageList$Orientation("UNSPECIFIED", 0, 0);
       DetailProfileFeedBidirectionalPageList$Orientation.UNSPECIFIED = orientation;
       orientation = new DetailProfileFeedBidirectionalPageList$Orientation("PREV", 1, 1);
       DetailProfileFeedBidirectionalPageList$Orientation.PREV = orientation;
       orientation = new DetailProfileFeedBidirectionalPageList$Orientation("NEXT", 2, 2);
       DetailProfileFeedBidirectionalPageList$Orientation.NEXT = orientation;
       DetailProfileFeedBidirectionalPageList$Orientation.$VALUES = orientationA;
    }
    public void DetailProfileFeedBidirectionalPageList$Orientation(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static DetailProfileFeedBidirectionalPageList$Orientation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DetailProfileFeedBidirectionalPageList$Orientation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DetailProfileFeedBidirectionalPageList$Orientation.class, p0);
    }
    public static DetailProfileFeedBidirectionalPageList$Orientation[] values(){
       Object obj = PatchProxy.apply(null, null, DetailProfileFeedBidirectionalPageList$Orientation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DetailProfileFeedBidirectionalPageList$Orientation.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
