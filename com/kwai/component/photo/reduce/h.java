package com.kwai.component.photo.reduce.h;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import java.util.List;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yf5.w;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.lang.Number;
import java.lang.Float;
import y8c.g;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import qvb.i;
import android.view.View;
import lnc.d2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import tkd.b;
import tkd.d;
import lv5.c;
import androidx.fragment.app.Fragment;
import lv5.b;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import android.content.res.Resources;
import cw9.c;
import android.view.ViewGroup;
import java.util.HashSet;
import android.content.Context;
import lnc.a1;
import com.yxcorp.utility.n;
import yf5.b$b;
import q87.c;
import o56.c;
import o56.a;
import android.app.Application;

public class h	// class@000aea
{
    public final RecyclerFragment a;

    public void h(RecyclerFragment p0){
       super();
       this.a = p0;
    }
    public boolean a(List p0,BaseFeed p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (y.o(p0, new w(p1)) >= 0)? true: false;
       return b;
    }
    public final int b(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       float f = p0.get(i).floatValue();
       int i1 = 1;
       while (i1 < p0.size()) {
          if (f - p0.get(i1).floatValue() > 0) {
             f = p0.get(i1).floatValue();
             i = i1;
          }
          i1 = i1 + 1;
       }
       return i;
    }
    public List c(){
       Object obj = PatchProxy.apply(null, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.g7().Q0();
    }
    public RecyclerView d(){
       Object obj = PatchProxy.apply(null, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.h0();
    }
    public void e(int p0,Set p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "8")) {
          return;
       }
       g og = this.a.g7();
       og.n1("TRANSLATE_DISTANCE", Integer.valueOf(p0));
       og.n1("ANIMATE_POSITION", p1);
       og.k0();
       return;
    }
    public void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "7")) {
          return;
       }
       this.a.q().l0(p0);
       return;
    }
    public void g(View p0,BaseFeed p1){
       int spanCount;
       int i1;
       List list;
       ArrayList uArrayList1;
       ArrayList uArrayList2;
       int i3;
       int i4;
       Iterator iterator1;
       QPhoto qPhoto;
       int i6;
       int i7;
       int this;
       int height;
       HashSet hashSet;
       float f2;
       int i8;
       QPhoto qPhoto3;
       Object obj = this;
       Object obj1 = p1;
       h oh = h.class;
       if (PatchProxy.applyVoidTwoRefs(p0, obj1, obj, oh, "1")) {
          return;
       }
       float f = 0;
       int i = 0;
       if (d2.j() && d2.k()) {
          RecyclerView$LayoutManager layoutManage = obj.a.h0().getLayoutManager();
          if (layoutManage instanceof StaggeredGridLayoutManager) {
             spanCount = layoutManage.getSpanCount();
          }else {
             i8 = -242212848;
             if (d.a(i8).qr(obj.a)) {
                spanCount = d.a(i8).ye();
             }else {
                i1 = 2;
             label_0054 :
                if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(i1), this, h.class, "3")) {
                   list = this.c();
                   if (obj.a(list, obj1)) {
                      ArrayList uArrayList = new ArrayList();
                      uArrayList1 = new ArrayList();
                      super();
                      for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                         uArrayList.add(new ArrayList());
                         uArrayList1.add(Float.valueOf(f));
                         this.add(Integer.valueOf(i));
                      }
                      uArrayList2 = new ArrayList();
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         Integer obj2 = iterator.next();
                         i3 = obj.b(uArrayList1);
                         uArrayList.get(i3).add(obj2);
                         float f1 = uArrayList1.get(i3).floatValue() + obj2.getCoverAspectRatioPrioritizeAdCover();
                         uArrayList1.set(i3, Float.valueOf(f1));
                         obj2 = null;
                      }
                      for (i4 = 0; i4 < uArrayList1.size(); i4 = i4 + 1) {
                         uArrayList1.set(i4, Float.valueOf(f));
                      }
                      iterator1 = list.iterator();
                      i4 = -1;
                      i3 = -1;
                      while (iterator1.hasNext()) {
                         qPhoto = iterator1.next();
                         int i5 = obj.b(uArrayList1);
                         i = this.get(i5).intValue();
                         if (uArrayList.get(i5).size() <= i) {
                            break ;
                         }else {
                            QPhoto qPhoto2 = uArrayList.get(i5).get(i);
                            i = this.get(i5).intValue() + 1;
                            this.set(i5, Integer.valueOf(i));
                            if (qPhoto2.mEntity != obj1) {
                               uArrayList2.add(qPhoto2);
                               f2 = uArrayList1.get(i5).floatValue() + qPhoto.getCoverAspectRatioPrioritizeAdCover();
                               uArrayList1.set(i5, Float.valueOf(f2));
                            }else {
                               i4 = this.get(i5).intValue();
                               i3 = i5;
                            }
                         }
                      }
                      if (i4 == -1) {
                         i6 = 0;
                         while (i6 < i1) {
                            if (this.get(i6).intValue() < uArrayList.get(i6).size()) {
                               while (this.get(i6).intValue() < uArrayList.get(i6).size()) {
                                  QPhoto qPhoto1 = uArrayList.get(i6).get(this.get(i6).intValue());
                                  i7 = this.get(i6).intValue() + 1;
                                  this.set(i6, Integer.valueOf(i7));
                                  if (qPhoto1.mEntity != obj1) {
                                     uArrayList2.add(qPhoto1);
                                  }else {
                                     i4 = this.get(i6).intValue();
                                     i3 = i6;
                                  }
                               }
                            }
                            i6 = i6 + 1;
                         }
                      }
                      if (i4 >= 0) {
                         i = 0;
                         while (i < i1) {
                            if (this.get(i).intValue() < uArrayList.get(i).size()) {
                               uArrayList2.addAll(uArrayList.get(i).subList(this.get(i).intValue(), uArrayList.get(i).size()));
                            }
                            i = i + 1;
                         }
                         i6 = c.b(p0.getResources(), R.dimen.arg_RES_7f07044a);
                         List list1 = uArrayList.get(i3);
                         spanCount = p0.getTop();
                         this = p0.getWidth();
                         height = obj.a.h0().getHeight();
                         hashSet = new HashSet();
                         for (; i4 < list1.size(); i4 = i4 + 1) {
                            qPhoto = list1.get(i4);
                            if (spanCount > height) {
                               break ;
                            }
                            hashSet.add(Integer.valueOf(uArrayList2.indexOf(qPhoto)));
                            f2 = (float)this * qPhoto.getCoverAspectRatioPrioritizeAdCover();
                            f2 = f2 + (float)i6;
                            f2 = f2 + (float)n.c(a1.c(), 25.00f);
                            float f3 = (float)spanCount + f2;
                            spanCount = (int)f3;
                         }
                         obj.f(uArrayList2);
                         obj.e(p0.getHeight(), hashSet);
                      }
                   }
                }
                return;
             }
          }
          i1 = spanCount;
          goto label_0054 ;
       }else if(PatchProxy.applyVoidThreeRefs(p0, p1, null, this, h.class, "2")){
          Object[] objArray = new Object[0];
          b$b.a.w("PhotoReduceLayoutHelper", "rearrangeLayout", objArray);
          list = this.c();
          if (obj.a(list, obj1)) {
             uArrayList1 = new ArrayList();
             ArrayList uArrayList3 = new ArrayList();
             uArrayList2 = new ArrayList();
             iterator1 = list.iterator();
             float f4 = 0;
             float f5 = 0;
             while (iterator1.hasNext()) {
                qPhoto = iterator1.next();
                if (f4 - f5 <= 0) {
                   uArrayList1.add(qPhoto);
                   f4 = f4 + qPhoto.getCoverAspectRatioPrioritizeAdCover();
                }else {
                   uArrayList3.add(qPhoto);
                   f5 = f5 + qPhoto.getCoverAspectRatioPrioritizeAdCover();
                }
             }
             i6 = -1;
             f4 = 0;
             i3 = 0;
             i7 = 0;
             while (true) {
                int i9 = 0;
                break ;
             }
             while (true) {
                if (i3 < uArrayList1.size() && i7 < uArrayList3.size()) {
                   if (f - f4 <= 0) {
                      qPhoto3 = uArrayList1.get(i3);
                      i3 = i3 + 1;
                      if (qPhoto3.mEntity != obj1) {
                         uArrayList2.add(qPhoto3);
                         f = f + qPhoto3.getCoverAspectRatioPrioritizeAdCover();
                      }else {
                         i6 = i3;
                         i9 = 1;
                      }
                   }else {
                      qPhoto3 = uArrayList3.get(i7);
                      i7 = i7 + 1;
                      if (qPhoto3.mEntity != obj1) {
                         uArrayList2.add(qPhoto3);
                         f4 = f4 + qPhoto3.getCoverAspectRatioPrioritizeAdCover();
                      }else {
                         i6 = i7;
                      }
                   }
                }else if(i6 == -1){
                   if (i3 < uArrayList1.size()) {
                      while (i3 < uArrayList1.size()) {
                         QPhoto qPhoto4 = uArrayList1.get(i3);
                         i3 = i3 + 1;
                         if (qPhoto4.mEntity != obj1) {
                            uArrayList2.add(qPhoto4);
                         }else {
                            i6 = i3;
                            i9 = 1;
                            continue ;
                         }
                      }
                   }else if(i7 < uArrayList3.size()){
                      while (i7 < uArrayList3.size()) {
                         QPhoto qPhoto5 = uArrayList3.get(i7);
                         i7 = i7 + 1;
                         if (qPhoto5.mEntity != obj1) {
                            uArrayList2.add(qPhoto5);
                         }else {
                            i6 = i7;
                            i9 = 0;
                            continue ;
                         }
                      }
                   }
                }
                if (i6 >= 0) {
                   if (i3 < uArrayList1.size()) {
                      uArrayList2.addAll(uArrayList1.subList(i3, uArrayList1.size()));
                   }
                   if (i7 < uArrayList3.size()) {
                      uArrayList2.addAll(uArrayList3.subList(i7, uArrayList3.size()));
                   }
                   i8 = c.b(p0.getResources(), R.dimen.arg_RES_7f07044a);
                   if (!i9) {
                      uArrayList1 = uArrayList3;
                   }
                   this = p0.getTop();
                   i4 = p0.getWidth();
                   if (this.d() != null) {
                      height = this.d().getHeight();
                      hashSet = new HashSet();
                      for (; i6 < uArrayList1.size(); i6 = i6 + 1) {
                         qPhoto = uArrayList1.get(i6);
                         if (this > height) {
                         }
                         hashSet.add(Integer.valueOf(uArrayList2.indexOf(qPhoto)));
                         f2 = (float)i4 * qPhoto.getCoverAspectRatioPrioritizeAdCover();
                         f2 = f2 + (float)i8;
                         f2 = f2 + (float)n.c(a.a().a(), 25.00f);
                         float f6 = (float)this + f2;
                         this = (int)f6;
                      }
                      obj.f(uArrayList2);
                      obj.e(p0.getHeight(), hashSet);
                   }
                }
             }
          }
       }
       return;
    }
}
