package com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.i;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import android.media.AudioRecord;
import java.lang.Throwable;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.i$b;
import java.lang.Thread;
import com.yxcorp.gifshow.media.builder.b;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.List;
import java.lang.Number;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.i$c;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.i$a;

public class i	// class@00113f
{
    public boolean a;
    public boolean b;
    public boolean c;
    public File d;
    public List e;
    public i$b f;
    public AudioRecord g;
    public b h;

    public void i(){
       super();
       this.e = new ArrayList();
    }
    public synchronized void a(){
       i oi = i.class;
       if (PatchProxy.applyVoid(null, this, oi, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditAudioRecorder", "destroy EditAudioRecorder", objArray);
       this.c = false;
       this.b = false;
       i tg = this.g;
       if (tg != null) {
          try{
             tg.stop();
          }catch(java.lang.IllegalStateException e1){
             a.D().z("EditAudioRecorder", "failed to stop AudioRecord", e1);
          }
          if (!PatchProxy.applyVoid(null, this, oi, "10")) {
             oi = this.g;
             if (oi != null) {
                oi.release();
                this.g = null;
             }
          }
       }
       oi = this.f;
       if (oi != null) {
          oi.b = true;
          this.f.interrupt();
          this.f = null;
       }
       oi = this.h;
       if (oi != null) {
          oi.c();
          this.h = null;
       }
       return;
    }
    public synchronized final void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       if (this.h == null) {
          Object[] objArray = new Object[0];
          a.D().w("EditAudioRecorder", "start init audio builder", objArray);
          this.d = p0;
          this.h = new b(p0);
          Object[] objArray1 = new Object[0];
          a.D().w("EditAudioRecorder", "song recorder output: "+this.d.getAbsolutePath(), objArray1);
       }
       return;
    }
    public synchronized void c(File p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditAudioRecorder", "open AudioRecord", objArray);
       if (this.b != null && this.g != null) {
          objArray1 = new Object[0];
          a.D().w("EditAudioRecorder", "AudioRecord is opened", objArray1);
          return;
       }else if(this.f == null){
          i$b uob = new i$b(this);
          this.f = uob;
          uob.start();
       }
       i tg = this.g;
       boolean b = true;
       if (tg != null) {
          if (tg.getState() == b) {
             return;
          }else if(this.g.getRecordingState() == 3){
             return;
          }else {
             this.a();
          }
       }
       if (this.h == null) {
          this.b(p0);
       }
       AudioRecord uAudioRecord = this.d();
       this.g = uAudioRecord;
       if (uAudioRecord != null) {
          uAudioRecord.startRecording();
          this.b = b;
          this.c = false;
          objArray1 = new Object[0];
          a.D().w("EditAudioRecorder", "init AudioRecord finish", objArray1);
          return;
       }else {
          objArray1 = new Object[0];
          a.D().w("EditAudioRecorder", "init AudioRecord fail", objArray1);
          throw new IllegalStateException("EditAudioRecorder init AudioRecord failed");
       }
    }
    public final AudioRecord d(){
       int i;
       String str = "EditAudioRecorder";
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i = 0xac44;
       int i1 = 16;
       int i2 = 2;
       try{
          int minBufferSiz = AudioRecord.getMinBufferSize(i, i1, i2);
          Object[] objArray = new Object[0];
          a.D().w(str, "open audio, buffer size = "+minBufferSiz, objArray);
          AudioRecord uAudioRecord = new AudioRecord(1, 0xac44, 16, 2, minBufferSiz);
          if (i.getState() != 1) {
             return null;
          }
          return i;
       }catch(java.lang.IllegalArgumentException e1){
          PostUtils.D(i.getState(), "openAudio", e1);
          return null;
       }
    }
    public final void e(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "12")) {
          return;
       }
       boolean b = false;
       if (!this.e.isEmpty()) {
          i th = this.h;
          if (th != null) {
             _monitor_enter(th);
             Object obj = PatchProxy.apply(objArray, th, b.class, "3");
             i = (obj != PatchProxyResult.class)? obj.intValue(): th.c.size();
             _monitor_exit(th);
          label_003a :
             this.e.add(new i$c(i, b, objArray));
             Object[] objArray1 = new Object[b];
             a.D().A("EditAudioRecorder", "rememberSegment "+i, objArray1);
             return;
          }
       }
       i = 0;
       goto label_003a ;
    }
    public synchronized void f(){
       this.a = false;
    }
}
