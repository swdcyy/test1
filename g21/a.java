package g21.a;
import gq1.a;
import oq5.b;
import rp5.a;
import dq5.b;
import qc2.a;
import aq5.d;
import i81.g;
import sa3.b;
import kq5.b;
import a32.j;
import android.view.ViewGroup;
import android.view.View;
import msd.a;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import mrd.a;
import java.lang.Integer;
import g21.a$b;
import g21.a$c;
import g21.a$d;
import g21.a$e;
import androidx.fragment.app.c$b;
import a32.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import g21.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import w51.a;
import g21.a$a;
import android.view.View$OnLayoutChangeListener;
import java.lang.Runnable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import d61.y;
import g21.a$f;
import androidx.lifecycle.Observer;
import brd.t;
import ls1.g;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import tkd.b;
import tkd.d;
import ym5.a;
import f61.b;
import va1.n0;
import java.lang.StringBuilder;
import android.graphics.Rect;
import i81.f;
import i81.f$a$b;
import i81.f$a;
import qc2.u;
import qc2.u$a;
import lnc.a1;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LyricsMode;
import com.kuaishou.live.core.show.music.audiencelyrics.view.ConstraintType;
import android.graphics.PointF;
import com.yxcorp.utility.n;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kuaishou.live.core.basic.bulletin.BulletinUtils;

public final class a implements a	// class@002406
{
    public View$OnLayoutChangeListener a;
    public final a b;
    public final a c;
    public final Runnable d;
    public final Runnable e;
    public final c$b f;
    public final b g;
    public final b h;
    public final a i;
    public final b j;
    public final a k;
    public final d l;
    public final g m;
    public final b n;
    public final b o;
    public final j p;
    public final ViewGroup q;
    public final View r;
    public final View s;
    public final a t;
    public final l u;

