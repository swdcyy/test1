package com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSessionState;
import msd.a;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession$clearScreen$1;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.lang.Integer;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.Iterator;
import java.lang.Iterable;
import s19.a;
import java.lang.StringBuilder;
import yx.j0;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession$b;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession$c;

public final class ScreenCleanSession	// class@0016ef
{
    public final ArrayList a;
    public final ArrayList b;
    public ScreenCleanSessionState c;
    public static final ScreenCleanSession$a d;

    static {
       ScreenCleanSession.d = new ScreenCleanSession$a(null);
    }
    public void ScreenCleanSession(){
       super();
       this.a = new ArrayList();
       this.b = new ArrayList();
       this.c = ScreenCleanSessionState.Reset;
    }
    public static void e(ScreenCleanSession p0,boolean p1,a p2,int p3,int p4,Object p5){
       ScreenCleanSession$clearScreen$1 iNSTANCE;
       if (p4 & 0x02) {
          iNSTANCE = ScreenCleanSession$clearScreen$1.INSTANCE;
       }
       if (p4 & 0x04) {
          p3 = 8;
       }
       p0.d(p1, iNSTANCE, p3);
       return;
    }
    public final void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScreenCleanSession.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.a.add(p0);
       return;
    }
    public final boolean b(){
       ScreenCleanSession tc = this.c;
       boolean b = (tc == ScreenCleanSessionState.Reset || tc == ScreenCleanSessionState.ResumeDone)? true: false;
       return b;
    }
    public final boolean c(){
       ScreenCleanSession tc = this.c;
       boolean b = (tc == ScreenCleanSessionState.Reset || tc == ScreenCleanSessionState.CleanDone)? true: false;
       return b;
    }
    public final void d(boolean p0,a p1,int p2){
       ScreenCleanSession screenCleanS = this;
       int i = p2;
       if (PatchProxy.isSupport(ScreenCleanSession.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, Integer.valueOf(p2), this, ScreenCleanSession.class, "3")) {
          return;
       }
       a.p(p1, "callback");
       if (!this.b()) {
          return;
       }
       screenCleanS.c = ScreenCleanSessionState.CleanRequest;
       screenCleanS.b.clear();
       Ref$IntRef intRef = new Ref$IntRef();
       int i1 = 0;
       intRef.element = i1;
       if (screenCleanS.a.isEmpty()) {
          screenCleanS.c = ScreenCleanSessionState.CleanDone;
          p1.invoke();
          return;
       }else {
          Iterator iterator = screenCleanS.a.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             obj.clearAnimation();
             screenCleanS.b.add(new a(obj, obj.getVisibility()));
             screenCleanS.c = ScreenCleanSessionState.Cleaning;
             obj.clearAnimation();
             if (!obj.getVisibility() && p0) {
                Object[] objArray = new Object[i1];
                j0.a("ScreenCleanManager", "setViewVisibility:"+intRef.element, objArray);
                ScreenCleanSession$b uob = v6;
                ScreenCleanSession$b uob1 = v6;
                uob = new ScreenCleanSession$b(obj, this, p0, intRef, p2, p1);
                n.X(obj, i, 200, uob1);
             }else {
                int i2 = intRef.element + 1;
                intRef.element = i2;
                obj.setVisibility(i);
                if (intRef.element == screenCleanS.a.size()) {
                   screenCleanS.c = ScreenCleanSessionState.CleanDone;
                   p1.invoke();
                }
             }
             i1 = 0;
          }
          return;
       }
    }
    public final ScreenCleanSessionState f(){
       return this.c;
    }
    public final void g(boolean p0,a p1){
       ScreenCleanSession screenCleanS = ScreenCleanSession.class;
       if (PatchProxy.isSupport(screenCleanS) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, screenCleanS, "4")) {
          return;
       }
       a.p(p1, "callback");
       if (!this.c()) {
          return;
       }
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = 0;
       this.c = ScreenCleanSessionState.ResumeRequest;
       if (this.b.isEmpty()) {
          this.c = ScreenCleanSessionState.ResumeDone;
          return;
       }else {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             this.c = ScreenCleanSessionState.Resuming;
             if (obj.a().getVisibility() != obj.b() && p0) {
                obj.a().clearAnimation();
                ScreenCleanSession$c uoc = new ScreenCleanSession$c(obj, this, p0, intRef, p1);
                n.X(obj.a(), obj.b(), 200, v12);
             }else {
                int i = intRef.element + 1;
                intRef.element = i;
                obj.a().setVisibility(obj.b());
                if (intRef.element == this.b.size()) {
                   this.c = ScreenCleanSessionState.ResumeDone;
                   this.b.clear();
                   p1.invoke();
                }
             }
          }
          return;
       }
    }
    public final void h(ScreenCleanSessionState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScreenCleanSession.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
}
