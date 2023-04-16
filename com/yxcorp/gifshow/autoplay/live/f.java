package com.yxcorp.gifshow.autoplay.live.f;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.yxcorp.gifshow.autoplay.live.g;
import java.lang.Object;
import rj3.a;
import t99.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Iterator;
import java.util.Set;

public class f implements LiveAutoPlay$b	// class@001c19
{
    public final g a;

    public void f(g p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       c.e(this, p0);
    }
    public void onAnchorEndLive(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "4")) {
          return;
       }
       f ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, g.class, "22")) {
          Iterator iterator = ta.g.iterator();
          while (iterator.hasNext()) {
             iterator.next().onAnchorEndLive();
          }
       }
       return;
    }
    public void onAudioStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "2")) {
          return;
       }
       f ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, g.class, "17")) {
          Iterator iterator = ta.g.iterator();
          while (iterator.hasNext()) {
             iterator.next().onAudioStart();
          }
       }
       return;
    }
    public void onPlayerCached(){
       c.c(this);
    }
    public void onPlayerRetrieved(){
       c.d(this);
    }
    public void onRenderStop(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.a.V();
       return;
    }
    public void onVideoStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "1")) {
          return;
       }
       f ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, g.class, "16")) {
          Iterator iterator = ta.g.iterator();
          while (iterator.hasNext()) {
             iterator.next().onVideoStart();
          }
       }
       return;
    }
}
