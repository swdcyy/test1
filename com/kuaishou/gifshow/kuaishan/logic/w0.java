package com.kuaishou.gifshow.kuaishan.logic.w0;
import erd.o;
import java.lang.Object;
import java.lang.Integer;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import com.kuaishou.gifshow.kuaishan.utils.e;

public final class w0 implements o	// class@001a78
{
    public static final w0 b;

    static {
       w0.b = new w0();
    }
    public void w0(){
       super();
    }
    public final Object apply(Object p0){
       return Integer.valueOf(e.j(p0.intValue(), 0, 60));
    }
}
