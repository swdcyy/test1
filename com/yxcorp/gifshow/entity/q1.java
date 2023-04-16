package com.yxcorp.gifshow.entity.q1;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta;
import java.util.List;
import com.kuaishou.android.model.mix.ImageMetaExt;

public final class q1 implements h	// class@000e21
{
    public static final q1 b;

    static {
       q1.b = new q1();
    }
    public void q1(){
       super();
    }
    public final Object apply(Object p0){
       return ImageMetaExt.getAtlasList(p0);
    }
}
