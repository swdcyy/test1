package com.yxcorp.gifshow.prettify.beauty.v;
import o0c.b;
import g9c.a;
import hka.h;
import java.util.HashSet;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.List;
import h16.n;
import p0c.a;
import h16.k;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import java.util.Objects;
import java.util.Map;
import h16.l;
import q0c.q1;
import n1c.a;
import q0c.t1;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import java.util.Collection;
import ekd.q;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.util.Set;
import java.util.Iterator;
import java.lang.Float;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Number;
import q0c.s1;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.prettify.beauty.v$b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import w46.b;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import q0c.x1;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyTagInfo;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import lnc.e0;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n1c.e;
import n1c.n;
import jd.c;
import android.content.res.Resources;
import lnc.a1;
import android.content.Context;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.graphics.Typeface;
import q0c.r1;
import android.view.View$OnClickListener;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import n1c.i;
import bld.b;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.prettify.beauty.v$a;

public class v extends a implements b	// class@001123
{
    public BeautifyConfig g;
    public BeautifyConfig h;
    public BeautifyConfig i;
    public h j;
    public int k;
    public final Set l;
    public a m;
    public a n;
    public int o;
    public v$b p;
    public boolean q;

    public void v(h p0){
       super();
       this.l = new HashSet();
       this.o = -2;
       this.p = null;
       this.q = false;
       this.j = p0;
    }
    public boolean D(int p0){
       k obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ov, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if (p0 == (this.Q0().size() - i)) {
          return false;
       }else if(p0 < 0){
          return false;
       }else if(this.q != null){
          obj = this.m.o().f();
          p0 = this.N0(p0).getItemId();
          Objects.requireNonNull(obj);
          k ok = k.class;
          if (PatchProxy.isSupport(ok)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, ok, "3");
             if (obj1 != patchProxyRe) {
                boolean b = obj1.booleanValue();
             label_0079 :
                return b;
             }
          }
          l ol = obj.b.get(Integer.valueOf(p0));
          if (ol == null || ol.f != p0) {
             i = 0;
          }
          p0 = i;
          goto label_0079 ;
       }else {
          return false;
       }
    }
    public final void X0(BeautyFilterItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "8")) {
          return;
       }
       this.k = p0.getItemId();
       q1 oq1 = new q1();
       oq1.a = this.Z0(this.o);
       oq1.b = p0;
       this.j.b(oq1);
       return;
    }
    public a Y0(){
       return this.n;
    }
    public BeautyFilterItem Z0(int p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ov, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return y.y(this.Q0(), new t1(p0)).orNull();
    }
    public BeautyFilterItem a1(){
       Object obj = PatchProxy.apply(null, this, v.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Z0(this.k);
    }
    public boolean b1(){
       Object obj = PatchProxy.apply(null, this, v.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(this.l) ^ 0x01);
    }
    public final void d1(BeautifyConfig p0,BeautifyConfig p1){
       boolean b1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "12")) {
          return;
       }
       this.l.clear();
       boolean b = this.m.f();
       Iterator iterator = this.Q0().iterator();
       while (iterator.hasNext()) {
          BeautyFilterItem uBeautyFilte = iterator.next();
          float uIFilterValu = uBeautyFilte.getUIFilterValue(p0);
          float f = (b)? 0: uBeautyFilte.getUIFilterValue(p1);
          if (PatchProxy.isSupport(v.class)) {
             Object obj = PatchProxy.applyTwoRefs(Float.valueOf(uIFilterValu), Float.valueOf(f), this, v.class, "17");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else {
             label_0055 :
                uIFilterValu = uIFilterValu - f;
                b1 = (Math.abs(uIFilterValu) - 0.01f < 0)? true: false;
             }
          }else {
             goto label_0055 ;
          }
          if (!b1) {
             this.l.add(Integer.valueOf(uBeautyFilte.mId));
          }
       }
       return;
    }
    public void e1(BeautyFilterItem p0){
       int i;
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "6")) {
          return;
       }
       if (p0 != null && this.h != null) {
          if (this.k == p0.getItemId()) {
             if (this.j != null) {
                q1 oq1 = new q1();
                oq1.a = this.Z0(this.o);
                oq1.b = p0;
                this.j.a(oq1);
             }
             return;
          }else if(p0.getItemId() == -1){
             if (this.m.n()) {
                ov = this.i;
                if (ov != null) {
                   this.h.copyFilterValue(ov);
                   this.d1(this.h, this.g);
                label_0061 :
                   this.k0();
                   this.X0(p0);
                }
             }
             this.h.copyFilterValue(this.g);
             this.l.clear();
             goto label_0061 ;
          }else if(p0.getItemId() == -2){
             this.o = p0.getItemId();
             ov = this.h;
             ov.mUseQuickBeauty = false;
             ov.copyFilterValue(new BeautifyConfig());
             this.d1(this.h, this.g);
             this.k0();
             this.X0(p0);
          }else {
             v tk = this.k;
             if (PatchProxy.isSupport(ov)) {
                Object obj = PatchProxy.applyOneRefs(Integer.valueOf(tk), this, ov, "7");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                label_00ba :
                   if (i != -1) {
                      this.m0(i, Boolean.FALSE);
                   }
                   this.m0(this.P0(p0), Boolean.FALSE);
                   this.X0(p0);
                }
             }
             i = y.o(this.Q0(), new s1(tk));
             goto label_00ba ;
          }
       }
       return;
    }
    public void f1(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("BeautyItemAdapter", "updateItem, isInitValue: "+p0, objArray);
       if (!p0 && !this.l.contains(Integer.valueOf(this.k))) {
          this.l.add(Integer.valueOf(this.k));
          this.k0();
       }else if(p0 && this.l.contains(Integer.valueOf(this.k))){
          this.l.remove(Integer.valueOf(this.k));
          this.k0();
       }
       v tp = this.p;
       if (tp != null) {
          tp.a(this.b1());
       }
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       View view6;
       View view7;
       View view8;
       View view9;
       int b;
       BeautyFilterItem mItemNameSty;
       Object[] objArray;
       Object obj = this;
       Object[] obj1 = p0;
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, ov, "3")) {
          return;
       }
       int i = obj.N0(p1);
       int i1 = 0;
       if (i == null) {
          obj1 = new Object[i1];
          a.D().t("BeautyItemAdapter", "onBindViewHolder", obj1);
          return;
       }else {
          View view = obj1.itemView.findViewById(R.id.beauty_filter_area);
          View view1 = obj1.itemView.findViewById(0x7f0a130c);
          View view2 = obj1.itemView.findViewById(0x7f0a2d10);
          View view3 = obj1.itemView.findViewById(0x7f0a0c01);
          View view4 = obj1.itemView.findViewById(0x7f0a31c9);
          View view5 = obj1.itemView.findViewById(R.id.select_indicator_new_ui);
          x1 c = x1.c;
          int i2 = obj.m.d();
          Objects.requireNonNull(c);
          BeautyFilterItem obj2 = null;
          if (PatchProxy.isSupport(x1.class)) {
             i1 = i2;
             view6 = view5;
             view7 = view;
             view = view4;
             view8 = view3;
             if (!PatchProxy.applyVoidThreeRefs(view4, i, Integer.valueOf(i2), c, x1.class, "1")) {
             label_00b2 :
                a.p(i, "item");
                if (view != null) {
                   if (c.c(i, i1)) {
                      view.setTagText(c.b(i, i1));
                      mItemNameSty = i.mBeautifyTagInfo;
                      BeautifyTagInfo mBackgroundC = (mItemNameSty != null)? mItemNameSty.mBackgroundColor: null;
                      view.setTagBgColor(mBackgroundC);
                      view.q();
                   }else {
                      view.p();
                   }
                }
             }
          }else {
             i1 = i2;
             view6 = view5;
             view8 = view3;
             view7 = view;
             view = view4;
             goto label_00b2 ;
          }
          v n = obj.n;
          RecyclerView$ViewHolder itemView = obj1.itemView;
          Objects.requireNonNull(n);
          if (!PatchProxy.applyVoidTwoRefs(itemView, i, n, a.class, "6") && itemView != null) {
             if (n.f(i)) {
                itemView.setAlpha(0x3f000000);
             }else {
                itemView.setAlpha(0x3f800000);
             }
          }
          if (!PatchProxy.applyVoidTwoRefs(view1, i, obj, ov, "20")) {
             if (!q.f(i.mIconCdnUrls)) {
                view1.getHierarchy().u(t$b.a);
                view1.O(Lists.e(e0.a(i.mIconCdnUrls, i.mIconUrl)), null);
             }else if(!TextUtils.x(i.mIconUrl)){
                view1.getHierarchy().u(t$b.a);
                view1.L(i.mIconUrl);
             }else {
                view1.getHierarchy().u(t$b.h);
                obj2 = i.mIconResId;
                if (obj2 != null) {
                   view1.z(obj2, -1, -1, n.d(), null);
                }else if(!TextUtils.x(i.mIconResKey)){
                   try{
                      int identifier = a1.m().getIdentifier(i.mIconResKey, "drawable", a1.c().getPackageName());
                      if (identifier) {
                         i.mIconResId = identifier;
                         Object[] objArray1 = new Object[0];
                         a.D().w("BeautyItemAdapter", "bind icon res key", objArray1);
                         view1.z(identifier, -1, -1, n.d(), null);
                      }
                   }catch(java.lang.Exception e0){
                      PostUtils.D("BeautyItemAdapter", "parse res key failed", e0);
                   }
                }
             }
          }
          i1 = 0;
       label_01bb :
          String str = PatchProxy.applyOneRefs(i, obj, ov, "19");
          if (str != PatchProxyResult.class) {
          }else {
             mItemNameSty = i.mNameId;
             if (mItemNameSty != null) {
                str = a1.p(mItemNameSty);
             }else if(!TextUtils.x(i.mNameResKey)){
                b = a1.m().getIdentifier(i.mNameResKey, "string", a1.c().getPackageName());
                if (b) {
                   i.mNameId = b;
                   str = a1.p(b);
                }
             }
             if (!TextUtils.x(i.mName)) {
                mItemNameSty = i.mName;
             }else {
                str = "";
             }
          }
          view2.setText(str);
          i2 = 1;
          if (i.getItemId() == obj.k) {
             view9 = view7;
             b = true;
          }else {
             view9 = view7;
             b = false;
          }
          view9.setSelected(b);
          view2.setSelected(b);
          view9 = view6;
          if (view9 != null) {
             view9.setSelected(b);
          }
          if (!obj.m.j()) {
             view2.setTypeface(null, b);
          }
          if (i.getItemId() == -1 || !obj.l.contains(Integer.valueOf(i.getItemId()))) {
             i2 = 0;
          }
          if (obj.n.f(i)) {
             i2 = 0;
          }
          if (!i2) {
             i1 = 4;
          }
          view8.setVisibility(i1);
          obj1.itemView.setOnClickListener(new r1(obj, i, view));
          if (obj.m.j()) {
             mItemNameSty = i.mItemNameStyle;
             if (!PatchProxy.applyVoidTwoRefs(view2, mItemNameSty, obj, ov, "21")) {
                view2.setTextColor(i.d(mItemNameSty));
                b uob = new b();
                uob.v(i.c(mItemNameSty));
                uob.g(i.a());
                view2.setBackground(uob.a());
             }
          }
          return;
       }
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       Context obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ov, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = p0.getContext();
       Object obj1 = PatchProxy.apply(null, this, ov, "16");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): this.m.d;
       return new v$a(this, a.d(obj, i, p0, false));
    }
}
