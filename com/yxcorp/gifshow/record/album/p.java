package com.yxcorp.gifshow.record.album.p;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class p implements g	// class@001748
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ks://LocalAlbumFragmentV2", "isDeprecatedSparkDraft", p0);
    }
}
