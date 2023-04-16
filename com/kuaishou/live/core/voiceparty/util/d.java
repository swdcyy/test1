package com.kuaishou.live.core.voiceparty.util.d;
import erd.o;
import java.lang.Object;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.String;
import java.io.Reader;
import qkd.c;
import kqb.g0;
import com.yxcorp.gifshow.model.Lyrics;

public final class d implements o	// class@001ad7
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       return new g0().b(c.k(new InputStreamReader(new BufferedInputStream(new FileInputStream(p0)), "UTF-8")));
    }
}
