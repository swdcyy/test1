package com.yxcorp.gifshow.entity.b2;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Boolean;

public final class b2 implements h	// class@000d93
{
    public static final b2 b;

    static {
       b2.b = new b2();
    }
    public void b2(){
       super();
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(p0.isLiked());
    }
}
