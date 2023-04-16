package com.kuaishou.live.lite.end.LiveLiteEndBizPresenter;
import b93.d;
import com.kuaishou.live.lite.end.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mq5.h;
import mq5.b;
import e93.f;
import c93.b;
import d93.a;
import e93.c;

public class LiveLiteEndBizPresenter extends d	// class@0008dc
{
    public b v;
    public c w;
    public final h x;

    public void LiveLiteEndBizPresenter(){
       super();
       this.x = new b(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEndBizPresenter.class, "3")) {
          return;
       }
       super.F8();
       this.v.Km(this.x);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEndBizPresenter.class, "4")) {
          return;
       }
       this.v.le(this.x);
       f.g(this);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEndBizPresenter.class, "1")) {
          return;
       }
       this.v = p0.a(b.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEndBizPresenter.class, "2")) {
          return;
       }
       this.w = p0.a(c.class);
       return;
    }
}
