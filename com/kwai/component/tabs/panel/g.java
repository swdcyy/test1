package com.kwai.component.tabs.panel.g;
import com.kwai.component.tabs.panel.a;
import yg5.t0;
import com.kwai.component.tabs.panel.TabsPanelConfig;
import yg5.i0;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.component.tabs.panel.TabsPanelConfig$Style;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.c;
import bh5.a;
import java.lang.Throwable;
import q87.c;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import yg5.r0;
import java.lang.Boolean;
import android.os.SystemClock;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;
import java.lang.Integer;
import yg5.c0;
import java.util.List;
import java.util.Objects;
import java.util.Collection;
import com.kwai.component.tabs.panel.a$a;
import java.lang.StringBuilder;
import android.view.View;
import yg5.s0;

public class g implements a, t0	// class@000b7e
{
    public TabsPanelHostFragment b;
    public c c;
    public List d;
    public a$a e;
    public final i0 f;
    public TabsPanelConfig g;

    public void g(TabsPanelConfig p0,i0 p1){
       super();
       this.d = new ArrayList();
       this.g = p0;
       this.f = p1;
    }
    public TabsPanelConfig$Style a(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.b();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       g tb = this.b;
       if (tb != null && tb.isAdded()) {
          e uoe = this.c.beginTransaction();
          uoe.u(this.b);
          uoe.o();
          this.b = null;
          tb = this.b;
          if (tb != null && tb.isAdded()) {
             uoe = this.c.beginTransaction();
             uoe.u(this.b);
             uoe.m();
             this.b = null;
          }
       }
    label_005b :
       return;
    }
    public boolean c(boolean p0,r0 p1){
       e obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, og, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p1 != null) {
          p1.d = SystemClock.elapsedRealtime();
       }
       og = this.b;
       if (og != null && og.isAdded()) {
          obj = this.c.beginTransaction();
          obj.E(this.b);
          obj.o();
          if (p0) {
             this.b.ci(p1);
          }
       }
       return true;
    }
    public boolean d(){
       g obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = (obj != null && (obj.isVisible() && this.b.Uh()))? true: false;
       return b;
    }
    public boolean e(boolean p0,int p1){
       r0 obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, og, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = new r0();
       obj.e(p1);
       return this.c(p0, obj);
    }
    public boolean f(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (new c0().b(this.g.g, p0) >= 0)? true: false;
       return b;
    }
    public boolean g(){
       g obj = PatchProxy.apply(null, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = (obj != null && obj.isAdded())? true: false;
       return b;
    }
    public boolean h(c p0,int p1){
       TabsPanelConfig g;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.c = p0;
       this.b();
       if (this.b == null) {
          this.b = this.f.create();
       }
       og = this.b;
       g tg = this.g;
       Objects.requireNonNull(og);
       if (!PatchProxy.applyVoidOneRefs(tg, og, TabsPanelHostFragment.class, "19") && og.E == null) {
          g = tg.g;
          if (g != null) {
             og.B.addAll(g);
          }
          g = tg.c;
          if (g != null) {
             og.D = g;
          }
          g = tg.a;
          if (g != null) {
             og.K = g;
          }
          og.I = tg;
       }
       this.b.Zh(this.d);
       this.b.ai(this.e);
       this.b.H = this;
       e uoe = p0.beginTransaction();
       if (this.g.l != null) {
          uoe.w(p1, this.b, "CommentPanelImpl");
       }else {
          uoe.g(p1, this.b, "CommentPanelImpl");
       }
       uoe.s(this.b);
       uoe.o();
       return true;
    }
    public void i(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "12")) {
          return;
       }
       this.e = p0;
       g tb = this.b;
       if (tb != null) {
          tb.ai(p0);
       }
       return;
    }
    public boolean j(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, og, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       g tb = this.b;
       if (tb != null && (!tb.isRemoving() && p0)) {
          this.b.bi();
       }else {
          g tb1 = this.b;
          if (tb1 != null && (tb1.isAdded() && !this.b.isRemoving())) {
             e uoe = this.c.beginTransaction();
             uoe.s(this.b);
             uoe.o();
          }else {
             Object[] objArray = new Object[0];
             a.C().t("CommentPanelImpl", "hideFragment failed  mPanelHostFragment "+this.b, objArray);
             return 0;
          }
       }
       return true;
    }
    public void k(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "11")) {
          return;
       }
       this.d = p0;
       g tb = this.b;
       if (tb != null) {
          tb.Zh(p0);
       }
       return;
    }
    public void l(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "1")) {
          return;
       }
       og = this.b;
       if (og != null && og.getView() != null) {
          this.b.getView().setEnabled(p0);
       }
       return;
    }
    public List m(){
       return this.g.g;
    }
    public void s(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "5")) {
          return;
       }
       if (!p0) {
          this.j(false);
       }
       return;
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       s0.c(this, p0, p1, p2, p3, p4);
    }
    public void xe(boolean p0,r0 p1){
       s0.b(this, p0, p1);
    }
}
