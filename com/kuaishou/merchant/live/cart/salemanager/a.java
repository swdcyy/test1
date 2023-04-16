package com.kuaishou.merchant.live.cart.salemanager.a;
import android.widget.Filterable;
import y8c.g;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.String;
import java.lang.Object;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import im8.c;
import g9c.a;
import com.kuaishou.merchant.live.cart.basic.model.ItemCard;
import java.lang.Number;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo;
import com.kuaishou.merchant.live.cart.salemanager.model.TabBarInfo;
import android.widget.Filter;
import com.kuaishou.merchant.live.cart.salemanager.a$a;
import android.view.ViewGroup;
import z24.c;
import q54.a;
import z24.b;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;

public class a extends g implements Filterable	// class@0019d2
{
    public LiveAnchorShopFragment$b w;
    public Filter x;
    public List y;
    public b z;

    public void a(LiveAnchorShopFragment$b p0,Context p1){
       super();
       this.w = p0;
       this.G0(true);
       this.n1("ADAPTER", this);
    }
    public ArrayList a1(int p0,f p1){
       if (PatchProxy.isSupport(a.class)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, a.class, "6");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       ArrayList uArrayList = new ArrayList();
       a tw = this.w;
       if (tw != null) {
          uArrayList.add(tw);
       }
       uArrayList.add(new c("MERCHANT_FRAGMENT", this.k));
       uArrayList.add(new c("MERCHANT_REFRESHER", this.n));
       Object obj = this.N0(p0);
       if (obj instanceof ItemCard) {
          ItemCard mType = obj.mType;
          if (mType != 1) {
             if (mType != 2) {
                if (mType != 3) {
                   if (mType == 4) {
                      uArrayList.add(obj.mSectionsTitleInfo);
                   }
                }else {
                   uArrayList.add(obj.mBannerInfo);
                }
             }else {
                uArrayList.add(new c("LIVE_ANCHOR_SHOP_SIMPLE_TEXT_BANNER", obj.mSimpleText));
             }
          }else {
             uArrayList.add(obj.mCommodity);
          }
       }
       return uArrayList;
    }
    public long d0(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       ItemCard obj1 = this.N0(p0);
       if (obj1 instanceof ItemCard) {
          obj1 = obj1.mCommodity;
          if (obj1 != null) {
             Commodity mId = obj1.mId;
             if (mId != null) {
                return (long)mId.hashCode();
             }
          }
       }
       return -1;
    }
    public int f0(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       ItemCard obj1 = this.N0(p0);
       if (obj1 instanceof LiveAnchorToolsInfo) {
          if (obj1.mIsPermanent != null) {
             return 1;
          }else {
             return 2;
          }
       }else if(obj1 instanceof String){
          return 3;
       }else if(obj1 instanceof TabBarInfo){
          return 7;
       }else if(obj1 instanceof ItemCard){
          obj1 = obj1.mType;
          if (obj1 != 1) {
             if (obj1 != 2) {
                if (obj1 != 3) {
                   if (obj1 != 4) {
                      return -1;
                   }else {
                      return 8;
                   }
                }else {
                   return 5;
                }
             }else {
                return 4;
             }
          }
       }
       return 0;
    }
    public Filter getFilter(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.x == null) {
          this.x = new a$a(this);
       }
       return this.x;
    }
    public f h1(ViewGroup p0,int p1){
       Context obj;
       f uof;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, a.class, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = p0.getContext();
       RecyclerView$LayoutParams layoutParams = null;
       if (PatchProxy.isSupport(a.class)) {
          uof = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p1), this, a.class, "5");
          if (uof != patchProxyRe) {
          }else {
          label_0039 :
             a tw = this.w;
             if (tw != null) {
                LiveAnchorShopFragment$b l = tw.l;
                if (l != null) {
                   uof = l.b(p1);
                label_0049 :
                   if (uof == null) {
                      if (this.z == null) {
                         this.z = new a(obj);
                      }
                      uof = this.z.create(p1);
                   }
                }
             }
             uof = layoutParams;
             goto label_0049 ;
          }
       }else {
          goto label_0039 ;
       }
       ViewGroup$LayoutParams layoutParams1 = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (layoutParams1 != patchProxyRe) {
       }else if(p0 instanceof RecyclerView && p0.getLayoutManager() != null){
          layoutParams = p0.getLayoutManager().generateDefaultLayoutParams();
       }
       if (layoutParams == null) {
          layoutParams1 = new ViewGroup$LayoutParams(-1, -2);
       }else {
          layoutParams1 = layoutParams;
       }
       layoutParams1.width = -1;
       if (p1 == 1) {
          layoutParams1.height = a1.d(0x7f0702a5);
       }else if(p1 == 3){
          layoutParams1.height = -2;
       }else if(p1 == 2){
          layoutParams1.height = -2;
       }else if(p1 == 4){
          layoutParams1.height = a1.d(0x7f0702ef);
       }else if(p1 == -1){
          layoutParams1.height = 0;
       }else if(p1 == 5){
          layoutParams1.height = a1.d(0x7f07032a);
       }else if(p1 == 7){
          layoutParams1.height = -2;
       }else if(p1 == 8){
          layoutParams1.height = a1.d(0x7f070307);
       }else {
          layoutParams1.height = a1.e(140.00f);
       }
       RecyclerView$ViewHolder itemView = uof.itemView;
       if (itemView != null) {
          itemView.setLayoutParams(layoutParams1);
       }
       return uof;
    }
}
