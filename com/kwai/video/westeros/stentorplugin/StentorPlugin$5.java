package com.kwai.video.westeros.stentorplugin.StentorPlugin$5;
import j85.e;
import com.kwai.video.westeros.stentorplugin.StentorPlugin;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.stentor.AsrProduct.Asr;

public class StentorPlugin$5 implements e	// class@0010be
{
    public final StentorPlugin this$0;

    public void StentorPlugin$5(StentorPlugin p0){
       this.this$0 = p0;
       super();
    }
    public void onSignalReceive(String p0,String p1,byte[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, StentorPlugin$5.class, "1")) {
          return;
       }
       this.this$0.asr.j(p2);
       return;
    }
}
