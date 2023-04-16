package com.kwai.live.gzone.promotion.n;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import java.io.Serializable;
import java.lang.Object;
import vq4.c;
import vq4.d;

public final class n implements AdDataWrapper$AdLogParamAppender, Serializable	// class@000dd0
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final void appendAdLogParam(c p0){
       p0 = p0.F;
       p0.g2 = 2;
       p0.h2 = 3;
       p0.i2 = 2;
    }
}
