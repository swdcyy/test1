package com.yxcorp.gifshow.record.album.c2;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class c2 implements g	// class@001715
{
    public static final c2 b;

    static {
       c2.b = new c2();
    }
    public void c2(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("DraftAlbum", "get list", p0);
    }
}
