package com.kwai.library.groot.slide.filter.SlideMediaType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SlideMediaType extends Enum	// class@00083d
{
    public int value;
    public static final SlideMediaType[] $VALUES;
    public static final SlideMediaType ALL;
    public static final SlideMediaType AUTO_MODE;
    public static final SlideMediaType IGNORE_STANDARD_LIVE;
    public static final SlideMediaType LIVE;
    public static final SlideMediaType NONE;
    public static final SlideMediaType PHOTO;
    public static final SlideMediaType VIDEO;

    static {
       SlideMediaType slideMediaTy = new SlideMediaType("LIVE", 0, 0);
       SlideMediaType.LIVE = slideMediaTy;
       SlideMediaType slideMediaTy1 = new SlideMediaType("PHOTO", 1, 1);
       SlideMediaType.PHOTO = slideMediaTy1;
       SlideMediaType slideMediaTy2 = new SlideMediaType("ALL", 2, 2);
       SlideMediaType.ALL = slideMediaTy2;
       SlideMediaType slideMediaTy3 = new SlideMediaType("VIDEO", 3, 3);
       SlideMediaType.VIDEO = slideMediaTy3;
       SlideMediaType slideMediaTy4 = new SlideMediaType("AUTO_MODE", 4, 4);
       SlideMediaType.AUTO_MODE = slideMediaTy4;
       SlideMediaType slideMediaTy5 = new SlideMediaType("NONE", 5, 5);
       SlideMediaType.NONE = slideMediaTy5;
       SlideMediaType slideMediaTy6 = new SlideMediaType("IGNORE_STANDARD_LIVE", 6, 6);
       SlideMediaType.IGNORE_STANDARD_LIVE = slideMediaTy6;
       SlideMediaType[] slideMediaTy7 = new SlideMediaType[]{slideMediaTy,slideMediaTy1,slideMediaTy2,slideMediaTy3,slideMediaTy4,slideMediaTy5,slideMediaTy6};
       SlideMediaType.$VALUES = slideMediaTy7;
    }
    public void SlideMediaType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static SlideMediaType valueOf(int p0){
       if (!p0) {
          return SlideMediaType.LIVE;
       }
       if (p0 == 1) {
          return SlideMediaType.PHOTO;
       }
       if (p0 == 2) {
          return SlideMediaType.ALL;
       }
       if (p0 == 3) {
          return SlideMediaType.VIDEO;
       }
       if (p0 == 4) {
          return SlideMediaType.AUTO_MODE;
       }
       if (p0 != 5) {
          return null;
       }
       return SlideMediaType.NONE;
    }
    public static SlideMediaType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SlideMediaType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SlideMediaType.class, p0);
    }
    public static SlideMediaType[] values(){
       Object obj = PatchProxy.apply(null, null, SlideMediaType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlideMediaType.$VALUES.clone();
    }
    public int value(){
       return this.value;
    }
}
