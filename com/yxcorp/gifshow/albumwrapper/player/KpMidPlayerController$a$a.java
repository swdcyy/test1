package com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$a$a;
import com.kwai.video.wayne.player.logreport.DataReporter;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$a;
import java.lang.Object;
import com.kwai.player.qos.KwaiPlayerResultQos;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gp.a;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController;
import java.lang.StringBuilder;
import q87.c;
import nc6.e;

public final class KpMidPlayerController$a$a implements DataReporter	// class@001b70
{
    public final KpMidPlayerController$a a;

    public void KpMidPlayerController$a$a(KpMidPlayerController$a p0){
       this.a = p0;
       super();
    }
    public void report(KwaiPlayerResultQos p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KpMidPlayerController$a$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s(this.a.a.d, "report\(\) called with: qos = ["+p0+']', objArray);
       KpMidPlayerController h = this.a.a.h;
       if (h != null) {
          h.b(p0);
       }
       return;
    }
}
