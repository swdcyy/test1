package com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayFragment$a;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.pymk.slide.play.empty.e;
import java.lang.Object;
import o17.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PymkDetailSlidePlayFragment$a implements RefreshLayout$h	// class@0016d0
{
    public final AtomicBoolean a;
    public final e b;
    public final PymkDetailSlidePlayFragment c;

    public void PymkDetailSlidePlayFragment$a(PymkDetailSlidePlayFragment p0,AtomicBoolean p1,e p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(float p0,float p1,boolean p2){
       i.a(this, p0, p1, p2);
    }
    public void b(){
       i.d(this);
    }
    public void pullToRefresh(){
       if (PatchProxy.applyVoid(null, this, PymkDetailSlidePlayFragment$a.class, "1")) {
          return;
       }
       this.a.set(true);
       this.c.yh("pullToRefresh", true);
       return;
    }
    public void refreshComplete(){
       if (PatchProxy.applyVoid(null, this, PymkDetailSlidePlayFragment$a.class, "3")) {
          return;
       }
       this.a.set(false);
       this.c.yh("refreshComplete", this.b.b());
       return;
    }
    public void releaseToRefresh(){
       if (PatchProxy.applyVoid(null, this, PymkDetailSlidePlayFragment$a.class, "2")) {
          return;
       }
       this.c.yh("releaseToRefresh", true);
       return;
    }
}
