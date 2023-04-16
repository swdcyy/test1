package com.kuaishou.live.ad.fanstop.b;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import java.lang.Object;
import pl0.d;
import pl0.e;
import ok.n;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Integer;
import mxb.j0;
import mxb.i0;
import mxb.j;
import java.lang.ref.WeakReference;
import android.view.View;
import com.kuaishou.live.ad.fanstop.a;
import erd.g;
import pl0.c;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Enum;

public class b implements LivePlayerStateChangeListener	// class@00099d
{
    public int b;
    public List c;
    public List d;
    public Runnable e;
    public Runnable f;
    public BaseFeed g;
    public WeakReference h;
    public int i;

    public void b(BaseFeed p0,List p1){
       ArrayList uArrayList;
       super();
       this.b = 0;
       this.e = new d(this);
       this.f = new e(this);
       n.j(p0);
       this.g = p0;
       if (p1 == null) {
          uArrayList = new ArrayList(1);
       }
       this.c = uArrayList;
       this.d = uArrayList;
       return;
    }
    public final void a(){
       int i;
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (this.b >= this.d.size()) {
          return;
       }
       if (this.g instanceof LiveStreamFeed) {
          i = this.d.get(this.b).intValue();
          if (!i) {
             j oj = i0.a().g(this.g);
             b th = this.h;
             if (th != null && th.get() != null) {
                oj.m(this.h.get()).n(this.i);
             }
             i0.a().p(68, oj).d(a.b).a();
          }else {
             i0.a().e(69, this.g).d(new c(i)).a();
          }
       }
       i = this.b + 1;
       this.b = i;
       if (i < this.d.size()) {
          k1.r(this.e, (long)(this.d.get(this.b).intValue() - this.d.get((this.b - 1)).intValue()));
       }
       return;
    }
    public b b(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return this;
       }
       this.h = new WeakReference(p0);
       return this;
    }
    public b c(int p0){
       this.i = p0;
       return this;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       k1.m(this.e);
       k1.m(this.f);
       k1.o(this.f);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       k1.m(this.e);
       k1.m(this.f);
       return;
    }
    public void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       if (p0.equals(LivePlayerState.PLAYING)) {
          this.d();
       }else if(p0.equals(LivePlayerState.STOP)){
          this.e();
       }
       return;
    }
}
