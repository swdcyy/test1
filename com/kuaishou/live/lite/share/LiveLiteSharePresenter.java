package com.kuaishou.live.lite.share.LiveLiteSharePresenter;
import b93.d;
import com.kuaishou.live.lite.share.LiveLiteSharePresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.share.a;
import dd3.i;
import com.kuaishou.live.lite.sidebar.e;
import or5.d;
import z1.k;
import eq3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import c93.b;
import td3.o;
import vq5.d;
import d93.a;
import d93.b;
import dd3.j;

public class LiveLiteSharePresenter extends d	// class@000b10
{
    public a A;
    public e v;
    public d w;
    public o x;
    public k y;
    public final j z;

    public void LiveLiteSharePresenter(){
       super();
       this.z = new LiveLiteSharePresenter$a(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteSharePresenter.class, "4")) {
          return;
       }
       super.F8();
       this.A = new a(this.v, this.w, new i(this), this.y);
       this.P8().xg(this.A);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSharePresenter.class, "2")) {
          return;
       }
       this.w = p0.a(d.class);
       this.x = p0.a(o.class);
       this.y = p0.c(d.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSharePresenter.class, "3")) {
          return;
       }
       this.v = p0.a(e.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSharePresenter.class, "1")) {
          return;
       }
       p0.d(j.class, this.z);
       return;
    }
}
