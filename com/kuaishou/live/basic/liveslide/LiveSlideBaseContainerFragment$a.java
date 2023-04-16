package com.kuaishou.live.basic.liveslide.LiveSlideBaseContainerFragment$a;
import c51.b;
import com.kuaishou.live.basic.liveslide.LiveSlideBaseContainerFragment;
import java.lang.Object;
import c51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Throwable;
import java.util.List;
import b51.c;
import java.lang.Runnable;
import ekd.k1;

public class LiveSlideBaseContainerFragment$a implements b	// class@000ccc
{
    public final LiveSlideBaseContainerFragment b;

    public void LiveSlideBaseContainerFragment$a(LiveSlideBaseContainerFragment p0){
       this.b = p0;
       super();
    }
    public void S(boolean p0){
       a.e(this, p0);
    }
    public void U(boolean p0){
       LiveSlideBaseContainerFragment$a uoa = LiveSlideBaseContainerFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       if (!p0) {
          this.b.Zg();
       }
       return;
    }
    public void X(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(LiveSlideBaseContainerFragment$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveSlideBaseContainerFragment$a.class, "2")) {
          return;
       }
       if (!p0) {
          this.b.bh();
       }
       return;
    }
    public void c0(){
       a.a(this);
    }
    public void w(boolean p0,List p1){
       LiveSlideBaseContainerFragment$a uoa = LiveSlideBaseContainerFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       k1.r(new c(this), 0);
       this.b.ah();
       return;
    }
}
