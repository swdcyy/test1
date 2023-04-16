package com.yxcorp.gifshow.entity.t1;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta;
import java.util.List;
import com.kuaishou.android.model.mix.ImageMetaExt;

public final class t1 implements h	// class@000e3c
{
    public static final t1 b;

    static {
       t1.b = new t1();
    }
    public void t1(){
       super();
    }
    public final Object apply(Object p0){
       return ImageMetaExt.getSinglePhotoList(p0);
    }
}
