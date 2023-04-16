package com.kuaishou.live.common.core.component.gift.viewholder.a;
import com.kuaishou.live.common.core.component.gift.viewholder.LiveCommonGiftViewHolder;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.viewholder.b;
import vg1.k;
import androidx.lifecycle.LifecycleOwner;
import z1.k;
import com.kuaishou.live.common.core.component.gift.viewholder.a$a;
import sm1.d;
import xz6.e;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.viewholder.adapter.LiveGiftBoxAlbumItemGiftImageLayoutManager;
import android.content.Context;
import android.view.ViewGroup;
import tm1.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$l;
import sm1.e;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.lang.Integer;
import java.lang.Boolean;
import lnc.a1;
import va1.n0;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import java.util.List;
import rm1.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;

public class a extends LiveCommonGiftViewHolder	// class@001331
{
    public RecyclerView q;
    public LiveGiftBoxAlbumItemGiftImageLayoutManager r;
    public a s;
    public final b t;
    public final k u;
    public GiftPanelItemViewData v;
    public final Runnable w;
    public final Runnable x;
    public boolean y;

    public void a(View p0,b p1,k p2){
       super(p0, null, null);
       this.w = new a$a(this);
       this.x = new d(this);
       this.q = this.a(0x7f0a1d48);
       this.t = p1;
       this.u = p2;
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
       }else {
          this.r = new LiveGiftBoxAlbumItemGiftImageLayoutManager(this.q.getContext(), 0, 0);
          this.s = new a();
          this.q.setLayoutManager(this.r);
          this.q.setAdapter(this.s);
          if (this.q.getItemAnimator() != null) {
             this.q.getItemAnimator().x(0);
          }
          this.q.addOnScrollListener(new e(this));
       }
       return;
    }
    public void c(int p0,GiftPanelItem p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, a.class, "2")) {
          return;
       }
       this.i();
       super.c(p0, p1, p2);
       if (!p2) {
          n0.s(this.h, (- a1.d(R.dimen.arg_RES_7f07034b)));
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       this.i();
       return;
    }
    public void f(GiftPanelItem p0,GiftPanelItemViewData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       String str = "";
       String str1 = this.k(this.q, str);
       GiftPanelItemViewData giftPanelIte = null;
       if (!b.c(p1.mPicUrls)) {
          giftPanelIte = f.d(p1.mPicUrls);
       }
       str = this.k(this.h, str);
       if (!TextUtils.isEmpty(str1) && (!TextUtils.isEmpty(giftPanelIte) && (!TextUtils.equals(str1, giftPanelIte) || !TextUtils.equals(str, p1.mName)))) {
          if (TextUtils.isEmpty(str1) && p0.mCurrentSelectedAlbumPanelItem == null) {
             this.s.J0(p1.mPicUrls);
             return;
          }else {
             this.n(p1);
             this.q.setTag(giftPanelIte);
          }
       }
       return;
    }
    public GiftPanelItemViewData h(GiftPanelItem p0){
       GiftPanelItem mCurrentSele = p0.mCurrentSelectedAlbumPanelItem;
       if (mCurrentSele != null) {
          return mCurrentSele.mGiftPanelItemViewData;
       }
       return p0.mGiftPanelItemViewData;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          tq.removeCallbacks(this.w);
          this.q.removeCallbacks(this.x);
       }
       return;
    }
    public GiftPanelItem j(){
       LiveCommonGiftViewHolder tm = this.m;
       if (tm == null) {
          return null;
       }
       GiftPanelItem mCurrentSele = tm.mCurrentSelectedAlbumPanelItem;
       if (mCurrentSele != null) {
          tm = mCurrentSele;
       }
       return tm;
    }
    public final String k(View p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.getTag() == null) {
          return p1;
       }
       return p0.getTag().toString();
    }
    public void l(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          return;
       }
       LiveCommonGiftViewHolder tm = this.m;
       if (tm == null) {
          return;
       }
       a uoa1 = (tm.mCurrentSelectedAlbumPanelItem != null)? 1: null;
       if (this.y == null && !uoa1) {
          return;
       }else if(uoa1 && this.t.c(this.j())){
          if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
             this.u.b();
             if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
                float f = 0x3f99999a;
                this.q.setScaleX(f);
                this.q.setScaleX(f);
             }
             if (this.j() != null) {
                this.t.a(this.j(), this);
             }
          }
       }else {
          this.u.a(this.q);
       }
       return;
    }
    public void m(boolean p0){
       this.y = p0;
    }
    public final void n(GiftPanelItemViewData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       this.v = p0;
       this.q.post(this.w);
       return;
    }
}
