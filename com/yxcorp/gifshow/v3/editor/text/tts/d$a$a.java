package com.yxcorp.gifshow.v3.editor.text.tts.d$a$a;
import o75.j0;
import com.yxcorp.gifshow.v3.editor.text.tts.d$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import faa.a;
import java.lang.StringBuilder;
import w46.b;
import hvc.g;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.v3.editor.text.tts.e;
import java.io.FileOutputStream;
import java.io.File;
import zt7.d;
import com.kwai.chat.kwailink.data.PacketData;
import q87.c;

public class d$a$a implements j0	// class@0014f1
{
    public final d$a a;

    public void d$a$a(d$a p0){
       this.a = p0;
       super();
    }
    public void onFailed(int p0,String p1){
       d$a a;
       d$a$a uoa$a = d$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa$a, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("TtsAuditionManager", "onFailed: i = "+p0+" s = "+p1, objArray);
       k1.o(new g(this));
       a = this.a.a;
       a.b(a.b, a.c);
       this.a.a.a.e(p0, p1);
       return;
    }
    public void onResponse(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsAuditionManager", "sendMessage onResponse: ", objArray);
       return;
    }
}
