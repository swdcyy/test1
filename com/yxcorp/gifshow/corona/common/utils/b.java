package com.yxcorp.gifshow.corona.common.utils.b;
import lnc.c2;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import uq9.f;

public final class b implements c2	// class@001270
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final boolean accept(Object p0){
       boolean b = (!p0.isVideoType() && !p0.isImageType())? true: false;
       return b;
    }
}
