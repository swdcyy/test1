package com.yxcorp.gifshow.entity.z1;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Integer;

public final class z1 implements h	// class@000e74
{
    public static final z1 b;

    static {
       z1.b = new z1();
    }
    public void z1(){
       super();
    }
    public final Object apply(Object p0){
       return Integer.valueOf(p0.getLikeCount());
    }
}
