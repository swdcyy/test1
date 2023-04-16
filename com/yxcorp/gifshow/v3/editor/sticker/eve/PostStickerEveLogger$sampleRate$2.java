package com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$sampleRate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Double;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class PostStickerEveLogger$sampleRate$2 extends Lambda implements a	// class@00123e
{
    public static final PostStickerEveLogger$sampleRate$2 INSTANCE;

    static {
       PostStickerEveLogger$sampleRate$2.INSTANCE = new PostStickerEveLogger$sampleRate$2();
    }
    public void PostStickerEveLogger$sampleRate$2(){
       super(0);
    }
    public final Double invoke(){
       Double obj = PatchProxy.apply(null, this, PostStickerEveLogger$sampleRate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().getValue("stickerRerankReportLimit", Double.TYPE, Double.valueOf(0x3fb999999999999a));
       Object[] objArray = new Object[0];
       a.D().w("PostStickerEveLogger", "fetch from KSwitch stickerRerankReportLimit="+obj, objArray);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
