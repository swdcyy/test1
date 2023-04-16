package com.yxcorp.gifshow.entity.c2;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Boolean;

public final class c2 implements h	// class@000d9d
{
    public static final c2 b;

    static {
       c2.b = new c2();
    }
    public void c2(){
       super();
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(p0.isPending());
    }
}
