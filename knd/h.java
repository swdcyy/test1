package knd.h;
import knd.j;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import knd.h$a;
import faa.a;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.sdk.signal.f;
import j85.e;
import zt7.d;
import zt7.d$b;
import com.kwai.video.stannis.Stannis;
import knd.e;
import knd.f;
import knd.g;
import com.kwai.video.stannis.observers.StannisQosObserver;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import java.lang.Boolean;
import java.lang.StringBuilder;
import knd.h$b;
import com.kwai.video.stannis.observers.AudioBufferPlayObserver;
import java.io.FileOutputStream;
import java.io.File;
import com.yxcorp.gifshow.player.KsAudioPlayer;

public final class h extends j	// class@0017e4
{
    public Stannis f;
    public long g;
    public KsAudioPlayer h;
    public DataReadyObserver i;
    public final int j;
    public boolean k;
    public j$a l;
    public d$b m;
    public final Context n;

    public void h(Context p0){
       h oh = h.class;
       a.p(p0, "context");
       super();
       this.n = p0;
       this.j = 1234;
       this.m = new h$a(this);
       Object[] objArray = new Object[0];
       a.D().w("TTSAuditionManagerV2", "construction method", objArray);
       if (PatchProxy.applyVoid(null, this, oh, "6")) {
       }else {
          String[] stringArray = new String[]{"Push.MMU.RtTextToSpeechPushKS"};
          f.e().o(this.e(), stringArray);
          this.f().k(this.m, "Global.MMU.RtTextToSpeechPushKS");
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, oh, "1")) {
          Stannis instance = Stannis.getInstance();
          a.o(instance, "Stannis.getInstance\(\)");
          this.f = instance;
          this.i = e.a;
          if (instance == null) {
             a.S("mStannis");
          }
          this.g = instance.initStannisEngineWithNotifyObserver(p0, f.a, new g());
       }
       return;
    }
    public final void m(String p0,byte[] p1,boolean p2){
       h tf;
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, h.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSAuditionManagerV2", "playAudioAsync reqID = "+p0+" isFinished = "+p2, objArray);
       h$b uob = new h$b(this);
       if (!p2) {
          tf = this.f;
          if (tf == null) {
             a.S("mStannis");
          }
          tf.playAudioBuffer(p0, p1, this.g(), false, uob);
       }else {
          byte[] uobyteArray = new byte[0];
          tf = this.f;
          if (tf == null) {
             a.S("mStannis");
          }
          tf.playAudioBuffer(p0, uobyteArray, this.g(), true, uob);
       }
       return;
    }
    public final void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "10")) {
          return;
       }
       int i = 0;
       if (this.k != null) {
          objArray = new Object[i];
          a.D().w("TTSAuditionManagerV2", "stopAudioPlayingIfNeeded: isPlayingAudioUsingStannis", objArray);
          this.o();
          this.k = i;
          if (!this.f().c()) {
             objArray = new Object[i];
             a.D().w("TTSAuditionManagerV2", "stopAudioPlayingIfNeeded: mTts.isNotFinished", objArray);
             this.f().h();
             this.f().l();
             File uFile = this.c();
             a.m(uFile);
             this.b(this.d(), uFile);
          }
       }else {
          h th = this.h;
          if (th != null) {
             a.m(th);
             if (th.k()) {
                Object[] objArray1 = new Object[i];
                a.D().w("TTSAuditionManagerV2", "stopAudioPlayingIfNeeded: isPlayingAudioUsingPlayer", objArray1);
                th = this.h;
                a.m(th);
                th.l();
                th = this.h;
                a.m(th);
                th.n();
                this.h = objArray;
             }
          }
       }
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       h tf = this.f;
       if (tf == null) {
          a.S("mStannis");
       }
       int i = tf.stopPipeline();
       if (i) {
          Object[] objArray = new Object[0];
          a.D().w("TTSAuditionManagerV2", "stopPipeline failed! result="+i, objArray);
       }
       tf = this.f;
       if (tf == null) {
          a.S("mStannis");
       }
       tf.clearAllAudioBuffer();
       return;
    }
}
