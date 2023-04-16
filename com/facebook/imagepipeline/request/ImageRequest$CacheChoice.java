package com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ImageRequest$CacheChoice extends Enum	// class@00114b
{
    public static final ImageRequest$CacheChoice[] $VALUES;
    public static final ImageRequest$CacheChoice DEFAULT;
    public static final ImageRequest$CacheChoice SMALL;

    static {
       ImageRequest$CacheChoice uCacheChoice = new ImageRequest$CacheChoice("SMALL", 0);
       ImageRequest$CacheChoice.SMALL = uCacheChoice;
       ImageRequest$CacheChoice uCacheChoice1 = new ImageRequest$CacheChoice("DEFAULT", 1);
       ImageRequest$CacheChoice.DEFAULT = uCacheChoice1;
       ImageRequest$CacheChoice[] uCacheChoice2 = new ImageRequest$CacheChoice[]{uCacheChoice,uCacheChoice1};
       ImageRequest$CacheChoice.$VALUES = uCacheChoice2;
    }
    public void ImageRequest$CacheChoice(String p0,int p1){
       super(p0, p1);
    }
    public static ImageRequest$CacheChoice valueOf(String p0){
       return Enum.valueOf(ImageRequest$CacheChoice.class, p0);
    }
    public static ImageRequest$CacheChoice[] values(){
       return ImageRequest$CacheChoice.$VALUES.clone();
    }
}
