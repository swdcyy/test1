package com.kwai.feature.post.api.core.model.GSConfig$SizeType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GSConfig$SizeType extends Enum	// class@001305
{
    public static final GSConfig$SizeType[] $VALUES;
    public static final GSConfig$SizeType IMPORTED_VIDEO;
    public static final GSConfig$SizeType PHOTO_MOVIE;
    public static final GSConfig$SizeType PICTURES;
    public static final GSConfig$SizeType SINGLE_PICTURE;
    public static final GSConfig$SizeType VIDEO;

    static {
       GSConfig$SizeType sizeType = new GSConfig$SizeType("VIDEO", 0);
       GSConfig$SizeType.VIDEO = sizeType;
       GSConfig$SizeType sizeType1 = new GSConfig$SizeType("IMPORTED_VIDEO", 1);
       GSConfig$SizeType.IMPORTED_VIDEO = sizeType1;
       GSConfig$SizeType sizeType2 = new GSConfig$SizeType("PHOTO_MOVIE", 2);
       GSConfig$SizeType.PHOTO_MOVIE = sizeType2;
       GSConfig$SizeType sizeType3 = new GSConfig$SizeType("SINGLE_PICTURE", 3);
       GSConfig$SizeType.SINGLE_PICTURE = sizeType3;
       GSConfig$SizeType sizeType4 = new GSConfig$SizeType("PICTURES", 4);
       GSConfig$SizeType.PICTURES = sizeType4;
       GSConfig$SizeType[] sizeTypeArra = new GSConfig$SizeType[]{sizeType,sizeType1,sizeType2,sizeType3,sizeType4};
       GSConfig$SizeType.$VALUES = sizeTypeArra;
    }
    public void GSConfig$SizeType(String p0,int p1){
       super(p0, p1);
    }
    public static GSConfig$SizeType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GSConfig$SizeType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GSConfig$SizeType.class, p0);
    }
    public static GSConfig$SizeType[] values(){
       Object obj = PatchProxy.apply(null, null, GSConfig$SizeType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GSConfig$SizeType.$VALUES.clone();
    }
}
