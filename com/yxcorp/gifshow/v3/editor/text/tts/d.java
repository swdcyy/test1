package com.yxcorp.gifshow.v3.editor.text.tts.d;
import com.yxcorp.gifshow.v3.editor.text.tts.e;
import android.content.Context;
import com.yxcorp.gifshow.v3.editor.text.tts.d$a;
import faa.a;
import java.lang.Object;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.sdk.signal.f;
import j85.e;
import zt7.d$b;
import zt7.d;
import com.kwai.video.stannis.Stannis;
import com.yxcorp.gifshow.v3.editor.text.tts.a;
import com.yxcorp.gifshow.v3.editor.text.tts.b;
import hvc.h;
import com.kwai.video.stannis.observers.StannisQosObserver;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.text.tts.d$b;
import com.kwai.video.stannis.observers.AudioBufferPlayObserver;
import com.yxcorp.gifshow.v3.editor.text.tts.e$c;
import java.io.FileOutputStream;
import java.io.File;
import com.yxcorp.gifshow.player.KsAudioPlayer;

public class d extends e	// class@0014f4
{
    public Stannis f;
    public long g;
    public KsAudioPlayer h;
    public DataReadyObserver i;
    public boolean j;
    public e$c k;
    public d$b l;

    public void d(Context p0){
       d uod = d.class;
       super();
       this.j = false;
       this.l = new d$a(this);
       Object[] objArray = new Object[false];
       a.D().w("TtsAuditionManager", "construction method", objArray);
       if (PatchProxy.applyVoid(null, this, uod, "6")) {
       }else {
          String[] stringArray = new String[]{"Push.MMU.RtTextToSpeechPushKS"};
          f.e().o(this.e, stringArray);
          this.a.k(this.l, "Global.MMU.RtTextToSpeechPushKS");
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "1")) {
          Stannis instance = Stannis.getInstance();
          this.f = instance;
          this.i = a.a;
          this.g = instance.initStannisEngineWithNotifyObserver(p0, b.a, new h(this));
       }
       return;
    }
    public void g(String p0,byte[] p1,boolean p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, d.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsAuditionManager", "playAudioAsync reqID = "+p0+" isFinished = "+p2, objArray);
       d$b uob = new d$b(this);
       if (!p2) {
          this.f.playAudioBuffer(p0, p1, this.d, false, uob);
       }else {
          byte[] uobyteArray = new byte[0];
          this.f.playAudioBuffer(p0, uobyteArray, this.d, true, uob);
       }
       return;
    }
    public void h(e$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsAuditionManager", "setTtsListener", objArray);
       this.k = p0;
       return;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "10")) {
          return;
       }
       int i = 0;
       if (this.j != null) {
          objArray = new Object[i];
          a.D().w("TtsAuditionManager", "stopAudioPlayingIfNeeded: isPlayingAudioUsingStannis", objArray);
          this.j();
          this.j = i;
          if (!this.a.c()) {
             objArray = new Object[i];
             a.D().w("TtsAuditionManager", "stopAudioPlayingIfNeeded: mTts.isNotFinished", objArray);
             this.a.h();
             this.a.l();
             this.b(this.b, this.c);
          }
       }else {
          d th = this.h;
          if (th != null && th.k()) {
             Object[] objArray1 = new Object[i];
             a.D().w("TtsAuditionManager", "stopAudioPlayingIfNeeded: isPlayingAudioUsingPlayer", objArray1);
             this.h.l();
             this.h.n();
             this.h = objArray;
          }
       }
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       int i = this.f.stopPipeline();
       if (i) {
          Object[] objArray = new Object[0];
          a.D().w("TtsAuditionManager", "stopPipeline failed! result="+i, objArray);
       }
       this.f.clearAllAudioBuffer();
       return;
    }
}
