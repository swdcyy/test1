package com.yxcorp.gifshow.record.album.z;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class z implements g	// class@00178c
{
    public static final z b;

    static {
       z.b = new z();
    }
    public void z(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("LocalAlbumListFragment", "isDurationOverLimit", p0);
    }
}
