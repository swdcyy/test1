package com.yxcorp.gifshow.entity.u1;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.ImageMetaExt;

public final class u1 implements h	// class@000e47
{
    public static final u1 b;

    static {
       u1.b = new u1();
    }
    public void u1(){
       super();
    }
    public final Object apply(Object p0){
       return ImageMetaExt.getSinglePictureMusicCdn(p0);
    }
}