    public void a(b p0,a p1,b p2,a p3,d p4,g p5,b p6,b p7,j p8,ViewGroup p9,View p10,View p11,a p12,l p13){
       a.p(p1, "currentActivityService");
       a.p(p5, "layoutManagerService");
       a.p(p6, "interactiveEffectService");
       a.p(p9, "lineContainerView");
       a.p(p10, "multiLineContainerBackground");
       a.p(p11, "playerViewWrapper");
       a.p(p12, "isServiceManagerCleared");
       a.p(p13, "updateRenderAreaWidth");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p3;
       this.l = p4;
       this.m = p5;
       this.n = p6;
       this.o = p7;
       this.p = p8;
       this.q = p9;
       this.r = p10;
       this.s = p11;
       this.t = p12;
       this.u = p13;
       a uoa = a.h(Boolean.FALSE);
       a.o(uoa, "BehaviorSubject.createDefault\(false\)");
       this.b = uoa;
       uoa = a.h(Integer.valueOf(0));
       a.o(uoa, "BehaviorSubject.createDefault\(0\)");
       this.c = uoa;
       this.d = new a$b(this);
       this.e = new a$c(this);
       a$d uod = new a$d(this);
       this.f = uod;
       a$e uoe = new a$e(this);
       this.g = uoe;
       if (p7 != null) {
          p7.c(uod);
       }
       if (p8 != null) {
          p8.a(uoe);
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       b.P(b.a, "adaptMultiLinePosition");
       if (a.K()) {
          this.q.setVisibility(8);
       }else {
          this.q.setVisibility(0);
       }
       this.d();
       if (this.a == null) {
          a$a uoa = new a$a(this);
          this.a = uoa;
          this.s.addOnLayoutChangeListener(uoa);
       }
       this.s.post(this.e);
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       this.s.removeOnLayoutChangeListener(this.a);
       this.a = objArray;
       a to = this.o;
       if (to != null) {
          to.a(this.f);
       }
       to = this.p;
       if (to != null) {
          to.b(this.g);
       }
       this.f();
       b.P(b.a, "onLineEnd - removeCallbacks");
       this.s.removeCallbacks(this.d);
       this.s.removeCallbacks(this.e);
       return;
    }
    public void c(LiveData p0,LifecycleOwner p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "userListLiveData");
       a.p(p1, "lifecycleOwner");
       if (y.d(this.i.c())) {
          a th = this.h;
          if (th != null) {
             th.d();
          }
       }
       b.P(b.a, "onLineStartRender");
       this.s.post(this.d);
       p0.observe(p1, new a$f(this));
       g.l(this.m, this.c.hide(), this.b.hide());
       return;
    }
    public final void d(){
       List a;
       int i;
       Object obj = this;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uoa, "4")) {
          return;
       }
       a = b.a;
       b.S(a, "adjustViewLayout", "isServiceManagerCleared", obj.t.invoke());
       if (obj.t.invoke().booleanValue()) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, obj, uoa, "5")) {
          int i1 = (int)obj.s.getY();
          ViewGroup$LayoutParams layoutParams = obj.q.getLayoutParams();
          String str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
          Objects.requireNonNull(layoutParams, str);
          ViewGroup$LayoutParams layoutParams1 = layoutParams;
          layoutParams1.height = obj.s.getHeight();
          layoutParams1.topMargin = i1;
          int i2 = (int)obj.s.getX();
          int i3 = 0x4c5dd1b8;
          int i4 = 0;
          String str1 = 8;
          if (d.a(i3).f2() || b.b()) {
             layoutParams1.width = obj.s.getWidth();
             layoutParams1.leftMargin = i2;
             obj.u.invoke(Integer.valueOf(obj.s.getWidth()));
             if (b.b()) {
                ViewGroup$LayoutParams layoutParams2 = obj.r.getLayoutParams();
                Objects.requireNonNull(layoutParams2, str);
                layoutParams2.topMargin = i1;
                layoutParams2.height = obj.s.getHeight();
                obj.r.setLayoutParams(layoutParams2);
                obj.r.setVisibility(i4);
             }else {
                obj.r.setVisibility(str1);
             }
          }else {
             layoutParams1.width = -1;
             layoutParams1.leftMargin = i4;
             obj.u.invoke(Integer.valueOf(n0.f()));
             obj.r.setVisibility(str1);
          }
          obj.q.setLayoutParams(layoutParams1);
          i = i2;
          b.V(a, "adjustPlayerHeight - lineContainerView.layoutParams, isServiceManagerCleared: "+obj.t.invoke().booleanValue(), "topMargin", Integer.valueOf(i1), "height", Integer.valueOf(obj.s.getHeight()), "isLiveAdaptation", Boolean.valueOf(d.a(i3).f2()), "leftMargin", Integer.valueOf(i2));
          if (obj.n != null && (!obj.t.invoke().booleanValue() && (i1 > 0 || i > 0))) {
             Rect rect = new Rect(i, i1, (layoutParams1.width + i), (layoutParams1.height + i1));
             b.S(a, "adjustPlayerHeight - 2 ", "rect", rect);
             obj.n.Oa(2, rect);
          }
       label_0150 :
          a q = obj.q;
          if (!PatchProxy.applyVoidOneRefs(q, obj, uoa, "8") && this.e()) {
             f uof = obj.m.nc();
             if (uof != null) {
                uof.b(new f$a$b(q));
             }
          }
       }
    label_0172 :
       if (!PatchProxy.applyVoid(null, obj, uoa, "6")) {
          Activity uActivity = obj.i.c();
          if (obj.k != null && uActivity != null) {
             i = (u.c.a())? a1.d(R.dimen.arg_RES_7f07087a): a1.d(R.dimen.arg_RES_7f070879);
             obj.k.e(LyricsMode.LEFT, ConstraintType.RIGHT_TOP, new PointF((float)(n.k(uActivity) - a1.d(R.dimen.arg_RES_7f070878)), ((obj.s.getY() + (float)obj.s.getHeight()) + (float)i)), true);
          }
       }
       return;
    }
    public final boolean e(){
       a obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.l;
       boolean b = true;
       if (obj == null || obj.r2(AudienceBizRelation.LIVE_MULTI_LINE) != b) {
          b = false;
       }
       return b;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       this.r.setVisibility(8);
       this.q.setVisibility(8);
       a tj = this.j;
       if (tj != null) {
          tj.a();
       }
       BulletinUtils.b(this.m);
       return;
    }
}
