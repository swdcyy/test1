package com.yxcorp.gifshow.prettify.makeup.b0;
import com.yxcorp.gifshow.prettify.makeup.a;
import lnc.a1;
import p0c.f;
import n1c.l;
import hka.h;
import com.yxcorp.gifshow.prettify.makeup.b0$c;
import n1c.d;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import g9c.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.RecoSuiteGroup;
import android.view.ViewGroup;
import com.yxcorp.gifshow.prettify.makeup.a$b;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.prettify.makeup.b0$d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.Typeface;
import java.lang.CharSequence;
import java.lang.Boolean;
import crd.b;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import com.kwai.feature.post.api.widget.PrettifyLoadingView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import com.yxcorp.gifshow.prettify.makeup.b0$b;
import t16.a;
import l16.b;
import com.yxcorp.gifshow.prettify.makeup.i;
import com.yxcorp.gifshow.prettify.makeup.a0;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import xyb.a;
import q87.c;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.prettify.makeup.b0$a;
import java.util.concurrent.TimeUnit;
import brd.a0;
import t45.d;
import brd.z;
import f1c.s1;
import erd.b;
import com.yxcorp.gifshow.prettify.makeup.d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.yxcorp.gifshow.prettify.makeup.m;
import f1c.r1;
import com.yxcorp.gifshow.prettify.makeup.m$b;
import com.yxcorp.gifshow.prettify.makeup.c0;
import com.kwai.feature.post.api.widget.PrettifyLoadingView$a;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import ub.b;
import com.yxcorp.gifshow.prettify.makeup.d0;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import f1c.v1;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.prettify.makeup.z;
import android.view.View$OnClickListener;
import f1c.w1;
import f1c.p1;
import n1c.i;
import bld.b;
import bld.c;
import androidx.recyclerview.widget.RecyclerView;

public class b0 extends a	// class@00116a
{
    public int j;
    public int k;
    public final b0$c l;
    public l m;
    public b n;
    public b o;
    public final d p;
    public static final int q;
    public static final int r;
    public static final int s;

