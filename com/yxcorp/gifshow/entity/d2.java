package com.yxcorp.gifshow.entity.d2;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Boolean;

public final class d2 implements h	// class@000da6
{
    public static final d2 b;

    static {
       d2.b = new d2();
    }
    public void d2(){
       super();
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(p0.isPrefetch());
    }
}
