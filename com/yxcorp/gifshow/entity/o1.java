package com.yxcorp.gifshow.entity.o1;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta;
import java.lang.Boolean;

public final class o1 implements h	// class@000e0f
{
    public static final o1 b;

    static {
       o1.b = new o1();
    }
    public void o1(){
       super();
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(p0.isSinglePhoto());
    }
}
