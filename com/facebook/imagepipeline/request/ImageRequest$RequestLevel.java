package com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ImageRequest$RequestLevel extends Enum	// class@00114c
{
    public int mValue;
    public static final ImageRequest$RequestLevel[] $VALUES;
    public static final ImageRequest$RequestLevel BITMAP_MEMORY_CACHE;
    public static final ImageRequest$RequestLevel DISK_CACHE;
    public static final ImageRequest$RequestLevel ENCODED_MEMORY_CACHE;
    public static final ImageRequest$RequestLevel FULL_FETCH;

    static {
       ImageRequest$RequestLevel requestLevel = new ImageRequest$RequestLevel("FULL_FETCH", 0, 1);
       ImageRequest$RequestLevel.FULL_FETCH = requestLevel;
       ImageRequest$RequestLevel requestLevel1 = new ImageRequest$RequestLevel("DISK_CACHE", 1, 2);
       ImageRequest$RequestLevel.DISK_CACHE = requestLevel1;
       ImageRequest$RequestLevel requestLevel2 = new ImageRequest$RequestLevel("ENCODED_MEMORY_CACHE", 2, 3);
       ImageRequest$RequestLevel.ENCODED_MEMORY_CACHE = requestLevel2;
       ImageRequest$RequestLevel requestLevel3 = new ImageRequest$RequestLevel("BITMAP_MEMORY_CACHE", 3, 4);
       ImageRequest$RequestLevel.BITMAP_MEMORY_CACHE = requestLevel3;
       ImageRequest$RequestLevel[] requestLevel4 = new ImageRequest$RequestLevel[]{requestLevel,requestLevel1,requestLevel2,requestLevel3};
       ImageRequest$RequestLevel.$VALUES = requestLevel4;
    }
    public void ImageRequest$RequestLevel(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static ImageRequest$RequestLevel getMax(ImageRequest$RequestLevel p0,ImageRequest$RequestLevel p1){
       if (p0.getValue() > p1.getValue()) {
       }else {
          p0 = p1;
       }
       return p0;
    }
    public static ImageRequest$RequestLevel valueOf(String p0){
       return Enum.valueOf(ImageRequest$RequestLevel.class, p0);
    }
    public static ImageRequest$RequestLevel[] values(){
       return ImageRequest$RequestLevel.$VALUES.clone();
    }
    public int getValue(){
       return this.mValue;
    }
}
