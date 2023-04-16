package com.yxcorp.gifshow.entity.p1;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kuaishou.android.model.mix.ImageMetaExt;

public final class p1 implements h	// class@000e18
{
    public static final p1 b;

    static {
       p1.b = new p1();
    }
    public void p1(){
       super();
    }
    public final Object apply(Object p0){
       return ImageMetaExt.getAtlasIndices(p0);
    }
}
