package com.yxcorp.gifshow.corona.common.utils.d;
import lnc.c2;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import uq9.f;

public final class d implements c2	// class@001272
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final boolean accept(Object p0){
       return (p0.isVideoType() ^ 0x01);
    }
}
