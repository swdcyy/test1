package com.yxcorp.gifshow.camera.record.sidebar.n;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import lnc.a1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.y;
import oc9.x;
import android.view.ViewStub;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import tkd.b;
import tkd.d;
import om6.r;
import nm6.c;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.camera.record.base.d;
import in6.b;
import com.yxcorp.gifshow.camera.record.sidebar.k;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.ArrayList;
import java.util.Iterator;
import zg9.y;
import com.google.common.base.Optional;
import android.util.SparseIntArray;
import com.yxcorp.gifshow.camera.record.sidebar.l;
import java.util.Collection;
import com.google.common.collect.e;
import com.google.common.collect.e$a;
import com.google.common.collect.AbstractIterator;
import com.yxcorp.gifshow.camera.record.sidebar.m;
import zg9.a0;
import java.util.Comparator;
import java.util.Collections;
import ekd.q;
import android.app.Application;
import o56.a;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Resources;
import android.content.Context;
import cw9.c;
import i2b.a;
import com.yxcorp.gifshow.widget.textview.PressedDisableWithAlphaTextImageView;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import zg9.z;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import android.content.Intent;

public class n extends j	// class@000f21
{
    public final float M;
    public boolean N;
    public boolean O;
    public static final int P;

    public void n(CameraPageType p0,b p1){
       super(p0, p1);
       this.M = (float)a1.d(0x7f070139);
    }
    public void Q(View p0){
       Iterator iterator;
       b uob1;
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, on, "2")) {
          return;
       }
       x.a(this, p0);
       int i = 0x7f0a0635;
       if (!PatchProxy.applyVoidOneRefs(p0, this, on, "7")) {
          View view = p0.findViewById(i);
          if (view == null) {
             ViewStub viewStub = p0.findViewById(R.id.camera_sidebar_view_stub);
             if (viewStub != null) {
                if (viewStub.getParent() instanceof RelativeLayout) {
                   RelativeLayout$LayoutParams layoutParams1 = viewStub.getLayoutParams();
                   layoutParams1.addRule(11, -1);
                   viewStub.setLayoutParams(layoutParams1);
                }
                viewStub.setLayoutResource(R.layout.arg_RES_7f0d018f);
                view = viewStub.inflate();
             }
             if (view != null) {
                view.getLayoutParams().topMargin = a1.d(0x7f070323);
             }
          }
       }
       ViewGroup viewGroup = p0.findViewById(i);
       if (!PatchProxy.applyVoidOneRefs(viewGroup, this, on, "8")) {
          ArrayList uArrayList = PatchProxy.apply(null, this, on, "10");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             c b = d.a(-831446984).sH().b;
             List list = this.d.e(b.class);
             y.q(list, k.b);
             ArrayList uArrayList1 = new ArrayList();
             ArrayList uArrayList2 = new ArrayList();
             Iterator iterator1 = b.iterator();
             while (iterator1.hasNext()) {
                uob1 = iterator1.next();
                Optional optional = y.y(list, new y(uob1));
                if (optional.isPresent()) {
                   b uob2 = optional.get();
                   ArrayList uArrayList3 = (uob1.O0() >= 0 || uob2.O0() >= 0)? uArrayList2: uArrayList1;
                   if (!uob1.R() && (uob1.T() || uob1.a1())) {
                      uArrayList3.add(uob1);
                   }else {
                      uArrayList3.add(uob2);
                   }
                }
             }
             SparseIntArray sparseIntArr = new SparseIntArray();
             iterator1 = e.c(uArrayList2, l.b).iterator();
             Iterator iterator2 = iterator1;
             while (iterator2.hasNext()) {
                uob1 = iterator2.next();
                int i1 = uob1.Y0();
                sparseIntArr.put(i1, uob1.O0());
             }
             iterator = e.c(b, m.b).iterator();
             iterator1 = iterator;
             while (iterator1.hasNext()) {
                b uob3 = iterator1.next();
                int i2 = uob3.Y0();
                sparseIntArr.put(i2, uob3.O0());
             }
             Collections.sort(uArrayList2, new a0(sparseIntArr));
             iterator = uArrayList2.iterator();
             while (iterator.hasNext()) {
                b uob4 = iterator.next();
                int i3 = sparseIntArr.get(uob4.Y0());
                if (i3 >= 0 && i3 < uArrayList1.size()) {
                   uArrayList1.add(i3, uob4);
                }else {
                   uArrayList1.add(uob4);
                }
             }
             uArrayList = uArrayList1;
          }
          if (!q.f(uArrayList) && viewGroup != null) {
             Application uApplication = a.b();
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                b uob = iterator.next();
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
                layoutParams.topMargin = c.a(uApplication.getResources(), 0x7f070139);
                if (uob.R()) {
                   viewGroup.addView(a.i(viewGroup, uob.R()), layoutParams);
                }else if(uob.T() || uob.a1()){
                   PressedDisableWithAlphaTextImageView pressedDisab = a.i(viewGroup, R.layout.camera_item_normal);
                   pressedDisab.setTopDrawable(ContextCompat.getDrawable(uApplication, uob.T()));
                   pressedDisab.setText(uApplication.getString(uob.a1()));
                   viewGroup.addView(pressedDisab, layoutParams);
                }
             }
          }
       }
       return;
    }
    public boolean l2(){
       return true;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, n.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.N = false;
       return;
    }
    public void onResume(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "3")) {
          return;
       }
       super.onResume();
       if (this.N == null) {
          if (!PatchProxy.applyVoid(objArray, this, on, "9")) {
             j tu = this.u;
             if (tu != null && tu.getChildCount()) {
                f.G(this.u, new z(this));
                this.v2(true);
                n.Y(this.w, 0, true);
                n.Y(this.x, 0, true);
             }
          }
          this.N = true;
       }
       return;
    }
    public ViewStub p2(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewStub viewStub = p0.findViewById(R.id.camera_sidebar_view_stub);
       if (viewStub != null) {
          viewStub.setLayoutResource(R.layout.arg_RES_7f0d018f);
       }
       return viewStub;
    }
    public void u2(boolean p0){
       boolean b;
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "5")) {
          return;
       }
       super.u2(p0);
       int i = 1;
       int i1 = p0 ^ i;
       this.O = i1;
       if (i1) {
          c uoc = this.d.b().V7();
          if (uoc != null) {
             a uoa = uoc.h();
             Object obj = PatchProxy.applyOneRefs(uoa, this, on, "11");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                b = false;
                if (uoa != null) {
                   if (uoa.d() != RecordBubbleItem.SIDEBAR_FOLD_BTN && uoa.d() != RecordBubbleItem.INTELLIGENT) {
                      i = 0;
                   }
                   b = i;
                }
             }
             if (b) {
                uoc.c();
             }
          }
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       super.w1(p0);
       return;
    }
}
