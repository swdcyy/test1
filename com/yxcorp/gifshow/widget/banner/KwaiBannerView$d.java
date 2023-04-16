package com.yxcorp.gifshow.widget.banner.KwaiBannerView$d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import yb.b;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$d$a;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$d$b;
import android.view.View$OnClickListener;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import java.util.Objects;
import java.lang.Number;

public class KwaiBannerView$d extends RecyclerView$Adapter	// class@001942
{
    public final KwaiBannerView e;

    public void KwaiBannerView$d(KwaiBannerView p0){
       this.e = p0;
       super();
    }
    public void J0(KwaiBannerView$ViewHolder p0,int p1){
       KwaiBannerView$d uod = KwaiBannerView$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "3")) {
          return;
       }
       a.p(p0, "holder");
       RecyclerView$ViewHolder itemView = p0.itemView;
       a.o(itemView, "holder.itemView");
       int i = -1;
       itemView.setLayoutParams(new FrameLayout$LayoutParams(i, i));
       b uob = new b(this.e.getResources());
       uob.s(new ColorDrawable(a1.a(R.color.arg_RES_7f06006a)));
       a uoa = uob.a();
       a.o(uoa, "GenericDraweeHierarchyBu¡­        \)\n      \).build\(\)");
       uoa.L(RoundingParams.c(((float)this.e.w * 0x3f800000)));
       p0.a().setHierarchy(uoa);
       Object obj = this.e.getMBanners().get((p1 % this.e.getMBannerCount()));
       a.o(obj, "mBanners[index]");
       KwaiBannerView$b d = obj.d;
       if (d != null) {
          i = d.length;
       }
       if (i > 0) {
          KwaiBannerView$b d1 = obj.d;
          a.m(d1);
          p0.a().a0(d1, new KwaiBannerView$d$a());
       }else {
          p0.a().setImageURI(obj.a);
       }
       p0.itemView.setOnClickListener(new KwaiBannerView$d$b(this, p1, obj));
       KwaiBannerView$b e = obj.e;
       if (e != null && (e == null || e.length())) {
          p0.c().setText(obj.e);
          p0.c().setVisibility(0);
          p0.b().setVisibility(0);
       }else {
          p0.c().setVisibility(8);
          p0.b().setVisibility(8);
       }
       return;
    }
    public KwaiBannerView$ViewHolder K0(ViewGroup p0,int p1){
       KwaiBannerView$d obj;
       KwaiBannerView$d uod = KwaiBannerView$d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       View view = a.c(LayoutInflater.from(this.e.getContext()), R.layout.arg_RES_7f0d1640, p0, false);
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
       view.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       obj = this.e;
       view.setPadding(obj.r, obj.s, obj.r, obj.s);
       KwaiBannerView$ViewHolder viewHolder = new KwaiBannerView$ViewHolder(view);
       viewHolder.a().setAspectRatio(this.e.u);
       return viewHolder;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, KwaiBannerView$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.getCount();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.J0(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.K0(p0, p1);
    }
}
