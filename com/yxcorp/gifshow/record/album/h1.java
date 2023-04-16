package com.yxcorp.gifshow.record.album.h1;
import erd.o;
import java.lang.Object;
import m8c.e;
import java.io.File;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.String;
import k46.a;
import brd.t;

public final class h1 implements o	// class@001726
{
    public static final h1 b;

    static {
       h1.b = new h1();
    }
    public void h1(){
       super();
    }
    public final Object apply(Object p0){
       File uFile = (LocalAlbumUtils.v(p0.getCoverFile()))? LocalAlbumUtils.h(p0.getCoverFile()): p0.getCoverFile();
       String absolutePath = (uFile != null && uFile.exists())? uFile.getAbsolutePath(): "";
       return t.just(new a(p0.getIdentifier(), absolutePath, p0.i()));
    }
}
