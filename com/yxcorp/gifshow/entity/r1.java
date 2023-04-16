package com.yxcorp.gifshow.entity.r1;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kuaishou.android.model.mix.ImageMetaExt;
import java.lang.Float;

public final class r1 implements h	// class@000e2a
{
    public static final r1 b;

    static {
       r1.b = new r1();
    }
    public void r1(){
       super();
    }
    public final Object apply(Object p0){
       return Float.valueOf(ImageMetaExt.getAtlasMusicVolume(p0));
    }
}
