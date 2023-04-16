package com.yxcorp.gifshow.prettify.beauty.r;
import o0c.b;
import g9c.a;
import p0c.a;
import com.yxcorp.gifshow.prettify.beauty.r$b;
import n1c.l;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.prettify.beauty.r$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.beauty.r$d;
import com.kwai.feature.post.api.widget.PrettifyLoadingView;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.Collection;
import ekd.q;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import lnc.e0;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import jd.c;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n1c.e;
import n1c.n;
import android.content.res.Resources;
import lnc.a1;
import android.content.Context;
import xyb.a;
import q87.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.widget.ProgressBar;
import android.view.View;
import w46.b;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import q0c.c1;
import java.lang.Runnable;
import ekd.k1;
import android.widget.TextView;
import q0c.d1;
import android.view.View$OnClickListener;
import q0c.m1;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import s0c.a;
import crd.b;
import com.yxcorp.gifshow.prettify.beauty.o;
import java.lang.Iterable;
import ok.o;
import qk.y;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import t16.b;
import java.lang.System;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.lang.Enum;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper;
import t16.a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$DownloadID;
import com.yxcorp.gifshow.prettify.beauty.r$a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$b;
import q0c.b1;
import java.util.Iterator;
import boc.b;
import com.yxcorp.gifshow.util.resource.p;
import java.lang.Number;
import com.kwai.feature.post.api.componet.prettify.beauty.RecoBeautifyConfig;
import q0c.f1;
import q0c.e1;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.prettify.beauty.p;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyTagInfo;
import lnc.p3;
import skd.a$a;
import skd.a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import n0c.c;
import brd.t;
import t45.d;
import brd.z;
import q0c.h1;
import q0c.i1;
import erd.g;
import android.view.ViewGroup;
import i2b.a;
import androidx.recyclerview.widget.RecyclerView;

public class r extends a implements b	// class@00111c
{
    public r$b g;
    public BeautifyConfig h;
    public int i;
    public boolean j;
    public a k;
    public l l;
    public boolean m;
    public b n;
    public b o;
    public int p;

