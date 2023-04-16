package com.yxcorp.gifshow.prettify.beauty.BeautyConfigView;
import hka.h;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xyb.a;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.prettify.beauty.v;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import q0c.o1;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar$a;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar;
import q0c.n1;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import q0c.p1;
import q0c.q1;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import q0c.z1;
import w46.b;
import n1c.a;
import java.lang.Math;
import java.lang.Boolean;
import android.view.View;
import java.lang.Runnable;
import g9c.a;
import com.yxcorp.gifshow.prettify.beauty.BeautifyFilterFragment;
import java.lang.Number;
import java.lang.Integer;
import n1c.j;
import java.util.List;
import java.util.Collection;
import ekd.q;
import m0c.m;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.prettify.beauty.v$b;
import p0c.a;
import java.util.Objects;
import l0c.c;
import com.kwai.video.westeros.models.BeautifyVersion;

public class BeautyConfigView extends PrettifyConfigView implements h	// class@0010ee
{
    public BeautifyConfig o;
    public BeautifyConfig p;
    public v q;
    public z1 r;
    public a s;
    public boolean t;
    public static final int u;

    public void BeautyConfigView(Context p0){
       super(p0, null);
    }
    public void BeautyConfigView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BeautyConfigView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       boolean b = false;
       this.t = b;
       if (PatchProxy.applyVoid(null, this, BeautyConfigView.class, "3")) {
       }else {
          Object[] objArray = new Object[b];
          a.D().w("BeautyConfigView", "initialize", objArray);
          v ov = PatchProxy.apply(null, this, BeautyConfigView.class, "4");
          if (ov != PatchProxyResult.class) {
          }else {
             ov = new v(this);
          }
          this.q = ov;
          this.c.setAdapter(ov);
          this.b.setOnSeekBarChangeListener(new o1(this));
          this.d.setOnClickListener(new n1(this));
          this.setOnPrettifyDoubleSeekBarChangeListener(new p1(this));
       }
       return;
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyConfigView.class, "16")) {
       }else {
          BeautyConfigView tr = this.r;
          if (tr != null) {
             tr.c(p0.b, this.p);
          }
       }
       return;
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyConfigView.class, "10")) {
       }else {
          q1 b = p0.b;
          int i = 0;
          if (b == null) {
             Object[] objArray = new Object[i];
             a.D().t("BeautyConfigView", "onItemSelectError", objArray);
          }else {
             BeautyConfigView tq = this.q;
             if (tq == null || (tq.Y0() == null || !this.q.Y0().f(b))) {
                int i1 = -1;
                if (b.getItemId() == i1 || b.getItemId() == -2) {
                   this.g();
                   this.e(i, null);
                }else if(!b.getItemId() && (this.v() && (this.h != null && this.i != null))){
                   this.h(true);
                   p0 = this.i;
                   tq = this.o;
                   if (tq != null) {
                      i1 = this.t(b, tq, p0.getMaxProgress());
                   }
                   p0.setDefaultIndicatorProgress(i1);
                   int i2 = Math.max(Math.min(b.getUIProgressValue(this.p, this.i.getMaxProgress()), this.i.getMaxProgress()), (- this.i.getMaxProgress()));
                   this.i.m(i2, String.valueOf(Math.abs(i2)));
                   if (!PatchProxy.isSupport(PrettifyConfigView.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, this, PrettifyConfigView.class, "18")) {
                      i2 = this.h;
                      if (i2 != null && (this.i != null && (!i2.getVisibility() || !this.i.getVisibility()))) {
                         i2 = this.i;
                         if (i2 != null) {
                            i2.a(true);
                         }
                      }else {
                         this.p(this.i, i);
                         this.p(this.h, i);
                      }
                   }
                }else if(b.getItemId() != 33 && (b.getItemId() != 3 && (b.getItemId() != 37 && (b.getItemId() != 40 && (b.getItemId() != 17 && (b.getItemId() != 36 && (b.getItemId() == 35 || b.getItemId() == 32))))))){
                   this.e(true, null);
                   this.o();
                   this.b.setupSeekBarMode(i);
                   this.setupSeekBar(p0);
                }else {
                   this.e(true, null);
                   this.o();
                   this.b.setupSeekBarMode(true);
                   this.setupSeekBar(p0);
                }
                this.m(this.q.P0(b));
                p0 = this.r;
                if (p0 != null) {
                   p0.d(b, this.p);
                }
             }
          }
       }
       return;
    }
    public int getConfigViewLayoutId(){
       return BeautifyFilterFragment.y;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, BeautyConfigView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.q.getItemCount();
    }
    public final float q(BeautyFilterItem p0,int p1,int p2){
       Object obj;
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(BeautyConfigView.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, BeautyConfigView.class, "20");
          if (obj != patchProxyRe) {
             return obj.floatValue();
          }
       }
       if (this.t != null) {
          if (PatchProxy.isSupport(j.class)) {
             obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, j.class, "3");
             if (obj != patchProxyRe) {
                f = obj.floatValue();
             }else if(j.a(p0)){
                f = (((float)p1 * 0x3f333333) * 100.00f) / (float)p2;
             }else {
                f = p0.getFilterValue(p1, p2);
             }
          }else {
             goto label_004c ;
          }
          return f;
       }else {
          return p0.getFilterValue(p1, p2);
       }
    }
    public BeautyFilterItem r(int p0){
       if (PatchProxy.isSupport(BeautyConfigView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, BeautyConfigView.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.q.N0(p0);
    }
    public int s(int p0){
       List obj;
       if (PatchProxy.isSupport(BeautyConfigView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, BeautyConfigView.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.q.Q0();
       if (!q.f(obj)) {
          int i = 0;
          while (i < obj.size()) {
             if (obj.get(i).getItemId() == p0) {
                return i;
             }
             i = i + 1;
          }
       }
       return -1;
    }
    public void setBeautyConfigViewListener(z1 p0){
       this.r = p0;
    }
    public void setItemDecoration(int p0){
       if (PatchProxy.isSupport(BeautyConfigView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BeautyConfigView.class, "2")) {
          return;
       }
       m om = new m(0, a1.d(0x7f070295), p0, this.getItemDividerWidth(), this.getItemDividerHeight(), 1);
       this.c.addItemDecoration(v8);
       return;
    }
    public void setItemIntensityChangedListener(v$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyConfigView.class, "18")) {
          return;
       }
       this.q.p = p0;
       return;
    }
    public final void setupSeekBar(q1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyConfigView.class, "21")) {
          return;
       }
       q1 b = p0.b;
       int i = 0;
       if (b == null) {
          Object[] objArray = new Object[i];
          a.D().t("BeautyConfigView", "setupSeekBarError", objArray);
          return;
       }else {
          PrettifyConfigView tb = this.b;
          q1 obj = PatchProxy.applyOneRefs(p0, this, BeautyConfigView.class, "22");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             obj = p0.b;
             p0 = p0.a;
             BeautyConfigView ts = this.s;
             if (ts == null || (!ts.n() || (!this.s.f() || (p0 != null && p0.getItemId() != -2)))) {
                BeautyConfigView to = this.o;
                i = (to == null || obj == null)? -1: this.t(obj, to, this.b.getMaxProgress());
             }
          }
          tb.setDefaultIndicatorProgress(i);
          PrettifyConfigView tb1 = this.b;
          tb1.setProgress(this.t(b, this.p, tb1.getMaxProgress()));
          this.x();
          return;
       }
    }
    public final int t(BeautyFilterItem p0,BeautifyConfig p1,int p2){
       Object obj;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(BeautyConfigView.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, BeautyConfigView.class, "19");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       int i = 0;
       if (p1 == null) {
          return i;
       }else if(p1.mId == 31){
          this.t = true;
          if (PatchProxy.isSupport(j.class)) {
             obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, j.class, "2");
             if (obj != patchProxyRe) {
                i1 = obj.intValue();
             }
          }
          if (j.a(p0)) {
             i1 = Math.round((((float)p2 * BeautyFilterItem.getFilterValue(p1, p0)) / 70.00f));
          }else {
             i1 = p0.getUIProgressValue(p1, p2);
          }
       }else {
          this.t = i;
          i1 = p0.getUIProgressValue(p1, p2);
       }
       return Math.max(Math.min(i1, p2), (- p2));
    }
    public boolean u(){
       Object obj = PatchProxy.apply(null, this, BeautyConfigView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.q.b1();
    }
    public boolean v(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       BeautyConfigView obj = PatchProxy.apply(objArray, this, BeautyConfigView.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.q;
       boolean b = true;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, v.class, "18");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             BeautyFilterItem uBeautyFilte = obj.Z0(0);
             if (uBeautyFilte != null && (uBeautyFilte.isDoubleSeekEnable() && obj.m.h())) {
                uBeautyFilte = (obj.m.c().a == BeautifyVersion.kBeautifyVersion3)? 1: 0;
                if (!uBeautyFilte) {
                   b1 = true;
                }
             }
          label_0055 :
             b1 = false;
          }
          if (b1) {
             BeautyConfigView ts = this.s;
             if (ts != null && ts.h()) {
             label_0064 :
                return b;
             }
          }
       }
    label_0063 :
       b = false;
       goto label_0064 ;
    }
    public void w(int p0){
       if (PatchProxy.isSupport(BeautyConfigView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BeautyConfigView.class, "11")) {
          return;
       }
       BeautyConfigView tq = this.q;
       Objects.requireNonNull(tq);
       v ov = v.class;
       if (!PatchProxy.isSupport(ov) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tq, ov, "4")) {
          tq.e1(tq.Z0(p0));
       }
       return;
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, BeautyConfigView.class, "9")) {
          return;
       }
       int progress = this.b.getProgress();
       this.b.m(progress, String.valueOf(progress));
       return;
    }
}
