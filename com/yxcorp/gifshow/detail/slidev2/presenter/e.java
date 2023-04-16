package com.yxcorp.gifshow.detail.slidev2.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import java.util.HashMap;
import com.yxcorp.gifshow.detail.slidev2.presenter.e$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import b8a.j;
import erd.g;
import crd.b;
import brd.t;
import java.util.List;
import com.yxcorp.gifshow.util.rx.RxBus;
import c9a.a;
import t45.d;
import brd.z;
import b8a.k;
import b8a.l;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.Math;
import brd.y;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import msd.r;
import java.util.Map;
import android.view.ViewGroup$LayoutParams;
import android.graphics.RectF;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.e9;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.lang.RuntimeException;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;

public abstract class e extends PresenterV2	// class@001901
{
    public final Map A;
    public final Map B;
    public final t0 C;
    public final t0 D;
    public float E;
    public float F;
    public List p;
    public List q;
    public MilanoContainerEventBus r;
    public List s;
    public PublishSubject t;
    public PublishSubject u;
    public QPhoto v;
    public BaseFragment w;
    public f x;
    public int y;
    public float z;

    public void e(){
       super();
       this.p = new ArrayList();
       this.q = new ArrayList();
       this.y = 0;
       this.z = 0;
       this.A = new HashMap();
       this.B = new HashMap();
       this.C = new e$a(this);
       this.D = new e$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       e tr = this.r;
       if (tr != null) {
          this.X7(tr.E.subscribe(new j(this)));
       }
       this.p.add(this.C);
       this.q.add(this.D);
       this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new k(this)));
       this.y = this.W8();
       this.X7(this.u.subscribe(new l(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       this.p.remove(this.C);
       this.q.remove(this.D);
       this.d9();
       this.z = 0;
       return;
    }
    public void P8(int p0,int p1,int p2,float p3,boolean p4){
       if (PatchProxy.isSupport(e.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, e.class, "4")) {
             return;
          }
       }
       if (this.Z8()) {
          return;
       }else {
          p0 = p0 + this.Y8();
          p1 = p1 - this.y;
          float f = (float)n.k(this.getActivity());
          this.E = f;
          if (!f) {
             this.E = (float)a1.h();
          }
          this.F = (float)((p0 - p1) - this.Y8());
          float f1 = 0x3f800000;
          float f2 = Math.min(Math.max(p3, 0), f1);
          this.z = f2;
          this.R8(f2, this.E, this.F);
          e tr = this.r;
          if (tr != null) {
             tr.j.onNext(Float.valueOf((f1 - f2)));
          }
          this.t.onNext(Float.valueOf((f1 - f2)));
          return;
       }
    }
    public abstract void R8(float p0,float p1,float p2);
    public final void S8(View p0,View p1,float p2,float p3,float p4,r p5){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uoe, "5")) {
             return;
          }
       }
       this.V8(p0, p1, p2, p3, p4, p5, false);
       return;
    }
    public final void V8(View p0,View p1,float p2,float p3,float p4,r p5,boolean p6){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uoe, "6")) {
             return;
          }
       }
       if (p0 != null && p1 != null) {
          if (!p4) {
             if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "8")) {
                ViewGroup$LayoutParams layoutParams = this.B.get(p0);
                if (layoutParams != null) {
                   p0.setLayoutParams(layoutParams);
                }
                this.B.remove(p0);
             }
             if (p6) {
                this.c9(p0);
             }
             return;
          }else {
             RectF rectF = this.X8(p1);
             if (rectF.isEmpty()) {
                return;
             }else {
                ViewGroup$MarginLayoutParams marginLayout = this.b9(p0);
                RectF rectF1 = p5.invoke(rectF, Float.valueOf(p2), Float.valueOf(p3), Float.valueOf(p4));
                if (p6) {
                   p0.setPivotX(rectF.centerX());
                   p3 = e9.a((rectF1.width() / rectF.width()));
                   p0.setPivotY(0);
                   p0.setTranslationY((rectF1.bottom - (rectF.bottom * p3)));
                   p0.setScaleX(p3);
                   p0.setScaleY(p3);
                   return;
                }else {
                   marginLayout.leftMargin = (int)rectF1.left;
                   marginLayout.topMargin = (int)rectF1.top;
                   marginLayout.width = (int)rectF1.width();
                   marginLayout.height = (int)rectF1.height();
                   p0.setLayoutParams(marginLayout);
                }
             }
          }
       }
       return;
    }
    public abstract int W8();
    public final RectF X8(View p0){
       RectF obj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A.get(p0);
       if (obj == null) {
          obj = new RectF();
          this.A.put(p0, obj);
       }
       if (obj.isEmpty()) {
          obj.set((float)p0.getLeft(), (float)p0.getTop(), (float)p0.getRight(), (float)p0.getBottom());
       }
       return obj;
    }
    public abstract int Y8();
    public abstract boolean Z8();
    public boolean a9(){
       boolean b = (!this.z - 0x3f800000)? true: false;
       return b;
    }
    public final ViewGroup$MarginLayoutParams b9(View p0){
       FrameLayout$LayoutParams layoutParams;
       ViewGroup$MarginLayoutParams obj = PatchProxy.applyOneRefs(p0, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B.get(p0) != null) {
          return p0.getLayoutParams();
       }
       obj = p0.getLayoutParams();
       this.B.put(p0, obj);
       if (obj instanceof FrameLayout$LayoutParams) {
          layoutParams = new FrameLayout$LayoutParams(obj.width, obj.height);
       }else if(obj instanceof RelativeLayout$LayoutParams){
          layoutParams = new RelativeLayout$LayoutParams(obj.width, obj.height);
       }else if(obj instanceof LinearLayout$LayoutParams){
          layoutParams = new LinearLayout$LayoutParams(obj.width, obj.height);
       }else {
          throw new RuntimeException("no support other LayoutParams");
       }
       return layoutParams;
    }
    public final void c9(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       p0.setScaleY(0x3f800000);
       p0.setScaleX(0x3f800000);
       p0.setPivotX(0);
       p0.setPivotY(0);
       p0.setTranslationY(0);
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, e.class, "12")) {
          return;
       }
       Iterator iterator = this.B.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          View key = uEntry.getKey();
          key.setLayoutParams(uEntry.getValue());
       }
       this.B.clear();
       this.A.clear();
       if (this.a9()) {
          e tr = this.r;
          float f = 0x3f800000;
          if (tr != null) {
             tr.j.onNext(Float.valueOf(f));
          }
          this.t.onNext(Float.valueOf(f));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.r = this.q8(MilanoContainerEventBus.class);
       this.p = this.r8("SLIDE_PLAY_COMMENT_PANEL_STATE_LISTENER_LIST");
       this.q = this.r8("SLIDE_PLAY_AI_TEXT_PANEL_STATE_LISTENER_LIST");
       this.s = this.t8("DETAIL_ATTACH_LISTENERS");
       this.t = this.r8("SLIDE_PLAY_SMALL_WINDOW_PROGRESS");
       this.u = this.r8("SLIDE_PLAY_HIDE_COMMENT_DIALOG");
       this.v = this.q8(QPhoto.class);
       this.w = this.r8("DETAIL_FRAGMENT");
       this.x = this.x8("NASA_COMMENT_TAB_SUPPLIER_REF");
       return;
    }
}
