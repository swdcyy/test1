package com.kuaishou.gifshow.kuaishan.logic.u0;
import erd.o;
import java.lang.Object;
import java.lang.Integer;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import com.kuaishou.gifshow.kuaishan.utils.e;

public final class u0 implements o	// class@001a74
{
    public static final u0 b;

    static {
       u0.b = new u0();
    }
    public void u0(){
       super();
    }
    public final Object apply(Object p0){
       return Integer.valueOf(e.j(p0.intValue(), 0, 60));
    }
}
