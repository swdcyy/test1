package com.yxcorp.gifshow.activity.share.presenter.i;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.activity.share.model.WaterMarkDetectResult;
import java.lang.Boolean;

public final class i implements o	// class@0013f0
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(p0.mHasWaterMark);
    }
}
