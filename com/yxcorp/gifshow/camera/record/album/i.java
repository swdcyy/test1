package com.yxcorp.gifshow.camera.record.album.i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import j8c.a;
import java.lang.String;
import w46.b;
import com.yxcorp.gifshow.util.PostUtils;

public final class i implements g	// class@001cb8
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray = new Object[0];
       a.D().t("AlbumController", "music file copy failure", objArray);
       PostUtils.D("AlbumController", "music file copy failure", p0);
    }
}
