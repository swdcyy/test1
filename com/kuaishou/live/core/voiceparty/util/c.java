package com.kuaishou.live.core.voiceparty.util.c;
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
import com.google.common.base.Optional;

public final class c implements o	// class@001ad6
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       return Optional.of(new g0().b(c.k(new InputStreamReader(new BufferedInputStream(new FileInputStream(p0)), "UTF-8"))));
    }
}
