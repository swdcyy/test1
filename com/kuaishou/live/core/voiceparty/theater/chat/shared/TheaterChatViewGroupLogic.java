package com.kuaishou.live.core.voiceparty.theater.chat.shared.TheaterChatViewGroupLogic;
import eq3.d;
import android.view.ViewGroup;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import com.kuaishou.live.core.voiceparty.g0;
import i81.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import fw2.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.t0;
import com.kuaishou.live.core.voiceparty.theater.chat.shared.TheaterChatViewGroupLogic$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import op2.j;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.theater.chat.shared.TheaterChatViewGroupLogic$switchDisplayMode$$inlined$let$lambda$1;
import android.view.ViewPropertyAnimator;
import fw2.b;
import java.lang.Enum;
import lnc.a1;
import android.view.animation.DecelerateInterpolator;
import android.view.View;
import android.animation.TimeInterpolator;
import msd.a;
import fw2.c;
import i81.f$a$a;
import i81.f$a;
import i81.f$a$d;
import i81.f$a$b;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.theater.chat.shared.TheaterChatViewGroupLogic$switchDisplayMode$3;
import usd.f;
import usd.p;

public abstract class TheaterChatViewGroupLogic	// class@001968
{
    public final a a;
    public final a b;
    public TheaterDisplayMode c;
    public final Map d;
    public ViewController e;
    public final TheaterChatViewGroupLogic$a f;
    public final d g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final ViewGroup j;
    public final TheaterManager k;
    public final g0 l;
    public final f m;

    public void TheaterChatViewGroupLogic(d p0,ViewGroup p1,ViewGroup p2,ViewGroup p3,TheaterManager p4,g0 p5,f p6){
       a.p(p0, "theaterRootViewControllerManager");
       a.p(p1, "halfScreenContainer");
       a.p(p2, "fullscreenPortraitContainer");
       a.p(p3, "fullscreenLandscapeContainer");
       a.p(p4, "theaterManager");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       this.m = p6;
       this.a = new a();
       this.b = new a();
       TheaterDisplayMode hALF_SCREEN = TheaterDisplayMode.HALF_SCREEN;
       this.c = hALF_SCREEN;
       Pair[] pairArray = new Pair[]{r0.a(hALF_SCREEN, p1),r0.a(TheaterDisplayMode.FULL_SCREEN_LANDSCAPE, p3),r0.a(TheaterDisplayMode.FULL_SCREEN_PORTRAIT, p2)};
       this.d = t0.W(pairArray);
       this.f = new TheaterChatViewGroupLogic$a(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TheaterChatViewGroupLogic.class, "2")) {
          return;
       }
       this.k.a(this.f);
       this.f(TheaterDisplayMode.HALF_SCREEN);
       return;
    }
    public abstract ViewController b(TheaterDisplayMode p0);
    public void c(){
       if (PatchProxy.applyVoid(null, this, TheaterChatViewGroupLogic.class, "3")) {
          return;
       }
       this.a.dispose();
       this.k.o(this.f);
       return;
    }
    public final ViewGroup d(){
       Object obj = PatchProxy.apply(null, this, TheaterChatViewGroupLogic.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.get(this.c);
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup");
       return obj;
    }
    public final a e(){
       return this.a;
    }
    public final void f(TheaterDisplayMode p0){
       TheaterChatViewGroupLogic b;
       TheaterChatViewGroupLogic c;
       TheaterDisplayMode theaterDispl = this;
       Object obj = p0;
       TheaterChatViewGroupLogic theaterChatV = TheaterChatViewGroupLogic.class;
       if (PatchProxy.applyVoidOneRefs(obj, theaterDispl, theaterChatV, "4")) {
          return;
       }
       TheaterChatViewGroupLogic e = theaterDispl.e;
       float f = 50.00f;
       if (e != null) {
          b = theaterDispl.b;
          c = theaterDispl.c;
          ViewGroup viewGroup = this.d();
          TheaterChatViewGroupLogic$switchDisplayMode$$inlined$let$lambda$1 oswitchDispl = new TheaterChatViewGroupLogic$switchDisplayMode$$inlined$let$lambda$1(e, theaterDispl);
          Objects.requireNonNull(b);
          ViewPropertyAnimator viewProperty = PatchProxy.applyThreeRefs(c, viewGroup, oswitchDispl, b, a.class, "4");
          if (viewProperty != PatchProxyResult.class) {
          }else {
             a.p(c, "displayMode");
             a.p(viewGroup, "view");
             viewProperty = (b.b[c.ordinal()] != 1)? b.a(viewGroup, 0, (float)a1.e(-50.00f), 80, new DecelerateInterpolator(0x3fc00000), oswitchDispl): b.a(viewGroup, 0, (float)a1.e(f), 80, new DecelerateInterpolator(0x3fc00000), oswitchDispl);
          }
          viewProperty.start();
       }
       if (!PatchProxy.applyVoidOneRefs(obj, theaterDispl, theaterChatV, "6")) {
          int i = c.a[p0.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   theaterChatV = theaterDispl.m;
                   if (theaterChatV != null) {
                      theaterChatV.b(f$a$a.a);
                   }
                }
             }else {
                theaterChatV = theaterDispl.m;
                if (theaterChatV != null) {
                   theaterChatV.b(f$a$d.a);
                }
             }
          }else {
             theaterChatV = theaterDispl.m;
             if (theaterChatV != null) {
                theaterChatV.b(new f$a$b(theaterDispl.h));
             }
          }
       }
       theaterDispl.c = obj;
       ViewController viewControll = this.b(p0);
       theaterDispl.g.E2(this.d(), viewControll);
       theaterDispl.e = viewControll;
       TheaterChatViewGroupLogic b1 = theaterDispl.b;
       ViewGroup viewGroup1 = this.d();
       TheaterChatViewGroupLogic$switchDisplayMode$3 oswitchDispl1 = new TheaterChatViewGroupLogic$switchDisplayMode$3(theaterDispl);
       Objects.requireNonNull(b1);
       ViewGroup viewGroup2 = viewGroup1;
       TheaterChatViewGroupLogic$switchDisplayMode$3 oswitchDispl2 = oswitchDispl1;
       TheaterChatViewGroupLogic$switchDisplayMode$3 oswitchDispl3 = oswitchDispl1;
       ViewGroup viewGroup3 = viewGroup1;
       ViewPropertyAnimator viewProperty1 = PatchProxy.applyThreeRefs(p0, viewGroup2, oswitchDispl2, b1, a.class, "3");
       if (viewProperty1 != PatchProxyResult.class) {
       }else {
          a.p(obj, "displayMode");
          a.p(viewGroup3, "view");
          viewProperty1 = (b.a[p0.ordinal()] != 1)? b1.b(viewGroup3, p.d(0, 0x3f800000), p.d((float)a1.e(-50.00f), 0), 80, new DecelerateInterpolator(0x3fc00000), oswitchDispl3): b1.b(viewGroup3, p.d(0, 0x3f800000), p.d((float)a1.e(50.00f), 0), 80, new DecelerateInterpolator(0x3fc00000), oswitchDispl3);
       }
       viewProperty1.start();
       return;
    }
}
