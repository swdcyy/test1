package com.yxcorp.gifshow.record.album.r;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import e17.i;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class r implements g	// class@00174e
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public final void accept(Object p0){
       i.a(R.style.arg_RES_7f110668, 0x7f10474b);
       PostUtils.D("ks://LocalAlbumFragmentV2", "onShareProject", p0);
    }
}
