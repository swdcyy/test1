package com.yxcorp.gifshow.publish.ShareProject$ProjectType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ShareProject$ProjectType extends Enum	// class@00160e
{
    public static final ShareProject$ProjectType[] $VALUES;
    public static final ShareProject$ProjectType MP4;
    public static final ShareProject$ProjectType PHOTOS;
    public static final ShareProject$ProjectType PICTURE;

    static {
       ShareProject$ProjectType projectType = new ShareProject$ProjectType("MP4", 0);
       ShareProject$ProjectType.MP4 = projectType;
       ShareProject$ProjectType projectType1 = new ShareProject$ProjectType("PICTURE", 1);
       ShareProject$ProjectType.PICTURE = projectType1;
       ShareProject$ProjectType projectType2 = new ShareProject$ProjectType("PHOTOS", 2);
       ShareProject$ProjectType.PHOTOS = projectType2;
       ShareProject$ProjectType[] projectTypeA = new ShareProject$ProjectType[]{projectType,projectType1,projectType2};
       ShareProject$ProjectType.$VALUES = projectTypeA;
    }
    public void ShareProject$ProjectType(String p0,int p1){
       super(p0, p1);
    }
    public static ShareProject$ProjectType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ShareProject$ProjectType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ShareProject$ProjectType.class, p0);
    }
    public static ShareProject$ProjectType[] values(){
       Object obj = PatchProxy.apply(null, null, ShareProject$ProjectType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ShareProject$ProjectType.$VALUES.clone();
    }
}
