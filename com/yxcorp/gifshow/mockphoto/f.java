package com.yxcorp.gifshow.mockphoto.f;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.mockphoto.EncodeResultResponse;
import com.yxcorp.gifshow.mockphoto.j;
import com.yxcorp.gifshow.mockphoto.EncodeResultResponse$EncodeResult;
import java.lang.Boolean;

public final class f implements o	// class@001de4
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       boolean b = (p0.mEncodeResult == EncodeResultResponse$EncodeResult.FAILED)? true: false;
       return Boolean.valueOf(b);
    }
}
