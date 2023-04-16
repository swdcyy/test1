package com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$d;
import jn9.b$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import java.lang.Object;
import nn9.a;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jn9.b$b$a;
import nn9.b;
import nn9.d;
import java.util.Objects;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import pn9.e;
import java.lang.Enum;
import android.view.ViewGroup;
import android.view.View;
import pn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import jn9.e;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import androidx.recyclerview.widget.RecyclerView$y;
import android.view.ViewTreeObserver;
import pn9.f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import mn9.a;
import pn9.g;
import java.util.ArrayList;
import java.util.Collection;
import g9c.a;
import pn9.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import jn9.d;
import jn9.b;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;

public final class PostListComponentView$d implements b$b	// class@0011cd
{
    public final PostListComponentView a;

    public void PostListComponentView$d(PostListComponentView p0){
       this.a = p0;
       super();
    }
    public void a(a p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostListComponentView$d.class, "2")) {
          return;
       }
       a.p(p0, "state");
       a.p(p1, "result");
       b$b$a.a(this, p0, p1);
       return;
    }
    public void b(b p0,b p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, PostListComponentView$d.class, "3");
    }
    public void c(d p0,d p1){
       PostListComponentView g;
       Object[] objArray1;
       Object[] objArray2;
       PostListComponentView obj;
       boolean i;
       PostListComponentView e;
       PostListComponentView f2;
       Object obj1;
       int i3;
       int i4;
       PostListComponentView e1;
       View view;
       PostListComponentView e3;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostListComponentView$d.class, str)) {
          return;
       }
       a.p(p0, "newState");
       PostListComponentView$d ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, PostListComponentView.class, "8")) {
          a uoa = 8;
          Object[] objArray = null;
          switch (e.a[p0.g().a().ordinal()]){
              case 1:
              case 2:
                if (!PatchProxy.applyVoid(objArray, ta, PostListComponentView.class, "11")) {
                   g = ta.d;
                   if (g == null) {
                      g = ta.e;
                      if (g != null) {
                         g.setVisibility(uoa);
                      }
                      g = ta.c;
                      if (g != null) {
                         g.setVisibility(uoa);
                      }
                      g = ta.b;
                      if (g != null) {
                         g.setVisibility(false);
                      }
                   }else {
                      g.G();
                   }
                }
                break;
              case 3:
              case 4:
                if (!PatchProxy.applyVoid(objArray, ta, PostListComponentView.class, "12")) {
                   g = ta.d;
                   if (g == null) {
                      g = ta.e;
                      if (g != null) {
                         g.setVisibility(uoa);
                      }
                      g = ta.c;
                      if (g != null) {
                         g.setVisibility(false);
                      }
                      g = ta.b;
                      if (g != null) {
                         g.setVisibility(uoa);
                      }
                   }else {
                      g.F();
                   }
                }
                break;
              case 5:
              case 6:
                if (!PatchProxy.applyVoid(objArray, ta, PostListComponentView.class, "13")) {
                   g = ta.d;
                   if (g == null) {
                      g = ta.e;
                      if (g != null) {
                         g.setVisibility(false);
                      }
                      g = ta.c;
                      if (g != null) {
                         g.setVisibility(uoa);
                      }
                      g = ta.b;
                      if (g != null) {
                         g.setVisibility(uoa);
                      }
                   }else {
                      g.E();
                   }
                }
                break;
              default:
          }
       label_00b5 :
          LoadingStatus loadingStatu = p0.g().a();
          if (p1 != null) {
             uoa = p1.g();
             if (uoa != null) {
                LoadingStatus loadingStatu1 = uoa.a();
             label_00cb :
                if (loadingStatu != loadingStatu1) {
                   g = ta.g;
                   if (g != null) {
                      g.a().b(p0.g().a(), g.b());
                   }
                }
                if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, PostListComponentView.class, "9")) {
                   List list = (p1 != null)? p1.j(): objArray;
                   Iterator iterator = p0.j().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         objArray1 = iterator.next();
                         if (!objArray1.d()) {
                            continue ;
                         }
                      }else {
                         objArray1 = objArray;
                      }
                      if (objArray1 != null) {
                         if (list != null) {
                            Iterator iterator1 = list.iterator();
                            while (true) {
                               if (iterator1.hasNext()) {
                                  objArray2 = iterator1.next();
                                  obj = objArray2;
                                  obj = (a.g(obj.b(), objArray1.b()) && obj.c() == objArray1.c())? 1: null;
                                  if (!obj) {
                                     continue ;
                                  }
                               }else {
                                  objArray2 = objArray;
                               }
                            }
                         }else {
                            objArray2 = objArray;
                         }
                         if (objArray2 != null && !objArray2.d()) {
                            i = objArray1.c();
                            b i1 = objArray1.i;
                            if (!PatchProxy.isSupport(PostListComponentView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), i1, ta, PostListComponentView.class, "10")) {
                               obj = ta.e;
                               if (obj != null) {
                                  RecyclerView$LayoutManager layoutManage1 = obj.getLayoutManager();
                                  if (layoutManage1 != null) {
                                     view = layoutManage1.findViewByPosition(i);
                                  label_0185 :
                                     if (i1 == SelectScrollOption.LAZY && view != null) {
                                        PostListComponentView e2 = ta.e;
                                        if (e2 != null) {
                                           RecyclerView$LayoutManager layoutManage2 = e2.getLayoutManager();
                                           if (layoutManage2 != null && !layoutManage2.isViewPartiallyVisible(view, false, false)) {
                                           }
                                        }
                                     }else if(i1 == SelectScrollOption.SMOOTH){
                                        e3 = ta.e;
                                        if (e3 != null) {
                                           RecyclerView$LayoutManager layoutManage3 = e3.getLayoutManager();
                                           if (layoutManage3 != null) {
                                              layoutManage3.smoothScrollToPosition(ta.e, new RecyclerView$y(), i);
                                           }
                                        }
                                     }else if(i1 == SelectScrollOption.REFRESH){
                                        e3 = ta.e;
                                        if (e3 != null) {
                                           ViewTreeObserver viewTreeObse = e3.getViewTreeObserver();
                                           if (viewTreeObse != null) {
                                              viewTreeObse.addOnGlobalLayoutListener(new f(ta, i));
                                           }
                                        }
                                        e = ta.e;
                                        if (e != null) {
                                           e.requestLayout();
                                        }
                                     }
                                  }
                               }
                               view = objArray;
                               goto label_0185 ;
                            }
                         label_01d2 :
                            if (objArray1.h != null) {
                               e = ta.e;
                               if (e != null) {
                                  RecyclerView$LayoutManager layoutManage = e.getLayoutManager();
                                  if (layoutManage != null) {
                                     objArray = layoutManage.findViewByPosition(objArray1.c());
                                  }
                               }
                               e = ta.g;
                               if (e != null) {
                                  e.a().c(objArray1.g(), objArray, e.b());
                               }
                            }
                         }
                      }
                   label_01fb :
                      PostListComponentView f = ta.f;
                      if (f == null || (!PatchProxy.applyVoidOneRefs(list, f, g.class, str) && list != null)) {
                         f.h.clear();
                         f.h.addAll(list);
                      }
                   label_0214 :
                      PostListComponentView f1 = ta.f;
                      if (f1 != null) {
                         f1.W0(p0.j());
                      }
                      f1 = (list == null || list.isEmpty())? 1: null;
                      if (f1) {
                         f1 = ta.e;
                         a.m(f1);
                         ta.i.c(f1);
                         f2 = ta.f;
                         if (f2 != null) {
                            f2.k0();
                         }
                         f2 = ta.h;
                         f1 = -1;
                         if (f2 != null) {
                            f2 = f2.l();
                            if (f2 != null) {
                               f2 = f2.b;
                            label_024d :
                               if (f2 == f1) {
                                  f2 = ta.h;
                                  if (f2 != null) {
                                     f2 = f2.l();
                                     if (f2 != null) {
                                        f2 = f2.c;
                                        if (f2 != null) {
                                           Iterator iterator2 = p0.j().iterator();
                                           int i2 = 0;
                                           while (iterator2.hasNext()) {
                                              obj1 = iterator2.next();
                                              i3 = i2 + 1;
                                              if (i2 < 0) {
                                                 CollectionsKt__CollectionsKt.W();
                                              }
                                              if (a.g(obj1.b(), f2)) {
                                                 i4 = i2;
                                              }
                                              i2 = i3;
                                           }
                                        }
                                     }
                                  }
                                  i3 = i4;
                               }else {
                                  d uod = f2;
                               }
                               int i5 = p0.j().size();
                               if (i3 >= null && i5 > i3) {
                                  e1 = ta.e;
                                  if (e1 != null) {
                                     e1.scrollToPosition(i3);
                                  }
                                  e = ta.h;
                                  if (e != null) {
                                     e1 = e.l();
                                     boolean b = (e1 != null && e1.d == 1)? true: false;
                                     b.E(e, i3, b, null, 4, null);
                                     break ;
                                  }
                               }
                            }
                         }
                         f2 = -1;
                         goto label_024d ;
                      }else if(list.size() != p0.j().size()){
                         f2 = ta.e;
                         a.m(f2);
                         ta.i.c(f2);
                         e1 = ta.f;
                         if (e1 != null) {
                            e1.k0();
                            break ;
                         }
                      }else {
                         Iterator iterator3 = p0.j().iterator();
                         i4 = 0;
                         while (iterator3.hasNext()) {
                            b uob = iterator3.next();
                            b uob1 = list.get(i4);
                            obj1 = PatchProxy.applyTwoRefs(uob1, uob, ta, PostListComponentView.class, "14");
                            if (obj1 != PatchProxyResult.class) {
                               i = obj1.booleanValue();
                            }else if(a.g(uob1.b(), uob.b()) && (uob1.d() == uob.d() && (uob1.f() != uob.f() || uob1.h() != uob.h()))){
                               i = true;
                            }else {
                               i = false;
                            }
                            if (i) {
                               e = ta.f;
                               if (e != null) {
                                  e.m0(i4, Boolean.TRUE);
                               }
                               if (uob.f() != uob1.f() || uob.e() != uob1.e()) {
                                  e = ta.g;
                                  if (e != null) {
                                     e.a().e(uob1, uob, e.b());
                                  }
                               }
                            }
                         label_0365 :
                            i4 = i4 + 1;
                         }
                      }
                   }
                }
             }
          }
          objArray1 = objArray;
          goto label_00cb ;
       }
       return;
    }
}
