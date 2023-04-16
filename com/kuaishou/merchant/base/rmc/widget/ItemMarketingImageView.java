package com.kuaishou.merchant.base.rmc.widget.ItemMarketingImageView;
import at3.b;
import android.widget.FrameLayout;
import android.content.Context;
import com.kuaishou.merchant.base.rmc.widget.ItemMarketingImageView$b;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import kotlin.jvm.internal.a;
import zs3.e;
import com.kuaishou.merchant.base.rmc.widget.ItemMarketingImageView$a;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewParent;
import java.util.Objects;
import com.kuaishou.merchant.base.rmc.RMCLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import at3.a;
import zs3.g;
import z1.a;
import vr3.a;

public final class ItemMarketingImageView extends FrameLayout implements b	// class@00158a
{
    public boolean b;
    public KwaiImageView c;
    public g d;
    public final a e;
    public ItemMarketingImageView$a f;
    public HashMap g;

    public void ItemMarketingImageView(Context p0){
       super(p0);
       this.e = new ItemMarketingImageView$b(this);
       this.b = a.t().d("enableRMCComponentAutoHide", false);
       if (PatchProxy.applyVoid(null, this, ItemMarketingImageView.class, "1")) {
       }else {
          a.b(this.getContext(), R.layout.arg_RES_7f0d0830, this);
          this.c = this.findViewById(0x7f0a368a);
       }
       return;
    }
    public static final KwaiImageView a(ItemMarketingImageView p0){
       p0 = p0.c;
       if (p0 == null) {
          a.S("mImageView");
       }
       return p0;
    }
    public e getItemMarketingViewModel(){
       return this.d;
    }
    public final ItemMarketingImageView$a getMImageLoadFinish(){
       return this.f;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(ItemMarketingImageView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ItemMarketingImageView.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          ViewParent parent = this.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          int measuredWidt = parent.getMeasuredWidth();
          a.s(RMCLogBiz.RMC, "ItemMarketingImageView", "right: "+p3+','+" parent width: "+measuredWidt);
          if (p3 >= measuredWidt && (!this.getMinimumWidth() && this.b != null)) {
             i = 8;
          }
       label_0080 :
          this.setVisibility(i);
          this.requestLayout();
       }
       return;
    }
    public void release(){
       PatchProxy.applyVoid(null, this, ItemMarketingImageView.class, "5");
    }
    public void setBusinessType(int p0){
       a.b(this, p0);
    }
    public void setItemMarketingViewModel(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ItemMarketingImageView.class, "2")) {
          return;
       }
       a.c(this, p0);
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.merchant.base.rmc.model.ItemMarketingImageModel");
       this.d = p0;
       p0.f(this.e);
       return;
    }
    public final void setMImageLoadFinish(ItemMarketingImageView$a p0){
       this.f = p0;
    }
    public final void setNeedGoneWhenNoSpace(boolean p0){
       this.b = p0;
    }
    public void setRowIndex(int p0){
       a.d(this, p0);
    }
    public void setShopItemMarketingComponentInfo(a p0){
    }
}
