package com.kuaishou.live.liteend.autoremove.LiveLiteEndAutoRemoveFeedPresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import id3.h;
import zd3.a;
import com.kuaishou.live.liteend.autoremove.a;
import erd.g;
import crd.b;
import c93.b;
import e93.a;
import d93.a;

public class LiveLiteEndAutoRemoveFeedPresenter extends d	// class@000bb9
{
    public h v;
    public a w;

    public void LiveLiteEndAutoRemoveFeedPresenter(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEndAutoRemoveFeedPresenter.class, "3")) {
          return;
       }
       super.F8();
       this.v.e().subscribe(new a(this), a.b);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEndAutoRemoveFeedPresenter.class, "1")) {
          return;
       }
       this.w = p0.a(a.class);
       this.v = p0.a(h.class);
       return;
    }
    public void Y8(a p0){
       PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEndAutoRemoveFeedPresenter.class, "2");
    }
}
