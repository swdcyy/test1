package com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper$Companion$TEMPLATE_FOLDER$2;
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

public final class DownloadRedPacketHelper$Companion$TEMPLATE_FOLDER$2 extends Lambda implements a	// class@000ee6
{
    public static final DownloadRedPacketHelper$Companion$TEMPLATE_FOLDER$2 INSTANCE;

    static {
       DownloadRedPacketHelper$Companion$TEMPLATE_FOLDER$2.INSTANCE = new DownloadRedPacketHelper$Companion$TEMPLATE_FOLDER$2();
    }
    public void DownloadRedPacketHelper$Companion$TEMPLATE_FOLDER$2(){
       super(0);
    }
    public final File invoke(){
       Object obj = PatchProxy.apply(null, this, DownloadRedPacketHelper$Companion$TEMPLATE_FOLDER$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1504323719).h(".download");
    }
    public Object invoke(){
       return this.invoke();
    }
}
