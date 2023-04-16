package com.kwai.video.krtc.rtcengine.internal.h;
import com.kwai.video.krtc.Arya;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class h	// class@000879
{
    public Arya a;

    public void h(Arya p0){
       super();
       this.a = p0;
    }
    public int a(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.a.setAudioVoiceEffectOption(p0);
       return 0;
    }
    public int b(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.a.setReverbLevel(p0);
       return 0;
    }
    public int c(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.a.setAudioVoiceRoleOption(p0);
       return 0;
    }
}
