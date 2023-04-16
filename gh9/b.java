package gh9.b;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import android.widget.FrameLayout;
import android.view.View;
import j8c.a;
import q87.c;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import java.lang.StringBuilder;
import android.widget.TextView;
import lnc.a1;
import ekd.r;
import qsd.d;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import qrd.l1;
import eh9.n;
import eh9.k;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;
import lnc.s6;
import android.content.Context;
import i2b.a;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import java.lang.CharSequence;
import java.util.List;
import gh9.b$b;
import android.view.View$OnTouchListener;
import gh9.b$a;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import gh9.h;

public class b implements CameraScrollTabViewGroupV2$c	// class@002490
{
    public final String a;
    public List b;
    public CameraActivity c;
    public ViewStubInflater2 d;
    public boolean e;
    public CameraScrollTabViewGroup f;
    public CameraScrollTabViewGroupV2 g;
    public int h;
    public boolean i;
    public CameraScrollTabViewGroupV2$c j;
    public Pair k;
    public b l;
    public boolean m;
    public boolean n;

    public void b(){
       super();
       this.a = "SnapshotModeController";
       this.h = -1;
    }
    public void a(){
       Object[] objArray1;
       int i6;
       int i7;
       int i10;
       float f;
       float f2;
       float f3;
       float f5;
       View view4;
       View view5;
       int width;
       float f6;
       float f7;
       Object obj = this;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uob, "23")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, obj, uob, "21")) {
          uob = obj.g;
          if (uob != null && uob.getItemCount()) {
             int i = uob.getWidth() / 2;
             int itemCount = uob.getItemCount();
             int i1 = 0;
             int i2 = 0;
             int i3 = 0;
             int i4 = 0;
             int i5 = 0;
             while (i2 < itemCount) {
                View view = uob.s(i2);
                if (view != null) {
                   if (!view.getWidth()) {
                      objArray1 = new Object[i1];
                      a.D().w(obj.a, "current view width is null skip", objArray1);
                   }else {
                      String str = "PRECENT : ";
                      String str1 = "   ";
                      if (view instanceof ViewGroup) {
                         View view1 = view;
                         int childCount = view1.getChildCount();
                         int i8 = 0;
                         while (i8 < childCount) {
                            View childAt = view1.getChildAt(i8);
                            int i9 = uob.l(view) - uob.getCurrentScrollX();
                            String str2 = "childView";
                            if (i8) {
                               a.o(childAt, str2);
                               i7 = itemCount;
                               ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                               i10 = childCount;
                               Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                               i9 = i9 + layoutParams.getMarginStart();
                            }else {
                               i7 = itemCount;
                               i10 = childCount;
                            }
                            itemCount = i9 - i;
                            f = (float)itemCount * 0x3f800000;
                            a.o(childAt, str2);
                            float f1 = (float)childAt.getWidth();
                            if (f - (float)0 > 0) {
                               if (!i2 && !i8) {
                                  i6 = i;
                                  f2 = Float.MIN_VALUE;
                               label_00fb :
                                  f2 = f1;
                                  f3 = 0x3f800000;
                               label_013a :
                                  View view2 = view1;
                                  b uob1 = uob;
                                  Object[] objArray2 = new Object[0];
                                  a.D().w(obj.a, str+f3+str1+i2+str1+f+str1+f2, objArray2);
                                  obj.k(childAt, r.a(a1.a(R.color.arg_RES_7f061fd5), a1.a(R.color.arg_RES_7f0601be), f3));
                                  if (!childAt.getVisibility()) {
                                     float f4 = (float)childAt.getWidth() * f3;
                                     i3 = i3 + d.H0(f4);
                                     i4 = Math.max(i4, childAt.getWidth());
                                     int i11 = (i5 > 0)? Math.min(i5, childAt.getWidth()): childAt.getWidth();
                                     i5 = i11;
                                  }
                                  i8 = i8 + 1;
                                  view1 = view2;
                                  itemCount = i7;
                                  childCount = i10;
                                  i = i6;
                                  uob = uob1;
                                  childAt = null;
                               }else if(!i8){
                                  View view3 = uob.n(view);
                                  childCount = (view3 != null)? view3.getWidth(): 0;
                               }else {
                                  View childAt1 = view1.getChildAt(0);
                                  a.o(childAt1, "currentView.getChildAt\(0\)");
                                  childCount = childAt1.getWidth();
                               }
                               childCount = childCount + childAt.getWidth();
                               f2 = (float)childCount / 2.00f;
                               f5 = Math.abs(f) / f2;
                               f1 = f2;
                               f2 = 0x3f800000;
                               i6 = i;
                               f5 = f2 - Math.max(Math.min(f5, f2), 0);
                               f3 = f5;
                            }else {
                               i6 = i;
                               childCount = 1;
                               i = uob.getItemCount() - childCount;
                               if (i2 == i && i8 == childCount) {
                                  goto label_00fb ;
                               }else if(i8 == childCount){
                                  view4 = uob.o(view);
                                  i = (view4 != null)? view4.getWidth(): 0;
                               }else {
                                  view4 = view1.getChildAt(childCount);
                                  a.o(view4, "currentView.getChildAt\(1\)");
                                  i = view4.getWidth();
                               }
                               i = i + childAt.getWidth();
                               f3 = (float)i / 2.00f;
                               f2 = Math.abs(f) / f3;
                               f5 = 0x3f800000;
                               f1 = f3;
                               f3 = f5 - Math.max(Math.min(f2, f5), 0);
                            }
                            f2 = f1;
                            goto label_013a ;
                         }
                      }else {
                         i6 = i;
                         i7 = itemCount;
                         i = uob.l(view) - uob.getCurrentScrollX();
                         i = i - i6;
                         f3 = (float)i * 0x3f800000;
                         f = (float)view.getWidth();
                         if (f3 - (float)0 > 0) {
                            if (i2 > 0) {
                               view5 = uob.n(view);
                               width = (view5 != null)? view5.getWidth(): 0;
                               width = width + view.getWidth();
                               f = (float)width / 2.00f;
                               f6 = Math.abs(f3) / f;
                               f6 = Math.max(Math.min(f6, 0x3f800000), 0);
                               f7 = 0x3f800000;
                            label_0232 :
                               f5 = f7 - f6;
                            label_0237 :
                               objArray1 = new Object[0];
                               a.D().w(obj.a, str+f5+str1+i2+str1+f3+str1+f, objArray1);
                               obj.k(view, r.a(a1.a(R.color.arg_RES_7f061fd5), a1.a(R.color.arg_RES_7f0601be), f5));
                               f3 = (float)view.getWidth() * f5;
                               i3 = i3 + d.H0(f3);
                               i = Math.max(i4, view.getWidth());
                               i1 = (i5 > 0)? Math.min(i5, view.getWidth()): view.getWidth();
                               i4 = i;
                               i5 = i1;
                            label_02a6 :
                               i2 = i2 + 1;
                               itemCount = i7;
                               i = i6;
                               i1 = 0;
                            }
                         }else {
                            i1 = uob.getItemCount() - 1;
                            if (i2 < i1) {
                               view5 = uob.o(view);
                               width = (view5 != null)? view5.getWidth(): 0;
                               width = width + view.getWidth();
                               f = (float)width / 2.00f;
                               f6 = Math.abs(f3) / f;
                               f7 = 0x3f800000;
                               f6 = Math.max(Math.min(f6, f7), 0);
                               goto label_0232 ;
                            }
                         }
                         b uob2 = 0x3f800000;
                         f5 = 0x3f800000;
                         goto label_0237 ;
                      }
                   }
                }
                i6 = i;
                i7 = itemCount;
                itemCount = 0;
                goto label_02a6 ;
             }
             if (i3 > 0) {
                uob = obj.d;
                if (uob == null) {
                   a.S("viewStub");
                }
                View view6 = uob.b(R.id.radio_indicator_bg);
                a.o(view6, "this");
                ViewGroup$LayoutParams layoutParams1 = view6.getLayoutParams();
                layoutParams1.width = Math.max(Math.min(i3, i4), i5) - a1.e(12.00f);
                view6.setLayoutParams(layoutParams1);
             }
          }
       }
       return;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       a.p(p0, "view");
       if (this.h == p0.getId()) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(this.a, "onSelected:"+p0.getTag(), objArray);
       int id = p0.getId();
       this.h = id;
       n on = this.e(id);
       if (on != null && on.getTabId() == 10) {
          i = true;
       }
       this.i = i;
       b tj = this.j;
       if (tj != null) {
          tj.b(p0);
       }
       return;
    }
    public void c(int p0){
       k.a(this, p0);
    }
    public void d(View p0){
       k.b(this, p0);
    }
    public final n e(int p0){
       Iterator obj;
       n on;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uob = this.b;
       if (uob == null) {
          a.S("items");
       }
       obj = uob.iterator();
       do {
          if (obj.hasNext()) {
             on = obj.next();
             Object obj1 = (p0 == on.getTextViewId())? 1: null;
          }else {
             on = null;
             break ;
          }
       } while (obj1);
       return on;
    }
    public void f(){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "13")) {
          return;
       }
       b tc = this.c;
       String str = "activity";
       if (tc == null) {
          a.S(str);
       }
       this.f = tc.findViewById(0x7f0a063e);
       tc = this.d;
       String str1 = "viewStub";
       if (tc == null) {
          a.S(str1);
       }
       View view = tc.b(R.id.radio_indicator);
       a.o(view, "viewStub.getView<View>\(R.id.radio_indicator\)");
       view.setVisibility(0);
       tc = this.d;
       if (tc == null) {
          a.S(str1);
       }
       tc.b(0x7f0a33dd).getLayoutParams().width = a1.d(0x7f070144);
       tc = this.d;
       if (tc == null) {
          a.S(str1);
       }
       CameraScrollTabViewGroupV2 uCameraScrol = tc.b(R.id.camera_time_mode_group);
       this.g = uCameraScrol;
       if (uCameraScrol != null) {
          if (this.e == null) {
             b = true;
             if (!PatchProxy.applyVoidOneRefs(uCameraScrol, this, uob, "14")) {
                b tb = this.b;
                if (tb == null) {
                   a.S("items");
                }
                Iterator iterator1 = tb.iterator();
                while (iterator1.hasNext()) {
                   n on = iterator1.next();
                   if (PatchProxy.applyVoidOneRefs(on, this, uob, "15")) {
                      continue ;
                   }else {
                      String str2 = "cameraTabItem";
                      a.p(on, str2);
                      b tg = this.g;
                      if (tg != null) {
                         View view2 = PatchProxy.applyOneRefs(on, this, uob, "16");
                         if (view2 != PatchProxyResult.class) {
                         }else {
                            a.p(on, str2);
                            b tc1 = this.c;
                            if (tc1 == null) {
                               a.S(str);
                            }
                            int i = (s6.m())? 0x7f0d0199: 0x7f0d019a;
                            View view3 = a.a(tc1, i);
                            view2 = view3;
                            view2.setId(on.getTextViewId());
                            String tabText = on.getTabText();
                            if (on.getTabId() == CameraTab.CAMERA_TAB_SNAPSHOT.getTabId()) {
                               tabText = a1.p(R.string.arg_RES_7f104b95);
                            }
                            String str3 = (tabText == null || !tabText.length())? 1: null;
                            if (!str3) {
                               a.o(view2, "this");
                               view2.setText(tabText);
                               view2.setTag(tabText);
                            }
                            a.o(view3, "KwaiLayoutInflater.infla¡­.tag = text\n      }\n    }");
                         }
                         tg.a(view2);
                      }
                   }
                }
             }
             this.e = b;
          }
          List itemViews = uCameraScrol.getItemViews();
          a.o(itemViews, "tabGroup.itemViews");
          Iterator iterator = itemViews.iterator();
          while (iterator.hasNext()) {
             View view1 = iterator.next();
             if (this.g(this.h) || this.m != null) {
                a.o(view1, "child");
                if (view1.getId() != CameraTab.CAMERA_TAB_PHOTO.getTextViewId() && view1.getId() != CameraTab.CAMERA_TAB_SNAPSHOT.getTextViewId()) {
                   view1.setVisibility(4);
                }
             }
             a.o(view1, "child");
             view1.setVisibility(0);
          }
          uCameraScrol.setOnTabSelected(this);
          if (this.n == null) {
             uCameraScrol.c(CameraTab.CAMERA_TAB_SNAPSHOT.getTabId());
          }
          uob = this.f;
          if (uob != null) {
             uCameraScrol.setOnTouchListener(new b$b(uob));
             uob.setOnTouchListener(new b$a(uCameraScrol));
          }
       }
       return;
    }
    public final boolean g(int p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b = (p0 == CameraTab.CAMERA_TAB_ACTIVITY.getTextViewId())? true: false;
       return b;
    }
    public final boolean h(int p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b = (this.e(p0) != null)? true: false;
       return b;
    }
    public final boolean i(int p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b = (this.h(p0) || this.g(p0))? true: false;
       return b;
    }
    public final void j(boolean p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "17")) {
          return;
       }
       String str = "viewStub";
       if (this.i(this.h)) {
          if (this.i != null) {
             b td = this.d;
             if (td == null) {
                a.S(str);
             }
             td.g(p0);
          }else {
             RxBus.f.b(new h(p0, p1));
          }
       }else {
          b td1 = this.d;
          if (td1 == null) {
             a.S(str);
          }
          td1.g(false);
       }
       return;
    }
    public void k(TextView p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "22")) {
          return;
       }
       a.p(p0, "textView");
       p0.setTextColor(p1);
       return;
    }
}
