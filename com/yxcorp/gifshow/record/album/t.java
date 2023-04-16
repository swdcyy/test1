package com.yxcorp.gifshow.record.album.t;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import e17.i;

public final class t implements g	// class@001754
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ks://LocalAlbumFragmentV2", "onDeleteProject", p0);
       i.a(R.style.arg_RES_7f110668, 0x7f104275);
    }
}
