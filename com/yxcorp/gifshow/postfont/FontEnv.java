package com.yxcorp.gifshow.postfont.FontEnv;
import com.yxcorp.gifshow.postfont.FontEnv$fontSavePath$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FontEnv	// class@001097
{
    public static final p a;
    public static final FontEnv b;

    static {
       FontEnv.b = new FontEnv();
       FontEnv.a = s.c(FontEnv$fontSavePath$2.INSTANCE);
    }
    public void FontEnv(){
       super();
    }
    public static final File a(){
       Object obj = PatchProxy.apply(null, null, FontEnv.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FontEnv.a.getValue();
    }
}
