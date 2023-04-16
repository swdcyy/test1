package com.kwai.live.gzone.promotion.m;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import java.io.Serializable;
import java.lang.Object;
import vq4.c;
import vq4.d;

public final class m implements AdDataWrapper$AdLogParamAppender, Serializable	// class@000dcf
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final void appendAdLogParam(c p0){
       p0 = p0.F;
       p0.g2 = 2;
       p0.h2 = 3;
       p0.i2 = 2;
    }
}
