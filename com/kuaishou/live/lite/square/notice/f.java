package com.kuaishou.live.lite.square.notice.f;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import e93.b;
import xp5.i;
import z1.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.kuaishou.live.lite.square.notice.g;
import ld3.i;
import java.lang.Class;
import ok.x;
import va1.g0;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import android.view.View;
import ha1.b;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import com.kuaishou.live.lite.square.notice.b;
import androidx.lifecycle.ViewModel;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Lifecycle;
import ld3.b;
import androidx.lifecycle.LifecycleObserver;
import e93.f;

public class f extends ViewController	// class@000b73
{
    public final LiveStreamFeed j;
    public final b k;
    public final i l;
    public final a m;
    public LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig n;
    public b o;
    public g p;
    public final ViewModelProvider q;

    public void f(LiveStreamFeed p0,b p1,i p2,a p3){
       super();
       this.q = new ViewModelProvider(this.getViewModelStore(), g0.a(g.class, new i(this)));
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
    }
    public void F2(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, f.class, str)) {
          return;
       }
       LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig liveSquareSi = a.J(LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig.class);
       this.n = liveSquareSi;
       if (liveSquareSi == null) {
          b.j0(LiveLiteLogTag.SQUARE, "notice config is null");
          return;
       }else {
          View view = b.e(this.D2(), R.layout.lite_square_notice_layout);
          view.setTag(d.a, LayoutViewType.SquareNoticeArea.name());
          this.R2(view);
          this.o = new b(this.P2());
          g og = this.q.get(g.class);
          this.p = og;
          f to = this.o;
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoidTwoRefs(this, og, to, b.class, str)) {
             to.a = og;
             og.u0().observeForever(to.f);
             this.getLifecycle().addObserver(new b(to));
          }
          return;
       }
    }
    public void J2(){
       String str = "2";
       if (PatchProxy.applyVoid(null, this, f.class, str)) {
          return;
       }
       f to = this.o;
       if (to != null) {
          f tp = this.p;
          if (tp != null) {
             Objects.requireNonNull(to);
             if (!PatchProxy.applyVoidOneRefs(tp, to, b.class, str)) {
                to.b();
                f.g(to);
                tp.u0().removeObserver(to.f);
             }
          }
       }
       return;
    }
}