    public void r(a p0,r$b p1,l p2){
       super();
       this.j = false;
       this.m = false;
       this.p = -1;
       this.g = p1;
       this.k = p0;
       this.l = p2;
    }
    public void B0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "26")) {
       }else if(p0 instanceof r$d && (this.l1() || (this.k1() && p0.getAdapterPosition() != -1))){
          p0.h.c();
       }
       return;
    }
    public boolean D(int p0){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, or, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if (p0 < (this.Q0().size() - i)) {
          BeautifyConfig mId = this.Q0().get((p0 + i)).mId;
          if (mId != 1000 && mId != 999) {
             i = false;
          }
          return i;
       }else {
          return false;
       }
    }
    public void D0(RecyclerView$ViewHolder p0){
       PatchProxy.applyVoidOneRefs(p0, this, r.class, "25");
    }
    public int P0(Object p0){
       return this.f1(p0);
    }
    public void X0(KwaiImageView p0,BeautifyConfig p1){
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "7")) {
          return;
       }
       if (this.k.i() && !q.f(p1.mIconCDNUrls)) {
          p0.getHierarchy().u(t$b.a);
          p0.R(Lists.e(e0.a(p1.mIconCDNUrls, p1.mIconUrl)), -1, -1, null, null);
          return;
       }else {
          int i = 1;
          int i1 = 0;
          if (this.k.i() && !TextUtils.x(p1.mIconUrl)) {
             p0.getHierarchy().u(t$b.a);
             String[] stringArray = new String[i];
             stringArray[i1] = p1.mIconUrl;
             p0.R(Lists.e(stringArray), -1, -1, null, null);
             return;
          }else {
             p0.getHierarchy().u(t$b.h);
             BeautifyConfig mIconResId = p1.mIconResId;
             if (mIconResId != null) {
                p0.z(mIconResId, -1, -1, n.d(), null);
                return;
             }else {
                String str = "BeautyCategoryAdapter";
                if (!TextUtils.x(p1.mIconResKey)) {
                   try{
                      int identifier = a1.m().getIdentifier(p1.mIconResKey, "drawable", a1.c().getPackageName());
                      if (identifier) {
                         Object[] objArray1 = new Object[i1];
                         a.D().w(str, "bind icon res key", objArray1);
                         p1.mIconResId = identifier;
                         p0.z(identifier, -1, -1, n.d(), null);
                         return;
                      }
                   }catch(java.lang.Exception e0){
                      PostUtils.D(str, "parse icon res key failed", e0);
                   }
                }
             }
          }
       }
    }
    public void Y0(r$c p0,int p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, or, "3")) {
          return;
       }
       r$c a = p0.a;
       r$c b = p0.b;
       r$c c = p0.c;
       r$c d = p0.d;
       r$c e = p0.e;
       r$c f = p0.f;
       if (c != null) {
          c.setVisibility(8);
       }
       this.l.d(p0.itemView);
       if (d != null) {
          d.setVisibility(8);
       }
       BeautifyConfig uBeautifyCon = this.N0(p1);
       if (uBeautifyCon == null) {
          Object[] objArray = new Object[0];
          a.D().t("BeautyCategoryAdapter", "onBindViewHolderError", objArray);
          return;
       }else {
          r th = this.h;
          boolean b1 = true;
          boolean b2 = (th != null && uBeautifyCon.mId == th.mId)? true: false;
          if (b2) {
             this.i = p1;
          }
          if (uBeautifyCon.mId == -1) {
             this.X0(a, uBeautifyCon);
             b.setSelected(b2);
          }else if(b2){
             b.setSelected(b1);
             a.y(R.drawable.beauty_icon_adjust_white_xxl_normal_new_ui, -1, -1);
             List list = this.i1();
             if (c != null && !q.f(list)) {
                c.setProgressArcColor(c.getContext().getResources().getColor(R.color.arg_RES_7f061fda));
                c.setProgressArcBackgroundColor(c.getContext().getResources().getColor(R.color.arg_RES_7f06009a));
                a.y(0, -1, -1);
                this.b1(p0, list);
             }
             if (this.j != null && this.d1().isEmpty()) {
                this.j = false;
                k1.r(new c1(this), 0);
             }
          }else {
             b.setSelected(0);
             this.X0(a, uBeautifyCon);
          }
          int i = 0x7f103e10;
          Resources resources = 0x7f060620;
          if (e != null && this.k.z()) {
             String str = this.h1(uBeautifyCon);
             if (!TextUtils.x(str)) {
                e.setText(str);
                e.setVisibility(0);
                if (b2) {
                   e.setTextColor(e.getResources().getColor(R.color.arg_RES_7f061ff3));
                }else {
                   e.setTextColor(e.getResources().getColor(resources));
                }
             }else {
                e.setVisibility(8);
             }
             if (b2 && (this.k.y() && uBeautifyCon.mId != -1)) {
                e.setText(a1.p(i));
             }
          }else if(this.k.y() && e != null){
             if (b2 && uBeautifyCon.mId != -1) {
                e.setVisibility(0);
                e.setTextColor(e.getResources().getColor(resources));
                e.setText(a1.p(i));
             }else {
                e.setVisibility(8);
             }
          }
          p0.itemView.setOnClickListener(new d1(this, p0, p1, uBeautifyCon));
          if (f != null && !m1.b.c(f, uBeautifyCon)) {
             if (this.k.q() != null && !TextUtils.x(this.k.q().a(Integer.valueOf(uBeautifyCon.mId)))) {
                f.setTagText(this.k.q().a(Integer.valueOf(uBeautifyCon.mId)));
                f.q();
             }else {
                f.p();
             }
          }
          return;
       }
    }
    public void Z0(r$d p0,int p1){
    }
    public void a1(boolean p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, or, "22")) {
          return;
       }
       if (this.l1()) {
          this.n.dispose();
          or = this.g;
          if (or != null) {
             or.v();
          }
          int i = y.o(this.e, o.b);
          this.n = null;
          if (!p0 && i >= 0) {
             if (i == this.p) {
                this.p = -1;
             }
             this.l0(i);
          }
       }
    label_0040 :
       return;
    }
    public void b1(RecyclerView$ViewHolder p0,List p1){
       r$a obj = this;
       r$a obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, r.class, "8")) {
          return;
       }
       View view = obj1.itemView.findViewById(0x7f0a0c1b);
       View view1 = obj1.itemView.findViewById(R.id.refresh);
       view.setVisibility(0);
       int max = view.getMax();
       b uob = new b(n.b(obj.k.d()), "inner_resource", "faceRetouchAggregationResourceType");
       uob.e = System.currentTimeMillis();
       uob.h = DownloadTask$DownloadTaskType.IMMEDIATE.name();
       ResourceDownloadProgressHelper$DownloadID bEAUTY_DOWNL = ResourceDownloadProgressHelper$DownloadID.BEAUTY_DOWNLOAD_ID;
       obj1 = v6;
       obj = v6;
       obj1 = new r$a(this, view, max, uob, obj1.itemView.findViewById(0x7f0a0679), view1);
       ResourceDownloadProgressHelper.d().a(new a(n.b(obj.k.d()), "inner_resource"), bEAUTY_DOWNL.name(), obj2, obj);
       float f = ResourceDownloadProgressHelper.d().c(bEAUTY_DOWNL.name());
       if (f - 0xbf800000) {
          view.setProgress((int)(f * (float)max));
       }
       view1.setOnClickListener(new b1(this));
       return;
    }
    public List d1(){
       ArrayList obj = PatchProxy.apply(null, this, r.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       r tk = this.k;
       if (tk != null) {
          Iterator iterator = tk.G.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (!p.h(uob)) {
                obj.add(uob);
             }
          }
       }
       return obj;
    }
    public BeautifyConfig e1(int p0){
       a obj;
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, or, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.e;
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             BeautifyConfig uBeautifyCon = iterator.next();
             if (uBeautifyCon.mId == p0) {
                return uBeautifyCon;
             }
          }
       }
       return null;
    }
    public int f0(int p0){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, or, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.N0(p0) instanceof RecoBeautifyConfig) {
          return 2;
       }else {
          return 1;
       }
    }
    public int f1(BeautifyConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return y.o(this.Q0(), new f1(p0));
    }
    public int g1(int p0){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, or, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return y.o(this.Q0(), new e1(p0));
    }
    public String h1(BeautifyConfig p0){
       String obj = PatchProxy.applyOneRefs(p0, this, r.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.k.e() != null) {
          obj = this.k.e().a(Integer.valueOf(p0.mId));
          int i = 0;
          if (p0.mId == -1 && TextUtils.x(obj)) {
             obj = this.k.e().a(Integer.valueOf(i));
          }
          if (!TextUtils.x(obj)) {
             Object[] objArray = new Object[i];
             a.D().w("BeautyCategoryAdapter", "uase category name : "+obj, objArray);
             return obj;
          }
       }
       BeautifyConfig mNameResId = p0.mNameResId;
       if (mNameResId != null) {
          return a1.p(mNameResId);
       }else if(!TextUtils.x(p0.mNameResKey)){
          int identifier = a1.m().getIdentifier(p0.mNameResKey, "string", a1.c().getPackageName());
          if (identifier) {
             p0.mNameResId = identifier;
             return a1.p(identifier);
          }
       }
       if (!TextUtils.x(p0.mName)) {
          return p0.mName;
       }else {
          return "";
       }
    }
    public List i1(){
       ArrayList obj = PatchProxy.apply(null, this, r.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList(this.d1());
       r tk = this.k;
       if (tk != null) {
          Iterator iterator = tk.k().iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (!p.h(uob)) {
                obj.add(uob);
             }
          }
       }
       return obj;
    }
    public void j1(r$c p0,int p1,BeautifyConfig p2){
       r tg;
       int b1;
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, r.class, "5")) {
          return;
       }
       BeautifyConfig mId = p2.mId;
       if (mId == 1000 || mId == 999) {
          tg = this.g;
          if (tg != null) {
             tg.h0(p2);
          }
          return;
       }else if(this.l.b()){
          this.l.e();
          return;
       }else {
          r$c c = p0.c;
          if (c != null && !c.getVisibility()) {
             return;
          }
          boolean b = false;
          this.a1(b);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, or, "23") && this.k1()) {
             this.o.dispose();
             b1 = y.o(this.e, p.b);
             this.o = objArray;
             if (b1 >= 0) {
                if (b1 == this.p) {
                   this.p = -1;
                }
                this.l0(b1);
             }
          }
          p0 = p0.f;
          b1 = true;
          if (p0 != null) {
             m1 b2 = m1.b;
             Objects.requireNonNull(b2);
             if (!PatchProxy.applyVoidTwoRefs(p0, p2, b2, m1.class, "2")) {
                a.p(p0, "tagView");
                a.p(p2, "beautifyConfig");
                if (b2.a(p2)) {
                   BeautifyConfig mBeautifyTag = p2.mBeautifyTagInfo;
                   a.m(mBeautifyTag);
                   BeautifyTagInfo mText = mBeautifyTag.mText;
                   a.o(mText, "beautifyConfig.mBeautifyTagInfo!!.mText");
                   String str = b2.b(p2.mId, mText);
                   Object[] objArray1 = new Object[b];
                   p3.D().w("BeautyConfigTagHelper", "hideBeautyConfigTag: "+str, objArray1);
                   a$a uoa = m1.a.a();
                   uoa.putBoolean(str, b1);
                   g.a(uoa);
                   p0.p();
                }
             }
          }
          if (!this.d1().isEmpty()) {
             this.j = b1;
             tg = this.h;
             if (tg != null) {
                this.l0(this.f1(tg));
             }
             this.o1(p2);
             this.l0(p1);
          }else {
             tg = this.h;
             if (tg == null || tg.mId != p2.mId) {
                if (tg != null) {
                   this.l0(this.f1(tg));
                }
                this.o1(p2);
                this.g.h0(this.h);
                this.l0(p1);
             }else {
                this.g.i0(tg);
             }
          }
          return;
       }
    }
    public boolean k1(){
       r obj = PatchProxy.apply(null, this, r.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       boolean b = (obj != null && !obj.isDisposed())? true: false;
       return b;
    }
    public boolean l1(){
       r obj = PatchProxy.apply(null, this, r.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.n;
       boolean b = (obj != null && !obj.isDisposed())? true: false;
       return b;
    }
    public void m1(r$d p0,RecoBeautifyConfig p1){
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "19")) {
          return;
       }
       r tk = this.k;
       int i = 0;
       if (tk == null || tk.b() == null) {
          objArray = new Object[i];
          a.D().t("BeautyCategoryAdapter", "requestRecoListError", objArray);
          return;
       }else if(this.l1()){
          objArray = new Object[i];
          a.D().w("BeautyCategoryAdapter", "already requesting", objArray);
          return;
       }else {
          this.p = p0.getAdapterPosition();
          p0.h.c();
          tk = this.g;
          if (tk != null) {
             tk.t(this.k.b().a());
          }
          Object[] objArray1 = new Object[i];
          a.D().w("BeautyCategoryAdapter", "start requestRecoList", objArray1);
          this.n = this.k.b().b().observeOn(d.a).subscribe(new h1(this, p1, p0), new i1(this, p0));
          return;
       }
    }
    public void n1(int p0,RecoBeautifyConfig p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, r.class, "17")) {
          return;
       }
       r ti = this.i;
       this.i = p0;
       this.h = p1;
       if (p3) {
          p1.getNextConfig();
       }
       if (ti != this.i) {
          this.l0(ti);
       }
       this.l0(this.i);
       if (this.i1().isEmpty()) {
          r tg = this.g;
          if (tg != null) {
             tg.j0(p1, p2, p3);
          }
       }else {
          this.j = true;
       }
       return;
    }
    public void o1(BeautifyConfig p0){
       BeautifyConfig uBeautifyCon;
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "11")) {
          return;
       }
       int i = 0;
       if (this.l.b() && p0.mId != -1) {
          Object[] objArray = new Object[i];
          a.D().w("BeautyCategoryAdapter", "setSelectedBeautifyConfig forbidden", objArray);
          return;
       }else if(p0.mIsRecoConfig != null){
          uBeautifyCon = this.e1(-12);
          if (uBeautifyCon instanceof RecoBeautifyConfig && uBeautifyCon.getRecoSize() > 0) {
             this.h = uBeautifyCon;
          }
       }else {
          this.h = this.e1(p0.mId);
       }
       try{
          this.i = this.f1(this.h);
          Object[] objArray1 = new Object[i];
          a.D().w("BeautyCategoryAdapter", "setSelectedBeautifyConfig "+p0.mId+"---"+this.h, objArray1);
          r th = this.h;
          if (th != null) {
             th.copyFilterValue(p0);
          }else {
             p0 = p0.mId;
             StringBuilder str = new StringBuilder(p0);
             Iterator iterator = this.Q0().iterator();
             while (iterator.hasNext()) {
                uBeautifyCon = iterator.next().mId;
             }
          }
       }catch(java.lang.Exception e7){
          Object[] objArray2 = new Object[i];
          a.D().t("BeautyCategoryAdapter", "setSelectedBeautifyConfig "+e7, objArray2);
       }
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       r or = r.class;
       if (!PatchProxy.isSupport(or) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, or, "4")) {
          if (p0 instanceof r$d) {
             this.Z0(p0, p1);
          }else {
             this.Y0(p0, p1);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       r$d uod;
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          uod = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, or, "2");
          if (uod != PatchProxyResult.class) {
          label_0035 :
             return uod;
          }
       }
       View view = a.d(p0.getContext(), this.k.c, p0, false);
       r$d uod1 = (p1 == 2)? new r$d(view): new r$c(view);
       uod = uod1;
       goto label_0035 ;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "24")) {
          return;
       }
       this.a1(true);
       return;
    }
}
