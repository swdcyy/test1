package com.kwai.video.krtc.Arya$6;
import com.kwai.video.krtc.a$b;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.observers.BgmObserver;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.c;
import com.kwai.video.krtc.observers.BgmObserver$BgmErrorType;
import java.lang.Float;

public class Arya$6 implements a$b	// class@000656
{
    public final Arya this$0;
    public final BgmObserver val$observer;

    public void Arya$6(Arya p0,BgmObserver p1){
       this.this$0 = p0;
       this.val$observer = p1;
       super();
    }
    public void onCompleted(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$6.class, "3")) {
          return;
       }
       this.val$observer.onCompleted(p0);
       Arya$6 tthis$0 = this.this$0;
       Arya.a(tthis$0, Arya.c(tthis$0), false);
       Arya.q(this.this$0).b();
       Arya.a(this.this$0, false);
       return;
    }
    public void onError(String p0,BgmObserver$BgmErrorType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya$6.class, "4")) {
          return;
       }
       this.val$observer.onError(p0, p1);
       Arya$6 tthis$0 = this.this$0;
       Arya.a(tthis$0, Arya.c(tthis$0), false);
       Arya.q(this.this$0).b();
       Arya.a(this.this$0, false);
       return;
    }
    public void onProgressed(String p0,float p1,float p2){
       if (PatchProxy.isSupport(Arya$6.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, Arya$6.class, "2")) {
          return;
       }
       this.val$observer.onProgressed(p0, p1, p2);
       p0.a = (int)p1;
       p0.b = (int)p2;
       return;
    }
    public void onStart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$6.class, "1")) {
          return;
       }
       this.val$observer.onStart(p0);
       return;
    }
}
