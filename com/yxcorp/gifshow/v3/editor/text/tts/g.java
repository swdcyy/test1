package com.yxcorp.gifshow.v3.editor.text.tts.g;
import com.yxcorp.gifshow.v3.editor.text.tts.e;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.v3.editor.text.tts.g$a;
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
import com.yxcorp.gifshow.v3.editor.text.tts.g$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import java.lang.Boolean;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import com.yxcorp.gifshow.v3.editor.text.tts.e$c;
import jod.g;
import hvc.m;
import com.yxcorp.gifshow.v3.editor.text.tts.g$c;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import brd.a0;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.text.tts.f;
import erd.a;

public class g extends e	// class@0014ff
{
    public PostTaskManager f;
    public g$c g;
    public e$c h;
    public AtomicBoolean i;
    public d$b j;

    public void g(){
       super();
       this.f = new PostTaskManager();
       boolean b = false;
       this.i = new AtomicBoolean(b);
       this.j = new g$a(this);
       Object[] objArray = new Object[b];
       a.D().w("TtsDownloadManager", "construction method", objArray);
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
       }else {
          Object[] objArray1 = new Object[b];
          a.D().w("TtsDownloadManager", "registerListener: ", objArray1);
          String[] stringArray = new String[]{"Push.MMU.RtTextToSpeechPushKS"};
          f.e().o(this.e, stringArray);
          this.a.k(this.j, "Global.MMU.RtTextToSpeechPushKS");
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "cancel: ", objArray);
       this.i.set(true);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "clear", objArray);
       this.f.c();
       return;
    }
    public g$b i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "getResultData taskId = "+p0, objArray);
       if (this.f.d(p0) != null) {
          return this.f.d(p0).b();
       }
       return null;
    }
    public boolean j(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyOneRefs(p0, this, g.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("TtsDownloadManager", "isTaskRunning taskId ="+p0, objArray);
       obj = this.f;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, PostTaskManager.class, "8");
       if (obj1 != patchProxyRe) {
       }else {
          a.p(p0, "taskId");
          obj1 = obj.a.get(p0);
       }
       if (obj1 != null) {
          i = true;
       }
       return i;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, g.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "resetTTS: ", objArray);
       this.a.h();
       return;
    }
    public void l(e$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "setTtsListener", objArray);
       this.h = p0;
       return;
    }
    public void m(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "startTtsDownloadTask: taskData = "+p0.toString(), objArray);
       this.i.set(0);
       this.f.b(new g$c(this, m.c(p0), p0));
       return;
    }
    public a0 n(){
       Object obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "waitAllTaskComplete: ", objArray);
       return this.f.j().G(d.a).m(f.b);
    }
}