    static {
       b0.q = a1.d(0x7f07030d);
       b0.r = a1.d(0x7f070329);
       b0.s = a1.d(0x7f07025d);
    }
    public void b0(f p0,l p1,h p2,b0$c p3){
       super(p0, p2);
       this.j = -1;
       this.o = null;
       this.p = new d();
       this.m = p1;
       this.l = p3;
    }
    public int P0(Object p0){
       return this.j1(p0);
    }
    public int Z0(){
       Object obj = PatchProxy.apply(null, this, b0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.c;
    }
    public int f0(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob0, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       MakeupSuite makeupSuite = this.N0(p0);
       if (makeupSuite != null) {
          if (makeupSuite instanceof RecoSuiteGroup) {
             return -2;
          }else if(makeupSuite.isDivider()){
             return -1;
          }
       }
       return 0;
    }
    public a$b f1(ViewGroup p0,int p1){
       Context obj;
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob0, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == -1) {
          obj = p0.getContext();
          a ti = this.i;
          int i = (ti != null && ti.b())? 0x7f0d11a0: 0x7f0d119f;
          return new a$b(a.d(obj, i, p0, false));
       }else if(p1 == -2){
          return new b0$d(a.d(p0.getContext(), this.Z0(), p0, false));
       }else {
          return super.f1(p0, p1);
       }
    }
    public final void g1(a$b p0,int p1){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob0, "5")) {
          return;
       }
       this.m.d(p0.itemView);
       boolean b = (p1 == this.k)? true: false;
       p0.d.setSelected(b);
       p0.b.setSelected(b);
       a ti = this.i;
       if (ti == null || !ti.b()) {
          p0.d.setTypeface(null, b);
       }
       if (b && (this.i.r != null && !this.N0(p1).isEmpty())) {
          p0.d.setText(a1.p(R.string.arg_RES_7f103e10));
       }
    label_005d :
       p0 = p0.c;
       if (p0 != null) {
          p0.setSelected(b);
       }
       return;
    }
    public void h1(boolean p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob0, "29")) {
          return;
       }
       if (this.q1()) {
          this.n.dispose();
          uob0 = this.l;
          if (uob0 != null) {
             uob0.v();
          }
          if (!p0 && this.k1() != null) {
             if (this.j == this.k1().getPosition()) {
                this.j = -1;
             }
             this.l0(this.k1().getPosition());
          }
          this.n = null;
       }
       b0 to = this.o;
       if (to != null && !to.isDisposed()) {
          this.o.dispose();
          this.o = null;
       }
       return;
    }
    public final void i1(b0$d p0,MakeupItem p1,boolean p2,List p3){
       if (PatchProxy.isSupport(b0.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, b0.class, "14")) {
          return;
       }
       if (!this.a1()) {
          return;
       }
       b0$d i = p0.i;
       if (i != null) {
          i.c();
          this.e1(p0.g, "", "", "", true);
       }
       i.f(new a("record", "inner_resource"), p1, p2, p3, new b0$b(this, p1, p0));
       return;
    }
    public int j1(MakeupSuite p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b0.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (p0.isReco())? 0: super.P0(p0);
       return i;
    }
    public RecoSuiteGroup k1(){
       MakeupSuite obj = PatchProxy.apply(null, this, b0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = y.y(this.e, a0.b).orNull();
       if (obj instanceof RecoSuiteGroup) {
          return obj;
       }
       return null;
    }
    public final MakeupSuite l1(RecoSuiteGroup p0,int p1){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob0, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       MakeupSuite recoSuite = (this.k != p1 && p0.getRecoSuite() != null)? p0.getRecoSuite(): p0.getNextRecoSuite();
       return recoSuite;
    }
    public MakeupSuite m1(){
       MakeupSuite obj = PatchProxy.apply(null, this, b0.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N0(this.k);
       if (obj == null) {
          return MakeupSuite.getEmpty();
       }
       if (obj instanceof RecoSuiteGroup) {
          obj = (obj.getRecoSuite() != null)? obj.getRecoSuite(): MakeupSuite.getEmpty();
       }
    label_0034 :
       return obj;
    }
    public int n1(){
       return this.k;
    }
    public final void o1(a$b p0,MakeupSuite p1,int p2){
       if (PatchProxy.isSupport(b0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b0.class, "7")) {
          return;
       }
       if (this.m.b()) {
          this.m.e();
          return;
       }else {
          b0 to = this.o;
          if (to != null && !to.isDisposed()) {
             Object[] objArray = new Object[0];
             a.D().w("MakeupSuitesAdapter", "mock loading", objArray);
             return;
          }else if(p1.isEmpty()){
             this.t1(p2);
          }else {
             boolean b = i.o(p1);
             List list = i.k(p1);
             if (q.f(list) && b) {
                this.t1(p2);
             }else {
                this.j = p2;
                this.X0(p0, p1, (b ^ 0x01), true, list, new b0$a(this, p2));
             }
          }
          return;
       }
    }
    public final void p1(b0$d p0,int p1,RecoSuiteGroup p2,boolean p3){
       b0$d i;
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, b0.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MakeupSuitesAdapter", "onRepoFilterClick", objArray);
       if (this.m.b()) {
          this.m.e();
          return;
       }else {
          MakeupSuite makeupSuite = this.l1(p2, p1);
          if (makeupSuite == null) {
             return;
          }
          boolean b = i.o(makeupSuite);
          List list = i.k(makeupSuite);
          if (q.f(list) && b) {
             if (p3) {
                if (!PatchProxy.isSupport(uob0) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b0.class, "10")) {
                   Object[] objArray1 = new Object[0];
                   a.D().w("MakeupSuitesAdapter", "mockDownloadRecoFilter start", objArray1);
                   i = p0.i;
                   if (i != null) {
                      i.c();
                   }
                   a$b g = p0.g;
                   if (g != null) {
                      g.p();
                   }
                   this.o = a0.Y(200, TimeUnit.MILLISECONDS).G(d.a).P(new s1(this, p0, p1, p2));
                }
                return;
             }else {
                p0 = p0.i;
                if (p0 != null) {
                   p0.e(0);
                }
                this.s1(p2, makeupSuite, p1);
             }
          }else {
             this.j = p1;
             this.i1(p0, makeupSuite, (b ^ 0x01), list);
          }
          b0 tl = this.l;
          if (tl != null) {
             tl.A2(p2, makeupSuite);
          }
          return;
       }
    }
    public final boolean q1(){
       b0 obj = PatchProxy.apply(null, this, b0.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.n;
       boolean b = (obj != null && !obj.isDisposed())? true: false;
       return b;
    }
    public void r1(boolean p0,boolean p1,List p2){
       if (PatchProxy.isSupport(b0.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, b0.class, "21")) {
          return;
       }
       int i = -1;
       this.j = i;
       if (!p1) {
          i = 0;
       }
       this.k = i;
       if (!this.m.b() && p0) {
          m d = d.a().b(this.h).d;
          r1 or1 = null;
          if (d != null) {
             or1 = y.y(p2, new r1(d)).orNull();
          }
          if (or1 != null) {
             if (i.o(or1) && i.p(or1)) {
                this.k = or1.getPosition();
             }else {
                this.j = or1.getPosition();
             }
          }
       }
    label_006a :
       this.W0(p2);
       this.k0();
       return;
    }
    public void s1(RecoSuiteGroup p0,MakeupItem p1,int p2){
       if (PatchProxy.isSupport(b0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b0.class, "19")) {
          return;
       }
       if (!this.a1() || (p0 != null && p1 != null)) {
          if (this.m.b()) {
             return;
          }else {
             b0 tl = this.l;
             if (tl != null && !tl.j5()) {
                return;
             }else {
                p0.setRecoIndex(p1.getPosition());
                if (p0.getRecoSuite() == null) {
                   Object[] objArray = new Object[0];
                   a.D().s("MakeupSuitesAdapter", "selectRecoItem reco suite is null", objArray);
                   return;
                }else {
                   b0 tk = this.k;
                   this.k = p2;
                   this.j = -1;
                   Boolean fALSE = Boolean.FALSE;
                   this.m0(tk, fALSE);
                   this.m0(this.k, fALSE);
                   a tg = this.g;
                   if (tg != null) {
                      tg.b(p0.getRecoSuite());
                   }
                }
             }
          }
       }
       return;
    }
    public void t1(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob0, "18")) {
          return;
       }
       MakeupSuite makeupSuite = this.N0(p0);
       if (this.m.b() && (makeupSuite != null && !makeupSuite.isEmpty())) {
          return;
       }
       if (!this.a1()) {
          return;
       }
       b0 tk = this.k;
       int i = (p0 == tk)? 1: 0;
       if (!i) {
          this.k = p0;
          this.j = -1;
          Boolean fALSE = Boolean.FALSE;
          this.m0(tk, fALSE);
          this.m0(this.k, fALSE);
       }
       a tg = this.g;
       if (tg != null) {
          if (i) {
             tg.a(makeupSuite);
          }else {
             tg.b(makeupSuite);
          }
       }
       return;
    }
    public void u1(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob0, "17")) {
          return;
       }
       MakeupSuite makeupSuite = this.N0(p0);
       b0 tk = this.k;
       int i = (p0 == tk)? 1: 0;
       if (!i) {
          this.k = p0;
          this.j = -1;
          this.l0(tk);
          this.l0(this.k);
       }
       a tg = this.g;
       if (tg != null) {
          tg.a(makeupSuite);
       }
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       b0$d i2;
       MakeupSuite recoSuite;
       Bitmap uBitmap;
       ImageRequest[] imageRequest;
       d0 uBitmap1;
       a i2;
       v1 i21;
       int s;
       String this;
       Object obj = this;
       int i = p1;
       String str = p0;
       b0 uob0 = b0.class;
       if (!PatchProxy.isSupport(uob0) || !PatchProxy.applyVoidTwoRefs(str, Integer.valueOf(p1), obj, uob0, "4")) {
          Object obj1 = obj.N0(i);
          if (obj1 != null && !obj1.isDivider()) {
             b0 l = obj.l;
             if (l != null) {
                l.x7(str.itemView, i, obj1);
             }
             ImageView imageView = null;
             int i1 = 8;
             if (str instanceof b0$d) {
                if (PatchProxy.isSupport(uob0)) {
                   if (!PatchProxy.applyVoidThreeRefs(str, Integer.valueOf(p1), obj1, this, b0.class, "8")) {
                   }
                }else {
                   int i3 = 0;
                }
             }else if(PatchProxy.isSupport(uob0) && PatchProxy.applyVoidThreeRefs(str, Integer.valueOf(p1), obj1, this, b0.class, "6")){
                str.a = obj1.mId;
                a$b b = str.g;
                String bottomMaskTe = obj1.getBottomMaskText();
                this = obj1.getBottomMaskColor();
                String bottomMastSe = obj1.getBottomMastSecondColor();
                boolean b1 = (i == obj.k)? true: false;
                this.e1(b, bottomMaskTe, this, bottomMastSe, b1);
                if (obj1.isEmpty()) {
                   str.e.setVisibility(i1);
                   str.d.setText(R.string.arg_RES_7f1039a6);
                   str.b.setVisibility(0);
                   str.b.setForegroundDrawable(imageView);
                   str.b.setImageResource(R.drawable.prettify_common_icon_none);
                   str.b.setBackgroundResource(R.drawable.arg_RES_7f081d2a);
                }else {
                   a$b h = str.e;
                   if (!i.o(obj1) || !i.p(obj1)) {
                      i1 = 0;
                   }
                   h.setVisibility(i1);
                   str.b.setVisibility(0);
                   str.d.setText(obj1.mName);
                   h = str.b;
                   h.setForegroundDrawable(h.getContext().getResources().getDrawable(R.drawable.arg_RES_7f0816db));
                   obj.d1(str.b, obj1.mImages);
                }
                if (obj.j == i) {
                   k1.r(new w1(obj, str, obj1, i), 0);
                }
                str.itemView.setOnClickListener(new p1(obj, str, obj1, i));
                obj.g1(str, i);
                obj.v1(obj1.mItemNameStyle, str.d, str.b, str.h);
             }
          }
       }
    label_0275 :
       return;
    }
    public final void v1(ItemNameStyle p0,TextView p1,KwaiImageView p2,ImageView p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b0.class, "23")) {
          return;
       }
       if (!this.i.b()) {
          return;
       }
       if (p0 == null) {
          p0 = new ItemNameStyle();
       }
       p1.setTextColor(i.d(p0));
       b uob = new b();
       uob.v(i.c(p0));
       uob.g(i.a());
       p1.setBackground(uob.a());
       if (p2.isSelected()) {
          if (p0.a != null) {
             p2.setColorFilter(a1.a(R.color.arg_RES_7f0600a7));
          }
          if (p3 != null) {
             p3.setVisibility(0);
             p3.setImageResource(R.drawable.arg_RES_7f081b07);
          }
       }else if(p3 != null){
          p3.setVisibility(8);
       }
       p2.clearColorFilter();
       p2.setForegroundDrawable(null);
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.f1(p0, p1);
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "26")) {
          return;
       }
       this.h1(true);
       return;
    }
}
