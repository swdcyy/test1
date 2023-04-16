package com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import msd.a;
import ds5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import t93.a;
import com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$a;
import z1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import crd.b;
import lnc.b9;
import z93.a;
import va1.f;
import brd.t;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$b;
import erd.g;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$c;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$d;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$e;
import brd.w;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$f;
import erd.a;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$g;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$h;
import n2.a;
import ds5.c;

public final class LiveLiteDisplayAuthorStateManager implements DefaultLifecycleObserver	// class@000800
{
    public final a b;
    public long c;
    public LiveRichTextUserState d;
    public long e;
    public b f;
    public final LiveLiteDisplayAuthorStateManager$a g;
    public final LifecycleOwner h;
    public final a i;
    public final a j;

    public void LiveLiteDisplayAuthorStateManager(LifecycleOwner p0,a p1,a p2){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "liveStreamIdFetcher");
       a.p(p2, "playConfigManager");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.b = new a();
       this.d = new LiveRichTextUserState();
       this.e = 2000;
       p0.getLifecycle().addObserver(this);
       this.g = new LiveLiteDisplayAuthorStateManager$a(this);
    }
    public final void a(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteDisplayAuthorStateManager.class, "4")) {
          return;
       }
       b.S(LiveLogTag.LIVE_LITE_COMMENT.appendTag("LiveLiteDisplayAuthorStateManager"), "start request", "liveStreamId", p0);
       b9.a(this.f);
       this.f = f.a(a.class).b(p0).doOnSubscribe(new LiveLiteDisplayAuthorStateManager$b(this)).observeOn(d.b).map(new e()).doOnNext(new LiveLiteDisplayAuthorStateManager$c(this)).map(new LiveLiteDisplayAuthorStateManager$d(this)).timeout(500, TimeUnit.MILLISECONDS, new LiveLiteDisplayAuthorStateManager$e(this)).observeOn(d.a).doFinally(new LiveLiteDisplayAuthorStateManager$f(this, p1)).subscribe(new LiveLiteDisplayAuthorStateManager$g(this), LiveLiteDisplayAuthorStateManager$h.b);
       return;
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayAuthorStateManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.a(this, p0);
       this.j.gd(this.g);
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayAuthorStateManager.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       a.b(this, p0);
       this.h.getLifecycle().removeObserver(this);
       this.j.fo(this.g);
       b9.a(this.f);
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
