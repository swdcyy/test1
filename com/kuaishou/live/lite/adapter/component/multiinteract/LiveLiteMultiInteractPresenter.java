package com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractPresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bo1.f;
import c93.b;

public final class LiveLiteMultiInteractPresenter extends d	// class@001e07
{
    public f v;

    public void LiveLiteMultiInteractPresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiInteractPresenter.class, "2")) {
          return;
       }
       super.E8();
       LiveLiteMultiInteractPresenter tv = this.v;
       if (tv == null) {
          a.S("watchdogService");
       }
       tv.start();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiInteractPresenter.class, "3")) {
          return;
       }
       super.J8();
       LiveLiteMultiInteractPresenter tv = this.v;
       if (tv == null) {
          a.S("watchdogService");
       }
       tv.stop();
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiInteractPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(f.class);
       return;
    }
}
