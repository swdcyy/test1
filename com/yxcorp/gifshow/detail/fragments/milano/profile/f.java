package com.yxcorp.gifshow.detail.fragments.milano.profile.f;
import qvb.q;
import g9c.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import me5.a$a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$j;
import java.util.ArrayList;
import java.lang.Boolean;
import java.lang.Throwable;
import qvb.p;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.social.profile.model.ProfileDraftsFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.detail.fragments.milano.profile.f$a;
import java.lang.Integer;
import android.graphics.drawable.ColorDrawable;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.content.res.Resources;
import android.view.View;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import le5.f;
import android.widget.ImageView;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.entity.DynamicEffectMarker;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.detail.fragments.milano.profile.e;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView$b;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView;
import java.util.Collection;
import ekd.q;
import jp.a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import ub.b;
import wb5.h;
import kp.r1;
import z0a.k;
import android.view.View$OnClickListener;
import android.widget.TextView;
import tkd.b;
import tkd.d;
import nl9.w;
import com.kuaishou.android.model.mix.w;
import yw6.g;
import qvb.i;
import androidx.recyclerview.widget.RecyclerView;
import qvb.j;
import java.util.Objects;
import fx6.b;
import yw6.h;
import yw6.c;
import gx6.b;
import com.kwai.library.slide.base.pagelist.DetailProfileFeedBidirectionalPageList;
import com.kwai.library.slide.base.pagelist.DetailProfileFeedBidirectionalPageList$Orientation;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup;
import i2b.a;

public class f extends a implements q	// class@00154b
{
    public i g;
    public g h;
    public final SlidePlayViewModel i;
    public final Boolean j;
    public View$OnClickListener k;
    public QPhoto l;
    public View m;
    public QPhoto n;
    public QPhoto o;
    public boolean p;
    public final boolean q;
    public final List r;
    public final a$a s;
    public final MilanoProfileSidePresenter$j t;

