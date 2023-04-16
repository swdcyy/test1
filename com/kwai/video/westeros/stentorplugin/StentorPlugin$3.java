package com.kwai.video.westeros.stentorplugin.StentorPlugin$3;
import o75.j0;
import com.kwai.video.westeros.stentorplugin.StentorPlugin;
import java.lang.Object;
import java.lang.String;
import com.kwai.stentor.AsrProduct.Asr;
import com.kwai.video.westeros.WesterosPlugin;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import ow7.c;
import java.lang.Runnable;
import android.os.Handler;
import com.kwai.chat.kwailink.data.PacketData;

public class StentorPlugin$3 implements j0	// class@0010bc
{
    public final StentorPlugin this$0;

    public void StentorPlugin$3(StentorPlugin p0){
       this.this$0 = p0;
       super();
    }
    public static void a(StentorPlugin$3 p0,int p1,String p2){
       p0.lambda$onFailed$0(p1, p2);
    }
    private void lambda$onFailed$0(int p0,String p1){
       StentorPlugin asr = this.this$0.asr;
       if (asr != null) {
          asr.e(p0, p1);
       }
       StentorPlugin$3 tthis$0 = this.this$0;
       tthis$0.nativeNetworkError(tthis$0.nativePlugin, p0);
       return;
    }
    public void onFailed(int p0,String p1){
       StentorPlugin$3 u3 = StentorPlugin$3.class;
       if (PatchProxy.isSupport(u3) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, u3, "2")) {
          return;
       }
       if (this.this$0.isReleased()) {
          return;
       }
       this.this$0.handler.post(new c(this, p0, p1));
       return;
    }
    public void onResponse(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StentorPlugin$3.class, "1")) {
          return;
       }
       this.this$0.isReleased();
       return;
    }
}
