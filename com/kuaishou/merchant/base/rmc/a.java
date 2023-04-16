package com.kuaishou.merchant.base.rmc.a;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import android.util.SparseArray;
import androidx.collection.SimpleArrayMap;
import ys3.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopRMCModel$Row;
import java.lang.Integer;
import zs3.i;
import android.view.ViewGroup;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopComponentModel;
import at3.b;
import ys3.e;
import vr3.a;
import android.view.View;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingTimerView;
import ys3.d;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingTimerView$b;
import com.kuaishou.merchant.base.rmc.widget.ItemMarketingImageView;
import ys3.c;
import com.kuaishou.merchant.base.rmc.widget.ItemMarketingImageView$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.base.rmc.a$a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingFlipperView;
import ys3.g;
import android.view.ViewTreeObserver;
import com.kuaishou.merchant.base.rmc.a$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import zs3.c;
import ys3.f;
import com.kuaishou.merchant.base.rmc.e;
import com.kwai.robust.PatchProxyResult;

public class a	// class@001581
{
    public Context a;
    public List b;
    public f c;
    public g d;
    public e e;
    public SparseArray f;
    public SimpleArrayMap g;

    public void a(Context p0){
       super();
       this.b = new ArrayList();
       this.f = new SparseArray(4);
       this.g = new SimpleArrayMap(4);
       this.a = p0;
    }
    public void a(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (!this.b.contains(p0)) {
          this.b.add(p0);
       }
       return;
    }
    public void b(int p0,LiveShopRMCModel$Row p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "6")) {
          return;
       }
       this.c(p0, p1, new i());
       return;
    }
    public void c(int p0,LiveShopRMCModel$Row p1,i p2){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "7")) {
          return;
       }
       if (p1 != null && p0 >= 0) {
          ViewGroup viewGroup = this.f.get(p0);
          if (viewGroup == null) {
             return;
          }else if(PatchProxy.applyVoidOneRefs(viewGroup, this, uoa, "14")){
             viewGroup.removeAllViews();
             if (this.g.containsKey(viewGroup)) {
                this.h(this.g.get(viewGroup));
             }
          }
          this.e(this.g.get(viewGroup), p1, viewGroup, p2);
       }
       return;
    }
    public void d(List p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       this.g();
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          LiveShopRMCModel$Row row = iterator.next();
          ViewGroup viewGroup = this.f.get(row.mIndex);
          if (viewGroup == null) {
             continue ;
          }else {
             this.e(this.g.get(viewGroup), row, viewGroup, p1);
          }
       }
       return;
    }
    public final void e(List p0,LiveShopRMCModel$Row p1,ViewGroup p2,i p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "15")) {
          return;
       }
       if (!q.f(p1.mComponents)) {
          Iterator iterator = p1.mComponents.iterator();
          while (iterator.hasNext()) {
             LiveShopComponentModel liveShopComp = iterator.next();
             b uob = e.a(this.a, liveShopComp, p3);
             a payload = liveShopComp.getPayload();
             if (uob != null && payload != null) {
                p2.addView(uob);
                this.i(uob, liveShopComp, payload, p1.mIndex);
                p0.add(uob);
             }
          }
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.g();
       this.f.clear();
       this.g.clear();
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       if (this.g.isEmpty()) {
          return;
       }
       int i = 0;
       while (true) {
          if (i >= this.f.size()) {
             return;
          }
          ViewGroup viewGroup = this.f.get(i);
          if (viewGroup == null) {
             break ;
          }else {
             viewGroup.removeAllViews();
             if (this.g.containsKey(viewGroup)) {
                this.h(this.g.get(viewGroup));
             }
             i = i + 1;
          }
       }
       return;
    }
    public final void h(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "16")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().release();
       }
       p0.clear();
       return;
    }
    public final void i(b p0,LiveShopComponentModel p1,a p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, a.class, "12")) {
          return;
       }
       p1.mRowIndex = p3;
       if (p0 instanceof ShopItemMarketingTimerView) {
          p0.setMTimeOutListener(new d(this));
       }
       if (p0 instanceof ItemMarketingImageView) {
          p0.setMImageLoadFinish(new c(this));
       }
       if (this.c != null && (p0 instanceof View && !TextUtils.x(p2.getLink()))) {
          p0.setOnClickListener(new a$a(this, p0, p1, p2));
       }
    label_0058 :
       if (p0 instanceof View) {
          a td = this.d;
          if (td != null) {
             if (p0 instanceof ShopItemMarketingFlipperView) {
                ShopItemMarketingFlipperView shopItemMark = p0;
                shopItemMark.setOnComponentShowListener(td);
                shopItemMark.setRowIndex(p3);
             }
             LiveShopComponentModel mBusinessTyp = p1.mBusinessType;
             if (mBusinessTyp != null && mBusinessTyp != -1) {
                p0.getViewTreeObserver().addOnGlobalLayoutListener(new a$b(this, p0, p1));
             }
          }
       }
       if (p0 instanceof c) {
          c uoc = p0;
          uoc.setOnComponentClickListener(this.c);
          uoc.setShimmerManager(this.e);
       }
       p0.setShopItemMarketingComponentInfo(p2);
       return;
    }
    public b j(LiveShopComponentModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k(p0, new i());
    }
    public b k(LiveShopComponentModel p0,i p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       b uob = e.a(this.a, p0, p1);
       obj = p0.getPayload();
       if (uob != null && obj != null) {
          this.i(uob, p0, obj, -1);
       }
       return uob;
    }
    public void l(int p0,ViewGroup p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       this.f.put(p0, p1);
       if (!this.g.containsKey(p1)) {
          this.g.put(p1, new ArrayList());
       }
       return;
    }
    public void m(f p0){
       this.c = p0;
    }
}
