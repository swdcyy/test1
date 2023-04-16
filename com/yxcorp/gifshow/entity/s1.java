package com.yxcorp.gifshow.entity.s1;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta;
import java.lang.String;
import com.kuaishou.android.model.mix.ImageMetaExt;

public final class s1 implements h	// class@000e33
{
    public static final s1 b;

    static {
       s1.b = new s1();
    }
    public void s1(){
       super();
    }
    public final Object apply(Object p0){
       return ImageMetaExt.getMusicUrl(p0);
    }
}
