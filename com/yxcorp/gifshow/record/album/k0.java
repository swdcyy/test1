package com.yxcorp.gifshow.record.album.k0;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import k8c.a;
import java.lang.String;
import q87.c;
import ooc.j;

public final class k0 implements g	// class@00172e
{
    public static final k0 b;

    static {
       k0.b = new k0();
    }
    public void k0(){
       super();
    }
    public final void accept(Object p0){
       LocalAlbumUtils.i(p0);
       Object[] objArray = new Object[0];
       a.D().w("LocalAlbumUtils", "startEdit EditTools fillVideoContextClipInfo", objArray);
       j.a(p0);
    }
}
