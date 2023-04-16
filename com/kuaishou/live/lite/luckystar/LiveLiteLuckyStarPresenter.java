package com.kuaishou.live.lite.luckystar.LiveLiteLuckyStarPresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eq3.d;
import com.kuaishou.live.lite.luckystar.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import v51.a;
import qd3.r;
import e93.b;
import n91.f;
import xp5.i;
import com.kuaishou.live.viewcontroller.ViewController;
import c93.b;
import or5.d;
import d93.a;
import d93.b;

public class LiveLiteLuckyStarPresenter extends d	// class@000a30
{
    public b A;
    public a v;
    public d w;
    public f x;
    public i y;
    public r z;

    public void LiveLiteLuckyStarPresenter(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteLuckyStarPresenter.class, "4")) {
          return;
       }
       super.F8();
       a uoa = new a(this.v, this.z, this.A, this.x, this.y, this.w.j0());
       this.P8().xg(v8);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLuckyStarPresenter.class, "2")) {
          return;
       }
       this.v = p0.a(a.class);
       this.w = p0.a(d.class);
       this.y = p0.a(i.class);
       this.x = p0.a(f.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLuckyStarPresenter.class, "3")) {
          return;
       }
       this.z = p0.a(r.class);
       this.A = p0.a(b.class);
       return;
    }
    public void Z8(b p0){
       PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLuckyStarPresenter.class, "1");
    }
}
