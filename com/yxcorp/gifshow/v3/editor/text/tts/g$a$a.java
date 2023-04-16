package com.yxcorp.gifshow.v3.editor.text.tts.g$a$a;
import o75.j0;
import com.yxcorp.gifshow.v3.editor.text.tts.g$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import faa.a;
import java.lang.StringBuilder;
import w46.b;
import hvc.k;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.v3.editor.text.tts.g;
import com.yxcorp.gifshow.v3.editor.text.tts.e;
import java.io.FileOutputStream;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.text.tts.g$c;
import java.util.concurrent.CountDownLatch;
import q87.c;
import zt7.d;
import com.kwai.chat.kwailink.data.PacketData;

public class g$a$a implements j0	// class@0014fb
{
    public final g$a a;

    public void g$a$a(g$a p0){
       this.a = p0;
       super();
    }
    public void onFailed(int p0,String p1){
       g$a a;
       g$a$a uoa$a = g$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa$a, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("TtsDownloadManager", "onFailed: i = "+p0+" s = "+p1, objArray);
       k1.o(new k(this));
       this.a.a.h();
       a = this.a.a;
       a.b(a.b, a.c);
       this.a.a.g.d.countDown();
       Object[] objArray1 = new Object[0];
       a.D().w("TtsDownloadManager", "onFailed: release mCountDownLatch", objArray1);
       this.a.a.a.e(p0, p1);
       return;
    }
    public void onResponse(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "sendMessage onResponse: ", objArray);
       return;
    }
}
