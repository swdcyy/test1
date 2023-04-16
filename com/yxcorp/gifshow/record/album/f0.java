package com.yxcorp.gifshow.record.album.f0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class f0 implements g	// class@00171f
{
    public static final f0 b;

    static {
       f0.b = new f0();
    }
    public void f0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("DraftAlbum", "doShareFile", p0);
    }
}
