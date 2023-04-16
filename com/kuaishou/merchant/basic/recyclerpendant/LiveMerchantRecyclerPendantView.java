package com.kuaishou.merchant.basic.recyclerpendant.LiveMerchantRecyclerPendantView;
import lt3.b;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import lt3.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collection;
import ekd.q;
import android.widget.LinearLayout;
import java.util.ArrayList;
import android.view.View;
import lt3.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import lt3.c;

public class LiveMerchantRecyclerPendantView extends SelectShapeLinearLayout implements b	// class@0015cd
{
    public a c;
    public SparseArray d;
    public SparseArray e;

    public void LiveMerchantRecyclerPendantView(Context p0){
       super(p0, null);
       this.d = new SparseArray();
       this.e = new SparseArray();
    }
    public void LiveMerchantRecyclerPendantView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
       this.d = new SparseArray();
       this.e = new SparseArray();
    }
    public void LiveMerchantRecyclerPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new SparseArray();
       this.e = new SparseArray();
    }
    public d a(int p0){
       if (PatchProxy.isSupport(LiveMerchantRecyclerPendantView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveMerchantRecyclerPendantView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       List list = this.e.get(p0);
       if (q.f(list)) {
          return null;
       }else {
          return list.remove(0);
       }
    }
    public void b(int p0,d p1){
       if (PatchProxy.isSupport(LiveMerchantRecyclerPendantView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, LiveMerchantRecyclerPendantView.class, "5")) {
          return;
       }
       this.removeViewAt(p0);
       d c = p1.c;
       if (!PatchProxy.isSupport(LiveMerchantRecyclerPendantView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(c), p1, this, LiveMerchantRecyclerPendantView.class, "10")) {
          List list = this.e.get(c);
          if (list != null) {
             list.add(p1);
          }else {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(p1);
             this.e.put(c, uArrayList);
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantRecyclerPendantView.class, "3")) {
          return;
       }
       for (int i = this.getChildCount() - 1; i >= 0; i = i - 1) {
          this.i(this.getChildAt(i), i);
       }
       return;
    }
    public d d(int p0){
       if (PatchProxy.isSupport(LiveMerchantRecyclerPendantView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveMerchantRecyclerPendantView.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View childAt = this.getChildAt(p0);
       if (childAt != null) {
          return childAt.getTag();
       }else {
          return null;
       }
    }
    public void e(d p0,int p1){
       if (PatchProxy.isSupport(LiveMerchantRecyclerPendantView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveMerchantRecyclerPendantView.class, "7")) {
          return;
       }
       this.addView(p0.a, p1);
       d c = p0.c;
       if (!PatchProxy.isSupport(LiveMerchantRecyclerPendantView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(c), p0, this, LiveMerchantRecyclerPendantView.class, "11")) {
          List list = this.d.get(c);
          if (list != null) {
             list.add(p0);
          }else {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(p0);
             this.d.put(c, uArrayList);
          }
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantRecyclerPendantView.class, "2")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       if (this.getChildCount() <= this.c.getCount()) {
          return;
       }
       for (int i = this.getChildCount() - 1; i >= this.c.getCount(); i = i - 1) {
          this.i(this.getChildAt(i), i);
       }
       return;
    }
    public final void i(View p0,int p1){
       ArrayList uArrayList;
       if (PatchProxy.isSupport(LiveMerchantRecyclerPendantView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveMerchantRecyclerPendantView.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.removeViewAt(p1);
       p0 = p0.getTag();
       if (!p0 instanceof d) {
          return;
       }
       p0.b.unbind();
       List list = this.d.get(p0.c);
       if (!q.f(list)) {
          list.remove(p0);
       }
       list = this.e.get(p0.c);
       if (list == null) {
          uArrayList = new ArrayList();
          this.e.put(p0.c, uArrayList);
       }
       uArrayList.add(p0);
       return;
    }
    public void onViewAdded(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantRecyclerPendantView.class, "8")) {
          return;
       }
       super.onViewAdded(p0);
       LinearLayout$LayoutParams tag = p0.getTag(R.id.merchant_recycler_pendant_tag_average_id);
       if (tag instanceof Boolean && tag.booleanValue()) {
          tag = p0.getLayoutParams();
          tag.width = 0;
          tag.weight = 0x3f800000;
          p0.setLayoutParams(tag);
       }
       return;
    }
    public void setAdapter(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantRecyclerPendantView.class, "1")) {
          return;
       }
       this.c = p0;
       p0.f(this);
       return;
    }
}
