package com.yxcorp.gifshow.record.album.h0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class h0 implements g	// class@001725
{
    public static final h0 b;

    static {
       h0.b = new h0();
    }
    public void h0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("LocalAlbumUtils", "editSession", p0);
    }
}
