package com.yxcorp.gifshow.detailbubble.LikeRandomBubbleView;
import com.yxcorp.gifshow.detailbubble.LikeBubbleBaseView;
import com.yxcorp.gifshow.detailbubble.LikeRandomBubbleView$b;
import nsd.u;
import android.app.Application;
import o56.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import cw9.c;
import android.content.Context;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import t9a.a;
import java.lang.Integer;
import java.lang.Float;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.View;
import android.graphics.Rect;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.detailbubble.LikeRandomBubbleView$a;
import java.lang.Number;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$a;
import android.graphics.Bitmap;
import android.util.SparseArray;
import usd.q;
import android.view.ViewGroup;
import android.graphics.Canvas;
import com.yxcorp.gifshow.detailbubble.LikeRandomBubbleView$d;
import java.lang.Runnable;
import a2.i0;

public final class LikeRandomBubbleView extends LikeBubbleBaseView	// class@001a97
{
    public final ArrayList b;
    public final Random c;
    public boolean d;
    public a e;
    public CdnResource$ResourceKey f;
    public Integer g;
    public String h;
    public boolean i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static int m;
    public static final LikeRandomBubbleView$b n;

    static {
       LikeRandomBubbleView.n = new LikeRandomBubbleView$b(null);
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       LikeRandomBubbleView.j = c.b(uApplication.getResources(), 0x7f070581);
       uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       LikeRandomBubbleView.k = c.b(uApplication.getResources(), 0x7f070580);
       uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       LikeRandomBubbleView.l = c.b(uApplication.getResources(), 0x7f07057f);
    }
    public void LikeRandomBubbleView(Context p0){
       super(p0);
       this.b = new ArrayList();
       this.c = new Random();
       this.h = "";
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, LikeRandomBubbleView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.b.isEmpty() ^ 0x01);
    }
    public void b(String p0,CdnResource$ResourceKey p1,int[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LikeRandomBubbleView.class, "5")) {
          return;
       }
       a.p(p2, "drawables");
       a uoa = new a(p2, this.c, p1, p0, this.i);
       this.e = v0;
       return;
    }
    public void c(){
       this.d = true;
    }
    public void d(int p0,int p1,int p2,int p3,float p4){
       int i7;
       int i8;
       Iterator iterator1;
       int i11;
       Object[] objArray2;
       Object obj = this;
       int i = p0;
       int i1 = p1;
       float f = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(LikeRandomBubbleView.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, LikeRandomBubbleView.class, "1")) {
             return;
          }
       }
       View parent = this.getParent();
       if (parent != null) {
          Rect rect = new Rect();
          parent.getLocalVisibleRect(rect);
          int l = LikeRandomBubbleView.l;
          int i4 = l / 2;
          int i5 = rect.right - (l / 2);
          if (i5 < 0 || (i4 >= 0 && i5 > i4)) {
             Rect top = rect.top;
             int i6 = ((l / 2) + top) + LikeRandomBubbleView.j;
             if ((v14 = f - (float)i3) >= 0) {
                i7 = (int)f;
                i8 = l / 2;
             }else {
                i7 = rect.bottom;
                i8 = l / 2;
             }
             i7 = i7 - i8;
             if (i7 > 0 && (i6 <= 0 || i7 <= i6)) {
                int i9 = (v14 >= 0)? (int)f: rect.bottom;
                i7 = i9;
                if (i7 < 0 || (top >= null && i7 > top)) {
                label_0095 :
                   int i10 = obj.f(top, i7);
                   Rect[] rectArray = new Rect[i2];
                   p2 = obj.e(i4, i5);
                   rectArray[0] = new Rect((i - l), (i1 - l), (i + l), (l + i1));
                   ArrayList uArrayList = CollectionsKt__CollectionsKt.r(rectArray);
                   Iterator iterator = obj.b.iterator();
                   while (iterator.hasNext()) {
                      LikeRandomBubbleView$a uoa1 = iterator.next();
                      if (!uoa1.d()) {
                         int l1 = LikeRandomBubbleView.l;
                         i6 = uoa1.b() - l1;
                         iterator1 = iterator;
                         l = uoa1.c() - l1;
                         i11 = i10;
                         i10 = uoa1.b() + l1;
                         i2 = uoa1.c() + l1;
                         uArrayList.add(new Rect(i6, l, i10, i2));
                      }else {
                         iterator1 = iterator;
                         i11 = i10;
                      }
                      iterator = iterator1;
                      i10 = i11;
                   }
                   i2 = p2;
                   i3 = i10;
                   l = 0;
                   while (true) {
                      Iterator iterator2 = uArrayList.iterator();
                      break ;
                   }
                   while (true) {
                      if (iterator2.hasNext()) {
                         if (iterator2.next().contains(i, i1)) {
                            iterator2 = 1;
                         }
                      }else {
                         iterator2 = 0;
                      }
                      if (iterator2) {
                         i10 = 1;
                         l = l + i10;
                         if (l < 10) {
                            i2 = obj.e(i4, i5);
                            i3 = obj.f(top, i7);
                         }
                      }else {
                         i10 = 1;
                      }
                      LikeRandomBubbleView e = obj.e;
                      if (e != null) {
                         i1 = LikeRandomBubbleView.m + i10;
                         LikeRandomBubbleView.m = i1;
                         Object[] objArray1 = null;
                         Object obj1 = PatchProxy.apply(objArray1, e, uoa, "4");
                         l = (obj1 != patchProxyRe)? obj1.intValue(): e.a.size();
                         if (i1 >= l) {
                            LikeRandomBubbleView.m = 0;
                         }
                         i1 = LikeRandomBubbleView.m;
                         l = LikeRandomBubbleView.k;
                         if (PatchProxy.isSupport(uoa)) {
                            Object obj2 = PatchProxy.applyThreeRefs(Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(l), e, a.class, "3");
                            if (obj2 != patchProxyRe) {
                               objArray2 = obj2;
                            label_01bd :
                               if (objArray2 != null) {
                                  a.o(objArray2, "it");
                                  LikeRandomBubbleView$a uoa2 = new LikeRandomBubbleView$a(this, this, objArray2, i2, i3);
                                  obj.b.add(i4);
                                  this.invalidate();
                                  break ;
                               }
                            }
                         }
                         if (i1 >= 0 && i1 < e.a.size()) {
                            objArray1 = e.b.get(e.a.b(i1));
                            if (objArray1 == null) {
                               Bitmap uBitmap = e.a.a(i1);
                               if (uBitmap != null) {
                                  if (l != uBitmap.getWidth() || l != uBitmap.getHeight()) {
                                     objArray1 = Bitmap.createScaledBitmap(uBitmap, l, l, true);
                                     uBitmap.recycle();
                                  }else {
                                     objArray1 = uBitmap;
                                  }
                                  e.b.put(e.a.b(i1), objArray1);
                               }
                            }
                         }
                         objArray2 = objArray1;
                         goto label_01bd ;
                      }
                   }
                }
             }else {
                top = i6;
                goto label_0095 ;
             }
          }
       }
    label_01d8 :
       return;
    }
    public final int e(int p0,int p1){
       if (PatchProxy.isSupport(LikeRandomBubbleView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LikeRandomBubbleView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (this.c.nextInt(q.n(1, (p1 - p0))) + p0);
    }
    public final int f(int p0,int p1){
       if (PatchProxy.isSupport(LikeRandomBubbleView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LikeRandomBubbleView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.c.nextDouble() - (double)0x3f666666 < 0) {
          p1 = this.c.nextInt(q.n(1, ((p1 - p0) / 2))) + p0;
       }else {
          p1 = (p1 - p0) / 2;
          p1 = p1 + (this.c.nextInt(q.n(1, p1)) + p0);
       }
       return p1;
    }
    public a getBubbleProvider(){
       return this.e;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LikeRandomBubbleView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       LikeRandomBubbleView te = this.e;
       if (te != null) {
          te.a();
       }
       this.removeAllViews();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LikeRandomBubbleView.class, "6")) {
          return;
       }
       super.onDraw(p0);
       if (this.b.isEmpty()) {
          this.post(new LikeRandomBubbleView$d(this));
          return;
       }else if(p0 != null){
          Iterator iterator = this.b.iterator();
          a.o(iterator, "bubbleHolderList.iterator\(\)");
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             a.o(obj, "iterator.next\(\)");
             if (obj.d()) {
                iterator.remove();
             }else {
                obj.a(p0);
             }
          }
          i0.j0(this);
       }
       return;
    }
    public void setBifrostStyle(boolean p0){
       this.i = p0;
    }
}
