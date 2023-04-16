package com.yxcorp.gifshow.record.album.n;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class n implements g	// class@001742
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ks://LocalAlbumFragmentV2", "onDownLoadProject", p0);
    }
}
