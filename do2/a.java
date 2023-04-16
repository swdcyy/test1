package do2.a;
import qu2.a;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import hf3.a;
import com.kuaishou.live.core.voiceparty.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.media.SoundPool;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyResourceHelper;
import android.os.Handler;
import android.os.Looper;
import crd.a;
import ix2.c;
import ix2.d;
import com.kuaishou.livestream.message.nano.SCKtvApplauded;
import do2.a$a;
import java.lang.Class;
import lf3.g;
import com.kwai.robust.PatchProxy;
import jp2.a;
import q00.b;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyResourceHelper$LiveVoicePartyResourceType;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import jw4.a;
import i91.m;
import kt.c;
import com.kwai.robust.PatchProxyResult;
import do2.d;
import lt.b;
import ht.c;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import do2.e;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import java.lang.Thread;

public final class a	// class@002561
{
    public String a;
    public boolean b;
    public SoundPool c;
    public int d;
    public final LiveVoicePartyResourceHelper e;
    public final Handler f;
    public final a g;
    public c h;
    public Object i;
    public final c j;
    public final a k;
    public final a l;
    public final KtvManager m;
    public final a n;

    public void a(a p0,a p1,KtvManager p2,a p3,a p4){
       a.p(p0, "liveContext");
       a.p(p1, "voicePartyManager");
       a.p(p2, "ktvManager");
       a.p(p3, "longConnection");
       a.p(p4, "aryaProvider");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p4;
       this.c = new SoundPool(2, 3, 0);
       LiveVoicePartyResourceHelper liveVoicePar = new LiveVoicePartyResourceHelper();
       this.e = liveVoicePar;
       this.f = new Handler(Looper.getMainLooper());
       this.g = new a();
       c uoc = d.a(p3);
       this.j = uoc;
       this.c.autoPause();
       liveVoicePar.a();
       uoc.a(478, SCKtvApplauded.class, new a$a(this));
    }
    public final void a(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          return;
       }
       if (!this.m.e().j() && this.b == null) {
          int i = 1;
          if (this.n.k() != null) {
             if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
                LiveVoicePartyResourceHelper$LiveVoicePartyResourceType kTV_APPLAUSE = LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.KTV_APPLAUSE;
                if (!kTV_APPLAUSE.isFileReady()) {
                   this.e.a();
                }else {
                   String[] stringArray = new String[i];
                   stringArray[0] = kTV_APPLAUSE.getFilePath();
                   ArrayList uArrayList = CollectionsKt__CollectionsKt.r(stringArray);
                   this.c(this.i, i, "restart play audio");
                   Object obj = new Object();
                   this.i = obj;
                   a uoa1 = m.a(this.k.q5());
                   c uoc = PatchProxy.applyOneRefs(uArrayList, objArray, c.class, "2");
                   if (uoc != PatchProxyResult.class) {
                   }else {
                      uoc = new c(2);
                      uoc.b = uArrayList;
                   }
                   c uoc1 = uoa1.d(uoc, new d(this, obj));
                   this.h = uoc1;
                   if (uoc1 != null) {
                      uoc1.startPlay();
                      b.S(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyApplauseAudienceController"), " start play ", "player instance ", uoc1);
                   }
                }
             }
          }else if(this.d == null){
             this.d = this.c.load(LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.KTV_APPLAUSE.getFilePath(), i);
          }
          if (this.d != null && !PatchProxy.applyVoid(objArray, this, uoa, "5")) {
             this.b = i;
             this.c.play(this.d, 0x3f800000, 0x3f800000, 0, 0, 0x3f800000);
             this.f.postDelayed(new e(this), 3000);
          }
       }
    label_00d8 :
       return;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       this.g.dispose();
       this.f.removeCallbacksAndMessages(objArray);
       this.c.stop(this.d);
       this.c.release();
       this.b = false;
       this.d = 0;
       this.c(this.i, true, "release");
       k1.n(this);
       this.j.b();
       return;
    }
    public final void c(Object p0,boolean p1,String p2){
       String this;
       boolean b;
       Thread thread;
       a uoa = this;
       Object obj = p0;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "7")) {
          return;
       }
       a h = uoa.h;
       int i = 1;
       this = "Thread.currentThread\(\)";
       String str = "VoicePartyApplauseAudienceController";
       if ((a.g(uoa.i, obj) ^ i) || h == null) {
          LiveVoicePartyLogTag kTV = LiveVoicePartyLogTag.KTV;
          kTV.appendTag(str);
          LiveVoicePartyLogTag liveVoicePar = kTV;
          b = (uoa.i == obj)? true: false;
          Boolean uBoolean = Boolean.valueOf(b);
          thread = Thread.currentThread();
          a.o(thread, this);
          String name = thread.getName();
          if (h != null) {
             i = false;
          }
          b.U(liveVoicePar, "innerReleasePlayer error", "token ", uBoolean, "thread :", name, "player instance : ", Boolean.valueOf(i));
          return;
       }else if(p1){
          h.stopPlay();
       }
       h.release();
       thread = Thread.currentThread();
       a.o(thread, this);
       this = thread.getName();
       b.U(LiveVoicePartyLogTag.KTV.appendTag(str), " releaseAudioPlayer ", "thread :", this, "releaseReason ", p2, "player instance ", this);
       uoa.h = null;
       return;
    }
}
