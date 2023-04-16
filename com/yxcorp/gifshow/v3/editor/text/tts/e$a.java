package com.yxcorp.gifshow.v3.editor.text.tts.e$a;
import j85.e;
import com.yxcorp.gifshow.v3.editor.text.tts.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import zt7.d;

public class e$a implements e	// class@0014f6
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void onSignalReceive(String p0,String p1,byte[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsBaseManager", "onSignalReceive: uid:"+p0+"signal:"+p1, objArray);
       this.a.a.j(p2);
       return;
    }
}
