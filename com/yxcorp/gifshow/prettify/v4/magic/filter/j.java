package com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import g9c.a;
import lnc.a1;
import java.util.List;
import java.util.HashMap;
import n1c.d;
import java.lang.Object;
import o1c.w0;
import erd.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import o1c.g;
import ekd.q$b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$d;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$c;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.ImageView;
import p0c.c;
import android.graphics.Typeface;
import android.view.View;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import java.lang.Boolean;
import crd.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$d;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import android.widget.ProgressBar;
import java.lang.Float;
import java.util.Map;
import com.yxcorp.gifshow.prettify.v4.magic.filter.b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$a;
import t16.a;
import j16.b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$e;
import com.kwai.feature.post.api.widget.PrettifyLoadingView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$b;
import n1c.n;
import java.lang.Number;
import com.facebook.imagepipeline.request.ImageRequest;
import android.text.TextUtils;
import s0d.f;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import s0d.a;
import s0d.e;
import java.util.Objects;
import com.yxcorp.gifshow.prettify.v4.magic.filter.e;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import xyb.a;
import q87.c;
import java.lang.StringBuilder;
import java.util.concurrent.TimeUnit;
import brd.a0;
import t45.d;
import brd.z;
import o1c.h;
import erd.b;
import w46.b;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import o1c.x0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;
import ub.b;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Collection;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import n1c.i;
import bld.b;
import bld.c;
import com.kwai.feature.post.api.componet.prettify.filter.model.RecoFilterGroup;
import com.yxcorp.gifshow.prettify.v4.magic.filter.h;
import com.kwai.feature.post.api.widget.PrettifyLoadingView$a;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import com.yxcorp.gifshow.prettify.v4.magic.filter.i;
import android.widget.FrameLayout;
import o1c.d;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.prettify.v4.magic.filter.d;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import dg.e;
import ekd.f;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.yxcorp.gifshow.prettify.v4.magic.filter.g;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import o1c.c;
import o1c.e;
import android.view.View$OnLongClickListener;
import o1c.b;
import android.view.ViewGroup;
import android.content.Context;
import i2b.a;
import androidx.recyclerview.widget.RecyclerView;

public class j extends a	// class@0011c5
{
    public final List g;
    public final Map h;
    public j$d i;
    public int j;
    public w0 k;
    public int l;
    public c m;
    public FilterVideoPlugin$FilterEntranceType n;
    public b o;
    public b p;
    public final d q;
    public static final int r;
    public static String s;
    public static final int t;
    public static final int u;

