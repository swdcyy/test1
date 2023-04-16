package com.yxcorp.gifshow.v3.editor.template.data.PicResourceHelper$dirFile$2;
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

public final class PicResourceHelper$dirFile$2 extends Lambda implements a	// class@00131f
{
    public static final PicResourceHelper$dirFile$2 INSTANCE;

    static {
       PicResourceHelper$dirFile$2.INSTANCE = new PicResourceHelper$dirFile$2();
    }
    public void PicResourceHelper$dirFile$2(){
       super(0);
    }
    public final File invoke(){
       Object obj = PatchProxy.apply(null, this, PicResourceHelper$dirFile$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1504323719).d(".pic_templates");
    }
    public Object invoke(){
       return this.invoke();
    }
}
