package com.kuaishou.merchant.transaction.live.orderconfirmpanel.a;
import y8c.g;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import g9c.a;
import kk4.g;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p1;
import xm4.a;
import nk4.f;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.s;
import re4.g;
import nk4.d1;
import ok4.a;
import nk4.r;
import nk4.m;
import nk4.l;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.k;
import nk4.i;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.m;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.f;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.b;
import nk4.x;
import nk4.s0;
import com.kuaishou.merchant.transaction.base.purchasepanel.secondhand.a;
import nk4.q1;
import ml8.c;

public class a extends g	// class@0007e7
{
    public MerchantLivePurchasePanelFragment$b w;

    public void a(MerchantLivePurchasePanelFragment$b p0){
       super();
       this.w = p0;
    }
    public ArrayList a1(int p0,f p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "4");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(this.w);
       g og = this.N0(p0);
       if (og != null) {
          uArrayList.add(og.b);
       }
       return uArrayList;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       g og = this.N0(p0);
       if (og != null) {
          return og.a;
       }else {
          return 0;
       }
    }
    public void g1(f p0,int p1,List p2){
       int i;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "2")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.itemView.getLayoutParams();
       if (layoutParams instanceof RecyclerView$LayoutParams) {
       }else if(layoutParams instanceof ViewGroup$MarginLayoutParams){
          layoutParams = new RecyclerView$LayoutParams(layoutParams);
       }else if(layoutParams == null){
          i = -1;
       }else {
          ViewGroup$LayoutParams width = layoutParams.width;
       }
       int i1 = (layoutParams == null)? -2: layoutParams.height;
       layoutParams = new RecyclerView$LayoutParams(i, i1);
       i = (int)0;
       layoutParams.leftMargin = i;
       layoutParams.rightMargin = i;
       p0.itemView.setLayoutParams(layoutParams);
       super.g1(p0, p1, p2);
       return;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       View view;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       switch (p1){
           case 1:
             view = a.e(p0, R.layout.arg_RES_7f0d00d3);
             obj.U7(new q1());
             break;
           case 2:
             view = a.e(p0, R.layout.arg_RES_7f0d00da);
             obj.U7(new a());
             break;
           case 3:
             view = a.e(p0, R.layout.arg_RES_7f0d00db);
             obj.U7(new s0());
             break;
           case 4:
             view = a.e(p0, R.layout.arg_RES_7f0d00d7);
             obj.U7(new x());
             break;
           case 5:
             view = a.e(p0, R.layout.arg_RES_7f0d00d0);
             obj.U7(new b());
             break;
           case 6:
             view = a.e(p0, R.layout.arg_RES_7f0d00d6);
             obj.U7(new f());
             break;
           case 7:
             view = a.e(p0, R.layout.arg_RES_7f0d00d9);
             obj.U7(new m());
             break;
           case 8:
             view = a.e(p0, R.layout.arg_RES_7f0d00d2);
             obj.U7(new i());
             break;
           case 10:
             view = a.e(p0, R.layout.arg_RES_7f0d00d8);
             obj.U7(new k());
             break;
           case 13:
             view = a.e(p0, R.layout.arg_RES_7f0d00d4);
             obj.U7(new l());
             break;
           case 14:
             view = a.e(p0, R.layout.arg_RES_7f0d0822);
             obj.U7(new m());
             break;
           case 15:
             view = a.e(p0, R.layout.arg_RES_7f0d0821);
             obj.U7(new PresenterV2());
             break;
           case 16:
             view = a.e(p0, R.layout.arg_RES_7f0d00d5);
             obj.U7(new r());
             break;
           case 17:
             view = a.e(p0, R.layout.arg_RES_7f0d0863);
             obj.U7(new a());
             break;
           case 18:
             view = a.e(p0, R.layout.arg_RES_7f0d0824);
             obj.U7(new d1());
             break;
           case 19:
             view = a.e(p0, R.layout.arg_RES_7f0d00de);
             obj.U7(new s());
             obj.U7(new g());
             break;
           case 20:
             view = a.e(p0, R.layout.arg_RES_7f0d00d1);
             obj.U7(new f());
             break;
           default:
          label_0021 :
             view = p1.b(p0);
       }
       return new f(view, obj);
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
