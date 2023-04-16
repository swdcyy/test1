package com.yxcorp.gifshow.record.album.c1;
import erd.o;
import java.lang.Object;
import java.lang.Double;
import k8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Boolean;

public final class c1 implements o	// class@001714
{
    public static final c1 b;

    static {
       c1.b = new c1();
    }
    public void c1(){
       super();
    }
    public final Object apply(Object p0){
       Object[] objArray = new Object[0];
       a.D().w("LocalAlbumUtils", "video asset duration: "+p0, objArray);
       return Boolean.valueOf(LocalAlbumUtils.b(p0.doubleValue()));
    }
}
