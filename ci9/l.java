package ci9.l;
import oh9.v;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import ed9.f;
import tkd.b;
import tkd.d;
import om6.r;
import nm6.c;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import android.util.SparseArray;
import com.yxcorp.gifshow.camera.record.base.d;
import ci9.m;
import ci9.e;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import ci9.d;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import ci9.l$a;
import dba.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Shoot;
import com.kuaishou.edit.draft.Shoot$RecordMode;
import java.lang.Enum;
import android.content.Intent;
import android.app.Activity;
import gh9.i;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import mm6.c;
import java.lang.Integer;
import gh9.d;
import yb9.b;
import th0.e;
import th0.n;
import android.view.View;
import android.view.animation.Interpolator;
import yb9.b$a;
import android.widget.FrameLayout;
import ci9.b;
import android.view.View$OnTouchListener;
import ci9.c;
import android.view.ViewGroup;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import ci9.i;
import java.lang.Runnable;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import zb9.s;
import zb9.s$a;
import com.yxcorp.utility.n;
import vb9.m;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import ekd.j0;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import ci9.g;
import erd.g;
import crd.b;
import eoc.f;
import zb9.t;
import ci9.f;
import ci9.j;
import android.animation.Animator$AnimatorListener;
import pi9.n;
import com.kuaishou.edit.draft.Asset$b;
import oh9.u;

public class l extends d0 implements v	// class@0005fd
{
    public ViewGroup o;
    public CameraScrollTabViewGroupV2 p;
    public CameraScrollTabViewGroup q;
    public final f r;
    public final List s;
    public final SparseArray t;
    public int u;
    public boolean v;

    public void l(CameraPageType p0,b p1){
       super(p0, p1);
       this.r = new f(CameraPageType.VIDEO);
       this.s = d.a(-831446984).sH().a;
       this.t = new SparseArray();
       this.u = Integer.MIN_VALUE;
       this.v = false;
       this.d.n(m.class, new e(this));
       this.d.n(v.class, new d(this));
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, l.class, "7")) {
          return;
       }
       if (!this.a2()) {
          this.i2(true, true);
       }
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       this.i2(false, false);
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, l.class, "8")) {
          return;
       }
       this.i2(true, true);
       return;
    }
    public void W(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
          return;
       }
       int i = l$a.a[p0.S0().v().getRecordMode().ordinal()];
       d0 uod0 = 4;
       int i1 = 2;
       if (i != 1) {
          if (i != i1) {
             if (i != 3) {
                if (i != uod0) {
                   uod0 = this.n;
                }
             }else {
                uod0 = 2;
             }
          }else {
             uod0 = 1;
          }
       }else {
          uod0 = null;
       }
       if (uod0 == null && (i.a(this.e.getIntent()) && p0.S0().v().getMaxDuration() - (double)d.a(-831446984).uK(uod0) <= 0)) {
          i1 = uod0;
       }
       if (i1 != this.n) {
          d te = this.e;
          if (te instanceof CameraActivity) {
             d tf = this.f;
             if (tf instanceof c) {
                te.H0(i1, tf, false, false);
             }
          }
       }
       if (this.p != null) {
          this.g2(this.n);
          this.i2(false, false);
       }
       return;
    }
    public void d5(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol, "9")) {
          return;
       }
       super.d5(p0);
       d a = this.d.d(d.c).a;
       if (p0 == 5 || a != null) {
          this.d.h().d(this.o, 4, new e(), new n(), null);
       }else {
          this.g2(p0);
          this.d.h().d(this.o, 0, new e(), new n(), null);
          l tp = this.p;
          if (tp != null) {
             tp.setEnabled(true);
          }
          if (this.q != null) {
             tp = this.p;
             if (tp != null) {
                tp.setOnTouchListener(new b(this));
                this.q.setOnTouchListener(new c(this));
             }
          }
       }
       if (a == null && (p0 == 5 || p0 == 3)) {
          this.v = true;
       }else if(this.v != null){
          this.v = false;
          this.h2();
       }
       return;
    }
    public final void g2(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol, "13")) {
          return;
       }
       if (this.p == null || (5 != p0 && 3 != p0)) {
          if (this.d.d(d.c).a != null) {
             return;
          }else {
             p0 = this.t.indexOfValue(Integer.valueOf(p0));
             if (p0 >= 0) {
                this.p.c(this.t.keyAt(p0));
             }
          }
       }
       return;
    }
    public final void h2(){
       if (PatchProxy.applyVoid(null, this, l.class, "15")) {
          return;
       }
       l tp = this.p;
       if (tp == null || (!tp.getVisibility() && this.d.d(d.c).a == null)) {
          int i = 0;
          while (i < this.p.getChildCount()) {
             View childAt = this.p.getChildAt(i);
             if (!childAt.getVisibility() && this.t.indexOfKey(childAt.getId()) >= 0) {
                this.p.post(new i(this, childAt));
             }
             i = i + 1;
          }
       }
       return;
    }
    public final void i2(boolean p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ol, "11")) {
          return;
       }
       int i = 0;
       l ol1 = (!this.a2() && (p0 && (this.f2() && (!CameraLogger.d(this.d) && (this.d.d(d.c).a == null && !this.d.d(s.d.a()).a())))))? 1: null;
       ol = this.o;
       int i1 = (ol1)? 0: 4;
       n.Y(ol, i1, p1);
       if (this.o != null) {
          if (ol1 && !this.d.d(m.d).a()) {
             i = 1;
          }
          l to = this.o;
          float f = (i)? 0x3f800000: 0;
          to.setAlpha(f);
       }
       if (ol1) {
          ol1 = this.p;
          if (ol1 != null) {
             ol1.setEnabled(true);
          }
       }
       return;
    }
    public void k(View p0){
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "1")) {
          return;
       }
       super.k(p0);
       if (!q.f(this.s) && this.s.size() != 1) {
          Object obj = PatchProxy.apply(null, this, ol, "10");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): j0.a(this.e.getIntent(), "panel_disabled", false);
          if (!b) {
             this.Y1(f.a(PanelShowEvent.class, new g(this)));
             this.Y1(this.d.l(t.class, new f(this)));
             this.b2(new j(this, p0));
          }
       }
    label_0067 :
       return;
    }
    public final void k2(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "3")) {
          return;
       }
       ol = this.o;
       if (ol == null) {
          return;
       }
       if (!p0 || (!ol.getVisibility() || (!p0 && this.o.getVisibility() == 4))) {
          return;
       }
       n.a(this.o, p0, this.u, null);
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       this.i2(false, false);
       return;
    }
    public void r0(int p0,Asset$b p1,b p2){
       u.b(this, p0, p1, p2);
    }
}
