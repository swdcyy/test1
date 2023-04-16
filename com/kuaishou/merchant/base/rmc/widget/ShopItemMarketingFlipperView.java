package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingFlipperView;
import at3.b;
import zs3.c;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.kuaishou.merchant.base.rmc.a;
import ekd.m1;
import com.kuaishou.merchant.basic.widget.AdapterViewFlipper;
import android.widget.AdapterViewFlipper;
import android.animation.ObjectAnimator;
import com.kuaishou.merchant.api.core.model.live.shop.ItemMarketingComplexInfo;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopComponentModel;
import ys3.g;
import com.kwai.robust.PatchProxyResult;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import lnc.a1;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import zs3.e;
import at3.a;
import ys3.f;
import com.kuaishou.merchant.base.rmc.e;
import zs3.b;
import vr3.a;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingFlipperView$c;
import android.view.ViewTreeObserver;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingFlipperView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingFlipperView$b;
import com.kuaishou.merchant.basic.widget.AdapterViewFlipper$a;
import android.widget.Adapter;

public class ShopItemMarketingFlipperView extends FrameLayout implements b, c	// class@001593
{
    public AdapterViewFlipper b;
    public a c;
    public g d;
    public int e;

    public void ShopItemMarketingFlipperView(Context p0){
       super(p0);
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingFlipperView.class, "1")) {
       }else {
          a.b(p0, R.layout.arg_RES_7f0d08ac, this);
          this.c = new a(p0);
          AdapterViewFlipper uAdapterView = m1.f(this, R.id.flipper_component);
          this.b = uAdapterView;
          uAdapterView.stopFlipping();
          this.b.setInAnimation(this.getFlipperInAnimator());
          this.b.setOutAnimation(this.getFlipperOutAnimator());
          this.b.setFlipInterval(4000);
       }
       return;
    }
    public void a(ItemMarketingComplexInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingFlipperView.class, "7")) {
          return;
       }
       if (this.d != null) {
          int displayedChi = this.b.getDisplayedChild();
          ArrayList subs = p0.getSubs();
          if (subs != null && (displayedChi >= 0 && displayedChi < subs.size())) {
             LiveShopComponentModel liveShopComp = subs.get(displayedChi);
             liveShopComp.mRowIndex = this.e;
             this.d.a(liveShopComp);
          }
       }
       return;
    }
    public final ObjectAnimator getFlipperInAnimator(){
       float[] uofloatArray;
       ObjectAnimator obj = PatchProxy.apply(null, this, ShopItemMarketingFlipperView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.Y, uofloatArray)};
       uofloatArray = new float[]{(float)a1.d(0x7f07028d),0};
       obj = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu);
       obj.setDuration(200);
       obj.setInterpolator(new AccelerateDecelerateInterpolator());
       return obj;
    }
    public final ObjectAnimator getFlipperOutAnimator(){
       float[] uofloatArray;
       ObjectAnimator obj = PatchProxy.apply(null, this, ShopItemMarketingFlipperView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.Y, uofloatArray)};
       uofloatArray = new float[]{0,(float)(- a1.d(0x7f07028d))};
       obj = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu);
       obj.setDuration(200);
       obj.setInterpolator(new AccelerateDecelerateInterpolator());
       return obj;
    }
    public e getItemMarketingViewModel(){
       return null;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingFlipperView.class, "5")) {
          return;
       }
       this.c.f();
       this.b.stopFlipping();
       return;
    }
    public void setBusinessType(int p0){
       a.b(this, p0);
    }
    public void setItemMarketingViewModel(e p0){
    }
    public void setOnComponentClickListener(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingFlipperView.class, "6")) {
          return;
       }
       if (p0 != null) {
          ShopItemMarketingFlipperView tc = this.c;
          if (tc != null) {
             tc.m(p0);
          }
       }
       return;
    }
    public void setOnComponentShowListener(g p0){
       this.d = p0;
    }
    public void setRowIndex(int p0){
       this.e = p0;
    }
    public void setShimmerManager(e p0){
       b.b(this, p0);
    }
    public void setShopItemMarketingComponentInfo(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingFlipperView.class, "4")) {
          return;
       }
       if (p0 instanceof ItemMarketingComplexInfo) {
          if (!q.f(p0.getSubs())) {
             ShopItemMarketingFlipperView$c uoc = new ShopItemMarketingFlipperView$c(this);
             uoc.b = p0.getSubs();
             this.b.getViewTreeObserver().addOnGlobalLayoutListener(new ShopItemMarketingFlipperView$a(this, p0));
             this.b.setOnViewFlipperListener(new ShopItemMarketingFlipperView$b(this, p0));
             this.b.setAdapter(uoc);
             this.b.startFlipping();
          }else {
             this.setVisibility(8);
          }
       }
       return;
    }
}