    public void f(SlidePlayViewModel p0,boolean p1,a$a p2,boolean p3,MilanoProfileSidePresenter$j p4){
       super();
       this.r = new ArrayList();
       this.i = p0;
       this.j = Boolean.valueOf(p1);
       this.s = p2;
       this.q = p3;
       this.t = p4;
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void W0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "6")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             if (!qPhoto.mEntity instanceof ProfileDraftsFeed) {
                uArrayList.add(qPhoto);
             }
          }
       }
       if (uArrayList.size() > 0 && (uArrayList.get(0).isLiveStream() && this.q == null)) {
          this.o = uArrayList.remove(0);
       }
       super.W0(uArrayList);
       this.p = false;
       uArrayList.clear();
       return;
    }
    public List X0(){
       return null;
    }
    public QPhoto Y0(){
       return this.l;
    }
    public int Z0(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.Q0().indexOf(p0);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean a1(){
       return this.p;
    }
    public void b1(f$a p0,int p1,List p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, f.class, "3")) {
          return;
       }
       p0.j = this.j.booleanValue();
       f$a uoa = f$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), p2, p0, uoa, "1")) {
          f$a k = p0.k;
          boolean i = 0x7f061ed1;
          if (k.p != null) {
             p0.a.setPlaceHolderImage(new ColorDrawable(p0.itemView.getResources().getColor(i)));
             p0.c.setSelected(false);
             if (f.o()) {
                p0.c.setBackgroundResource(R.drawable.arg_RES_7f0820fb);
             }
          }else {
             p0.i = k.N0(p1);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, p0, uoa, "6")) {
                if (!p0.i.isLiveStream()) {
                   p0.e.setVisibility(8);
                   p0.f.setVisibility(8);
                   p0.g.setVisibility(8);
                }else {
                   LiveStreamFeed mDynamicEffe = p0.i.getEntity().mDynamicEffectMarker;
                   if (mDynamicEffe == null || TextUtils.x(mDynamicEffe.mIcon)) {
                      p0.d();
                   }else if(mDynamicEffe.mIsBlocked != null){
                      p0.e.setVisibility(8);
                      p0.f.setVisibility(8);
                      p0.g.setVisibility(8);
                      p0.c(p0.b(false), p0.a());
                   }else {
                      p0.e.setVisibility(false);
                      p0.f.setVisibility(8);
                      p0.g.setVisibility(false);
                      p0.g.p0(mDynamicEffe.mIcon, new e(p0));
                   }
                }
             }
             if (q.f(p2)) {
                h.d(p0.a, p0.i.mEntity, a.e, new d(p0));
             }
             boolean b = p0.i.equals(p0.k.l);
             if (f.o()) {
                p0.a.setPlaceHolderImage(new ColorDrawable(p0.itemView.getResources().getColor(i)));
                p0.c.setBackgroundResource(R.drawable.arg_RES_7f0820fe);
             }
             p0.c.setSelected(b);
             boolean b1 = true;
             if (b) {
                QPhoto mEntity = p0.k.l.mEntity;
                Object obj = PatchProxy.applyOneRefs(mEntity, p0, uoa, "2");
                if (obj != PatchProxyResult.class) {
                   i = obj.booleanValue();
                }else if(!r1.D3(mEntity) && (r1.M2(mEntity) || r1.v3(mEntity))){
                   i = true;
                }else {
                   i = false;
                }
                if (i) {
                label_0165 :
                   f$a d = p0.d;
                   int i1 = (b1)? 0: 8;
                   d.setVisibility(i1);
                   if (b) {
                      p0.d.setSelected(p0.i.equals(p0.k.n));
                   }
                   p0.a.setOnClickListener(new k(p0, b1));
                   f$a b2 = p0.b;
                   if (b2 != null) {
                      b2.setVisibility(8);
                      String str = d.a(-918415405).HW(p0.i);
                      if (!TextUtils.x(str)) {
                         if (!PatchProxy.applyVoidOneRefs(str, p0, uoa, "10")) {
                            p0.b.setVisibility(false);
                            p0.b.setText(str);
                         }
                      }else if(!PatchProxy.applyVoid(objArray, p0, uoa, "11") && p0.j != null){
                         if (w.F0(p0.i.mEntity) && p0.i.isPublic()) {
                            p0.b.setVisibility(false);
                            p0.b.setText(R.string.arg_RES_7f104d63);
                         }else {
                            p0.b.setVisibility(8);
                         }
                      }
                   }
                }
             }
             b1 = false;
             goto label_0165 ;
          }
       }
    label_01ed :
       return;
    }
    public void d1(g p0){
    }
    public void e1(i p0){
    }
    public f f1(View$OnClickListener p0){
       this.k = p0;
       return this;
    }
    public void g1(QPhoto p0){
       this.n = p0;
    }
    public f h1(QPhoto p0){
       this.l = p0;
       return this;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "8")) {
          return;
       }
       f tg = this.g;
       if (tg != null) {
          tg.h(this);
       }
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "2")) {
          this.b1(p0, p1, this.r);
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       boolean b;
       int i;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uof, "4")) {
          return;
       }
       List list = this.X0();
       f ti = this.i;
       Objects.requireNonNull(ti);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, ti, SlidePlayViewModel.class, "107");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          b uob = ti.Q0("kwai_data_source_service");
          if (uob != null) {
             obj = PatchProxy.apply(null, uob, b.class, "13");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                g og = uob.a.g();
                if (og != null && (og.I() && og.k.E == DetailProfileFeedBidirectionalPageList$Orientation.PREV)) {
                   b = true;
                }
             }
          }
          b = false;
       }
       if (b) {
          this.W0(list);
          i = this.getItemCount() - this.getItemCount();
          if (i > 0) {
             this.r0(0, i);
          }
       }else if(!p1){
          i = this.getItemCount();
          this.W0(list);
          int itemCount = this.getItemCount();
          if (p0 || !i) {
             this.k0();
          }else if(itemCount <= i){
             this.k0();
          }else {
             this.r0(i, (itemCount - i));
          }
       }
       return;
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.b1(p0, p1, p2);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       f$a uoa;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "1");
          if (uoa != PatchProxyResult.class) {
          label_0026 :
             return uoa;
          }
       }
       uoa = new f$a(this, a.k(p0, 0x7f0d1531, false));
       goto label_0026 ;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "9")) {
          return;
       }
       f tg = this.g;
       if (tg != null) {
          tg.f(this);
       }
       return;
    }
}
