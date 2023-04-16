package com.yxcorp.gifshow.record.album.o;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class o implements g	// class@001745
{
    public static final o b;

    static {
       o.b = new o();
    }
    public void o(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ks://LocalAlbumFragmentV2", "isDeprecatedSparkDraft", p0);
    }
}