    static {
       j.r = a1.d(0x7f07030d);
       j.s = "FilterAdapter";
       j.t = a1.d(0x7f070329);
       j.u = a1.d(0x7f07025d);
    }
    public void j(List p0){
       super();
       this.h = new HashMap();
       this.j = -1;
       this.l = -1;
       this.p = null;
       this.q = new d();
       this.g = p0;
    }
    public Object N0(int p0){
       return this.g1(p0);
    }
    public void X0(int p0,o p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oj, "21")) {
          return;
       }
       Iterator iterator = this.i.t6(new g(p0)).iterator();
       while (iterator.hasNext()) {
          RecyclerView$ViewHolder viewHolder = iterator.next();
          try{
             p1.apply(viewHolder);
          }catch(java.lang.Exception e0){
             goto label_0024 ;
          }
       }
       return;
    }
    public final void Y0(j$c p0,int p1,FilterConfig p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, j.class, "8")) {
          return;
       }
       p0.d.setText(p2.getDisplayName());
       boolean b = (this.j == p1)? true: false;
       p0.d.setSelected(b);
       p0.a.setSelected(b);
       j tm = this.m;
       if (tm == null || !tm.a()) {
          p0.d.setTypeface(null, b);
       }
       j$c b1 = p0.b;
       if (b1 != null) {
          b1.setSelected(b);
       }
       p0 = p0.c;
       if (p0 != null) {
          this.n1(p0, b, p2);
       }
       return;
    }
    public void Z0(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "41")) {
          return;
       }
       if (this.m1()) {
          this.o.dispose();
          oj = this.i;
          if (oj != null) {
             oj.v();
          }
          this.o = null;
          if (!p0 && this.i1() != null) {
             if (this.i1().e() == this.l) {
                this.l = -1;
             }
             this.l0(this.i1().e());
          }
       }
    label_004c :
       j tp = this.p;
       if (tp != null && !tp.isDisposed()) {
          this.p.dispose();
          this.p = null;
       }
       return;
    }
    public boolean a1(){
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       int i = -1;
       this.j = i;
       this.k = objArray;
       this.l = i;
       this.m0(obj, Boolean.FALSE);
       if (this.i != null) {
          FilterConfig empty = FilterConfig.getEmpty();
          i = empty.getPosition();
          w0 ow0 = new w0(empty);
          this.i.I7(i, ow0, a0.i());
       }
       return true;
    }
    public void b1(j$c p0,FilterConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "20")) {
          return;
       }
       if (!p0.f.getVisibility()) {
          return;
       }
       this.h.put(Integer.valueOf(p0.i), Float.valueOf(0));
       this.X0(p0.i, b.b);
       n.f(this.e1(), p1, new j$a(this, p0));
       return;
    }
    public void d1(j$e p0,FilterConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "23")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       p0.l.c();
       p0.c.p();
       this.h.put(Integer.valueOf(p0.i), Float.valueOf(0));
       n.f(this.e1(), p1, new j$b(this, p1, p0));
       return;
    }
    public final a e1(){
       j obj = PatchProxy.apply(null, this, j.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj == null) {
          return new a();
       }
       return new a(n.b(obj.k), "inner_resource");
    }
    public int f0(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.g1(p0).k()) {
          return 3;
       }else if(this.g1(p0).a().isDivider()){
          return 2;
       }else {
          return 1;
       }
    }
    public final ImageRequest[] f1(String p0){
       f obj = PatchProxy.applyOneRefs(p0, this, j.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       obj = f.x();
       obj.t(p0);
       obj.f(ImageRequest$CacheChoice.SMALL);
       return obj.w();
    }
    public w0 g1(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.g.get(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.size();
    }
    public final FilterConfig h1(w0 p0,int p1){
       FilterConfig uFilterConfi;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oj, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (this.j != p1 && p0.f() != null) {
          uFilterConfi = p0.f();
       }else {
          Objects.requireNonNull(p0);
          Object obj1 = PatchProxy.apply(null, p0, w0.class, "5");
          if (obj1 != patchProxyRe) {
             uFilterConfi = obj1;
          }else {
             obj1 = p0.g + 1;
             w0 f = p0.f;
             if (f != null && f.size() > 0) {
                uFilterConfi = (obj1 < p0.f.size())? p0.f.get(obj1): p0.f.get(0);
             }else {
                uFilterConfi = null;
             }
          }
       }
       return uFilterConfi;
    }
    public w0 i1(){
       Object obj = PatchProxy.apply(null, this, j.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.y(this.g, e.b).orNull();
    }
    public w0 j1(){
       j obj = PatchProxy.apply(null, this, j.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj < null) {
          return null;
       }
       return this.g1(obj);
    }
    public int k1(){
       return this.j;
    }
    public final void l1(j$e p0,int p1,w0 p2,boolean p3){
       FilterConfig this;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, j.class, "13")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(j.s, "onRepoFilterClick", objArray);
       j tp = this.p;
       if (tp != null && !tp.isDisposed()) {
          Object[] objArray1 = new Object[i];
          a.D().w(j.s, "mock loading", objArray1);
          return;
       }else {
          this = this.h1(p2, p1);
          if (this == null) {
             return;
          }
          if (n.l(this)) {
             if (n.m(this)) {
                Object[] objArray2 = new Object[i];
                a.D().s(j.s, "config is Valid, "+this.toString(), objArray2);
                if (p3) {
                   if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, j.class, "14")) {
                      Object[] objArray3 = new Object[i];
                      a.D().w(j.s, "mockDownloadRecoFilter start", objArray3);
                      p0.l.c();
                      p0.c.p();
                      this.p = a0.Y(200, TimeUnit.MILLISECONDS).G(d.a).P(new h(this, p0, p1, p2));
                   }
                   return;
                }else {
                   p0.l.e(i);
                   p2.n(this.getPosition());
                   this.r1(p2, p0.getAdapterPosition(), a0.i());
                }
             }else {
                Object[] objArray4 = new Object[i];
                a.D().t(j.s, "config is not Valid, "+p2.toString(), objArray4);
                i1.c(new RuntimeException("config is not Valid,"+p2.toString()));
                this.l = p1;
                this.d1(p0, this);
             }
          }else {
             this.l = p1;
             this.d1(p0, this);
          }
          List list = p2.g();
          boolean b = (p2.h() >= 0)? true: false;
          if (!PatchProxy.isSupport(x0.class) || !PatchProxy.applyVoidThreeRefs(list, this, Boolean.valueOf(b), null, x0.class, "9")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             String str = "AI_FILTER";
             uElementPack.action2 = str;
             uElementPack.type = 1;
             super();
             if (b) {
                str = "CHANGE";
             }
             this.c0("button_action", str);
             x0.a(this, this);
             x0.b(this, list);
             uElementPack.params = this.toString();
             u1.u(1, uElementPack, null);
          }
          return;
       }
    }
    public final boolean m1(){
       j obj = PatchProxy.apply(null, this, j.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       boolean b = (obj != null && !obj.isDisposed())? true: false;
       return b;
    }
    public void n1(PrettifyTagView p0,boolean p1,FilterConfig p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, j.class, "27")) {
          return;
       }
       if (p2 == null) {
          return;
       }
       p0.setSelected(p1);
       if (!TextUtils.isEmpty(p2.getBottomMaskColor()) && !TextUtils.isEmpty(p2.getBottomMaskText())) {
          p0.q();
          p0.setTagBgColor(p2.getBottomMaskColor());
          p0.setTagBgSecondColor(p2.getBottomMaskSecondColor());
          p0.setTagText(p2.getBottomMaskText());
       }else {
          p0.p();
       }
       return;
    }
    public void o1(KwaiImageView p0,ImageRequest[] p1,Drawable p2,b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, j.class, "26")) {
          return;
       }
       if (p1 != null && p1.length) {
          if (p2 != null) {
             p0.getHierarchy().G(p2, t$b.e);
          }
          d uod = Fresco.newDraweeControllerBuilder();
          uod.y(p0.getController());
          uod.s(p3);
          uod.u(p1);
          p0.setController(uod.e());
       }
       return;
    }
    public void p1(int p0,a0 p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oj, "16")) {
          return;
       }
       w0 ow0 = this.g1(p0);
       if (ow0.k()) {
          this.r1(ow0, p0, p1);
       }else {
          this.q1(this.g1(p0), p1, false);
       }
       return;
    }
    public void q1(w0 p0,a0 p1,boolean p2){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, j.class, "18")) {
          return;
       }
       FilterConfig uFilterConfi = p0.a();
       int i = this.g.indexOf(p0);
       if (i < 0) {
          Object[] objArray = new Object[0];
          a.D().s(j.s, "selectItem position error "+uFilterConfi, objArray);
          return;
       }else {
          uFilterConfi = uFilterConfi.mIntensity;
          w0 ow0 = this.g1(i);
          if (ow0 == null) {
             return;
          }
          if (this.j != i || ow0.a().mIntensity - uFilterConfi) {
             ow0.a().mIntensity = uFilterConfi;
             j ti = this.i;
             if (ti != null) {
                ti.I7(i, ow0, p1);
             }
             if (n.l(ow0.a())) {
                j tj = this.j;
                this.j = i;
                this.k = ow0;
                this.l = -1;
                if (tj >= null) {
                   this.m0(tj, Boolean.FALSE);
                }
                this.m0(this.j, Boolean.FALSE);
             }else if(p2){
                this.l = i;
                this.m0(i, Boolean.FALSE);
             }
          }
          if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, oj, "19")) {
             Object[] objArray1 = new Object[0];
             a.D().w(j.s, "prepareAroundFilter position"+i, objArray1);
             int i1 = i - 1;
             i++;
             if (i1 >= 0) {
                FilterConfig uFilterConfi1 = this.g1(i1).a();
                if (!uFilterConfi1.isDivider()) {
                   n.f(this.e1(), uFilterConfi1, null);
                }
             }
             if (i < this.getItemCount()) {
                FilterConfig uFilterConfi2 = this.g1(i).a();
                if (!uFilterConfi2.isDivider()) {
                   n.f(this.e1(), uFilterConfi2, null);
                }
             }
          }
       label_00f9 :
          return;
       }
    }
    public void r1(w0 p0,int p1,a0 p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, j.class, "17")) {
          return;
       }
       if (p0.f() == null) {
          Object[] objArray = new Object[0];
          a.D().s(j.s, "selectRecoItem reco filter is null", objArray);
          return;
       }else {
          FilterConfig uFilterConfi = p0.f();
          j ti = this.i;
          if (ti != null) {
             ti.I7(p1, new w0(uFilterConfi), p2);
          }
          if (n.l(uFilterConfi)) {
             j tj = this.j;
             this.j = p1;
             this.k = p0;
             this.l = -1;
             if (tj >= null) {
                this.m0(tj, Boolean.FALSE);
             }
             this.m0(this.j, Boolean.FALSE);
          }
          return;
       }
    }
    public void s1(c p0){
       this.m = p0;
    }
    public void t1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          return;
       }
       if (p0.size() == this.g.size()) {
          int i = 0;
          while (i < p0.size() && p0.get(i) == this.g.get(i)) {
             int i1 = p0.size() - 1;
             if (i == i1) {
                return;
             }
             i = i + 1;
          }
       }
       this.g.clear();
       this.g.addAll(p0);
       this.v1();
       this.k0();
       return;
    }
    public final void u1(ItemNameStyle p0,TextView p1,KwaiImageView p2,ImageView p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, j.class, "38")) {
          return;
       }
       j tm = this.m;
       if (tm != null && tm.a()) {
          if (p0 == null) {
             p0 = new ItemNameStyle();
          }
          p1.setTextColor(i.d(p0));
          b uob = new b();
          uob.v(i.c(p0));
          uob.g(i.a());
          p1.setBackground(uob.a());
       }
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       Object[] obj1;
       Object obj2;
       RecoFilterGroup recoFilterGr;
       FilterConfig uFilterConfi;
       Bitmap uBitmap;
       j$c a;
       ImageRequest[] imageRequest;
       i oi;
       int u;
       j$c a1;
       int i2;
       Object obj = this;
       int i = p1;
       boolean b = p0;
       if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidTwoRefs(b, Integer.valueOf(p1), obj, j.class, "7")) {
          w0 ow0 = obj.g1(i);
          if (!ow0.a().isDivider()) {
             ImageView imageView = null;
             if (b instanceof j$e) {
                obj1 = b;
                if (PatchProxy.isSupport(j.class)) {
                   obj2 = obj1;
                   if (!PatchProxy.applyVoidThreeRefs(obj1, Integer.valueOf(p1), ow0, this, j.class, "10")) {
                   }
                }else {
                   obj2 = obj1;
                }
             }else if(PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(b, Integer.valueOf(p1), ow0, this, j.class, "9")){
                FilterConfig uFilterConfi1 = ow0.a();
                if ((ow0.d()).equals(b.j)) {
                   if (ow0.i() && b.k == null) {
                      b.g.setVisibility(0);
                      f.o(b.g, 0, 0x3f800000, 300.00f, 15.00f);
                   }else if(!ow0.i() && b.k != null){
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      uAnimatorSet.setDuration(200);
                      uAnimatorSet.setInterpolator(new LinearInterpolator());
                      uAnimatorSet.play(ObjectAnimator.ofFloat(b.g, View.SCALE_X, new float[2]{0x3f800000,0})).with(ObjectAnimator.ofFloat(b.g, View.SCALE_Y, new float[2]{0x3f800000,0}));
                      uAnimatorSet.addListener(new g(obj, b));
                      uAnimatorSet.start();
                   }else {
                      a1 = b.g;
                      i2 = (ow0.i())? 0: 8;
                      a1.setVisibility(i2);
                   }
                }else {
                   a1 = b.g;
                   i2 = (ow0.i())? 0: 8;
                   a1.setVisibility(i2);
                }
                b.k = ow0.i();
                b.i = uFilterConfi1.mFilterId;
                if (TextUtils.isEmpty(b.j) || !(ow0.d()).equals(b.j)) {
                   a1 = b.a;
                   if (!PatchProxy.applyVoidTwoRefs(a1, uFilterConfi1, obj, j.class, "25")) {
                      obj1 = new Object[0];
                      a.D().w(j.s, " loadImage "+uFilterConfi1.getDisplayName(), obj1);
                      if (!TextUtils.isEmpty(uFilterConfi1.mThumbImageUrl)) {
                         obj.o1(a1, obj.f1(uFilterConfi1.mThumbImageUrl), imageView, imageView);
                      }
                   }
                }
                b.j = ow0.d();
                if (n.l(uFilterConfi1)) {
                   b.e.setVisibility(8);
                   b.f.setVisibility(8);
                }else if(obj.h.containsKey(Integer.valueOf(uFilterConfi1.mFilterId))){
                   b.e.setVisibility(8);
                   b.f.setVisibility(0);
                   b.f.setProgress((int)(obj.h.get(Integer.valueOf(uFilterConfi1.mFilterId)).floatValue() * (float)b.f.getMax()));
                }else {
                   b.e.setVisibility(0);
                   b.f.setVisibility(8);
                   n.d(obj.n);
                }
                if (obj.l == i) {
                   k1.r(new c(obj, b, uFilterConfi1), 0);
                }
                if (obj.m.b()) {
                   b.itemView.setOnLongClickListener(new e(obj, b));
                }
                b.itemView.setOnClickListener(new b(obj, b, uFilterConfi1, i));
                obj.Y0(b, i, uFilterConfi1);
                obj.u1(uFilterConfi1.mItemNameStyle, b.d, b.a, b.h);
             }
             j i1 = obj.i;
             if (i1 != null) {
                i1.w5(b.itemView, i, obj.g1(i));
             }
          }
       }
       return;
    }
    public void v1(){
       if (PatchProxy.applyVoid(null, this, j.class, "34")) {
          return;
       }
       this.j = -1;
       if (this.k == null) {
          return;
       }
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          w0 ow0 = iterator.next();
          if ((ow0.d()).equals(this.k.d())) {
             this.j = ow0.e();
             this.k = ow0;
             break ;
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       j$e uoe;
       int i;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          uoe = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oj, "6");
          if (uoe != PatchProxyResult.class) {
          label_0054 :
             return uoe;
          }
       }
       oj = this.m;
       uoe = (oj != null && oj.a())? 1: 0;
       if (p1 == 2) {
          i = (uoe)? 0x7f0d11a0: 0x7f0d119f;
       }else if(uoe){
          i = 0x7f0d119c;
       }else {
          i = 0x7f0d119b;
       }
       View view = a.d(p0.getContext(), i, p0, false);
       j$e uoe1 = (p1 == 3)? new j$e(view): new j$c(view);
       uoe = uoe1;
       goto label_0054 ;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "37")) {
          return;
       }
       this.Z0(true);
       return;
    }
}
