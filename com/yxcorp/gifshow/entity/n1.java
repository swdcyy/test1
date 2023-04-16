package com.yxcorp.gifshow.entity.n1;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;

public final class n1 implements h	// class@000e06
{
    public static final n1 b;

    static {
       n1.b = new n1();
    }
    public void n1(){
       super();
    }
    public final Object apply(Object p0){
       return p0.getSinglePictureIfValid();
    }
}
