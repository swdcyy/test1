package com.yxcorp.gifshow.map.PhotoSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoSource extends Enum	// class@001c65
{
    public static final PhotoSource[] $VALUES;
    public static final PhotoSource FROM_LOCATION;
    public static final PhotoSource FROM_SEARCH;

    static {
       PhotoSource photoSource = new PhotoSource("FROM_SEARCH", 0);
       PhotoSource.FROM_SEARCH = photoSource;
       PhotoSource photoSource1 = new PhotoSource("FROM_LOCATION", 1);
       PhotoSource.FROM_LOCATION = photoSource1;
       PhotoSource[] photoSourceA = new PhotoSource[]{photoSource,photoSource1};
       PhotoSource.$VALUES = photoSourceA;
    }
    public void PhotoSource(String p0,int p1){
       super(p0, p1);
    }
    public static PhotoSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoSource.class, p0);
    }
    public static PhotoSource[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoSource.$VALUES.clone();
    }
}
