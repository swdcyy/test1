package com.yxcorp.gifshow.v3.editor.text.tts.e$b;
import o75.j0;
import com.yxcorp.gifshow.v3.editor.text.tts.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import faa.a;
import w46.b;
import com.kwai.chat.kwailink.data.PacketData;
import q87.c;

public class e$b implements j0	// class@0014f7
{
    public final j0 a;
    public final e b;

    public void e$b(e p0,j0 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailed(int p0,String p1){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("TtsBaseManager", "sendMessage2IM onFailed: ", objArray);
       this.a.onFailed(p0, p1);
       return;
    }
    public void onResponse(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsBaseManager", "sendMessage2IM onResponse: ", objArray);
       this.a.onResponse(p0);
       return;
    }
}
