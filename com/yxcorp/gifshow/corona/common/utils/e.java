package com.yxcorp.gifshow.corona.common.utils.e;
import lnc.c2;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import uq9.f;
import mxb.b0;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class e implements c2	// class@001273
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final boolean accept(Object p0){
       boolean b = (!b0.a(p0) && (p0.isSerialPayPhoto() || r1.c2(p0.getEntity())))? true: false;
       return b;
    }
}
