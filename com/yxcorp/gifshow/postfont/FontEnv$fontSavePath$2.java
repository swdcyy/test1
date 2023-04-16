package com.yxcorp.gifshow.postfont.FontEnv$fontSavePath$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import j80.c;

public final class FontEnv$fontSavePath$2 extends Lambda implements a	// class@001096
{
    public static final FontEnv$fontSavePath$2 INSTANCE;

    static {
       FontEnv$fontSavePath$2.INSTANCE = new FontEnv$fontSavePath$2();
    }
    public void FontEnv$fontSavePath$2(){
       super(0);
    }
    public final File invoke(){
       Object obj = PatchProxy.apply(null, this, FontEnv$fontSavePath$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1504323719).d(".fonts");
    }
    public Object invoke(){
       return this.invoke();
    }
}
