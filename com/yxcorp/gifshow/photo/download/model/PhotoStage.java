package com.yxcorp.gifshow.photo.download.model.PhotoStage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoStage extends Enum	// class@000ed7
{
    public String name;
    public static final PhotoStage[] $VALUES;
    public static final PhotoStage MOCK;
    public static final PhotoStage NORMAL;
    public static final PhotoStage PENDING;
    public static final PhotoStage UNPUBLISHED;

    static {
       PhotoStage photoStage = new PhotoStage("MOCK", 0, "MOCK");
       PhotoStage.MOCK = photoStage;
       PhotoStage photoStage1 = new PhotoStage("PENDING", 1, "PENDING");
       PhotoStage.PENDING = photoStage1;
       PhotoStage photoStage2 = new PhotoStage("UNPUBLISHED", 2, "UNPUBLISHED");
       PhotoStage.UNPUBLISHED = photoStage2;
       PhotoStage photoStage3 = new PhotoStage("NORMAL", 3, "NORMAL");
       PhotoStage.NORMAL = photoStage3;
       PhotoStage[] photoStageAr = new PhotoStage[]{photoStage,photoStage1,photoStage2,photoStage3};
       PhotoStage.$VALUES = photoStageAr;
    }
    public void PhotoStage(String p0,int p1,String p2){
       super(p0, p1);
       this.name = p2;
    }
    public static PhotoStage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoStage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoStage.class, p0);
    }
    public static PhotoStage[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoStage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoStage.$VALUES.clone();
    }
}
