package com.kuaishou.live.lite.redpacket.LiveLiteRedPackPresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eq3.d;
import com.kuaishou.live.lite.redpacket.a;
import v51.a;
import qd3.r;
import n91.f;
import e93.b;
import xp5.i;
import or5.d;
import com.kuaishou.live.viewcontroller.ViewController;
import c93.b;
import d93.a;

public class LiveLiteRedPackPresenter extends d	// class@000b0d
{
    public b A;
    public a v;
    public f w;
    public d x;
    public i y;
    public r z;

    public void LiveLiteRedPackPresenter(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRedPackPresenter.class, "3")) {
          return;
       }
       super.F8();
       a uoa = new a(this.v, this.z, this.w, this.A, this.y, this.x);
       this.P8().xg(v8);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteRedPackPresenter.class, "1")) {
          return;
       }
       this.v = p0.a(a.class);
       this.y = p0.a(i.class);
       this.w = p0.a(f.class);
       this.x = p0.a(d.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteRedPackPresenter.class, "2")) {
          return;
       }
       this.z = p0.a(r.class);
       this.A = p0.a(b.class);
       return;
    }
}
