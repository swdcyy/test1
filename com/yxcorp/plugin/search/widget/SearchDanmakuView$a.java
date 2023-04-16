package com.yxcorp.plugin.search.widget.SearchDanmakuView$a;
import android.view.Choreographer$FrameCallback;
import com.yxcorp.plugin.search.widget.SearchDanmakuView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import android.widget.FrameLayout;
import java.util.Objects;
import android.os.SystemClock;
import android.view.View;
import ufd.i;
import java.lang.Integer;
import android.content.Context;
import android.view.Choreographer;

public class SearchDanmakuView$a implements Choreographer$FrameCallback	// class@0007d5
{
    public final SearchDanmakuView b;

    public void SearchDanmakuView$a(SearchDanmakuView p0){
       this.b = p0;
       super();
    }
    public void doFrame(long p0){
       long l1;
       int i2;
       int i3;
       int i4;
       View childAt;
       int i5;
       int i6;
       int i7;
       SearchDanmakuView d;
       SearchDanmakuView c;
       int i8;
       float f;
       if (PatchProxy.isSupport(SearchDanmakuView$a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, SearchDanmakuView$a.class, "1")) {
          return;
       }
       SearchDanmakuView$a tb = this.b;
       if (tb.g == null) {
          return;
       }
       if (tb.getChildCount() > 0) {
          tb = this.b;
          if (tb.e != null) {
             int i = 0x7f0a4478;
             long l = 0;
             Object[] objArray = null;
             if (tb.m != null) {
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoid(objArray, tb, SearchDanmakuView.class, "2")) {
                   l1 = SystemClock.uptimeMillis();
                   SearchDanmakuView i1 = tb.i;
                   l = (!i1 - l)? 17: l1 - i1;
                   tb.i = l1;
                   i2 = (int)(((long)tb.d * l) / tb.b);
                   i3 = 0;
                   i4 = 0;
                   while (i3 < tb.getChildCount()) {
                      childAt = tb.getChildAt(i3);
                      i5 = (int)childAt.getX();
                      if (!i3) {
                         i6 = childAt.getWidth() + i5;
                         if (i6 < 0) {
                            tb.e.c(childAt);
                            tb.removeView(childAt);
                            i3 = i3 - 1;
                         }else {
                            f = childAt.getTranslationX() - (float)i2;
                            childAt.setTranslationX(f);
                            i4 = i6 - i2;
                         }
                      }else {
                         i4 = i4 + childAt.getTag(i).intValue();
                         childAt.setTranslationX((float)i4);
                         i4 = i4 + childAt.getWidth();
                      }
                      i7 = tb.getChildCount() - 1;
                      if (i3 == i7) {
                         d = tb.d;
                         if (i5 < d) {
                            i5 = tb.c + i4;
                            if (i5 < d) {
                               i7 = tb.f + 1;
                               if (i7 >= tb.e.e()) {
                                  if (tb.l != null && tb.f >= tb.getChildCount()) {
                                     tb.f = 0;
                                  }
                               }else {
                                  i7 = tb.f + 1;
                                  tb.f = i7;
                               }
                               childAt = tb.e.f(tb.getContext(), tb.f, tb.e.h());
                               i5 = tb.d - i4;
                               c = tb.c;
                               i8 = c / 6;
                               i8 = i8 + c;
                               if (i5 > i8) {
                                  childAt.setTag(i, Integer.valueOf(i5));
                               }else {
                                  childAt.setTag(i, Integer.valueOf(c));
                               }
                               tb.a(childAt);
                               i3 = i3 + 1;
                            }
                         }
                      }
                      i3 = i3 + 1;
                   }
                }
             }else {
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoid(objArray, tb, SearchDanmakuView.class, "5")) {
                   if (!tb.i - l) {
                      tb.getChildAt(0).setTranslationY((float)tb.n);
                      tb.i = SystemClock.uptimeMillis();
                   }else {
                      l = SystemClock.uptimeMillis();
                      l1 = l - tb.i;
                      tb.i = l;
                      l = (long)tb.n * l1;
                      i2 = (int)(l / tb.b);
                      i3 = 0;
                      i4 = 0;
                      while (i3 < tb.getChildCount()) {
                         childAt = tb.getChildAt(i3);
                         i5 = (int)childAt.getY();
                         if (!i3) {
                            i6 = childAt.getHeight() + i5;
                            if (i6 < 0) {
                               tb.e.c(childAt);
                               tb.removeView(childAt);
                               i3 = i3 - 1;
                            }else {
                               f = childAt.getTranslationY() - (float)i2;
                               childAt.setTranslationY(f);
                               i4 = i6 - i2;
                            }
                         }else {
                            i4 = i4 + childAt.getTag(i).intValue();
                            childAt.setTranslationY((float)i4);
                            i4 = i4 + childAt.getHeight();
                         }
                         i7 = tb.getChildCount() - 1;
                         if (i3 == i7) {
                            d = tb.n;
                            if (i5 < d) {
                               i5 = tb.c + i4;
                               if (i5 < d) {
                                  i7 = tb.f + 1;
                                  if (i7 >= tb.e.e()) {
                                     if (tb.l != null && tb.f >= tb.getChildCount()) {
                                        tb.f = 0;
                                     }
                                  }else {
                                     i7 = tb.f + 1;
                                     tb.f = i7;
                                  }
                                  childAt = tb.e.f(tb.getContext(), tb.f, tb.e.h());
                                  i5 = tb.n - i4;
                                  c = tb.c;
                                  i8 = c / 6;
                                  i8 = i8 + c;
                                  if (i5 > i8) {
                                     childAt.setTag(i, Integer.valueOf(i5));
                                  }else {
                                     childAt.setTag(i, Integer.valueOf(c));
                                  }
                                  tb.b(childAt);
                                  i3 = i3 + 1;
                               }
                            }
                         }
                         i3 = i3 + 1;
                      }
                   }
                }
             }
             this.b.h.postFrameCallback(this);
          }else {
          label_01f8 :
             tb = this.b;
             if (tb.k != null) {
                tb.g();
             }else {
                tb.d();
             }
          }
       }else {
          goto label_01f8 ;
       }
       return;
    }
}
