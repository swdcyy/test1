package com.kuaishou.gifshow.kuaishan.ui.preview.c;
import u79.a;
import androidx.fragment.app.Fragment;
import crd.a;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSFeedPreviewViewBinder;
import u79.o;
import java.util.Iterator;
import java.util.List;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$b;
import java.util.Objects;
import r90.r;
import java.lang.StringBuilder;
import java.util.ArrayList;
import r90.r$a;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.System;
import k2b.e0;
import t90.j;
import androidx.fragment.app.FragmentActivity;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.yxcorp.gifshow.log.model.CommonParams;
import android.view.View;
import k2b.u1;
import com.kuaishou.gifshow.kuaishan.ui.preview.b;
import w46.b;
import com.kuaishou.gifshow.kuaishan.model.UITemplatePreviewItem;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import lnc.da;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.utils.e;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import java.lang.Throwable;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import r90.t;
import lnc.i1;
import java.lang.Number;
import com.kwai.library.widget.viewpager.VerticalViewPager$e;
import h3.a;

public class c extends a	// class@001aec
{
    public int f;
    public long g;
    public int h;
    public final Fragment i;
    public t j;
    public b k;
    public r l;
    public KSLaunchParams m;
    public final a n;
    public static boolean o;

    public void c(Fragment p0){
       super();
       this.f = -1;
       this.g = -1;
       this.h = 0;
       this.n = new a();
       this.i = p0;
       c.o = false;
    }
    public AbsPreviewItemViewBinder A(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new KSFeedPreviewViewBinder(this.i, 1);
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       o oo = this.C();
       if (oo != null && oo.isPlaying()) {
          this.L(false);
       }
       if (oo != null) {
          oo.n();
       }
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       o oo = this.C();
       boolean b = (oo != null && !oo.isPlaying())? true: false;
       this.L(b);
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().c();
       }
       return;
    }
    public void I(int p0){
       r or;
       int b;
       j oj;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       int i2;
       int i3;
       Object obj1;
       Object[] obj2;
       int i5;
       r or1;
       Object obj3;
       r or2;
       long l = this;
       int i = p0;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), l, uoc, "5")) {
          return;
       }
       super.I(p0);
       String str = "KSPreviewAdapter";
       int i1 = 0;
       if (!l.i.isResumed()) {
          Object[] objArray = new Object[i1];
          e.D().A(str, "setCurrentSelect: fragment not resumed", objArray);
          return;
       }else if(i < 0 || i >= l.d.size()){
          Object[] objArray1 = new Object[i1];
          e.D().t(str, "setCurrentSelect: invalid position or mItemList. position = "+i+", mLastPosition = "+l.f+", mItemList.size = "+l.d.size(), objArray1);
          return;
       }else if(i != l.f){
          c$b uob = l.d.get(i);
          c l1 = l.l;
          if (l1 != null) {
             Objects.requireNonNull(l1);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             or = r.class;
             if (!PatchProxy.isSupport(or) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), l1, or, "2")) {
                Object[] objArray3 = new Object[i1];
                e.D().w(l1.b, "onItemSelected: position = "+i, objArray3);
                if (i != l1.d) {
                   int i4 = l1.c.size();
                   if (i >= 0 && i4 > i) {
                      Object obj = l1.c.get(i);
                      String str1 = "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.ui.preview.TemplatePreviewAdapter.IjkPlayerPreviewItem";
                      Objects.requireNonNull(obj, str1);
                      if (PatchProxy.isSupport(or)) {
                         obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), l1, or, "7");
                         if (obj1 != patchProxyRe) {
                         label_00c9 :
                            obj2 = obj1;
                         label_00ce :
                            if (obj2 != null) {
                               r f = l1.f;
                               i3 = i + 1;
                               Objects.requireNonNull(f);
                               if (PatchProxy.isSupport(r$a.class)) {
                                  i5 = i3;
                                  or1 = f;
                                  obj3 = obj2;
                                  if (!PatchProxy.applyVoidThreeRefs(obj, obj2, Integer.valueOf(i3), f, r$a.class, "1")) {
                                  }
                               }else {
                                  i5 = i3;
                                  or1 = f;
                                  obj3 = obj2;
                               }
                            }
                         label_0138 :
                            int i6 = l1.c.size();
                            r d = l1.d;
                            if (d >= null && i6 > d) {
                               obj3 = l1.c.get(d);
                               Objects.requireNonNull(obj3, str1);
                               Object obj4 = PatchProxy.apply(null, l1, or, "8");
                               if (obj4 != patchProxyRe) {
                                  b = true;
                               }else {
                                  b = 1;
                                  if ((l1.d + b) < l1.c.size()) {
                                     obj4 = l1.c.get((l1.d + b));
                                     Objects.requireNonNull(obj4, str1);
                                     obj = obj4;
                                  }else {
                                     oj = null;
                                  }
                                  obj4 = obj;
                               }
                               if (i < l1.d) {
                                  obj3.H(i1);
                                  if (obj4 != null) {
                                     obj4.H(b);
                                  }
                               }else {
                                  obj3.H(b);
                               }
                            }
                         }
                      }
                      int i7 = i + 1;
                      if (i7 < l1.c.size()) {
                         obj1 = l1.c.get(i7);
                         Objects.requireNonNull(obj1, str1);
                         goto label_00c9 ;
                      }else {
                         obj2 = null;
                         goto label_00ce ;
                      }
                   }
                }
             label_018b :
                l1.d = i;
             }
          }
          c uoc1 = null;
          if (l.g - uoc1 > 0) {
             uoc1 = System.currentTimeMillis() - l.g;
          }
          c uoc2 = uoc1;
          l1 = l.f;
          if (l1 >= null && l1 < l.d.size()) {
             c$b uob1 = l.d.get(l.f);
             j.i(l.i, uob1.S, uob1.T, uob1.U, uob1.V, l.f, uoc2);
          }
          l1 = l.f;
          if (l1 >= null) {
             b = (i < l1)? true: false;
             if (l.i.getActivity() instanceof e0) {
                e0 activity = l.i.getActivity();
                c$b s = uob.S;
                c$b t = uob.T;
                c$b u = uob.U;
                uob = uob.V;
                oj = j.class;
                if (PatchProxy.isSupport(oj)) {
                   Object[] objArray2 = new Object[]{activity,Boolean.valueOf(b),s,t,u,uob,Integer.valueOf(p0)};
                   if (!PatchProxy.applyVoid(objArray2, null, oj, "4")) {
                   }
                }else {
                   i3 = 1;
                }
             }
          }
       }
    label_0298 :
       this.B();
       l.g = System.currentTimeMillis();
       l.f = i;
       uoc = l.k;
       if (uoc != null) {
          uoc.f = i;
       }
       return;
    }
    public void J(List p0){
       c i1;
       r or = this;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, or, c.class, str)) {
          return;
       }
       if (p0.isEmpty()) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("KSPreviewAdapter", "addItems: templates size="+p0.size(), objArray);
       if (or.l == null) {
          or.l = new r();
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!q.f(obj.mCoverImageUrls) && (TextUtils.x(obj.mName) || TextUtils.x(obj.mTemplateId))) {
             i1.a("KSPreviewAdapter", "addItems: wrong args "+obj);
          }else {
             double d = obj.mTemplateDuration * 0x408f400000000000;
             long l = (long)d;
             UITemplatePreviewItem uITemplatePr = null;
             String str1 = (l - null > 0)? a1.p(0x7f10186a)+da.b(l): uITemplatePr;
             String str2 = (obj.mDataSource instanceof KSTemplateDetailInfo)? obj.mMediaCount+e.n(obj.mDataSource): "";
             String str3 = str2;
             ColorDrawable uColorDrawab = new ColorDrawable(Color.parseColor("#"+obj.mColor));
             float f = (float)obj.mWidth / (float)obj.mHeight;
             a d1 = or.d;
             i1 = or.i;
             c uoc = i1;
             FragmentActivity activity = i1.getActivity();
             c$b uob = new c$b(or.m, or.j, or.l, obj, d1.size(), str3, str1, uColorDrawab, f, uoc, activity, or.n);
             d1.add(uITemplatePr);
          }
       }
       c l1 = or.l;
       a d2 = or.d;
       Objects.requireNonNull(l1);
       if (!PatchProxy.applyVoidOneRefs(d2, l1, r.class, str)) {
          a.p(d2, "itemList");
          Object[] objArray1 = new Object[i];
          e.D().w(l1.b, "updateItemList:", objArray1);
          l1.c.clear();
          l1.c.addAll(d2);
       }
       return;
    }
    public void K(){
       c.o = true;
    }
    public final void L(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "9")) {
          return;
       }
       o oo = this.C();
       if (oo != null) {
          Object[] objArray = new Object[0];
          e.D().w("KSPreviewAdapter", "pauseCurrentPlayWithoutShowPlayBtn\(\) index="+oo.getIndex(), objArray);
          oo.i();
          oo.w(p0, 0);
       }
       return;
    }
    public int k(Object p0){
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.h;
       if (obj > null) {
          this.h = obj - 1;
          return -2;
       }else if(p0 instanceof VerticalViewPager$e){
          p0 = p0.a;
       }else {
       }
       return this.d.indexOf(p0);
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       this.h = this.j();
       super.q();
       return;
    }
}
