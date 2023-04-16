package com.yxcorp.gifshow.photoad.i;
import lnc.c3$b;
import java.lang.Object;
import android.net.Uri;
import java.lang.String;

public final class i implements c3$b	// class@000f95
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final Object apply(Object p0){
       return p0.getQueryParameter("liveStreamId");
    }
}
