package com.yxcorp.gifshow.nasa.SimilarPhotoLocation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SimilarPhotoLocation extends Enum	// class@0020d3
{
    public static final SimilarPhotoLocation[] $VALUES;
    public static final SimilarPhotoLocation FEATURED_PAGE_BOTTOM_PANEL;
    public static final SimilarPhotoLocation FEATURED_PAGE_POP;
    public static final SimilarPhotoLocation FEATURED_PAGE_URL;

    static {
       SimilarPhotoLocation similarPhoto = new SimilarPhotoLocation("FEATURED_PAGE_BOTTOM_PANEL", 0);
       SimilarPhotoLocation.FEATURED_PAGE_BOTTOM_PANEL = similarPhoto;
       SimilarPhotoLocation similarPhoto1 = new SimilarPhotoLocation("FEATURED_PAGE_POP", 1);
       SimilarPhotoLocation.FEATURED_PAGE_POP = similarPhoto1;
       SimilarPhotoLocation similarPhoto2 = new SimilarPhotoLocation("FEATURED_PAGE_URL", 2);
       SimilarPhotoLocation.FEATURED_PAGE_URL = similarPhoto2;
       SimilarPhotoLocation[] similarPhoto3 = new SimilarPhotoLocation[]{similarPhoto,similarPhoto1,similarPhoto2};
       SimilarPhotoLocation.$VALUES = similarPhoto3;
    }
    public void SimilarPhotoLocation(String p0,int p1){
       super(p0, p1);
    }
    public static SimilarPhotoLocation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SimilarPhotoLocation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SimilarPhotoLocation.class, p0);
    }
    public static SimilarPhotoLocation[] values(){
       Object obj = PatchProxy.apply(null, null, SimilarPhotoLocation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SimilarPhotoLocation.$VALUES.clone();
    }
}
