package com.yxcorp.gifshow.entity.v1;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kuaishou.android.model.mix.ImageMetaExt;
import java.lang.Float;

public final class v1 implements h	// class@000e50
{
    public static final v1 b;

    static {
       v1.b = new v1();
    }
    public void v1(){
       super();
    }
    public final Object apply(Object p0){
       return Float.valueOf(ImageMetaExt.getSinglePictureMusicVolume(p0));
    }
}
