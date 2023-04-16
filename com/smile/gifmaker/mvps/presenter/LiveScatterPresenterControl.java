package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl;
import wj3.a;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$b;
import nsd.u;
import kotlin.Pair;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$State;
import java.lang.Object;
import java.util.Set;
import trd.d1;
import qrd.r0;
import java.util.Map;
import trd.t0;
import en8.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$g;
import vl8.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.util.ArrayList;
import java.util.LinkedList;
import wj3.a$a;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$a;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$f;
import wj3.c;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$skipOnBindTaskIfNeed$1;
import msd.l;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$skipOnBindTaskIfNeed$2;
import java.util.Collection;
import xj3.d;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$j;
import java.lang.Runnable;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$destroy$1;
import k51.a;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$flushDestroy$1;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$flushDestroy$2;
import java.util.Iterator;
import java.lang.Iterable;
import com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$d;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$c;
import wj3.b;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$e;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$i;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$flushUnbind$1;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$flushUnbind$2;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$flushUnbind$3;
import com.smile.gifmaker.mvps.presenter.PresenterStateMachine$PresenterState;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$h;

public final class LiveScatterPresenterControl implements a	// class@000c16
{
    public final c b;
    public LiveScatterPresenterControl$State c;
    public boolean d;
    public boolean e;
    public final b f;
    public final List g;
    public final LinkedList h;
    public final a i;
    public final String j;
    public static final Map k;
    public static final LiveScatterPresenterControl$b l;

    static {
       LiveScatterPresenterControl$State[] stateArray;
       LiveScatterPresenterControl$State cREATE;
       LiveScatterPresenterControl$State dESTROY;
       LiveScatterPresenterControl$State[] stateArray1;
       LiveScatterPresenterControl$State bIND;
       LiveScatterPresenterControl.l = new LiveScatterPresenterControl$b(null);
       Pair[] pairArray = new Pair[]{r0.a(LiveScatterPresenterControl$State.INIT, d1.u(stateArray)),r0.a(cREATE, d1.u(stateArray1)),r0.a(bIND, d1.u(stateArray1)),r0.a(cREATE, d1.u(stateArray1)),r0.a(dESTROY, d1.k())};
       stateArray = new LiveScatterPresenterControl$State[]{cREATE,dESTROY};
       cREATE = LiveScatterPresenterControl$State.CREATE;
       dESTROY = LiveScatterPresenterControl$State.DESTROY;
       stateArray1 = new LiveScatterPresenterControl$State[]{bIND,dESTROY};
       bIND = LiveScatterPresenterControl$State.BIND;
       stateArray1 = new LiveScatterPresenterControl$State[]{cREATE,dESTROY};
       cREATE = LiveScatterPresenterControl$State.UNBIND;
       stateArray1 = new LiveScatterPresenterControl$State[]{bIND,dESTROY};
       LiveScatterPresenterControl.k = t0.W(pairArray);
    }
    public void LiveScatterPresenterControl(a p0,String p1){
       a.p(p0, "stageLoader");
       a.p(p1, "taskTag");
       super();
       this.i = p0;
       this.j = p1;
       this.b = new LiveScatterPresenterControl$g(this);
       this.c = LiveScatterPresenterControl$State.INIT;
       this.d = true;
       this.f = new b(this, PresenterV2.class);
       this.g = new ArrayList();
       this.h = new LinkedList();
    }
    public void K7(a$a p0,Object[] p1){
       a.p(p1, "callerContext");
       b.Z(this.b, "bind");
       this.e = false;
       this.a(new LiveScatterPresenterControl$a(this, p0, p1));
    }
    public void L2(c p0){
       a.p(p0, "presenterListBuilder");
       this.p3(p0, null);
    }
    public final void a(LiveScatterPresenterControl$f p0){
       this.d = false;
       if (this.h.isEmpty()) {
          this.h.addLast(p0);
          this.c();
       }else {
          this.h.addLast(p0);
       }
       return;
    }
    public final void b(){
       if (this.c == LiveScatterPresenterControl$State.BIND) {
          this.i.b(new LiveScatterPresenterControl$skipOnBindTaskIfNeed$1(this));
          this.i.b(new LiveScatterPresenterControl$skipOnBindTaskIfNeed$2(this));
       }
       this.e = true;
       return;
    }
    public final void c(){
       if (this.h.isEmpty() ^ 0x01) {
          this.i.f(new d(100, "changeStateAction", this.j, new LiveScatterPresenterControl$j(this)));
       }
       return;
    }
    public void destroy(){
       b.Z(this.b, "destroy");
       LiveScatterPresenterControl tc = this.c;
       if (tc == LiveScatterPresenterControl$State.INIT || tc == LiveScatterPresenterControl$State.CREATE) {
          this.h.clear();
          this.i.b(new LiveScatterPresenterControl$destroy$1(this));
       }
       if (a.e()) {
          if (this.c == LiveScatterPresenterControl$State.BIND) {
             this.i.b(new LiveScatterPresenterControl$flushDestroy$1(this));
             this.i.b(new LiveScatterPresenterControl$flushDestroy$2(this));
          }
          Iterator iterator = this.g.iterator();
          while (iterator.hasNext()) {
             iterator.next().a.destroy();
          }
       }else {
          this.a(new LiveScatterPresenterControl$d(this));
          this.b();
       }
       return;
    }
    public void f(View p0){
       a.p(p0, "view");
       b.Z(this.b, "create");
       this.a(new LiveScatterPresenterControl$c(this, p0));
    }
    public void g1(b p0){
       a.p(p0, "presenterBuilder");
       if (this.d == null) {
          throw new IllegalStateException("当前状态不允许添加Presenter");
       }
       this.i.f(new LiveScatterPresenterControl$e(this, p0));
       return;
    }
    public void i(Object[] p0){
       a.p(p0, "callerContext");
       b.Z(this.b, "bind");
       this.e = false;
       this.a(new LiveScatterPresenterControl$a(this, null, p0));
    }
    public void p3(c p0,String p1){
       a.p(p0, "presenterListBuilder");
       b.Z(this.b, "addPresenterList "+p0+", taskName "+p1);
       if (this.d == null) {
          throw new IllegalStateException("当前状态不允许添加Presenter");
       }
       LiveScatterPresenterControl ti = this.i;
       if (p1 == null) {
          p1 = "PresenterListCreater";
       }
       ti.f(new d(0, p1, this.j, new LiveScatterPresenterControl$i(this, p0)));
       return;
    }
    public void unbind(){
       boolean b;
       PresenterV2$c a;
       b.Z(this.b, "unbind");
       if (a.e()) {
          if (this.c == LiveScatterPresenterControl$State.BIND) {
             this.i.b(new LiveScatterPresenterControl$flushUnbind$1(this));
             this.i.b(new LiveScatterPresenterControl$flushUnbind$2(this));
          }
          b = true;
          this.e = b;
          this.i.i(new LiveScatterPresenterControl$flushUnbind$3(this));
          Iterator iterator = this.g.iterator();
          boolean b1 = false;
          while (iterator.hasNext()) {
             PresenterV2$c uoc = iterator.next();
             a = uoc.a;
             a.h = b1;
             a.unbind();
             uoc = uoc.a;
             uoc.h = b;
             uoc.K8(uoc.f);
          }
          Iterator iterator1 = this.g.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().b();
          }
          this.e = b1;
       }else {
          this.a(new LiveScatterPresenterControl$h(this));
          this.b();
       }
       return;
    }
}
