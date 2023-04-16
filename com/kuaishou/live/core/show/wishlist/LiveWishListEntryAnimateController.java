package com.kuaishou.live.core.show.wishlist.LiveWishListEntryAnimateController;
import java.lang.Object;
import com.kuaishou.live.core.show.wishlist.LiveWishListEntryAnimateController$State;
import androidx.transition.TransitionSet;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import java.lang.String;
import kotlin.jvm.internal.a;
import nn2.z1;
import nn2.b;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nn2.q1;
import e3.l;
import androidx.transition.e;
import android.view.ViewGroup;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class LiveWishListEntryAnimateController	// class@0012cd
{
    public LiveWishListEntryAnimateController$State a;
    public l b;
    public b c;
    public ViewFlipper d;
    public final long e;
    public final long f;
    public ViewGroup g;
    public LiveWishListEntryAnimateController$a h;
    public LiveWishListEntryAnimateController$b i;
    public final Transition j;
    public final Transition k;
    public final z1 l;
    public final boolean m;

    public void LiveWishListEntryAnimateController(boolean p0){
       super();
       this.m = p0;
       this.a = LiveWishListEntryAnimateController$State.INIT;
       this.e = 300;
       this.f = 200;
       TransitionSet transitionSe = new TransitionSet();
       transitionSe.l0(new ChangeBounds());
       transitionSe.r0(300);
       a.o(transitionSe, "TransitionSet\(\).addTrans¡­on\(EXPANDING_DURATION_MS\)");
       this.j = transitionSe;
       transitionSe = new TransitionSet();
       transitionSe.l0(new ChangeBounds());
       transitionSe.r0(200);
       a.o(transitionSe, "TransitionSet\(\).addTrans¡­tion\(FOLDING_DURATION_MS\)");
       this.k = transitionSe;
       this.l = new z1();
    }
    public final Transition a(){
       return this.j;
    }
    public final b b(){
       return this.c;
    }
    public final b c(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveWishListEntryAnimateController.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       if (this.c == null) {
          this.c = new q1(p0, 0x7f0d0e8f);
       }
       LiveWishListEntryAnimateController tc = this.c;
       a.m(tc);
       return tc;
    }
    public final Transition d(){
       return this.k;
    }
    public final void e(l p0,Transition p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveWishListEntryAnimateController.class, "8")) {
          return;
       }
       this.b = p0;
       e.f(p0, p1);
       return;
    }
    public final void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveWishListEntryAnimateController.class, "7")) {
          return;
       }
       LiveWishListEntryAnimateController tg = this.g;
       if (tg != null) {
          try{
             e.d(tg);
          }catch(java.lang.Exception e0){
             b.I(LiveLogTag.WISH_LIST, "[LiveWishListEntryAnimateController][releaseTransition]", e0);
          }
       }
    }
    public final void g(){
       this.a = LiveWishListEntryAnimateController$State.INIT;
    }
    public final void h(LiveWishListEntryAnimateController$State p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWishListEntryAnimateController.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
}
