package com.yxcorp.gifshow.camera.record.music.KwaiKtvAudioPlayer;
import com.yxcorp.gifshow.camera.record.music.KwaiKtvAudioPlayer$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.music.KwaiKtvAudioPlayer$mRecordPlayer$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.camera.record.music.KwaiKtvAudioPlayer$mAccompanyPlayer$2;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import h5d.c;
import f5d.z;
import java.lang.Long;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Collection;
import java.lang.Float;
import android.net.Uri;

public final class KwaiKtvAudioPlayer	// class@000e6c
{
    public final p a;
    public final p b;
    public long c;
    public final ArrayList d;
    public static final KwaiKtvAudioPlayer$a e;

    static {
       KwaiKtvAudioPlayer.e = new KwaiKtvAudioPlayer$a(null);
    }
    public void KwaiKtvAudioPlayer(){
       super();
       this.a = s.c(KwaiKtvAudioPlayer$mRecordPlayer$2.INSTANCE);
       this.b = s.c(KwaiKtvAudioPlayer$mAccompanyPlayer$2.INSTANCE);
       this.d = new ArrayList();
    }
    public final long a(){
       long l;
       KwaiKtvAudioPlayer obj = PatchProxy.apply(null, this, KwaiKtvAudioPlayer.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.d.isEmpty()) {
          l = 0;
       }else {
          obj = this.d;
          Object obj1 = obj.get((obj.size() - 1));
          a.o(obj1, "mSegmentPositions[mSegmentPositions.size - 1]");
          l = obj1.longValue();
       }
       return l;
    }
    public final c b(){
       Object obj = PatchProxy.apply(null, this, KwaiKtvAudioPlayer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final c c(){
       Object obj = PatchProxy.apply(null, this, KwaiKtvAudioPlayer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final long d(){
       Object obj = PatchProxy.apply(null, this, KwaiKtvAudioPlayer.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.c().getCurrentPosition();
    }
    public final void e(){
       KwaiKtvAudioPlayer kwaiKtvAudio = KwaiKtvAudioPlayer.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, kwaiKtvAudio, "8")) {
          return;
       }
       if (this.c().isPlaying() && !PatchProxy.applyVoid(objArray, this, kwaiKtvAudio, "15")) {
          long l = this.d();
          this.d.add(Long.valueOf(l));
          StringBuilder str = "add segment "+l;
          objArray = new Object[0];
          a.D().w("KwaiAudioPlayer", str+" segment size is "+this.d.size(), objArray);
       }
       this.c().pause();
       this.b().pause();
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, KwaiKtvAudioPlayer.class, "10")) {
          return;
       }
       this.c().release();
       this.b().release();
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, KwaiKtvAudioPlayer.class, "14")) {
          return;
       }
       if (this.d.isEmpty() ^ 0x01) {
          Object[] objArray = new Object[0];
          a.D().w("KwaiAudioPlayer", "removeSegment", objArray);
          KwaiKtvAudioPlayer td = this.d;
          td.remove((td.size() - 1));
          this.h(this.a());
       }
       return;
    }
    public final void h(long p0){
       KwaiKtvAudioPlayer kwaiKtvAudio = KwaiKtvAudioPlayer.class;
       if (PatchProxy.isSupport(kwaiKtvAudio) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, kwaiKtvAudio, "11")) {
          return;
       }
       this.c().seekTo(p0);
       this.b().seekTo((this.c + p0));
       return;
    }
    public final void i(float p0,float p1){
       KwaiKtvAudioPlayer kwaiKtvAudio = KwaiKtvAudioPlayer.class;
       if (PatchProxy.isSupport(kwaiKtvAudio) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, kwaiKtvAudio, "5")) {
          return;
       }
       this.b().setVolume(p0, p1);
       return;
    }
    public final void j(String p0,String p1,long p2){
       if (PatchProxy.isSupport(KwaiKtvAudioPlayer.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, KwaiKtvAudioPlayer.class, "3")) {
          return;
       }
       a.p(p0, "recordPath");
       a.p(p1, "accompanyPath");
       this.c = p2;
       this.c().d(Uri.parse(p0));
       this.b().d(Uri.parse(p1));
       this.h(0);
       this.e();
       return;
    }
    public final void k(float p0,float p1){
       KwaiKtvAudioPlayer kwaiKtvAudio = KwaiKtvAudioPlayer.class;
       if (PatchProxy.isSupport(kwaiKtvAudio) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, kwaiKtvAudio, "6")) {
          return;
       }
       this.c().setVolume(p0, p1);
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, KwaiKtvAudioPlayer.class, "7")) {
          return;
       }
       this.c().start();
       this.b().start();
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, KwaiKtvAudioPlayer.class, "9")) {
          return;
       }
       this.e();
       this.h(0);
       return;
    }
}
