package com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister;
import androidx.lifecycle.DefaultLifecycleObserver;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import or5.d;
import xp5.i;
import td3.o;
import j93.b;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import k93.c;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$commentsBottomBarItem$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$a;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import crd.b;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import crd.c;
import brd.t;
import k93.g;
import java.util.concurrent.Callable;
import k93.h;
import erd.g;
import k93.i;
import erd.o;
import k93.j;
import brd.w;
import k93.d;
import k93.e;
import k93.f;
import krd.a;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$b;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$c;
import erd.a;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$d;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$e;
import z1.a;
import ak5.j;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$f;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import n2.a;

public final class LiteCommentBottomBarItemRegister implements DefaultLifecycleObserver	// class@001ec5
{
    public final a b;
    public final c c;
    public boolean d;
    public final p e;
    public final LiteCommentBottomBarItemRegister$a f;
    public final Context g;
    public final LifecycleOwner h;
    public final d i;
    public final i j;
    public final o k;
    public final b l;
    public final a m;
    public final a n;
    public final a o;

    public void LiteCommentBottomBarItemRegister(Context p0,LifecycleOwner p1,d p2,i p3,o p4,b p5,a p6,a p7,a p8){
       a.p(p0, "context");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "infoManager");
       a.p(p3, "logPackageProvider");
       a.p(p4, "userStatusManager");
       a.p(p5, "animationService");
       a.p(p6, "bottomBarService");
       a.p(p7, "editorService");
       a.p(p8, "commentService");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       this.m = p6;
       this.n = p7;
       this.o = p8;
       this.b = new a();
       this.c = new c(p2, p4);
       this.e = s.c(new LiteCommentBottomBarItemRegister$commentsBottomBarItem$2(this));
       this.f = new LiteCommentBottomBarItemRegister$a(this);
       p1.getLifecycle().addObserver(this);
    }
    public final CommentsBottomBarItem a(){
       Object obj = PatchProxy.apply(null, this, LiteCommentBottomBarItemRegister.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public void onCreate(LifecycleOwner p0){
       LiteCommentBottomBarItemRegister liteCommentB = LiteCommentBottomBarItemRegister.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liteCommentB, "3")) {
          return;
       }
       a.p(p0, "owner");
       LiteCommentBottomBarItemRegister tb = this.b;
       LiteCommentBottomBarItemRegister tc = this.c;
       Objects.requireNonNull(tc);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       b uob = PatchProxy.apply(null, tc, uoc, "6");
       if (uob != patchProxyRe) {
       }else if(!tc.a()){
          b.Z(LiveLiteLogTag.BOTTOM_BAR_EDITOR, "fetchEmojiConfig - disable emoji");
          uob = c.b();
          a.o(uob, "Disposables.empty\(\)");
       }else {
          t ot = PatchProxy.apply(null, tc, uoc, "7");
          if (ot != patchProxyRe) {
          }else {
             ot = t.defer(new g(tc)).doOnNext(h.b);
             a.o(ot, "Observable.defer {\n     ¡­igFromStartup\"\)\n        }");
          }
          t ot1 = PatchProxy.apply(null, tc, uoc, "9");
          if (ot1 != patchProxyRe) {
          }else {
             ot1 = tc.e.W().flatMap(i.b).doOnNext(j.b);
             a.o(ot1, "userStatusManager.timeCo¡­          \)\n            }");
          }
          uob = t.concat(ot, ot1).doOnError(d.b).subscribe(new e(tc), f.b);
          a.o(uob, "Observable.concat\(fetchF¡­rror\", it\)\n            }\)");
       }
       a.b(tb, uob);
       b uob1 = this.k.T3().subscribe(new LiteCommentBottomBarItemRegister$b(this));
       a.o(uob1, "userStatusManager.audien¡­\)\n            }\n        }");
       a.b(this.b, uob1);
       uob1 = c.c(new LiteCommentBottomBarItemRegister$c(this));
       a.o(uob1, "Disposables.fromAction {¡­BottomBarItem.release\(\) }");
       a.b(this.b, uob1);
       this.m.a(this.h, new LiteCommentBottomBarItemRegister$d(this), new LiteCommentBottomBarItemRegister$e(this));
       if (!PatchProxy.applyVoid(null, this, liteCommentB, "5")) {
          j oj = j.o();
          a.o(oj, "KwaiEmotionManager.getInstance\(\)");
          if (!oj.t()) {
             j.o().d();
          }
       }
       this.c.b.observe(this.h, new LiteCommentBottomBarItemRegister$f(this));
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteCommentBottomBarItemRegister.class, "4")) {
          return;
       }
       a.p(p0, "owner");
       this.b.dispose();
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
