package com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import msd.a;
import ds5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$a;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
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
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$b;
import erd.g;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$c;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$d;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$e;
import brd.w;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$f;
import erd.a;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$g;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$h;
import n2.a;
import ds5.c;

public final class LiveLiteDisplayUserStateManager implements DefaultLifecycleObserver	// class@0007f6
{
    public long b;
    public LiveRichTextUserState c;
    public long d;
    public b e;
    public final LiveLiteDisplayUserStateManager$a f;
    public final LifecycleOwner g;
    public final a h;
    public final a i;

    public void LiveLiteDisplayUserStateManager(LifecycleOwner p0,a p1,a p2){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "liveStreamIdFetcher");
       a.p(p2, "playConfigManager");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.c = new LiveRichTextUserState();
       this.d = 2000;
       this.f = new LiveLiteDisplayUserStateManager$a(this);
       p0.getLifecycle().addObserver(this);
    }
    public final void a(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteDisplayUserStateManager.class, "4")) {
          return;
       }
       b.S(LiveLogTag.LIVE_LITE_COMMENT.appendTag("LiveLiteDisplayUserStateManager"), "start request", "liveStreamId", p0);
       b9.a(this.e);
       this.e = f.a(a.class).a(p0).doOnSubscribe(new LiveLiteDisplayUserStateManager$b(this)).observeOn(d.b).map(new e()).doOnNext(new LiveLiteDisplayUserStateManager$c(this)).map(new LiveLiteDisplayUserStateManager$d(this)).timeout(500, TimeUnit.MILLISECONDS, new LiveLiteDisplayUserStateManager$e(this)).observeOn(d.a).doFinally(new LiveLiteDisplayUserStateManager$f(this, p1)).subscribe(new LiveLiteDisplayUserStateManager$g(this), LiveLiteDisplayUserStateManager$h.b);
       return;
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayUserStateManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.a(this, p0);
       this.i.gd(this.f);
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayUserStateManager.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       a.b(this, p0);
       this.g.getLifecycle().removeObserver(this);
       this.i.fo(this.f);
       b9.a(this.e);
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
