package com.yxcorp.gifshow.record.album.d2;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class d2 implements g	// class@001719
{
    public static final d2 b;

    static {
       d2.b = new d2();
    }
    public void d2(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("DraftAlbum", "loadLegacy error", p0);
    }
}
