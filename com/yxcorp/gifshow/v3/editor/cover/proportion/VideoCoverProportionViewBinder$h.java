package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$h;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import tpc.y;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Iterator;
import tpc.v$b;
import com.yxcorp.gifshow.widget.RatioExpandView;
import android.widget.LinearLayout;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.RatioExpandView$RatioExpandItemView;
import android.content.Context;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import tyc.w3;
import android.view.View$OnClickListener;
import tyc.v3;
import android.view.ViewTreeObserver;
import tyc.b4;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import tpc.e0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tpc.v;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import androidx.lifecycle.LiveData;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import oa0.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public final class VideoCoverProportionViewBinder$h implements Observer	// class@000ea6
{
    public final VideoCoverProportionViewBinder b;

    public void VideoCoverProportionViewBinder$h(VideoCoverProportionViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverProportionViewBinder$h.class, "1")) {
       }else {
          int i = p0.b();
          ListHolder$UpdateType updateType = p0.e();
          String str = 1;
          if (updateType == null || y.a[updateType.ordinal()] != str) {
             ArrayList uArrayList = new ArrayList();
             VideoCoverProportionViewBinder$h tb = this.b;
             p0 = p0.c();
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidTwoRefs(uArrayList, p0, tb, VideoCoverProportionViewBinder.class, "10")) {
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   uArrayList.add(p0.next().a());
                }
             }
             p0 = this.b.L();
             Object[] objArray = null;
             if (p0 != null && !PatchProxy.applyVoidOneRefs(uArrayList, p0, RatioExpandView.class, "5")) {
                p0.d = false;
                p0.j.removeAllViewsInLayout();
                RatioExpandView b1 = p0.b;
                int i4 = uArrayList.size();
                int i5 = 0;
                while (i5 < i4) {
                   Object obj2 = uArrayList.get(i5);
                   if (!PatchProxy.isSupport(RatioExpandView.class) || !PatchProxy.applyVoidThreeRefs(obj2, Integer.valueOf(i5), Integer.valueOf(i4), p0, RatioExpandView.class, "2")) {
                      RatioExpandView$RatioExpandItemView ratioExpandI = new RatioExpandView$RatioExpandItemView(p0, p0.getContext());
                      ratioExpandI.a(p0.j, false, i4);
                      ratioExpandI.setText(obj2);
                      p0.j.addView(ratioExpandI);
                      int i6 = p0.j.getChildCount() - 1;
                      ratioExpandI.setTag(Integer.valueOf(i6));
                      ratioExpandI.setOnClickListener(new w3(p0, ratioExpandI));
                      int i7 = i4 - 1;
                      if (i5 == i7) {
                         p0.l = p0.n;
                         if (!PatchProxy.applyVoid(objArray, p0, RatioExpandView.class, "4")) {
                            i7 = p0.j.getChildCount();
                            i6 = 0;
                            while (i6 < i7) {
                               if (i6 < p0.j.getChildCount()) {
                                  View childAt = p0.j.getChildAt(i6);
                                  if (i6 == p0.b) {
                                     childAt.setVisibility(false);
                                     p0.setTextViewNormal(childAt);
                                  }else {
                                     childAt.setVisibility(4);
                                  }
                               }
                               i6 = i6 + 1;
                            }
                         }
                         p0.invalidate();
                      }
                   }
                   i5 = i5 + 1;
                }
                if (p0.b < p0.getChildCount()) {
                   p0.b = b1;
                }
                if (p0.r != null && (!PatchProxy.isSupport(RatioExpandView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i4), p0, RatioExpandView.class, "3"))) {
                   RatioExpandView$RatioExpandItemView ratioExpandI1 = new RatioExpandView$RatioExpandItemView(p0, p0.getContext());
                   ratioExpandI1.a(p0.j, str, i4);
                   p0.j.addView(ratioExpandI1);
                   ratioExpandI1.setTag(Integer.valueOf((p0.j.getChildCount() - str)));
                   ratioExpandI1.setOnClickListener(new v3(p0));
                }
                p0.j.getViewTreeObserver().addOnGlobalLayoutListener(new b4(p0));
             }
             p0 = this.b.L();
             if (p0 != null) {
                p0.setSelectIndex(this.b.G().y0());
             }
             p0 = this.b;
             if (p0.j != null && p0.k != null) {
                p0 = p0.G();
                Objects.requireNonNull(p0);
                String obj = PatchProxy.apply(objArray, p0, e0.class, "11");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(p0.i.a()){
                   p0.i.h();
                   obj = (TextUtils.x(p0.i.d()))? a1.p(R.string.arg_RES_7f10461f): p0.i.d();
                   ListHolder value = p0.a.getValue();
                   if (value != null) {
                      List list = value.c();
                      if (list != null) {
                         Iterator iterator = list.iterator();
                         int i1 = 0;
                         int i2 = 0;
                         while (iterator.hasNext()) {
                            Object obj1 = iterator.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                               CollectionsKt__CollectionsKt.W();
                            }
                            if (a.g(obj1.a(), obj)) {
                               p0.C0(i2, false);
                               i1 = 1;
                            }
                            i2 = i3;
                         }
                         b = i1;
                      }
                   }
                }
             label_0208 :
                b = false;
                if (b) {
                   b = this.b;
                   b.k = false;
                   b = b.L();
                   if (b != null) {
                      b.setSelectIndex(this.b.G().y0());
                   }
                   b = this.b.L();
                   if (b != null && (!PatchProxy.applyVoid(objArray, b, RatioExpandView.class, "9") && b.j.getChildCount() > 0)) {
                      b = b.j.getChildAt(false);
                      if (b instanceof RatioExpandView$RatioExpandItemView) {
                         b.c.setCompoundDrawablePadding(false);
                         b.c.setCompoundDrawables(objArray, objArray, objArray, objArray);
                         b.c.setPadding(false, false, false, false);
                      }
                   }
                   if (a.b() && (!TextUtils.x(this.b.G().p0()) && !(a1.p(0x7f10461f)).equals(this.b.G().p0()))) {
                      b = this.b.L();
                      if (b != null) {
                         b.c(PostBubbleManager.d(this.b.J()), this.b.G().y0());
                      }
                   }
                }
             }
          }else {
             RatioExpandView ratioExpandV = this.b.L();
             if (ratioExpandV != null) {
                p0 = p0.c().get(i).a();
                if (!PatchProxy.isSupport(RatioExpandView.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), p0, ratioExpandV, RatioExpandView.class, "6") && i < ratioExpandV.j.getChildCount())) {
                   View childAt1 = ratioExpandV.j.getChildAt(i);
                   if (childAt1 instanceof RatioExpandView$RatioExpandItemView) {
                      childAt1.setText(p0);
                   }
                }
             }
          }
       }
    label_02e8 :
       return;
    }
}
