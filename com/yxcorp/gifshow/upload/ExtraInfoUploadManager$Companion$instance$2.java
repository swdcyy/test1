package com.yxcorp.gifshow.upload.ExtraInfoUploadManager$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.upload.ExtraInfoUploadManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ExtraInfoUploadManager$Companion$instance$2 extends Lambda implements a	// class@001e3f
{
    public static final ExtraInfoUploadManager$Companion$instance$2 INSTANCE;

    static {
       ExtraInfoUploadManager$Companion$instance$2.INSTANCE = new ExtraInfoUploadManager$Companion$instance$2();
    }
    public void ExtraInfoUploadManager$Companion$instance$2(){
       super(0);
    }
    public final ExtraInfoUploadManager invoke(){
       Object obj = PatchProxy.apply(null, this, ExtraInfoUploadManager$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ExtraInfoUploadManager();
    }
    public Object invoke(){
       return this.invoke();
    }
}
