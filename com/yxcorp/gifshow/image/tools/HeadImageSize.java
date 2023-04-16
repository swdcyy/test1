package com.yxcorp.gifshow.image.tools.HeadImageSize;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HeadImageSize extends Enum	// class@00194b
{
    public final boolean mAdjustSize;
    public final int mDefaultSize;
    public static final HeadImageSize[] $VALUES;
    public static final HeadImageSize ADJUST_BIG;
    public static final HeadImageSize ADJUST_EXTRA_BIG;
    public static final HeadImageSize ADJUST_MIDDLE;
    public static final HeadImageSize ADJUST_SMALL;
    public static final HeadImageSize BIG;
    public static final HeadImageSize MIDDLE;
    public static final HeadImageSize SMALL;

    static {
       HeadImageSize headImageSiz = new HeadImageSize("ADJUST_SMALL", 0, 60, true);
       HeadImageSize.ADJUST_SMALL = headImageSiz;
       HeadImageSize headImageSiz1 = new HeadImageSize("ADJUST_MIDDLE", true, 90, true);
       HeadImageSize.ADJUST_MIDDLE = headImageSiz1;
       HeadImageSize headImageSiz2 = new HeadImageSize("ADJUST_BIG", 2, 200, true);
       HeadImageSize.ADJUST_BIG = headImageSiz2;
       HeadImageSize headImageSiz3 = new HeadImageSize("ADJUST_EXTRA_BIG", 3, 300, true);
       HeadImageSize.ADJUST_EXTRA_BIG = headImageSiz3;
       HeadImageSize headImageSiz4 = new HeadImageSize("SMALL", 4, 60, 0);
       HeadImageSize.SMALL = headImageSiz4;
       HeadImageSize headImageSiz5 = new HeadImageSize("MIDDLE", 5, 90, 0);
       HeadImageSize.MIDDLE = headImageSiz5;
       HeadImageSize headImageSiz6 = new HeadImageSize("BIG", 6, 200, 0);
       HeadImageSize.BIG = headImageSiz6;
       HeadImageSize[] headImageSiz7 = new HeadImageSize[]{headImageSiz,headImageSiz1,headImageSiz2,headImageSiz3,headImageSiz4,headImageSiz5,headImageSiz6};
       HeadImageSize.$VALUES = headImageSiz7;
    }
    public void HeadImageSize(String p0,int p1,int p2,boolean p3){
       super(p0, p1);
       this.mDefaultSize = p2;
       this.mAdjustSize = p3;
    }
    public static HeadImageSize valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HeadImageSize.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HeadImageSize.class, p0);
    }
    public static HeadImageSize[] values(){
       Object obj = PatchProxy.apply(null, null, HeadImageSize.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HeadImageSize.$VALUES.clone();
    }
    public int getSize(){
       return this.mDefaultSize;
    }
    public boolean needAdjustSize(){
       return this.mAdjustSize;
    }
}
